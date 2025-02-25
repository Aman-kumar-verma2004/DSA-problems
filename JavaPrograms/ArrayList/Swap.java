package JavaPrograms.ArrayList;

import java.util.ArrayList;

public class Swap {
    public static void main(String[] args){
        ArrayList<Integer> ls = new ArrayList<>();

        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);

        int ind1 = 1;
        int ind2 = 3;

        int temp = ls.get(ind1);
        ls.set(ind1, ls.get(ind2));
        ls.set(ind2, temp);


        for(int i = 0; i< ls.size(); i++){
            System.out.print(ls.get(i)+" ");
        }
        System.out.println();

    }
}