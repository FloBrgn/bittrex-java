package com.github.flobrgn.bittrexjava.responses;

import com.google.gson.annotations.SerializedName;
import java.util.List;

class GetMarketsSummariesResponse<MarketSummary> extends Response {

	@SerializedName("result")
	public List<MarketSummary> _result;
}