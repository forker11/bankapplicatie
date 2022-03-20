package nl.jamiesoft;

import org.assertj.core.api.Assertions;
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
    void givenWelcomeMessage_whenShowWelcomeMessage_thenWelcomeStringIsReturned() {

        String underTest = menu.showWelcomeMessage(customerName,accountNr);

        Assertions.assertThat(underTest).isEqualTo("  Welkom Jamie met rekeningnr 888989");
    }

    @Test
    void whenShowMenu_thenReturnMenuString() {

        menu.initMenu();

//        Assertions.assertThat(underTest).isEqualTo(" Wat wil je doen?\")
    }
}
