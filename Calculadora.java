import java.util.Scanner;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Esta clase nos permite realizar operaciones matemáticas como la suma, resta, multiplicación o división.
 * @author Abel Cano Serrano
 * @version 1.0
 */
public class Calculadora {
}

public class Calculadora {
    
    /**
 * Suma dos números.
 * @param a El primer número
 * @param b El segundo número
 * @return La suma de los dos números
 */
    public static int sumando(int a, int b) {
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
    
    /**
 * Realiza la división de dos números.
 * Si el divisor es cero, lanza una excepción.
 * @param a El numerador
 * @param b El divisor
 * @return El resultado de la división
 * @throws ArithmeticException Si el divisor es cero
 */
   
    public static int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero, lanzando excepción");
            throw new ArithmeticException("No se puede dividir por cero");
        }
        System.out.println("Realizando división: " + a + " / " + b);
        return a / b;
    }
    
    public static int calculadora(int a, int b, char operacion) {
        switch (operacion) {
            case '+': System.out.println("Realizando suma: " + a + " + " + b);
                return a + b;
            case '-': return restar(a, b);
            case '*': return multiplicar(a, b);
            case '/': return dividir(a, b);
            default: throw new IllegalArgumentException("Operación no válida");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int n1 = scanner.nextInt();
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
