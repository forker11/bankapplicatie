package nl.jamiesoft;

/**
 * Class Menu implements a menu with options on startup
 *
 */

public class Menu {
    String welcomeMessage;
    public String showWelcomeMessage(String customerName, Integer accountNr) {

        welcomeMessage = String.format("  Welkom %s met rekeningnr %s",
                customerName, accountNr);

        return welcomeMessage;
    }
}
