package com.github.flobrgn.bittrexjava.requests;

import java.util.List;
import java.util.Vector;

public class GetBalanceRequest extends Request {
	public static String _url = "https://bittrex.com/api/v1.1/account/getbalance";

	private String _currency;

	@Override
	protected List<String> getParameters() {
		List<String> params = new Vector<String>();

		if (!_currency.isEmpty()) {
			params.add("currency=" + _currency);
		}

		return params;
	}
}