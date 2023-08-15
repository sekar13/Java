import java.util.Scanner;
public class Random {
    public static void main(String []args){
        Scanner input7 = new Scanner(System.in);
        System.out.print("Number From : ");
        int Number1 = input7.nextInt();
        System.out.print("Number to: ");
        int Number2 = input7.nextInt();
        double randomNumber = Math.random()*(Number2 - Number1 +1)+ Number1;
        int result = (int) randomNumber;
        System.out.println("Random Number : " + result);
        input7.close();

    }
    
}
