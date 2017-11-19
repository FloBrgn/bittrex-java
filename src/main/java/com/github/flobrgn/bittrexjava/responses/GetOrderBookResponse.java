package com.github.flobrgn.bittrexjava.responses;

import com.github.flobrgn.bittrexjava.model.OrderBook;
import com.google.gson.annotations.SerializedName;

class GetOrderBookResponse extends Response {

	@SerializedName("result")
	public OrderBook _result;
}