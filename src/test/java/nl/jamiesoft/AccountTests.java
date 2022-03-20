package nl.jamiesoft;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTests {
    private Account account;

    @BeforeEach()
    void init() {

    }

    @Test
    void instantiateWithNameAndAccountNr_whenInitalised_ThenJamieAnd1234IsSet() {
        account = new Account("Jamie",1234);

        assertThat(account.getCustomerName()).isEqualTo("Jamie");
        assertThat(account.getAccountNr()).isEqualTo(1234);
    }

    @Test
    void instantiateWithNameAndAccountNr_whenInitalised_ThenFailsTest() {
        account = new Account("Jamie",1234);

        assertThat(account.getCustomerName()).isNotEqualTo("Jami");
        assertThat(account.getAccountNr()).isNotEqualTo(123);
    }

    @Test
    void givenAccountBalance_whenCheckBalance_thenReturnsCorrectBalance() {
        Account account = new Account("Jamie",1234);
        Double underTest;

        underTest = account.getBalance();

        assertThat(underTest).isEqualTo(1001.21);

    }

}
