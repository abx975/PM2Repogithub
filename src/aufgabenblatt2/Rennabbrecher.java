package src.aufgabenblatt2;

public class Rennabbrecher extends Thread{

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		while (!interrupted()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (Math.random()*10 < 1) {
				Rennen.getRennautoListe().forEach(x -> x.interrupt());
			}
		}
	}

}
