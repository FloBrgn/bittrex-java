package com.github.flobrgn.bittrexjava.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class OrderBook {
	@SerializedName("buy")
	public List<OrderBookEntry> _buy;

	@SerializedName("sell")
	public List<OrderBookEntry> _sell;
}