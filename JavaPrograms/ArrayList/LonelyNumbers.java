package JavaPrograms.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class LonelyNumbers {
    public static ArrayList<Integer> checkLonely(ArrayList<Integer> list){
        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();
        for(int i = 0; i< list.size(); i++){
            int num1 = list.get(i) -1;
            int num2 = list.get(i)+1;
            if(list.contains(num1) || list.contains(num2)){
                ls2.add(list.get(i));
            }else{
                ls1.add(list.get(i));
            }
        }

        return ls1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        System.out.println(checkLonely(list));
    }
}