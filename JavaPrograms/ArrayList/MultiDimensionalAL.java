package JavaPrograms.ArrayList;
import java.util.ArrayList;

public class MultiDimensionalAL {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list2.add(3);
        list2.add(4);
        list3.add(5);
        list3.add(6);
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);

        //now lets print the element individually
        for(int i = 0 ; i < mainList.size(); i++){
            ArrayList<Integer> curr = mainList.get(i);
            for(int j = 0 ; j < curr.size(); j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
    }
}