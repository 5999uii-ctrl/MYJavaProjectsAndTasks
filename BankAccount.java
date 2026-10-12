public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;


    }


    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
      this.accountNumber=accountNumber;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double wtihdraw(double amount){
        if(balance<amount){
            System.out.println("your balnce is not enough to withdraw  ");
        } else if (balance>=amount) {
            System.out.println("balnce withdraw seccssfully");
            balance-=amount;


        } else if (amount<=0) {
            System.out.println("enter corretly ");

        }
        return balance;
    }
    public double Deposite(double amount){
       if(amount<=0){
           System.out.println("enter correcty ");

    } else {
           System.out.println("add susseefull");
           balance+=amount;
       }
           return balance;
       }
    }
