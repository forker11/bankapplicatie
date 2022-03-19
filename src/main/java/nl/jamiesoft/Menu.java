package nl.jamiesoft;

/**
 * Class Menu implements a menu with options on startup
 *
 */

public class Menu {

    public String showWelcomeMessage(String customerName, Integer accountNr) {

        return String.format("  Welkom %s met rekeningnr %s",
                customerName, accountNr);
    }
}
