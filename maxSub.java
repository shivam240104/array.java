public class maxSub {
    public static void max(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum +=num[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum = "+maxSum);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        max(num);
    }
}
