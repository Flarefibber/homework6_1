package HW_05_1;

public class GettingFood implements Runnable{
    private ObjectQueue q;

    public GettingFood(ObjectQueue q) {
        this.q=q;
    }

    @Override
    public void run() {
        while (true) {
            if (q.size() != 0) {
                System.out.println("Pull "+q.pull());
            }

        }

    }
}
