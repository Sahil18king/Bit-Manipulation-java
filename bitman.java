//   1.OddEven through BitManipulation #########################################
/* 
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
*/
//-------------------------------------------------------------------------------



//      2.Get Ith Bit ###########################################################

/* 
import java.util.*;
public class bitman{
    public static int GetIthBit(int n , int i){
        int bitMask =1<<i;
        if((n& bitMask) == 0){
            return 0;
        }else {
           return 1;
        }

    }
    public static void main(String args[]){
       System.out.println( GetIthBit(10 ,2));
    }
}
*/

//--------------------------------------------------------------------------------


//     3.SetIthBit################################################################
/* 
import java.util.*;
public class bitman{

    public static int SetIthBit(int n ,int i){
        int bitMask =1<<i;
        return n | bitMask;
    }
    public static void main(String args[]){
        System.out.println(SetIthBit(10,2));
    }
}

*/
//--------------------------------------------------------------------------------


//     4.  ClearBit   ##############################################################


/* 
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


*/

//------------------------------------------------------------------------------------


//       Clear Last i BITS ############################################################
/* 
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
*/

//--------------------------------------------------------------------------------------


//      Clear Range of bits ############################################################

/* 
import java.util.*;
public class bitman{
    public static int ClearRange(int n ,int i ,int j){
        int a = (-1) << (j+1);
        int b = (1<< i) -1 ;
        int BitMask = a|b;
        return n & BitMask;
    }
    public static void main(String args[]){
        System.out.println(ClearRange(10,2,4));
    }
}
*/

//----------------------------------------------------------------------------------------

//    IS the Number Power of 2 ? #########################################################

/* 
import java.util.*;
public class bitman {
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        System.out.println(isPowerOfTwo(6));
    }
}

*/

//------------------------------------------------------------------------------------------

//    SetBits###############################################################################
/* 
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
*/

//--------------------------------------------------------------------------------------------


