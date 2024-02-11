// New exception class
@SuppressWarnings("serial")
public class IllegalArgumentException extends Exception {
	public IllegalArgumentException() {
		super();
	}
	
	public IllegalArgumentException(String message) {
		super(message);
	}	
}
