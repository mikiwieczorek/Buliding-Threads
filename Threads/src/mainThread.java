/**
 * This class will will implement the initial thread that will create two child
 * threads
 * 
 * @author Mikolaj Wieczorek
 *
 */

public class mainThread {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Have the Initial thread pass each Child thread a data object (called
		 * ThreadData) with data members being an integer – to be used as a counter -
		 * and a string with your choice as to the name of the Thread.
		 */

		// Thread data constructor with ThreadData(String threadName) from
		// ThreadData.java
		ThreadData ChildData1 = new ThreadData("Child #1"); // name of the first child thread "Child #1"
		ThreadData ChildData2 = new ThreadData("Child #2"); // name of the first child thread "Child #2"

		ClientThread ChildThread1 = new ClientThread(ChildData1);
		ClientThread ChildThread2 = new ClientThread(ChildData2);
		ChildThread1.start();
		ChildThread2.start();

		/*
		 * The Initial Thread will monitor each Child Thread’s progress, watching the
		 * counters. It will do so every ½ second. When it finds that both counters had
		 * been incremented to the final value, it too will end, printing out that the
		 * work is complete.
		 * 
		 */
		for (int i = 0; i < 8; i++) {
			// every 1/2 second
			Thread.sleep(500);
			// condition to let the client thread know when both counters had incremented to
			// the final value so it ends
			if ((ChildData1.getCount() == 4) && (ChildData2.getCount() == 4)) {
				System.out.println("");
				System.out.println("Work is complete");
			}
		}

	}

}
