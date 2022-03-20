package nl.jamiesoft;

/**
 * Class Menu implements a menu with options on startup
 *
 */

public class Menu {

    public void initMenu(){
        System.out.println(showWelcomeMessage("Jamie",1234));;
        System.out.println(showMenu());
    }

    public String showWelcomeMessage(String customerName, Integer accountNr) {
        return String.format("Welkom %s met rekeningnr %s\n",
                customerName, accountNr);
    }

    public String showMenu() {
            StringBuilder sb = new StringBuilder();
            sb.append("Wat wil je doen?\n\n");
            sb.append("A. Saldo bekijken\n");
            sb.append("B. Geld storten\n");
            sb.append("C. Geld opnemen\n");
            sb.append("D. Vorige transactie bekijken\n");
            sb.append("E. Rente berekenen\n");
            sb.append("F. Afsluiten");

            return sb.toString();
    }
}
