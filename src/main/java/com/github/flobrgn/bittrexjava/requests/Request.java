package com.github.flobrgn.bittrexjava.requests;

import java.util.List;
import java.util.Vector;

public abstract class Request {

	private static String url;

	public String getRequest() {
		StringBuilder sb = new StringBuilder();
		sb.append(url);
		sb.append("?");
		List<String> params = getParameters();

		boolean first = true;

		for (String param : params) {
			if (first) {
				first = true;
			} else {
				sb.append("&");
			}
			sb.append(param);
		}

		return sb.toString();
	}

	protected List<String> getParameters() {
		return new Vector<String>();
	}
}