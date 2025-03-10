import java.util.Scanner;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Calculadora {
    
    public static int sumar(int a, int b) {
        System.out.println("Realizando suma: " + a + " + " + b);
        return a + b;
    }
    
    public static int restar(int a, int b) {
        System.out.println("Realizando resta: " + a + " - " + b);
        return a - b;
    }
    
    public static int multiplicar(int a, int b) {
        System.out.println("Realizando multiplicación: " + a + " * " + b);
        return a * b;
    }
    
    public static int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero, lanzando excepción");
            throw new ArithmeticException("No se puede dividir por cero");
        }
        System.out.println("Realizando división: " + a + " / " + b);
        return a / b;
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
    public static double media(double a, double b){

        return (a + b)/ 2;
    }
    
    public static int calculadora(int a, int b, char operacion) {
        switch (operacion) {
            case '+': return sumar(a, b);
            case '-': return restar(a, b);
            case '*': return multiplicar(a, b);
            case '/': return dividir(a, b);
            default: throw new IllegalArgumentException("Operación no válida");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);
        
        try {
            int resultado = calculadora(num1, num2, operacion);
            System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("---Inicio de las pruebas---");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("---Final de las pruebas---");
    }
}
