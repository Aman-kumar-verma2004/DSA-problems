package JavaPrograms.ArrayList;

import java.util.ArrayList;

public class Maximum{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(8);
        list.add(6);

        int max = 0;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}