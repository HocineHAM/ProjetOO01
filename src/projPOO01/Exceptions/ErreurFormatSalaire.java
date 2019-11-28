package projPOO01.Exceptions;

public class ErreurFormatSalaire extends Exception {

	/**
	 * Exception pour accepter que des nombres.
	 */
	private static final long serialVersionUID = 1L;

	public ErreurFormatSalaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErreurFormatSalaire(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ErreurFormatSalaire(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ErreurFormatSalaire(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ErreurFormatSalaire(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
