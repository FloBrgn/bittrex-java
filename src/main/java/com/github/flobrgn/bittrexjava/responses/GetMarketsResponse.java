package com.github.flobrgn.bittrexjava.responses;

import com.github.flobrgn.bittrexjava.model.Market;
import com.google.gson.annotations.SerializedName;
import java.util.List;

class GetMarketsResponse extends Response {

	@SerializedName("result")
	public List<Market> _result;
}