package com.github.flobrgn.bittrexjava.responses;

import com.github.flobrgn.bittrexjava.model.MarketSummary;
import com.google.gson.annotations.SerializedName;

class GetMarketSummaryResponse extends Response {

	@SerializedName("result")
	public MarketSummary _result;

}