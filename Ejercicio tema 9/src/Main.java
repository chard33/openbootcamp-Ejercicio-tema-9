public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(12000, 29, "Carlos", 123456789);
        Trabajador trabajador = new Trabajador(15000, 33, "Juan", 987654321);

        System.out.format("El cliente %s tiene %d años con un credito de %.2f.\n", cliente.getNombre(), cliente.getEdad()
                , cliente.getCredito());
        System.out.format("El telefono de %s es %d", cliente.getNombre(), cliente.getTelefono());

        System.out.format("\n\nEl trabajador %s tiene %d años con un salario de %.2f.\n", trabajador.getNombre(),
                trabajador.getEdad()
                , trabajador.getSalario());
        System.out.format("El telefono de %s es %d", trabajador.getNombre(), trabajador.getTelefono());
    }
}

class Persona{

    private int edad;
    private String nombre;
    private int telefono;

    public Persona(int edad, String nombre, int telefono){

        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    };

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona{

    private double credito;

    public Cliente(double credito, int edad, String nombre, int telefono){
        super(edad, nombre, telefono);

        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{

    private double salario;

    public Trabajador(double salario, int edad, String nombre, int telefono){
        super(edad, nombre, telefono);

        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}