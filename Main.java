import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int counter = 0;
    for (int i = 1; i <= 25; i += 2)
    {
      System.out.print(i + " ");
    }

    for (int c = 17; c <= 73; c++)
    {
      if (counter % 10 == 9)
      {
        System.out.println(i + " ");
      }
      else 
      {
        System.out.print(i + " ");
        counter++;
      }
      if counter == 10
      {
        counter = 0;
      }
    }
}
