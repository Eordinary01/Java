import java.util.Scanner;
public class Factorial {
    public static void main (String[] args) throws Exception{
        int n,fact =1;
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the number:");
            n = scanner.nextInt();
            for(int i =1; i<=n;i++){
                fact = fact *i ;
            }
            System.out.println("Factorial of "+n+" is: "+fact);
        }

    }
    
}
