package cas.oBcIntProg;

public class Main {

    public static void main(String[] args) {

// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito,
// tienes que darles valor y mostrarlas por pantalla.

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Cristian Ariel Sanguinetti";
        cliente.edad = 43;
        cliente.telefono = 987654321;
        cliente.credito = 500000.00;
        System.out.println("Mi nombre es " + cliente.nombre + ", soy un cliente de " + cliente.edad + " años de edad, mi telefono es " + cliente.telefono + " y dispongo de un credito de $" + cliente.credito + ".");

        trabajador.nombre = "Tronco";
        trabajador.edad = 42;
        trabajador.telefono = 123456789;
        trabajador.salario = 95000.00;
        System.out.println("Soy un trabajador de nombre " + trabajador.nombre + ", de " + trabajador.edad + " años de edad, mi telefono es " + trabajador.telefono
                + "y el salario que persivo es de $" + trabajador.salario + ".");

    }
}

// Crea una clase Persona con las siguientes variables: La edad, el nombre y el teléfono.
class Persona{
    int edad;
    int telefono;
    String nombre;
}
// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
// esta nueva clase tendrá la variable credito solo para esa clase
class Cliente extends Persona{
    double credito;
}
// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona y con una variable salario
// que solo tenga la clase Trabajador.
class Trabajador extends Persona {
    double salario;
}