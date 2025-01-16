public class App {

    // número de plazas disponible es de 10 (mismo orden inscripcion)
    // 1- Inscribir un participante. Nombre, mejor marca del 2002, mejor marca del
    // 2001 y mejor marca del 2000.
    // 2- Mostrar listado de datos. listado por número de dorsal
    // 3- Mostrar listado por marcas. listado ordenado por la marca del 2002, de
    // mayor a menor.
    // 4- Finalizar el programa.

    private int maxParticipant = 10;
    private static int choice = 0;

    public static void main(String[] args) throws Exception {
        do {
            showMenu();
            choice = InputManager.getNumberRangeSM("", 1, 4);
        } while (choice != 4);

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
                registerParticipant();
                break;
            case 2:
                orderDorsal();
                break;
            case 3:
                best2002();
                break;
            case 4:
                InputManager.limpiarConsola();
                break;
            default:
                showMenu();
                break;
        }

    }

    private static void best2002() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'best2002'");
    }

    private static void orderDorsal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'orderDorsal'");
    }

    private static void registerParticipant() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerParticipant'");
    }
}
