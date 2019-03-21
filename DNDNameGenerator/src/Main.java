import Races.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        DwarvenNames dwarvenName = new DwarvenNames();
        ElvishNames elvishName = new ElvishNames();
        HalflingNames halflingName = new HalflingNames();
        DragonbornNames dragonbornName = new DragonbornNames();
        GnomeNames gnomeName = new GnomeNames();
        HalfOrcNames halfOrcName = new HalfOrcNames();
        TieflingNames tieflingName = new TieflingNames();

        boolean valid = true;

        while (valid) {
            System.out.println("Dwarf      ( 1)\n" +
                    "Elf        ( 2)\n" +
                    "Halfing    ( 3)\n" +
                    "Dragonborn ( 4)\n" +
                    "Gnome      ( 5)\n" +
                    "Half-Orc   ( 6)\n" +
                    "Tiefling   ( 7)\n" +
                    "Exit       (20)"
            );
            System.out.print("Enter the number corresponding to your race: ");
            int raceChoice = kb.nextInt();
            int choice = 0;

            switch (raceChoice) {
                case 1:
                    System.out.print("Male (1) or Female (2): ");
                    choice = kb.nextInt();
                    if (choice == 1) {
                        System.out.println("First name: " + dwarvenName.createMaleName());
                        System.out.println("Clan name: " + dwarvenName.createClanName());
                    } else if (choice == 2) {
                        System.out.println("First name: " + dwarvenName.createFemaleName());
                        System.out.println("Clan name: " + dwarvenName.createClanName());
                    } else {
                        System.out.println("Enter 1 for male or enter 2 for female");
                    }
                    break;
                case 2:
                    System.out.print("Male (1) or Female (2): ");
                    choice = kb.nextInt();
                    if (choice == 1) {
                        System.out.println("First name: " + elvishName.createMaleName());
                        System.out.println("Family name: " + elvishName.createFamilyName());
                    } else if (choice == 2) {
                        System.out.println("First name: " + elvishName.createFemaleName());
                        System.out.println("Family name: " + elvishName.createFamilyName());
                    } else {
                        System.out.println("Enter 1 for male or enter 2 for female");
                    }
                    break;
                case 3:
                    System.out.print("Male (1) or Female (2): ");
                    choice = kb.nextInt();
                    if (choice == 1) {
                        System.out.println("First name: " + halflingName.createMaleName());
                        System.out.println("Family name: " + halflingName.createFamilyName());
                    } else if (choice == 2) {
                        System.out.println("First name: " + halflingName.createFemaleName());
                        System.out.println("Family name: " + halflingName.createFamilyName());
                    } else {
                        System.out.println("Enter 1 for male or enter 2 for female");
                    }
                    break;
                case 4:
                    System.out.print("Male (1) or Female (2): ");
                    choice = kb.nextInt();
                    if (choice == 1) {
                        System.out.println("First name: " + dragonbornName.createMaleName());
                        System.out.println("Clan name: " + dragonbornName.createClanName());
                    } else if (choice == 2) {
                        System.out.println("First name: " + dragonbornName.createFemaleName());
                        System.out.println("Clan name: " + dragonbornName.createClanName());
                    } else {
                        System.out.println("Enter 1 for male or enter 2 for female");
                    }
                    break;
                case 5:
                    System.out.print("Male (1) or Female (2): ");
                    choice = kb.nextInt();
                    if (choice == 1) {
                        System.out.println("First name: " + gnomeName.createMaleName());
                        System.out.println("Clan name: " + gnomeName.createClanName());
                    } else if (choice == 2) {
                        System.out.println("First name: " + gnomeName.createFemaleName());
                        System.out.println("Clan name: " + gnomeName.createClanName());
                    } else {
                        System.out.println("Enter 1 for male or enter 2 for female");
                    }
                    break;
                case 6:
                    System.out.print("Male (1) or Female (2): ");
                    choice = kb.nextInt();
                    if (choice == 1) {
                        System.out.println("First name: " + halfOrcName.createMaleName());
                    } else if (choice == 2) {
                        System.out.println("First name: " + halfOrcName.createFemaleName());
                    } else {
                        System.out.println("Enter 1 for male or enter 2 for female");
                    }
                    break;
                case 7:
                    System.out.print("Male (1) or Female (2): ");
                    choice = kb.nextInt();
                    if (choice == 1) {
                        System.out.println("First name: " + tieflingName.createMaleName());
                    } else if (choice == 2) {
                        System.out.println("First name: " + tieflingName.createFemaleName());
                    } else {
                        System.out.println("Enter 1 for male or enter 2 for female");
                    }
                    break;
                case 20:
                    valid = false;
                    System.out.println("Good Bye.");
                    break;
            }
            System.out.println();
        }
    }
}
