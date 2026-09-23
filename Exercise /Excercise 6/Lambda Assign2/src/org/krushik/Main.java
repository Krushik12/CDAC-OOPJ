package org.krushik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);	
		List<Transaction> transactions = new ArrayList<>();
		
		for(int Temp =0; Temp < 2;Temp++) {
			
			System.out.println("\nEnter Transaction " + (Temp + 1));
			
			System.out.print("Enter Transaction ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Transaction Amount: ");
            float amount = sc.nextFloat();

            System.out.print("Enter Transaction Status (true/false): ");
            boolean status = sc.nextBoolean();

            System.out.print("Enter Transaction Arrears (true/false): ");
            boolean arrears = sc.nextBoolean();
            
            transactions.add(new Transaction(id,amount,status,arrears));
		}
            //Transaction with Amount > 5000
		System.out.println("");
			System.out.println("\n--- Transaction with Amount > 5000 ---");
           Consumer<List<Transaction>> consume = list ->{
        	   
        	   for(Transaction t :list) {
        		   if(t.getTxAmount()>5000)
        			   System.out.println(t);
        		   
        	   }
           };
           consume.accept(transactions);
            
            
           //Transactions with Status = false
           System.out.println("\n--- Transactions with Status = false ---");		
           Consumer<List<Transaction>> consumeStatus = list -> {

               for (Transaction t : list) {

                   if (!t.isTxStatus()) {
                       System.out.println(t);
                   }
               }
           };
   		consumeStatus.accept(transactions);
            		
          
            //Amount due
            
            Function<Transaction, Float> amountDue = t -> {

                if (t.isTxArrears()) {
                    return t.getTxAmount()
                            + 500
                            + (t.getTxAmount() * 18 / 100);
                }

                return t.getTxAmount();
            };

            
            
            System.out.println("\n--- Amount Due for Each Transaction ---");
            
            for (Transaction t : transactions) {

                float due = amountDue.apply(t);

                System.out.println(
                        "Transaction ID: " + t.getTxId()
                        + " | Amount Due: " + due
                );
            }

	
		sc.close();
	}

}
