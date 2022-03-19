package nl.jamiesoft;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MenuTests {

    private Menu menu;
    private String customerName = "Jamie";
    private Integer accountNr = 888989;

    @BeforeEach
    public void init() {
        menu = new Menu();
    }

    @Test
    void showMenu() {
        menu.showMenu(customerName,accountNr);
    }
}
