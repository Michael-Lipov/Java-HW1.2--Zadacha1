public class Main {
    public static void main(String[] args) {
        int account = 2_000_000_000;
        System.out.println("account: " + account);
        int transfer = 500_000_000;
        System.out.println("transfer: " + transfer);
        int balance = account + transfer;
        System.out.println("balance: " + balance);
    }
}
