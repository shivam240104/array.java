import java.util.*;
public class binary {
 
    public static int binarySearch(int num[], int key){
        int start=0, end=num.length-1;

        while(start<=end){
            int mid= (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }
            else{
                end=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[]={3,4,5,67,8,34};
        int key=34;
       
        System.out.println("Index for key is : " +binarySearch(num, key));
    }
}
