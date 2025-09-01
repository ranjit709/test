import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a (integer): ");
        int a = sc.nextInt();
        sc.close();
        for (int k = 1; k <= a; k++) {
            int odd = 2 * k - 1;
            System.out.print(odd);
            if (k < a) {
                System.out.print(", ");
            }
        }
    }
}


    

