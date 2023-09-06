import java.util.*;
public class bitman{
    public static int SetBits(int n){
        int count =0 ;
        while(n > 0){
            int k = n & 1 ;
            if(k !=0){
                count ++;
            }
            n = n>>1;
        }
    }
    public static void main(String args[]){
        System.out.println(SetBits(15));
    }
}
