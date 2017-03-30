package testCallback2;

public class Printer {
	public void print(Callback callback, String text) {
		System.out.println("正在打印 . . . ");
		try {
			Thread.currentThread();
			Thread.sleep(3000);// 毫秒
		} catch (Exception e) {
		}
		callback.printFinished("打印完成");
	}
}
