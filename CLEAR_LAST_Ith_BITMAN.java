import java.util.*;
public class bitman{
    public static int ClearLastiBits(int n , int i){
        int BitMask = (-1) << i ;
        return (n & BitMask) ;
    }
    public static void main(String args[]){
       System.out.println(ClearLastiBits(15 , 2));
    }
}
