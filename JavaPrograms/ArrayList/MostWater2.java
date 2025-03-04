//2 Pointer Approach   TC -> O(n)
package JavaPrograms.ArrayList;

import java.util.ArrayList;

public class MostWater2 {
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
        int max = 0;
        int lp = 0, rp = list.size() -1;
        while(lp < rp){
            int hg = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;
            int currWater = hg * width;
            max = Math.max(max, currWater);

            if(list.get(lp) < list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        System.out.println(max);

    }
}