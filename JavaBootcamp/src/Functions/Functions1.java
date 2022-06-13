package Functions;

public class Functions1 {
    public static void main(String[] args) {
        System.out.println("Waiter : I hope you enjoyed your meal");
        System.out.print("Thank you! ");
        tipTheWaiter(100);
    }

    public static void tipTheWaiter(double bill) {
        double tip = bill * 0.15;
        System.out.println("Your service was wonderful! Please, accept this tip : " + tip + "$");
    }

}
