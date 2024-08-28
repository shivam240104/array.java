import java.util.*;

public class large {

    public static int largest(int num[]){
        int largestnum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(largestnum < num[i]){
                largestnum=num[i];
            }

        }
        return largestnum;
    }
    public static void main(String[] args) {
        int num[]={1, 2, 4, 3, 6, 8, 7, 9};
        System.out.println("largest number is = " +largest(num));

    }
    
}
