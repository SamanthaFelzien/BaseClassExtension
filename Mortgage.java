import java.util.*;
import java.io.*;

public class Mortgage extends Account{
  
 // private int termInYears = 0;
  private int termInMonths = 0;
  private double periodicPayment = 0.0;
  private double balanceRepaid = 0.0; 
  private int term = 0; 
  private static final String PAYMENT = "P"; 
  
   public Mortgage(int customerID, int accountNumber, String accountType, double interestRate, double balance, int term) 
     { 
  super(customerID, accountNumber,  accountType,  interestRate, balance); // pass these parms to the Account constructor
 setTerm(term);
 calcPeriodicPayment();
 }


  
 
  public void processTransaction(Transaction transactionObject)
{
transactionList.addLast( transactionObject); // Add a transaction to the list.
// Calculate interest the amount repaid and change the account balance.
if ( transactionObject.getTransactionType() == PAYMENT)
{
setCurrentMonthlyInterest( balance * monthlyInterestRate );
setBalanceRepaid(periodicPayment - currentMonthlyInterest) ;
setBalance( balance - balanceRepaid );
}
// To simplify this, we avoided dealing with an invalid transaction type.
}
  
  public void calcPeriodicPayment ()
  {
    double annuityFactor =
      (( 1 - ( 1 / Math.pow((1 + monthlyInterestRate ), termInMonths)))/ monthlyInterestRate);
    periodicPayment = balance / annuityFactor;
  } 
  

   public void setTermInMonths (int termInMonths) {
    this.termInMonths = termInMonths;
  }
  public int getTermInMonths(){
    return termInMonths;
  }
  
     public void setPeriodicPayment(double periodicPayment) {
    this.periodicPayment = periodicPayment;
  }
  public double getPeriodicPayment(){
    return periodicPayment;
  }
  
   public void setBalanceRepaid(double balanceRepaid) {
    this.balanceRepaid = balanceRepaid;
  }
  public double getBalanceRepaid(){
    return balanceRepaid;
  }
  
  public void setCurrentMonthlyInterest (double currentMonthlyInterest) {
    this.currentMonthlyInterest = currentMonthlyInterest;
  }
  public double getCurrentMonthlyInterest(){
    return currentMonthlyInterest;
  }
  
    public void setTerm (int term) {
    this.term = term; 
    termInMonths = term*12; 
  }
  
  public int getTerm() {
    return term;  
  }
  
  
   public String toString()
 {
  // Include the base class toString to display base class variables.
         StringBuffer strBuf = new StringBuffer(super.toString());
  strBuf.append("\nTerm In Years                  : "); 
  strBuf.append(term); 
  strBuf.append("\nTerm In Months                 : ");
  strBuf.append( termInMonths);
  strBuf.append("\nPeriodic Payment               : ");
  strBuf.append(periodicPayment);
  strBuf.append("\nBalance Repaid                 : ");
  strBuf.append(balanceRepaid);
   strBuf.append("\n") ;

      return strBuf.toString() ;

 }
  
}