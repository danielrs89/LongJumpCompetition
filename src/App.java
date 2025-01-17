public class App {

    // número de plazas disponible es de 10 (mismo orden inscripcion)
    // 1- Inscribir un participante. Nombre, mejor marca del 2002, mejor marca del
    // 2001 y mejor marca del 2000.
    // 2- Mostrar listado de datos. listado por número de dorsal
    // 3- Mostrar listado por marcas. listado ordenado por la marca del 2002, de
    // mayor a menor.
    // 4- Finalizar el programa.

    private static int maxParticipant = 10;
    private static int choice = 0;

    public static void main(String[] args) throws Exception {
        
        try {
            do {
                showMenu();
                choice = InputManager.getNumberRangeSM("", 1, 4);
                optionMenu(choice);    
            } while (choice != 4);
        } catch (Exception e) {
            System.out.println("Error -> "+e.getMessage());
        }

    }

    public static void showMenu() {
        System.out.println("1- Inscribir un participante.");
        System.out.println("2- Mostrar listado de datos.");
        System.out.println("3- Mostrar listado por marcas.");
        System.out.println("4- Finalizar el programa.");
    }

    public static void optionMenu(int choice) {
        switch (choice) {
            case 1:
                if (maxParticipant != 0) {
                    Process.registerParticipant();
                    maxParticipant--;
                    System.out.println("¡Dorsal registrado con éxito!");
                }
                // System.out.println("MAXIMOS PARTICIPANTES -> "+maxParticipant);
                // for (Participant p : Process.participantList) {
                //     System.out.println(p.toString());    
                // }
                break;
            case 2:
                Process.orderDorsal();
                break;
            case 3:
                // Process.best2002();
                break;
            case 4:
                InputManager.limpiarConsola();
                break;
            default:
                showMenu();
                break;
        }

    }

}
