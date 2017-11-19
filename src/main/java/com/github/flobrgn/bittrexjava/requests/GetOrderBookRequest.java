package com.github.flobrgn.bittrexjava.requests;

import java.util.List;
import java.util.Vector;

public class GetOrderBookRequest extends Request {
	public static String _url = "https://bittrex.com/api/v1.1/public/getorderbook";

	private String _market;

	private String _type;

	@Override
	protected List<String> getParameters() {
		List<String> params = new Vector<String>();

		if (!_market.isEmpty()) {
			params.add("market=" + _market);
		}

		if (!_type.isEmpty()) {
			params.add("type=" + _type);
		}

		return params;
	}
}