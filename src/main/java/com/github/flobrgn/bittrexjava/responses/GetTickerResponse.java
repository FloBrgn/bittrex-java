package com.github.flobrgn.bittrexjava.responses;

import com.github.flobrgn.bittrexjava.model.Ticker;
import com.google.gson.annotations.SerializedName;

class GetTickerResponse extends Response {

	@SerializedName("result")
	public Ticker _result;
}