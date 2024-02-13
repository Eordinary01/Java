import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)throws Exception{
        int num, r,sum=0,temp;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the Number:");
            num = scanner.nextInt();
            temp = num;

            while(num>0){
                r = num % 10;
                 sum = sum * 10 + r;
                 num /=10;
            }
            if(temp == sum){
                System.out.println("The number is Palindrome: ");
            }
            else{
                System.out.println("The number is not Palindrome: ");
            }
        }
    }
    
}
