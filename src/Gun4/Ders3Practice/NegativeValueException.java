package Gun4.Ders3Practice;

public class NegativeValueException extends Exception{
    private String message;
    NegativeValueException(String message){
        this.message=message;
    }


    @Override
    public String getLocalizedMessage() {
        return this.message;
    }
}
