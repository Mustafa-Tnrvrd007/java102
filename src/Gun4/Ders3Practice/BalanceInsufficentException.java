package Gun4.Ders3Practice;

public class BalanceInsufficentException extends  Exception{
    // balance => bakiye , insufficent => yetersiz
    private String massage;
    BalanceInsufficentException(String massage){
        this.massage=massage;
    }

    @Override
    public String getMessage() {
        return this.massage;
    }
}
