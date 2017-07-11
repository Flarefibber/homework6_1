package HW_06_1.Adapter;

public class Client {
    public static void main (String [] args){
        Chief chief = new ChiefAdapter();

        System.out.println(chief.makeBreakfast());
        System.out.println(chief.makeDinner());
        System.out.println(chief.makeSupper());
    }
}
