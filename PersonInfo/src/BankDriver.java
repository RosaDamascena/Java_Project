public class BankDriver {
    public static void main(String[] args) {
        //사람 선언
        person p1 = new person();
        p1.name = "한성주";
        p1.age = 24;
        p1.cashAmount = 30000;

        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.balance = 100000;

        p1.account = a1;
        a1.owner = p1;
    }
}
