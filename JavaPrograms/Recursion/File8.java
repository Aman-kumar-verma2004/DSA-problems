package JavaPrograms.Recursion;

public class File8 {
    //recursive function to reverse a String
    static String reverse(String s){
        StringBuilder str = new StringBuilder();
        if(s.isEmpty()){
            return s;
        }
        return reverse(s.substring(1))+s.charAt(0);

    }
    public static void main(String[] args) {
        String S = "AmanKumarVerma";
        String res = reverse(S);
        System.out.println(res);

    }
}
