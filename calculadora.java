import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada del primer número
        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();
        // Entrada del operador
        System.out.print("Ingresa una operacion (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        // Entrada del segundo número
        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();
        double resultado;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("error: no se puede dividir por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
