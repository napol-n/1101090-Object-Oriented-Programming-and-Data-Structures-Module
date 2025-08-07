package bank;

public class Account {
    Member user;
    String account;
    double accountBalance;

    public void setAccount(String ID){
        account = ID;
    }
    public String getAccount(){
        return account;
    }
    public void setBalance(double balance){
        accountBalance = balance;
    }
    public double getBalance(){
        return accountBalance;
    }
    public void  setMember(Member member){
        user = member;
    }
    public Member getMember(){
        return user;
    }
}
