import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int t,count=0;
        long n=1;

        while (n<100)
        {
            if(isPrime(n))
            {
                System.out.println(n);
            }
            n++;
        }

        t=scanner.nextInt();
        n=1;
        while (count<t)
        {
         if(isPrime(n))
         {
             System.out.println(n);
             count++;
         }
            n++;
        }

    }
    public  static  boolean isPrime(long x)
    {
        boolean f=true;

        if(x%2==0){f=false;}
        else
        {
            for (int i = 3; i*i <= x; i+=2)
            {
                if(x%i==0){f=false;}
            }
        }
        if(x==1){f=false;}
        if(x==2){f=true;}

        return f;

    }
}
