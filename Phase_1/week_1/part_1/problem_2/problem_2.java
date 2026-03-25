package Phase_1.week_1.part_1.problem_2;

class BankAccount{
    long accountNumber;
    String holderName;
    double balance;

    BankAccount(){
        accountNumber = 0;
        holderName = "";
        balance = 0;
    }

    BankAccount(long accountNumber , String holderName , double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        if(balance > 0){
            this.balance = balance;
        }
        else{
            this.balance = 0.0;
        }
    }

    void deposit(double amount){
        if(amount > 0 ){
            balance += amount;
            System.out.println("Your Balance : " + balance);
        }
        else System.out.println("invalid amount");
    }
    void withdraw(double amount){
        if(amount > 0 &&  amount <= this.balance) {
            balance -= amount;
            System.out.println("Your Balance : " + balance);
        }
        else System.out.println("insuficient Balance");
    }
}

public class problem_2 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(983515990 , "Aditya Gupta" ,  -1);
        account1.deposit(000);
        account1.withdraw(1500);
    }
}
