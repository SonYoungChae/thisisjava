package sec06.exam03_join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumthread = new SumThread();
		sumthread.start();
		try {
			sumthread.join();
		}catch(InterruptedException e) {}
		System.out.println("1~100 ��:" + sumthread.getSum());
	

	}

}
