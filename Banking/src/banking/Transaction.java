package banking;
public class Transaction implements Runnable {
	    private BankAccount bankAccount;
	    private boolean deposit;
	    private double amount;
	    public Transaction(BankAccount bankAccount, boolean deposit, double amount) {
	        this.bankAccount = bankAccount;
	        this.deposit = deposit;
	        this.amount = amount;
	    }

	    @Override
	    public void run() {
	        if (deposit) {
	            try {
					bankAccount.deposit(amount);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        } else {
	            try {
					bankAccount.withdraw(amount);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    }
	}

