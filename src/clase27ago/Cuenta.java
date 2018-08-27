package clase27ago;

public class Cuenta {
    private int number;
    private int pass;
    private String owner;
    private double balance;
    
    public Cuenta(int number, int pass, String owner, double balance) {
        this.number = number;
        this.pass = pass;
        this.owner = owner;
        this.balance = balance;
        
        System.out.println("Cuenta creada con el numero " + number);
    }

    Cuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }     
                   
    public boolean consignar(double d) {
        if(d > 0){
            this.balance += d;
            System.out.println("Consignacion realizada a la cuenta #" + this.number);
            System.out.println("Nuevo saldo: " + this.balance);
            return true;
        } else {
            System.out.println("Operacion fallida");
            return false;
        }
    }
    
    public boolean retirar(double d) {
        if(d > balance) {
            System.out.println("No hay suficientes fondos");
            return true;
        } else {
            this.balance -= d;
            System.out.println("Nuevo saldo: " + this.balance);
            return false;
        }
    }
    
    public boolean cambiarClave(int c) {
        if(c == this.pass){
            System.out.println("No puede usar la misma clave!");
            return false;
        } else {
            this.pass = c;
            System.out.println("Su nueva clave es: " + this.pass);
            return true;
        }
    }
    
    public double obtenerSaldo() {
        System.out.println("Su saldo es: $" + balance);
        return this.balance;
    }
    
}
