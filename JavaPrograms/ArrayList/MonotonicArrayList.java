package JavaPrograms.ArrayList;

import java.util.ArrayList;

public class MonotonicArrayList {
    public static boolean checkMonotonic(ArrayList<Integer> list){
        int count = 0;
        int sum = 0;
        for(int i = 0, j = i+1; i < list.size() && j < list.size(); i++, j++){
            if(list.get(i) <= list.get(j) ){
                count++;
            }else{
                sum++;
            }
        }
        if(count == list.size() - 1 || sum == list.size() -1) return true;
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(checkMonotonic(list));

    }
}