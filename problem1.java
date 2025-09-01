import java.util.Scanner;
class calculator {
    public static double calculate(double a, double b, String operation) {
        operation = operation.toLowerCase();
        Scanner sc = new Scanner(System.in);
            switch(operation) {
                case "add":
                    return a + b;
                case "subtract":
                    return a - b;
                case "multiply":
                    return a * b;
                case "divide":
                    if (b != 0) {
                        return a / b;
                    } else {
                        System.out.println(" you enter invalid number ");
                        return 0;
                    }
                default:
                    System.out.println("Invalid operation");
                    return 0;
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.next();
        double result = calculate(num1, num2, operation);
        System.out.println("Result: " + result);

        sc.close();
        
        
    }
    
}




    

    
