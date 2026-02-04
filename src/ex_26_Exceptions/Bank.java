package ex_26_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount){
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws CurrencyMismatchCustomException {
        if(bankName.currency.equals("INR")) {
            return bankName.amount + this.amount;
        }else{
            throw new CurrencyMismatchCustomException("Currency Mismatcj!");
        }
    }
}
class CurrencyMismatchCustomException extends Exception{

    public CurrencyMismatchCustomException(String msg) {
        super(msg);
    }
}

class NotValidAgeException extends Exception{
    NotValidAgeException(String e){
        super(e);
    }
}