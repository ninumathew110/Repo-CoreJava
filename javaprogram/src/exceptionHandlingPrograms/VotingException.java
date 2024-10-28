package exceptionHandlingPrograms;

public class VotingException extends RuntimeException {
public VotingException(String msg) {
	System.out.println(msg);
}
}
