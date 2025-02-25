package JavaPrograms.Backtracking;

public class File1{
    public static void changeValue(int[] arr, int i, int value){
        //base condition
        if(arr.length == i){
            printArr(arr);
            return;
        }
        arr[i] = value;
        changeValue(arr, i+1, value+1);
        arr[i] = arr[i] - 2;

    }
    public static void printArr(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = new int[5];
        changeValue(arr, 0,1);
        printArr(arr);
    }
}