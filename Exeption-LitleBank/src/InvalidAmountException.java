public class InvalidAmountException extends Exception{
    //если сумма операции ≤ 0
public InvalidAmountException(){
    super("Invalid Amount");
}
}
