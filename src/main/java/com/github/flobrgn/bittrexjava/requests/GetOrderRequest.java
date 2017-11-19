package com.github.flobrgn.bittrexjava.requests;

import java.util.List;
import java.util.Vector;

public class GetOrderRequest extends Request {
	public static String _url = "https://bittrex.com/api/v1.1/account/getorder";

	private String _uuid = "";

	@Override
	protected List<String> getParameters() {
		List<String> params = new Vector<String>();
		if (!_uuid.isEmpty()) {
			params.add("uuid=" + _uuid);
		}
		return params;
	}
}