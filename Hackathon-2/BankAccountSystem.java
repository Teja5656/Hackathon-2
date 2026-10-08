import java.util.Scanner;
class BankAccount {
String accno;
String accholNm;
double bal;
public BankAccount(String accno, String accholNm, double bal) {
this.accno=accno;
this.accholNm=accholNm;
this.bal=bal;
}
public void deposit(double amt) {
if(amt>0){
bal+=amt;
System.out.println("Successfully deposited:"+amt);
}else{
System.out.println("Invalid deposit amount");
}
}
public void withdraw(double amt) {
if (amt>0&&amt<=bal) {
bal -= amt;
System.out.println("Successfully withdrew: " + amt);
} else {
System.out.println("Insufficient balance or invalid withdrawal amount.");
}
}
public double checkBalance() {
return bal;
}
public void displayAccount() {
System.out.println("Account Number: " + accno);
System.out.println("Account Holder Name: " + accholNm);
System.out.println("Current Balance: " + bal);
}
}
public class BankAccountSystem {
public static void main(String[] args) {
Scanner ad= new Scanner(System.in);
System.out.print("Account Number: ");
String accno = ad.nextLine();
System.out.print("Account Holder Name: ");
String accName = ad.nextLine();
System.out.print("Initial Balance: ");
double iniBal = ad.nextDouble();
BankAccount account = new BankAccount(accno, accName, iniBal);
System.out.print("Amount to deposit: ");
double depoAmt = ad.nextDouble();
account.deposit(depoAmt);
System.out.print("Amount to withdraw: ");
double withamt = ad.nextDouble();
account.withdraw(withamt);
account.displayAccount();
}
}