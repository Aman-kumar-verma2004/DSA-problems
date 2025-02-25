package JavaPrograms.Recursion;

public class File10 {
    static int findElement(int[] arr, int target, int start, int end){
        //
        if(  end == 0){
            return 0;
        }
        if(start > end){
            return -1;
        }
        int mid =  start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
           return  findElement(arr,target,start, mid-1);
        }else {
            return findElement(arr, target, mid+1, end);
        }


    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int res = findElement(arr, 15, 0, arr.length -1);
        System.out.println(res);
    }
}
