package recursion;

public class number_rec {

    static void rec(int val){
        if(val>99){
            return;
        }
        rec(val+1);
        System.out.println(val);
    }
    public static void main(String args[]){
        rec(0);
    }
}
