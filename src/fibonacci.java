import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) throws Exception{
        int num,n1=0,n2=1,n3,i;
        try(Scanner scanner = new Scanner(System.in)){

            System.out.print("Enter the number:");
            num = scanner.nextInt();
            System.out.println("Fibonacci Series:");
            System.out.println(n1+ " " +n2);

            for(i=2;i<=num;i++){
                n3= n1+n2;
                System.out.println(" "+n3);
                n1=n2;
                n2=n3;
            }
           

        }
    }
    
}
