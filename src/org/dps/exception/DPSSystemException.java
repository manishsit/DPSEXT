package org.dps.exception;

public class DPSSystemException extends Exception {

	private static final long serialVersionUID = 4238602795909787908L;
	private String message = null;

	public DPSSystemException(Throwable cause) {
		super(cause);
	}

	public DPSSystemException(String message) {
		super(message);
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
