import java.util.*;
public class bitman{
    public static void OddEven(int n){
        int BitMask = 1;
        if(n == 0){
            System.out.println("Neither Even Nor Odd");
        }
        if(n>0){
            if((n & BitMask) == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
    public static void main(String args[]){
        OddEven(20);
    }
}
