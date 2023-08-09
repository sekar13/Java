import java.util.Scanner;

public class Palindrome {
    public static void main(String[]s){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the Number to check(Palindrome or not)  ");
        int numberFromUser = input1.nextInt();
        int originalNUmber = numberFromUser;
        int rem,reversedNumber=0;
        while(numberFromUser!=0){
            rem = numberFromUser%10;
            reversedNumber=(reversedNumber*10)+rem;
            numberFromUser/=10;

        }
        System.out.println(reversedNumber);
        if(originalNUmber==reversedNumber)
            System.out.println(originalNUmber + " is palindrome");
            
            
        else
            System.out.println(originalNUmber + " is not palindrome");
        input1.close();

    }
    
}
