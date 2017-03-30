package testCallback;

public class Wang implements Listener {

	private Li li;

	public Wang(Li li) {
		this.li = li;
	}

	public void askQusetion(final String question) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				li.executeMessage(Wang.this, question);
			}
		}).start();
		play();
	}

	public void play() {
		System.out.println("我要去逛街去了");
	}

	@Override
	public void onSucceed(String result) {
		System.out.println("小李告诉我小王的答案是 ---> " + result);
	}

	@Override
	public void onFailure(String error) {
		// TODO Auto-generated method stub

	}

}
