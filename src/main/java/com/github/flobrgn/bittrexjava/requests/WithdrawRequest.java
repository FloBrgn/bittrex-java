package com.github.flobrgn.bittrexjava.requests;

import java.util.List;
import java.util.Vector;

public class WithdrawRequest extends Request {
	public static String _url = "https://bittrex.com/api/v1.1/account/withdraw";

	private String _currency = "";

	private double _quantity = 0;

	private String _address = "";

	private String _paymentid = "";

	@Override
	protected List<String> getParameters() {
		List<String> params = new Vector<String>();

		if (!_currency.isEmpty()) {
			params.add("currency=" + _currency);
		}

		if (_quantity != 0) {
			params.add("quantity=" + _quantity);
		}

		if (!_address.isEmpty()) {
			params.add("address=" + _address);
		}

		if (!_paymentid.isEmpty()) {
			params.add("paymentId=" + _paymentid);
		}

		return params;
	}
}