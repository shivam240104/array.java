import java.util.*;

public class Array {

    public static void main(String[] args) {
        int marks[]=new int[100];
        System.out.println("Enter marks -");
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt(); //math
        marks[1]=sc.nextInt(); //phy
        marks[2]=sc.nextInt(); //chem
        
        System.out.println("math =" +marks[0]);
        System.out.println("phy =" +marks[0]);
        System.out.println("chem =" +marks[0]);

    }
}