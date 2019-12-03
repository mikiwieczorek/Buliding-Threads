import java.lang.Thread;

class ClientThread extends Thread {

	// Data member
	ThreadData parameter;

	// NewThread constructor.
	ClientThread(ThreadData z) {
		parameter = z;
		System.out.println("Thread Data: " + z.getThreadName());
		System.out.println("");

	}

	public void run() {

		/*
		 * Each Child Thread will increment the counter, once per second, printing its
		 * name and counter value after each increment.
		 *
		 *
		 * Each Child Thread will do this increment at least four times, and then die,
		 * but first printing that it is done.
		 */
		for (int i = 0; i < 4; i++) {
			// Sleep for 1 second
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println("Name of thread:" + " " + parameter.getThreadName());
			parameter.setCount();
			System.out.println("Counter value for " + parameter.getThreadName() + ": " + parameter.getCount());

		}
		// When Child #1 and Child #2 are done incrementing, we print "I am done"
		System.out.println("\n" + parameter.getThreadName() + ": " + "I am done");

	}

}
