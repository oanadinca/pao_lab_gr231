package main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import consumer.ConsumerTask;
import producer.ProducerTask;

public class Example4 {
	public static List<Integer> numbers = new ArrayList<>();

	public static void main(String[] args) {
		//Producer - Consumer = race condition
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.submit(new ProducerTask());
		executorService.submit(new ConsumerTask());
		executorService.submit(new ProducerTask());
		executorService.submit(new ConsumerTask());
	}
}
