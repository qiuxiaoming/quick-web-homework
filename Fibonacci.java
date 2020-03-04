public class Fibonacci {
    public static void main(String[] args) {
        for(int i=1;i<=200;i++){
            System.out.println(Fibonacci.of(i));
        }
    }

    public static double of(int n){
        double nums[]=new double [n+1];
        if(n<=0)
        {
            return -1;
        }
        for(int i=1;i<=n;i++){
            if(i==1||i==2){
                nums[i]=1;
            }
            else {
                nums[i]=nums[i-1]+nums[i-2];
            }
        }
        return nums[n];
    }
}
