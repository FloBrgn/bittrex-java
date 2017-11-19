package com.github.flobrgn.bittrexjava.responses;

import com.google.gson.annotations.SerializedName;
import java.util.List;

class GetMarketHistoryResponse<MarketHistory> extends Response {

	@SerializedName("result")
	public List<MarketHistory> _result;
}