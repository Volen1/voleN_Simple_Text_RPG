package text_adventure;

import java.util.Scanner;


public class textAdventure
{
    public static void main(String args[])
    {
        String playerMovement = "";

        // Intance of Scanner class, allows for input
        Scanner s = new Scanner(System.in);

        // Intro message, as well as basic data collection
        System.out.println("Welcome to voleN\'s Text RPG!");
        System.out.println("");
        System.out.println("WARNING: If you exit the program for ANY reason, all of you data will be LOST!");
        System.out.println("");

        System.out.println("Note: When Prompted for Movement. You may use \"North\", \"South\", \"East\", and \"East\"");
        System.out.println("");

        System.out.println("What is your name?");
        String playerName = s.nextLine();
        System.out.println("Your name is: " + playerName);

        System.out.println("What class would you like to be? (Warrior, Wizard, or Rogue)");
        String playerClass = s.nextLine();
        System.out.println("You have chosen " + playerClass);

        // Determines what the player starts with based on class chosen
        if(playerClass.equalsIgnoreCase("warrior"))
        {
            System.out.println("");
            System.out.println("You start with a Broadsword!");
            System.out.println("Damage: 5, Durability: 10");
            System.out.println("");
            System.out.println("You also start with Basic Chainmail!");
            System.out.println("Protection: 3, Durability: 10");
        }
        else if(playerClass.equalsIgnoreCase("wizard"))
        {
            System.out.println("");
            System.out.println("You start with a Twig Wand!");
            System.out.println("Damage: 8, Durability: 10");
            System.out.println("");
            System.out.println("You also start with Basic Wizard Robes!");
            System.out.println("Protection: 1, Durability: 10");
        }
        else if(playerClass.equalsIgnoreCase("rogue"))
        {
            System.out.println("");
            System.out.println("You start with a Dagger!");
            System.out.println("Damage: 3, Durability: 10");
            System.out.println("");
            System.out.println("You also start with Basic Leather Armor!");
            System.out.println("Protection: 2, Durability: 10");
            System.out.println("");
            System.out.println("You can \"Stealth\" to do more damage!");
        }
        else {
            System.out.println("You\'ve managed to pick something that isn't a class. Well done. Have shit gear!");
            System.out.println("");
            System.out.println("You start with a Dildo!");
            System.out.println("Damage: 1, Durability: 500");
            System.out.println("");
            System.out.println("You also start with no armor!");
            System.out.println("Protection: 3, Durability: 10");
        }

        System.out.println("");
        System.out.print("Now that you have chosen " + playerClass + ", " + playerName);
        System.out.println(" You may begin your journey!");

        System.out.println("Are you ready to start? (Y/N)");
        char start = s.findInLine(".").charAt(0);

        if(start == 'n' || start == 'N')
        {
            System.out.println("You have selected " + start + ", as such the program shall end.");
            System.exit(0);
        }

        System.out.println("");
        System.out.println("You begin in a bed. Groggy, with very little memory!");
        System.out.println("");
        System.out.println("How would you like to proceed?");





    }
}
