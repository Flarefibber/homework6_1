package HW_05_1;


public class MainApp {
    public static void main(String[] args) {
        ObjectQueue q = new ObjectQueue();
        Thread af = new Thread(new AddingFood(q));
        Thread gf = new Thread(new GettingFood(q));
        af.setName("AddingFoodThread");
        gf.setName("GettingFoodThread");
        System.out.println(af);
        System.out.println(gf);
        gf.setDaemon(true);
        af.start();
        gf.start();
        try {
            af.join();
            System.out.println("\nAdd completed\n");
            Thread.sleep(5000);
        } catch (InterruptedException e) {}

        System.out.println("\nMain thread completed\n");
    }
}
