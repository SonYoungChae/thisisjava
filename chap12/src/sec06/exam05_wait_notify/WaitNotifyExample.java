package sec06.exam05_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		DateBox dataBox = new DateBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ProducerThread consumerThread = new ProducerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();

	}

}
