package DosClasesEncapsulacion;
import java.util.ArrayList;

import javax.print.attribute.standard.JobPriority;
import javax.swing.JOptionPane;

class Perro {

    private String nombre;
    private int edad;
    private String genero;
    private String raza;

    public void inicio() {
        ingresar();
    }

    public void ingresar() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del perro");
        raza = JOptionPane.showInputDialog("Ingrese la raza del perro");
        genero = JOptionPane.showInputDialog("Ingrese el g�nero del perro");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
    }

    public Perro() {
    }

    public Perro(String nombre, String raza, String genero, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            JOptionPane.showMessageDialog(null, "La edad no puede ser un n�mero negativo");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("G�nero: " + genero);
        System.out.println("Edad: " + edad);
    }

    public void mostrarAccion() {
        if (raza.equalsIgnoreCase("Labrador")) {
            System.out.println("Accion del perro Labrador: Buscar objetos");
        } else if (raza.equalsIgnoreCase("Chihuahua")) {
            System.out.println("Accion del perro Chihuahua: Ladrar para alertar sobre posibles peligros.");
        } else if (raza.equalsIgnoreCase("Pastor Australiano")) {
            System.out.println("Accion del perro Pastor Australiano: Realizar saltos y carreras.");
        } else {
            JOptionPane.showMessageDialog(null, "La raza no se reconoci�.");
        }
    }

    public void mostrarAlimentacion() {
        if (edad <= 10) {
            System.out.println("Es un cachorro, su alimentaci�n es baja");
        } else if (edad > 10 && edad <= 20) {
            System.out.println("Es un perro adulto, su alimentaci�n es media");
        } else if (edad > 20 && edad <= 30) {
            System.out.println("Es un perro muy viejo, su alimentaci�n es alta");
        } else {
            JOptionPane.showMessageDialog(null, "La edad es muy alta para un perro");
        }
    }
}