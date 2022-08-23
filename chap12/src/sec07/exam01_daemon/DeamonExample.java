package sec07.exam01_daemon;

public class DeamonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {}
		System.out.println("메인스레드 종료");
	}	
}
