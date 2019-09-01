import java.util.Scanner;

public class Task14
{
  public static void main(String[] args)
  {
    Scanner nn=new Scanner(System.in);
    int inp;
    
    System.out.println("Enter a number: ");
    inp=nn.nextInt();
    for(int c=1; c<=inp; c++)
    {
      for(int j=1; j<=inp-c; j++)
      {
        System.out.print(" ");
      }
      for(int k=1; k<=c; k++)
      {
        System.out.print(k);
      }
      for(int k=c-1; k>=1; k--)
      {
        System.out.print(k);
      }
      System.out.println();
    }
  }
}