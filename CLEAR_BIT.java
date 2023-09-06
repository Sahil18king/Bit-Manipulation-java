import java.util.*;
public class bitman{
    public static int ClearIthBit(int n ,int i){
        int bitMask =~(1<<i);
        return n&bitMask;
    }
    public static void main(String args[]){
        System.out.println(ClearIthBit(10 ,1));
    }
}
