package HW_03_1;

public class Menu {
    private static boolean isExit = false;

    public static void start() {
        MenuUtils.initObjectQueue();
        while (true) {
            printMenu();
            MenuUtils.doChoice();
            MenuUtils.runMenu();
            if (isExit) return;
        }
    }
    private static void printMenu() {
        System.out.println("=====================================================");
        System.out.println("==================Make your choice:==================");
        System.out.println("     1: Create a new stack");
        System.out.println("     2: Add value");
        System.out.println("     3: Get the value of the stack");
        System.out.println("     4: Get the current stack size");
        System.out.println("     5: Test @NotNull");
        System.out.println("     6: Exit");
        System.out.println("=====================================================");
    }
    public static void setIsExit(boolean isExit) {
        Menu.isExit = isExit;
    }
}

