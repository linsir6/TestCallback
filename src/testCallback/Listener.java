package testCallback;

import javax.jws.Oneway;

public interface Listener {
	void onSucceed(String result);

	void onFailure(String error);

}
