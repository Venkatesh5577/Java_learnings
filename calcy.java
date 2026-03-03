import java.util.Scanner;

public class calcy {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int ans = 0;

    while(true)
    {
        System.out.println(" enter opreator : ");
        char op  = input.next().trim().charAt(0);

        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            System.out.println(" enter number : ");

            int num1 = input.nextInt();
            int num2 = input.nextInt();
            if (op == '+') {
                ans = num1 + num2;
            }
            if (op == '-') {
                ans = num1 - num2;

            }
            if (op == '/') {
                ans = num1 / num2;


            }
            if (op == '*') {
                ans = num1 * num2;

            }
            if (op == '%') {
                ans = num1 % num2;}
            } else if (op == 'x'   ) {
                break;
            }
            else {
                System.out.println(" invalid figure : ");
            }
            System.out.println(ans);

        }

    }
    }


