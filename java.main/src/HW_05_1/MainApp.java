package HW_05_1;


public class MainApp {
    public static void main(String[] args) {
        ObjectQueue q = new ObjectQueue();
        AddingFood  addingFood = new AddingFood(q);
        GettingFood  gettingFood = new GettingFood(q);
        Thread af = new Thread(addingFood);
        Thread gf = new Thread(gettingFood);
        gf.setDaemon(true);
        af.start();
        gf.start();
        try {
            af.join();
            System.out.println("\nAdd completed\n");
            Thread.sleep(100);
        } catch (InterruptedException e) {}

        System.out.println("\nMain thread completed\n");
    }

}
