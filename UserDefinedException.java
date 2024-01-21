import java.util.Random;

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            Rocket rock = new Rocket();
            rock.launch();
        } catch (ignitionException e) {
            System.out.println("ERROR! " + e.getMessage());
            System.out.println("Mission abort!");
        } catch (boosterException e) {
            System.out.println("ERROR! " + e.getMessage());
        }
    }
}

class ignitionException extends Exception {
    ignitionException(String message) {
        super(message);
    }
}

class boosterException extends RuntimeException {
    boosterException(String message) {
        super(message);
    }
}

class Rocket {
    boolean systemFailure = false;
    float exitForce;

    Random random = new Random();

    void checkSystemFailure() {
        systemFailure = random.nextBoolean();
    }

    void checkExitForce() {
        exitForce = (float) (Math.random() % 10 + 10.6);
    }

    void launch() throws ignitionException {
        System.out.println("Checking System failure....");
        checkSystemFailure();
        if (systemFailure)
            throw new ignitionException("Ignition failed due to system failure!!");
        System.out.println("Ready to Launch");
        checkExitForce();
        if (exitForce < 11.2)
            throw new boosterException("Failed to beat the gravity due to less exit force!!");
        System.out.println("Rocket successfully launched.");

    }
}