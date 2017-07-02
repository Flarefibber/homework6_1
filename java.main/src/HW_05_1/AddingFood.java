package HW_05_1;

public class AddingFood implements Runnable{
    private ObjectQueue q;

    public AddingFood(ObjectQueue q) {
        this.q=q;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            Beverages beverages = new Beverages();
            beverages.setName("Water"+i);
            beverages.setPrice(20.00);
            System.out.println("Add "+beverages);
            q.push(beverages);
            Sandwiches sandwiches = new Sandwiches();
            sandwiches.setName("Burger"+i);
            sandwiches.setPrice(10.00);
            System.out.println("Add "+sandwiches);
            q.push(sandwiches);
        }
    }
}
