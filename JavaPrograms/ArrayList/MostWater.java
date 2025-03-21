package JavaPrograms.ArrayList;

import java.util.ArrayList;
//BruteForce Approach   TC -> O(n^2)
public class MostWater {
    public static int Water(ArrayList<Integer> list){
        int max = 0;
        for(int i = 0; i< list.size(); i++){
            for(int j = i+1; j< list.size();j++){
                int hg = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int currWater = hg * width;
                max = Math.max(max, currWater);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(Water(list));
    }
}