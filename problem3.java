import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a (integer): ");
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd);
            if (i < num) {
                System.out.print(", ");
            }
        }
    }
}


    

