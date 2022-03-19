package nl.jamiesoft;

public class Account {
    private String customerName;
    private Integer accountNr;

    public Account(String customerName,Integer accountNr) {
        setCustomerName(customerName);
        setAccountNr(accountNr);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(Integer accountNr) {
        this.accountNr = accountNr;
    }
}
