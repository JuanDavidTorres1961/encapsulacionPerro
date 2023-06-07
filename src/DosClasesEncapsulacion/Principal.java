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

            rep = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro perro?", "Confirmación", JOptionPane.YES_NO_OPTION);
        } while (rep == JOptionPane.YES_OPTION);

        int opcion = 0;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU DE PERROS'\n"
                    + "1. Consultar perro por forma individual\n"
                    + "2. Imprimir lista completa de los perros\n"
                    + "3. Imprimir la acción de un perro\n"
                    + "4. Imprimir la alimentación de un perro\n"
                    + "5. Salir\n"
                    + "Ingrese la opción que desea"));

            switch (opcion) {
                case 1:
                    int codigoPerro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del perro a consultar"));
                    Perro perro = mapaPerros.get(codigoPerro);
                    if (perro != null) {
                        System.out.println("Información de la mascota:");
                        perro.mostrarInformacion();
                    } else {
                        System.out.println("No se encontró ningún perro con el código especificado.");
                    }
                    break;
                case 2:
                    System.out.println("Lista de perros:");
                    for (Perro m : mapaPerros.values()) {
                        m.mostrarInformacion();
                    }
                    break;
                case 3:
                    codigoPerro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del perro para mostrar la acción"));
                    perro = mapaPerros.get(codigoPerro);
                    if (perro != null) {
                        perro.mostrarAccion();
                    } else {
                        System.out.println("No se encontró ningún perro con el código especificado.");
                    }
                    break;
                case 4:
                    codigoPerro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del perro para mostrar la alimentación"));
                    perro = mapaPerros.get(codigoPerro);
                    if (perro != null) {
                        perro.mostrarAlimentacion();
                    } else {
                        System.out.println("No se encontró ningún perro con el código especificado.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 5);
    }
}