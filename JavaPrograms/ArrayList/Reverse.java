package JavaPrograms.ArrayList;

import java.util.ArrayList;

public class Reverse{
    public static void main(String[] args){
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);

        for(int i = 0; i< ls.size(); i++){
            System.out.print(ls.get(i)+ " ");
        }
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = ls.size()-1; i>=0; i--){
            list.add(ls.get(i));
        }

        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

    }
}