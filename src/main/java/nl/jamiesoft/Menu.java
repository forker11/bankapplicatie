package nl.jamiesoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Class Menu implements a menu with options on startup
 *
 */

public class Menu {
    private static Logger log = LoggerFactory.getLogger(Menu.class);

    public void initMenu(){
        char selectedOption = '\u0000';
        System.out.println(showWelcomeMessage("Jamie",1234));
        System.out.println(showMenu());
        do {
            selectedOption = getUserOption();
            executeSelectedOption(selectedOption);
        }while(selectedOption != 'Q');
    }

    public String showWelcomeMessage(String customerName, Integer accountNr) {
        return String.format("Welkom %s met rekeningnr %s\n\nMaak een keuze:\n",
                customerName, accountNr);
    }

    public String showMenu() {
            StringBuilder sb = new StringBuilder();
            sb.append("A. Saldo bekijken\n");
            sb.append("B. Geld storten\n");
            sb.append("C. Geld opnemen\n");
            sb.append("D. Vorige transactie bekijken\n");
            sb.append("E. Rente berekenen\n");
            sb.append("F. Menu tonen\n");
            sb.append("Q. Afsluiten\n\n");
            sb.append("Kies een optie:");

            return sb.toString();
    }

    public char getUserOption() {
        Scanner scanner = new Scanner(System.in);
        char optionInput = scanner.next().charAt(0); // Get first character of input
        char option = Character.toUpperCase(optionInput);
        if(option == 'Q'){
            scanner.close();
        }
        return option;
    }

    public void executeSelectedOption(char selectedOption) {
        switch(selectedOption){
            case 'A':
                System.out.println("saldo bekijken");
                break;
            case 'B':
                System.out.println("Geld storten");
                break;
            case 'C':
                System.out.println("Geld opnemen");
                break;
            case 'D':
                System.out.println("Vorige transactie bekijken");
                break;
            case 'E':
                System.out.println("Rente berekenen");
                break;
            case 'F':
                System.out.println(showMenu());
                break;
            case 'Q':
                System.out.println("Afsluiten");
                break;
            default:
                System.out.println("Geen geldig keuze gemaakt. Kies opnieuw.");
        }
    }
}
