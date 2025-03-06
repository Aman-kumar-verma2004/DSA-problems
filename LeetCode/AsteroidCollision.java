package LeetCode;

import java.util.Stack;

public class AsteroidCollision {
     public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        
        for (int asteroid : asteroids) {
            while (!s.isEmpty() && asteroid < 0 && s.peek() > 0) {
                int top = s.peek();
                if (Math.abs(asteroid) == top) {
                    s.pop();
                    asteroid = 0;
                    break;
                } else if (Math.abs(asteroid) < top) {
                    asteroid = 0;
                    break;
                } else {
                    s.pop();
                }
            }
            if (asteroid != 0) {
                s.push(asteroid);
            }
        }
        
        int[] arr = new int[s.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = s.pop();
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int[] asteroids = {10,2,-5};
        int[] res =  asteroidCollision(asteroids);
        for(int i = 0; i<res.length; i++){
            System.out.println(res[i]+" ");
        }
    }
}
