class Account {
    void deposit(int amount) {
        System.out.println("Account Class :: Deposit Amount " + amount);
    }

    void Withdraw(int amount) {
        System.out.println("Account Class :: WithdrawAmount " + amount);
    }

    void roi() {
        System.out.println("Account Class :: ROI 4%");
    }

}

// extends keyword - inheritence
class SavingAccount extends Account {
    void limit() {
        System.out.println("Limit of trans. in savings account");
    }

}

class CurrentAccount extends Account {
    void limit() {
        System.out.println("OD limit in current account");
    }

    // overriding-when u do inheritence we get the parent features in chile(code
    // reusability)
    // but some of the features for a child is outdated so child need its own
    // features thats why we do overriding
    // when we do overriding the parent version hides only child version is shown
    @Override // annotation for marking that we are doing overriding
    void roi() {
        System.out.println("ROI PAY 5%");

    }
}

class AccountCaller {
    void callAccount(Account account) {
        account.deposit(10000);
        account.Withdraw(2000);
        account.roi();
        System.out.println("**********************************");
        if (account instanceof SavingAccount) {
            // downcasting
            ((SavingAccount) account).limit();

        }

    }
}

public class ISA {
    public static void main(String[] args) {
        AccountCaller ac = new AccountCaller();
        ac.callAccount(new SavingAccount());
        ac.callAccount(new CurrentAccount());

        // Account acc = new SavingAccount();// upcasting -child casted to parent
        // acc.deposit(10000);
        // acc.Withdraw(2000);
        // .roi();
        // acc.limit();

        // acc = new CurrentAccount();
        // SavingAccount sa = new SavingAccount();
        // sa.deposit(10000);
        // sa.Withdraw(2000);
        // sa.roi();
        // sa.limit();
        // System.out.println("**********************************");
        // CurrentAccount ca = new CurrentAccount();
        // ca.deposit(10000);
        // ca.Withdraw(2000);
        // ca.roi();
    }

}
