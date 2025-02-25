package JavaPrograms.Recursion;
// for getting the length of the string
public class File5 {
    static int length(String str){

        //base case
        if (str == "") {

            return 0;
        }
        return 1+length(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "AmanKumarVerma";
        int count= length(str);
        System.out.println(count);
    }
}
