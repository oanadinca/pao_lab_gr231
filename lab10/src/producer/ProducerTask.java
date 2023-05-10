package producer;

import static main.Example4.numbers;

import java.util.Random;

public class ProducerTask implements Runnable {
	@Override
	public void run() {
		Random random = new Random();
		while(true) {
			synchronized (numbers) {
				if (numbers.size() < 20) {
					int number = random.nextInt(100);
					numbers.add(number);
					System.out.println(Thread.currentThread().getName() + " has added " + number);
					numbers.notifyAll();
				} else {
					try {
						numbers.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("The list already has 20 elements.");
				}
			}
		}
	}
}
