public class Account6 {
    private String id;
    private String name;
    private int balance=0;

    public Account6(String id, String name) {
        this.id=id;
        this.name=name;
    }
    public Account6(String id, String name, int balance) {
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account6 anotherAccount, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            anotherAccount.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}