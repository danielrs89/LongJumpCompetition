import java.util.ArrayList;

public class Process {
    private static Participant participant = new Participant();
    public static ArrayList<Participant> participantList = new ArrayList<>();

    public static void best2002() {

    }

    public static void orderDorsal() {

    }

    public static void registerParticipant() {

        participant = new Participant(InputManager.getStringNotEmpty("como te llamas"),
                participant.getDorsalNumber(), 
                InputManager.getDoubleNumber("tu mejor marca del 2000"),
                InputManager.getDoubleNumber("tu mejor marca del 2001"),
                InputManager.getDoubleNumber("tu mejor marca del 2002"));

        participantList.add(participant);

    }
}
