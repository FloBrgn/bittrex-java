package com.github.flobrgn.bittrexjava.requests;

import java.util.List;
import java.util.Vector;

public class GetOrderHistoryRequest extends Request {
	public static String _url = "https://bittrex.com/api/v1.1/account/getorderhistory";

	private String _market = "";

	@Override
	protected List<String> getParameters() {
		List<String> params = new Vector<String>();

		if (!_market.isEmpty()) {
			params.add("market=" + _market);
		}

		return params;
	}
}