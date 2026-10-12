void main(){
//pk99ABCD1234567890
    Scanner s=new Scanner(System.in);


    BankAccount ba=new BankAccount("pk99ABCD1234567890",100.0);
    System.out.println("AccountNumber:"+(ba.getAccountNumber()));
    System.out.println("initial Balance:"+(ba.getBalance()));
    ba.Deposite(100);
    System.out.println("deposite ka bad :"+(ba.getBalance()));
    ba.wtihdraw(1000);
    System.out.println("withdrawal ka bad :"+(ba.getBalance()));


    System.out.println("current balance:"+(ba.getBalance()));

}