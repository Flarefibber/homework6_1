package HW_04_1.view;

import HW_04_1.controller.DeveloperController;
import HW_04_1.model.Developer;

import java.util.Collection;
import java.util.Scanner;

public class DeveloperView {
    private DeveloperController controller = new DeveloperController();
    private static boolean isExit = false;
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;

    public void showStartMenu(){
        while (true) {
            printMenu();
            doChoice();
            runMenu();
            if (isExit) return;
        }
    }

    private static void printMenu() {
        System.out.println("\n=====================================================");
        System.out.println("==================Make your choice:==================");
        System.out.println("     1: Get all developers");
        System.out.println("     2: Add developer");
        System.out.println("     3: Update developer");
        System.out.println("     4: Remove developer");
        System.out.println("     5: Search by developer ID");
        System.out.println("     6: Exit");
        System.out.println("=====================================================\n");
    }

    private void runMenu() {
        switch (choice)  {
            case 1: getAll(); break;
            case 2: save(); break;
            case 3: update(); break;
            case 4: remove(); break;
            case 5: getById(); break;
            default: setIsExit();
        }
    }

    private void doChoice() {
        do {
            choice = readInt("Your choice is: \n");
        } while (choice < 1 || choice > 6);
    }


    private void getById () {
        try {
        Long id;
        System.out.print("\nEnter the developer's ID:\n");
        while ((id  = readLong("\nEnter ID (not less than zero):\n")) < 0);
        Developer developer = controller.getById(id);
        if (developer.getId() != null) {
            System.out.print("\nFound " + developer +"\n");
        } else {
            System.out.print("\nDeveloper not found.\n");
        }
        } catch (NullPointerException e) {
            System.out.print("\nDevelopers are missing.\n");
        }
    }
    private void save () {
        Long id;
        Double salary;
        Scanner in = new Scanner(System.in);
        Developer developer = new Developer();
        while ((id  = readLong("\nEnter ID (not less than zero):\n")) < 0);
        if (controller.getById(id) != null){
            System.out.print("\nDeveloper with such ID already exists.\n");
            save();
        } else {
            developer.setId(id);
            System.out.print("\nEnter developer name:\n");
            developer.setFirstName(in.nextLine());
            System.out.print("\nEnter the developer's surname:\n");
            developer.setLastName(in.nextLine());
            System.out.print("\nEnter the developer specialty:\n");
            developer.setSpecialty(in.nextLine());
            while ((salary = readDouble("\nEnter the salary (more than zero):\n")) <= 0) ;
            developer.setSalary(salary);
            controller.save(developer);
            System.out.print("\nSaved " + developer + "\n");
        }
    }
    private void update () {
        try {
        Long id;
        while ((id  = readLong("\nEnter the developer ID to update (not less than zero):\n")) < 0);
        if (controller.getById(id) != null) {
            Double salary;
            Scanner in = new Scanner(System.in);
            Developer developer = new Developer();
        developer.setId(id);
        System.out.print("\nEnter developer name:\n");
        developer.setFirstName(in.nextLine());
        System.out.print("\nEnter the developer's surname:\n");
        developer.setLastName(in.nextLine());
        System.out.print("\nEnter the developer specialty:\n");
        developer.setSpecialty(in.nextLine());
        while ((salary  = readDouble("\nEnter the salary (more than zero):\n")) < 0);
        developer.setSalary(salary);
        controller.update(developer);
        } else {
            System.out.print("\nDeveloper not found.\n");
        }
        } catch (NullPointerException e) {
            System.out.print("\nDevelopers are missing.\n");
        }
    }
    private void remove () {
        try {
        Long id;
        System.out.print("\nEnter the developer ID for removed:\n");
        while ((id  = readLong("\nEnter ID (not less than zero):\n")) < 0);
        Developer developer = controller.getById(id);
        if (developer.getId() != null) {
            controller.remove(developer);
            System.out.print("\nRemoved " + developer +"\n");
        } else {
            System.out.print("\nDeveloper not found.\n");
        }
        } catch (NullPointerException e) {
            System.out.print("\nDevelopers are missing.\n");
        }

    }
    private void getAll () {
        try {
        Collection<Developer> developers = controller.getAll();
        for (Developer all : developers) {
            System.out.print(all);
        }
        } catch (NullPointerException e) {
            System.out.print("\nDevelopers are missing.\n");
        }

    }
    private static int readInt(String request) {
        System.out.print(request);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print(request);
            }
        }
    }
    private static long readLong(String request) {
        System.out.print(request);
        while (true) {
            try {
                return Long.parseLong(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print(request);
            }
        }
    }
    private static double readDouble(String request) {
        System.out.print(request);
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print(request);
            }
        }
    }
    private static void setIsExit() {
        DeveloperView.isExit = true;
    }
}
