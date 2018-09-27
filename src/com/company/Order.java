package src.com.company;

import java.util.Scanner;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {

        System.out.println("Choix menu");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        switch (nbMenu) {
            case 1 :
                System.out.println("Vous avez choisi le menu : poulet");
                break;
            case 2 :
                System.out.println("Vous avez choisi le menu : boeuf");
                break;
            case 3 :
                System.out.println("Vous avez choisi le menu : végétarien");
                break;
            default :
                System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
                break;
        }
    }

    public void runMenu() {
        this.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nbMenu = sc.nextInt();
        this.displaySelectedMenu(nbMenu);
        switch (nbMenu) {
            case 1:
                displayAvalaibleSide(true);
                int nbSide = sc.nextInt();
                displaySelectedSide(nbSide, true);
                displayAvailableDrink();
                int nbDrink = sc.nextInt();
                displaySelectedDrink(nbDrink);
                break;
            case 2 :
                displayAvalaibleSide(true);
                nbSide = sc.nextInt();
                displaySelectedSide(nbSide, true);
                break;
            case 3 :
                displayAvalaibleSide(false);
                nbSide = sc.nextInt();
                displaySelectedSide(nbSide, false);
                displayAvailableDrink();
                nbDrink = sc.nextInt();
                displaySelectedDrink(nbDrink);
                break;

        }
    }

    /**
     * Display a choice from a selection of drinks
     */
    private void displayAvailableDrink() {
        System.out.println("Choix de la boisson :");
        System.out.println("1 - eau plate");
        System.out.println("2 - eau gazeuse");
        System.out.println("3 - soda");
        System.out.println("Que souhaitez-vous comme boisson ?");
    }

    /**
     * Display on screen the available sides depending on the chosen menu
     * @param allSidesEnable : enable the sides in case of true
     */
    private void displayAvalaibleSide(boolean allSidesEnable) {
        System.out.println("Choix de l'accompagnement :");
        if (allSidesEnable) {
            System.out.println("1 - Légumes frais");
            System.out.println("2 - Frites");
            System.out.println("3 - Riz");
        }
        else
        {
            System.out.println("1 - Riz");
            System.out.println("1 - Pas de riz");
        }
        System.out.println("Que souhaitez-vous comme accompagnement ?");
    }

    /**
     * Display a selected side depending on all sides available or not
     * All sides : vegetables, fries and rice
     * Not all sides : rice or not
     * @param nbSide : the selected side
     * @param allSidesEnable : enables display for all sides or not
     */

    public void displaySelectedSide(int nbSide, boolean allSidesEnable) {
        if (allSidesEnable) {
            switch (nbSide) {
                case 1 :
                    System.out.println("Vous avez choisi l'accompagnement : Légumes frais");
                    break;
                case 2 :
                    System.out.println("Vous avez choisi l'accompagnement : Frites");
                    break;
                case 3 :
                    System.out.println("Vous avez choisi l'accompagnement : Riz");
                    break;
                default:
                    System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                    break;
            }
        } else {
            switch (nbSide) {
                case 1 :
                    System.out.println("Vous avez choisi l'accompagnement : Riz");
                    break;
                case 2:
                    System.out.println("Vous avez choisi l'accompagnement : pas de riz");
                    break;
                default:
                    System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                    break;

            }
        }
    }

    /**
     * Display the selected drink
     * @param nbDrink : the selected drink
     */

    public void displaySelectedDrink(int nbDrink) {
        switch (nbDrink) {
            case 1 :
                System.out.println("Vous avez choisi la boisson : eau plate");
                break;
            case 2 :
                System.out.println("Vous avez choisi la boisson : eau gazeuse");
                break;
            case 3 :
                System.out.println("Vous avez choisi la boisson : soda");
                break;
            default :
                System.out.println("Vous n'avez pas choisi de boisson parmi celles proposées");
                break;
        }
    }
}