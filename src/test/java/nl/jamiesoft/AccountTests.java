package nl.jamiesoft;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTests {
    private Account account;

    @BeforeEach()
    void init() {

    }

    @Test
    void instiateWithNameAndAccountNr_whenInitalised_ThenJamieAnd1234IsSet() {
        account = new Account("Jamie",1234);

        Assertions.assertThat(account.getCustomerName()).isEqualTo("Jamie");
        Assertions.assertThat(account.getAccountNr()).isEqualTo(1234);
    }

    @Test
    void instiateWithNameAndAccountNr_whenInitalised_ThenFailsTest() {
        account = new Account("Jamie",1234);

        Assertions.assertThat(account.getCustomerName()).isNotEqualTo("Jami");
        Assertions.assertThat(account.getAccountNr()).isNotEqualTo(123);
    }

    @Test
    void setNameAndAccountnr_whenSetCustomerName_thenCustomerNameIsJamie() {

        account = new Account("Jamie");

        Assertions.assertThat(account.getCustomerName()).isEqualTo("Jamie");
    }
}
