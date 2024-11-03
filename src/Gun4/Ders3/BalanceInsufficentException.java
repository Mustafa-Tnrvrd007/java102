package Gun4.Ders3;

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
