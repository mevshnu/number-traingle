import java.util.*;
public class Traingle {
    public static void main(String[] args)
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (i =1; i<=n; i++)
        {

            for (j=0; j<i; j++)
            {
               System.out.print(i+" ");
            }
        System.out.println("");
        }
    }
}
