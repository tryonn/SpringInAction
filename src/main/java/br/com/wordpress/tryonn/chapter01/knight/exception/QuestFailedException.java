/**
 * 
 */
package br.com.wordpress.tryonn.chapter01.knight.exception;

/**
 * @author simao.neto
 *
 */
public class QuestFailedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8637904201727757929L;
	
	/**
	 * 
	 */
	public QuestFailedException() {
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#fillInStackTrace()
	 */
	@Override
	public synchronized Throwable fillInStackTrace() {
		// TODO Auto-generated method stub
		return super.fillInStackTrace();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getStackTrace()
	 */
	@Override
	public StackTraceElement[] getStackTrace() {
		// TODO Auto-generated method stub
		return super.getStackTrace();
	}

}
