public class InsufficientFundsException extends Exception{
    //если на счёте недостаточно средств
  public InsufficientFundsException(){
      super("Insufficient Funds");
  }
}
