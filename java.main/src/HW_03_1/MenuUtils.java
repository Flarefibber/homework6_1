package HW_03_1;

import java.util.Scanner;

public class MenuUtils {
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;
    private static ObjectQueue queue;


    public static void runMenu() {
        switch (choice)  {
            case 1: initObjectQueue(); break;
            case 2: pushQueue(); break;
            case 3: pullbackQueue(); break;
            case 4: sizeQueue(); break;
            case 5: printTestNotNull(); break;
            default: runExitMenu();
        }
    }

    private static void printTestNotNull() {
        try {
        System.out.print("\nInteger = "+queue.testNotNull()+"\n");
        } catch (IllegalStateException e) {
            System.out.print("\nInteger =  null\n");
        }
    }
    public static void doChoice() {
        do {
            choice = readInt("Your choice is: \n");
        } while (choice < 1 || choice > 6);
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
    public static void initObjectQueue() {
        int size;
        choice = -1;
        System.out.print("\nDo you want to set the size of the stack?\n");
        while ((choice < 1) || (choice > 2)) {
            choice = readInt("Enter 1 - Yes; \nEnter 2 - No; \n");
        }
        if (choice == 1){
        while ((size  = readInt("\nEnter the size of the stack (<1): \n")) < 1);
            try {
        queue = new ObjectQueue(size);
            } catch (StackException e) {
                e.printStackTrace();
            }
        }
        else queue = new ObjectQueue();
    }

    private static void pushQueue(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a value for the stack: \n");
        queue.push(in.nextLine());
    }

    private static void pullbackQueue() {
        Object obj = queue.pullback();
        if (obj == null) System.out.print("\nStack is empty\n");
        else  System.out.print("\nStack element = " + obj + "\n");
    }

    private static void sizeQueue() {
        System.out.print("\nCurrent stack size: "+queue.size()+"\n");
    }

    private static void runExitMenu() {
        Menu.setIsExit(true);
    }
}
