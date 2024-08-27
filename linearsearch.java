public class linearsearch {

    public static int linear(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={10,23,34,56,78,98};
        int key=78;
        int index= linear(num,key);
        if(index==-1){
            System.out.println("Key not found ");
        }
        else{
            System.out.println("Key at index =" +index);
        }
    }
    
}
