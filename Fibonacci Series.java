import java.util.Scanner;
class FibonacciSeries{
    public static void fs(int count){
        for (int i = 2;i<count;i++){
            int thirdNumber= firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            System. out.print( " "+ thirdNumber);
            
        }
        
    }
    static int firstNumber = 0;
    static int secondNumber=1;
    public static void main (String []s){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count ?");
        
        int count = sc.nextInt();
        System.out.print(firstNumber+ " "+ secondNumber);
        
        if(count>0){
            fs(count);
        }
        sc.close();    
    }

}