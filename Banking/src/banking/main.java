package banking;
import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



public class main {
	    public static void main(String[] args) throws InterruptedException {
	        BankAccount account = new BankAccount(1, 0, true);
	        
	        List<Thread> thread=new ArrayList<>();
	        
	        int flag =1;
	        
	        while(flag != 0) {
	        	
	            System.out.println("Enter your choice: 1.deposit  2.withdraw  3.balance 4.exit");
	            Scanner sc = new Scanner(System.in);
	            int choice=sc.nextInt();
	            switch(choice)
	            {
	            case 1:
	            {
	                System.out.println("Enter deposit amount");
	                double depositAmount  =sc.nextDouble();
	                Transaction t=new Transaction(account, true, depositAmount);
	                Thread t1=new Thread(t);
	    	       // System.out.println("I am being created for deposit: "+ t1.getName());
	                t1.start();
	                //t1.join();
	    	        thread.add(t1);          
	                break;
	            }
	            case 2:
	            {
	                System.out.println("Enter withdraw amount");
	                Double withdrawAmount  =sc.nextDouble();
	                Transaction t=new Transaction(account, false, withdrawAmount);
	                Thread t1=new Thread(t);
	    	        //System.out.println("I am being created for withdraw: "+ t1.getName());
	    	        thread.add(t1);       
	    	        t1.start();
	    	        
	                break;
	            }
	            case 3:
	            {
	            	System.out.println("Balance is: "+account.getBalance());
	            	break;	
	            	
	            }
	            case 4:
	            {
	            	flag=0;
	                break;      	
	            }
	            default:
	            {
	            	System.out.println("Enter only options 1-4");
	            	break;	            	
	            }
	            }
	        }
	        
//	       for(Thread t:thread)
//	       {   
//	           t.start();
//	       }
	       for(Thread t:thread)
	       {   
	           t.join();
	       }
	       
	       System.out.println("Final Balance :"+ account.getBalance());
	    	}
	    }

