package clase27ago;
import java.util.Scanner;

public class Clase27Ago {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta: ");
        int number = scanner.nextInt();
        System.out.println("Ingrese la clave: ");
        int pass = scanner.nextInt();
        System.out.println("Ingrese dueno: ");
        String owner = scanner.next();
        System.out.println("Saldo inicial: ");
        double balance = scanner.nextDouble();
        Cuenta c1 = new Cuenta(number, pass, owner, balance);
    }
}
