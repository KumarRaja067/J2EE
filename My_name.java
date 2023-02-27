class My_name 
{
    public static void main(String[] args) 
    {
     int n=5;
     for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(j==5)  // Space
            {
                System.out.print("  ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=n;j++)
        {
            if((i==1&&j!=1)||(i==2&&j==1)||(i==3&&j!=1&&j!=5)||(i==4&&j==5)||(i==5&&j!=5))  // S
            {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=1;j++)
        {
            if(j==5)  // Space
            {
                System.out.print("  ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=n;j++)
        {
            if((i==1&&j!=5)||(j==1&&i!=1)||i==3||(i==2&&j==5)||i==j&&i>3)  // R
            {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        for(int j=1;j<=1;j++)
        {
            if(j==5)  // Space
            {
                System.out.print("  ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=n;j++)
        {
            if(i==1||i==5||j==3)   // I
            {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
     System.out.println();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(j==1||(i+j==5)||(i==4&&j==3)||(i==5&&j==4))  // K
            {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=1;j++)
        {
            if(j==5)  // Space
            {
                System.out.print("  ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=n;j++)
        {
            if((j==1&&i!=5)||(j==5&&i!=5)||(i==5&&j!=1&&j!=5)) // U
            {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        for(int j=1;j<=1;j++)
        {
            if(j==5)  // Space
            {
                System.out.print("  ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=n;j++)
        {
            if(j==1||j==5||(i==j&&i<4)||(i+j==6&&j>2))  // M
            {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        for(int j=1;j<=1;j++)
        {
            if(j==5)  // Space
            {
                System.out.print("  ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=n;j++)
        {
            if((i==1&&j!=1&&j!=5)||(i!=1&&(j==1||j==5))||i==3)  // A
            {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        for(int j=1;j<=1;j++)
        {
            if(j==5)  // Space
            {
                System.out.print("  ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=n;j++)
        {
            if((i==1&&j!=5)||(j==1&&i!=1)||i==3||(i==2&&j==5)||i==j&&i>3)  // R
            {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        for(int j=1;j<=1;j++)
        {
            if(j==5)  // Space
            {
                System.out.print("  ");
            }
            else {
                System.out.print("  ");
            }
        } 
         System.out.println();
    } 
    System.out.println();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if((i==1&&j!=5)||(j==1&&i!=1)||i==3||(i==2&&j==5)||i==j&&i>3)  // R
            {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=1;j++)
        {
            if(j==5)  // Space
            {
                System.out.print("  ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=n;j++)
        {
            if((i==1&&j!=1&&j!=5)||(i!=1&&(j==1||j==5))||i==3)  // A
            {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        for(int j=1;j<=1;j++)
        {
            if(j==5)  // Space
            {
                System.out.print("  ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=n;j++)
        {
            if(i==1||j==3||(i==4&&j==1)||(i==5&&j==2))  // J
            {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        for(int j=1;j<=1;j++)
        {
            if(j==5)  // Space
            {
                System.out.print("  ");
            }
            else {
                System.out.print("  ");
            }
        } 
        for(int j=1;j<=n;j++)
        {
            if((i==1&&j!=1&&j!=5)||(i!=1&&(j==1||j==5))||i==3)  // A
            {
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    }
}
