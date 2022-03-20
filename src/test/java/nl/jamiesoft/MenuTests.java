package nl.jamiesoft;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MenuTests {

    private Menu menu;
    private String customerName;
    private Integer accountNr;

    @BeforeEach
    public void init() {
        menu = new Menu();
        customerName = "Jamie";
        accountNr = 888989;
    }

    @Test
    void givenWelcomeMessage_whenShowWelcomeMessage_thenWelcomeStringIsReturned() {

        String underTest = menu.showWelcomeMessage(customerName,accountNr);

        assertThat(underTest).isEqualTo("  Welkom Jamie met rekeningnr 888989");
    }

    @Test
    void givenOptionAorLowerCaseA_whenGetUserOption_thenAIsReturned() {

        char underTest = menu.getUserOption();

        assertThat(underTest).isEqualTo('A');
    }

    @Test
    void testInitMenu(){
        menu.initMenu();
    }
}
