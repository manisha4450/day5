public class butterfly{
    public static void main(String[] args){
        int n=10;
        n-=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || j==n-1 || i+j==n-1 || i==j)
                System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}