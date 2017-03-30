package testCallback;

public class Li {

	public void executeMessage(Listener listener, String question) {
		System.out.println("小王的问题是 ---> " + question);

		for (int i = 0; i < 10000; i++) {

		}
		String result = "答案是2";
		listener.onSucceed(result);
	}

}
