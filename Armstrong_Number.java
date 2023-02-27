 class Armstrong_Number 
{
    public static void main(String[] args) 
    { 
        for (int i = 200; i >=1; i--) 
        {
            int n=i ,n1=i;
            int c=0 ,sum=0;
        while (n!=0) {
                c++;
                n/=10;
            }
        while (n1!=0) {
            int last=n1%10;
            int pow=1;
            for (int j = 1; j <=c; j++) {
                pow=pow*last;
            }
            sum=sum+pow;
            n1/=10;
        }
        if (sum==i) {
            System.out.println(i);
         }
        }
    }
}





/*      int n=163 ,n1=n,n2=n;
        int c=0 ,sum=0;
        while (n!=0) {
            c++;
            n/=10;
        }
        while (n1!=0) {
            int last=n1%10;
            int pow=1;
            for (int i = 1; i <=c; i++) {
                pow=pow*last;
            }
            sum=sum+pow;
            n1/=10;
        }
        if (sum==n2) {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }     */