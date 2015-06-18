package com.ggvle.coolweather.util;

public interface HttpCallbackListener {
	void onFinish(String response);

	void onError(Exception e);
}
