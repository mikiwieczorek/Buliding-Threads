
public class ThreadData {

	private int counter;
	private String ClientThread = null;

	/**
	 * ThreadData sets the counter to 0 and the thread name from the constructor's
	 * input paramter
	 * 
	 * @param threadName
	 */
	public ThreadData(String threadName) {
		this.ClientThread = threadName;
		counter = 0;
	}

	/**
	 * Method getThreadName gets the name of the thread
	 * 
	 * @return name of thread
	 */
	public String getThreadName() {
		return ClientThread;
	}

	/**
	 * Method getCount gets the count
	 * 
	 * @return counter (initially set to 0)
	 */
	public int getCount() {
		return counter;
	}

	/**
	 * Method setCount increments the counter
	 * 
	 */
	public void setCount() {
		++counter;
	}

}
