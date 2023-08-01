package banking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	    private int accNo;
	    private double balance;
	    private boolean overdraftFacility;
	    private double remainingMonthlyDeposit;
	    private Lock lock;
	    
	    public BankAccount(int accountNumber, double balance, boolean overdraftFacility) {
	        this.accNo = accountNumber;
	        this.balance = balance;
	        this.overdraftFacility = overdraftFacility;
	        this.remainingMonthlyDeposit = 20000.00;
	        this.lock = new ReentrantLock();
	    }

	    public void deposit(double amount) throws InterruptedException {
	        lock.lock();
	        Thread.sleep(2000);
	        //System.out.println("I am in deposit method: "+ Thread.currentThread().getName());
	        try {
	            if (remainingMonthlyDeposit <= 0) {
	                System.out.println("Monthly deposit limit exceeded.");
	                return;
	            }
	            if(amount<=remainingMonthlyDeposit)
	            {
	               balance =balance+ amount;
	            remainingMonthlyDeposit =remainingMonthlyDeposit -amount;
	            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
	            }
	            else    
				{
				   System.out.println("Deposit declined. Limit is Rs 20,000");
				}
			} finally {
				lock.unlock();
			}
	    }

	    public void withdraw(double amount) throws InterruptedException {
	    	
//	    	Thread.sleep(3000);
	        lock.lock();
	        //System.out.println("I am in withdraw: "+ Thread.currentThread().getName());

	        try {
	            double overdraftFee = 0;
	            if ((!overdraftFacility && (balance - amount) < 0)||(overdraftFacility && (balance - amount) < -10000)) {
	                System.out.println("Withdrawal declined. Overdraft not allowed.");
	                return;
	            }
	            if (balance - amount < 0) {
	                overdraftFee = (amount - balance) * 0.01;
	                amount += overdraftFee;
	            }
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance + ", Overdraft Fee: " + overdraftFee);
	        } finally {
	            lock.unlock();
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
}

	 

	 
