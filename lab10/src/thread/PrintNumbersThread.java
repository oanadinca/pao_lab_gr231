package thread;

public class PrintNumbersThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 1; i <= 20; i++) {
			System.out.println(i);
		}
	}
}
