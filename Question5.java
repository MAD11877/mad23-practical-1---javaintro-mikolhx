import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the number of integers: ");
    int count = in.nextInt();

    int[] numbers = new int[count];
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an integer: ");
      numbers[i] = in.nextInt();
    }

    // find mole 
    int mode = 0;
    int maxCount = 0;

    for (int i = 0; i < count; i++) {
      int currentNumber = numbers[i];
      int currentCount = 0;
      
      for (int j = 0; j < count; j++) {
        if (numbers[j] == currentNumber) {
          currentCount++;
        }
      }

      if (currentCount > maxCount) {
        mode = currentNumber;
        maxCount = currentCount;
      }
    }
    System.out.println("The mode is: " + mode);
  }
}


