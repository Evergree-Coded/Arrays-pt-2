import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    /* Average Test score program
    Program Attributes:
      - Ask the user for 4 test scores
      - Store those 4 test scores in an array
      -Find the average and print to the user
    */
    Scanner scan = new Scanner(System.in);
    int sum = 0;
    int [] scoreArr = new int[4]; //better when you don't know everything that goes inside the array

    for(int i = 0; i < scoreArr.length; i++){
      System.out.println("Enter test score #" + (i+1) + " RIGHT NOW");
      scoreArr[i] = scan.nextInt();
      sum += scoreArr[i];

    }

    System.out.println("Your average score is: " + sum/scoreArr.length);

  }
}