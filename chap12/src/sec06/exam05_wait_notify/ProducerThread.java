package sec06.exam05_wait_notify;

public class ProducerThread extends Thread{
	private DateBox dataBox;
	public ProducerThread(DateBox dateBox) {
		this.dataBox = dateBox;
	}
	@Override
	public void run() {
		for(int i = 0; i<=3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
	}
}
