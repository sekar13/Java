import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[]p){
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the Number ?");
        int number1 = input2.nextInt();
        if(number1 ==0 || number1 ==1)
            System.out.println(number1 +" is not a primenumber");
        else{
            for(int i =2;i<=number1/2;i++){
                if(number1 % i==0){
                    System.out.println(number1 + " is not a primenumber");
                    break;
                }
                else{
                    System.out.println(number1 + " is a primenumber");
                    break;

                }
            }
        }
    input2.close();
    }
    
}
      