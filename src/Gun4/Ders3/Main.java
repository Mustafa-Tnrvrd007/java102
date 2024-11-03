package Gun4.Ders3;

public class Main {
    public static void main(String[] args) {
        AccountManager<Number> account = new AccountManager();

        account.showAccountInfo();
        try {
        account.deposit(150);// 150 yatırıldı
        }catch (Exception exception){
            System.out.println("exception.getMessage() = " + exception.getMessage());
        }
        account.showAccountInfo();
        try{
        account.withdraw(130); // 130 çekildi
        }catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        account.showAccountInfo();
        try {
        account.withdraw(50); // 50 tl çekiildi
        }catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        account.showAccountInfo();
        try {
            account.deposit(-100);
        }catch (Exception e){
            System.out.println("e.getMessage() = " + e.getLocalizedMessage());
        }
        account.showAccountInfo();

    }
}
