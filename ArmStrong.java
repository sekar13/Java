import java.util.Scanner;
public class ArmStrong {
    public static void main (String []s){
        Scanner input5 = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int enterNo = input5.nextInt();
        int originNumber = enterNo;
        int digit =0;
        while(enterNo !=0){
            enterNo=enterNo/10;
            digit++;   
        }
        int temp = originNumber;
        int last =0,sum =0;
        while(originNumber!=0){
            last = originNumber%10;
            sum +=(Math.pow(last,digit));
            originNumber%=10;
        }
        if(temp==sum)
        {
            System.out.println(temp + " is the armstrong number");
        }
        else{
            System.out.println(temp + "is not armstrong number");
        }

        input5.close();
    }
    
}
