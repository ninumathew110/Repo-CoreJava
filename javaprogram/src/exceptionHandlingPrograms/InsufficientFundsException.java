package exceptionHandlingPrograms;

public class InsufficientFundsException extends RuntimeException {
public InsufficientFundsException(String msg)
{
	System.out.println(msg);
}
}
 