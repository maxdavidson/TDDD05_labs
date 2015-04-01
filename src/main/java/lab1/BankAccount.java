package lab1;


class BankAccount {

    private float balance = 100;

    public void deposit(float amount) {
        balance += amount;
    }

    public float showBalance() {
        return balance;
    }

}
