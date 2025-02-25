package JavaPrograms.ArrayList;

import java.util.ArrayList;

public class PairSum1 {
    public static void findingPair(ArrayList<Integer> list, int target){
        int i = 0; int j = i+1;
        while( i< list.size()){
            if((list.get(i)+ list.get(j)) != target){
                j++;
                if(j == list.size() -1){
                    i++;
                }
            }else{
                System.out.print("["+ list.get(i)+","+list.get(j)+"]");
                break;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
       findingPair(list, target);
    }
}