import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int a,b,sum;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the First Number:");
            a = scanner.nextInt();
            System.out.print("Enter the Second Number:");
            b = scanner.nextInt();
            sum = a+b;
            System.out.println("The Addition of "+ a +" +"+ b +" is: "+sum);

        }
    }
}
