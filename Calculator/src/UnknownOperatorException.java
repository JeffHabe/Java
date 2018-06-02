
public class UnknownOperatorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnknownOperatorException() {
		super("Please select an actual operator and try again: ");
	}

	public UnknownOperatorException(String message) {
		super(message);
	}
}
