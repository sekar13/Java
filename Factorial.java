import java.util.Scanner;
public class Factorial{
    public static void main(String[]w){
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the number?");
        int FNumber = input3.nextInt();
        int answer=1;
        for (int i =FNumber;i>0;i--){
            answer *= i;
        }
        System.out.println(FNumber + " Factorial is " + answer);
        input3.close();

    }
}