public class BankAccount {
    private int balance;
    private person owner;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public person getOwner() {
        return owner;
    }

    public void setOwner(person newOwner) {
        owner = newOwner;
    }

    //파라미터 : 입금할 액수 (정수)
    //리턴 : 성공여부(불린)
    boolean deposit(int amount) {
        if (amount < 0 || owner.getCashAmount() < amount) {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("false");
            return false;
        } else {
            balance += amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("true");
            return true;
        }
    }

    //파라미터 : 출금할 액수 (정수)
    //리턴: 성공여부 (불린)
    boolean withdraw(int amount) {
        if (amount < 0 || balance < amount) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("false");
            return false;
        } else {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("true");
            return true;
        }
    }

    //첫 번째 파라미터 : 받는 사람 (Person)
    //두 번째 파라미터 :  이체할 금액 (정수)
    //리턴 : 성공여부 (불린)
}
