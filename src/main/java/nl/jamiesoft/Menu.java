package nl.jamiesoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class Menu implements a menu with options on startup
 *
 */

public class Menu {
    private final Logger log = LoggerFactory.getLogger(Menu.class);

    public void showMenu(String customerName, Integer accountNr) {
        // Welcome message with user and id
        // Menu options

        log.info("-".repeat(40));
        log.info(String.format("  Welkom %s met rekeningnr %s",customerName,accountNr));
    }
}
