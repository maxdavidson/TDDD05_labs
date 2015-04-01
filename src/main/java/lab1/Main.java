package lab1;


public class Main {

    public static void main(String[] args) {

        final Storage<BankAccount> aStorage = new Storage<>();
        final Storage<String>      sStorage = new Storage<>();

        final Class<BankAccount> baCls = BankAccount.class;

        try {
            final BankAccount myAccount = baCls.newInstance();
            aStorage.setValue(myAccount);

            // Deposit
            myAccount.deposit(15);
        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        }

        // Do a simple output
        System.out.println(aStorage.getValue().showBalance());

        // Now try to compare
        System.out.println((aStorage.getClass() == sStorage.getClass()) ? "EQUAL" : "NOT EQUAL");
        // EQUAL, due to type erasure. (Relic of generics being added to Java while keeping backwards-compatibility)
    }

}
