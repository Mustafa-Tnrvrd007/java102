package Gun4.Ders3Practice;

public class AccountManager <T extends Number>{
    private double balance ; // hesaptaki para miktarı , bakiye



    public void deposit (T amount) throws NegativeValueException{
        /// deposit => yatırmak , amount => miktar
        if (amount.doubleValue()>=0){
        this.balance += amount.doubleValue();
        }else {
            throw new NegativeValueException("Negatif degerde para yatiramazsiniz");
        }
    }
    public void withdraw (T amount) throws BalanceInsufficentException { // throws Exception ifadesi
        // bu metodun bir hata fırlatabileceğini belirtiyor
        // withdraw => para çekme
        if (getBalance()>=amount.doubleValue()){
        this.balance -= amount.doubleValue();
        }else {
            System.out.println("Para çekme işlemi başarısız");
            throw new BalanceInsufficentException("Baiye yetersiz");
        }
    }

    public void showAccountInfo(){
        System.out.println("Hesap bilgisi : "+getBalance());
    }

    public double getBalance(){
        return this.balance;
    }

}
