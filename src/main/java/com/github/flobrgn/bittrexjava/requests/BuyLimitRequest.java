package com.github.flobrgn.bittrexjava.requests;

import java.util.List;
import java.util.Vector;

public class BuyLimitRequest extends Request {
	public static String _url = "https://bittrex.com/api/v1.1/account/buylimit";

	private String _market = "";

	private double _quantity = 0;

	private double _rate = 0;

	@Override
	protected List<String> getParameters() {
		List<String> params = new Vector<String>();

		if (!_market.isEmpty()) {
			params.add("market=" + _market);
		}

		if (_quantity != 0) {
			params.add("quantity=" + _quantity);
		}

		if (_rate != 0) {
			params.add("rate=" + _rate);
		}

		return params;
	}
}