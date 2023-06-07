package DosClasesEncapsulacion;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        HashMap<Integer, Perro> mapaPerros = new HashMap<>();
        int rep;
        int codigoP = 1;

        do {
            Perro perro = new Perro();
            perro.ingresar();
            mapaPerros.put(codigoP, perro);
            codigoP++;

            rep = JOptionPane.showConfirmDialog(null, "�Desea ingresar otro perro?", "Confirmaci�n", JOptionPane.YES_NO_OPTION);
        } while (rep == JOptionPane.YES_OPTION);

        int opcion = 0;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU DE PERROS'\n"
                    + "1. Consultar perro por forma individual\n"
                    + "2. Imprimir lista completa de los perros\n"
                    + "3. Imprimir la acci�n de un perro\n"
                    + "4. Imprimir la alimentaci�n de un perro\n"
                    + "5. Salir\n"
                    + "Ingrese la opci�n que desea"));

            switch (opcion) {
                case 1:
                    int codigoPerro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el c�digo del perro a consultar"));
                    Perro perro = mapaPerros.get(codigoPerro);
                    if (perro != null) {
                        System.out.println("Informaci�n de la mascota:");
                        perro.mostrarInformacion();
                    } else {
                        System.out.println("No se encontr� ning�n perro con el c�digo especificado.");
                    }
                    break;
                case 2:
                    System.out.println("Lista de perros:");
                    for (Perro m : mapaPerros.values()) {
                        m.mostrarInformacion();
                    }
                    break;
                case 3:
                    codigoPerro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el c�digo del perro para mostrar la acci�n"));
                    perro = mapaPerros.get(codigoPerro);
                    if (perro != null) {
                        perro.mostrarAccion();
                    } else {
                        System.out.println("No se encontr� ning�n perro con el c�digo especificado.");
                    }
                    break;
                case 4:
                    codigoPerro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el c�digo del perro para mostrar la alimentaci�n"));
                    perro = mapaPerros.get(codigoPerro);
                    if (perro != null) {
                        perro.mostrarAlimentacion();
                    } else {
                        System.out.println("No se encontr� ning�n perro con el c�digo especificado.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opci�n inv�lida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 5);
    }
}