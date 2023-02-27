class Neon_Number 
{
    public static void main(String[] args) 
    {
        int i=1;
       while(i<=300)
       {
        int n=i;
        int sq=n*n;
        int sum=0;
        while(sq!=0) {
            int last=sq%10;
            sum=sum+last;
            sq=sq/10;
        }
        if(sum==n){
            System.out.println(n);
        }
        i++;
       }
    } 
}

#balu
