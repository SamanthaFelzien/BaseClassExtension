public class CheckingAccount extends Account{
  
    public CheckingAccount(int customerID, int accountNumber, String accountType, double interestRate, double balance) 
     { 
  super(customerID, accountNumber,  accountType,  interestRate, balance);
    }
    
    public void processTransaction(Transaction transactionObj){};
  
}
/*
  for (Transaction transactionObject : transactionList){
    if (transactionObject.getTransactionType() == "C"){
      balance = balance - transactionObj.getTransactionAmount(); 
  } else if (transactionObject.getTransactionType() == "D"){
      balance = balance + transactionObject.getTransactionAmount(); 
  }
  }
}
*/
    


    

