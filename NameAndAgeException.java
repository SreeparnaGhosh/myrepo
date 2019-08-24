package command.line.arg;

public class NameAndAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public NameAndAgeException(String inName, String inAge) {
		super(inAge + " is invalid for " + inName);
	}
}
