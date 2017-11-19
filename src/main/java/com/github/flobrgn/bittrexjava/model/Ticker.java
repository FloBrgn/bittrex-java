package com.github.flobrgn.bittrexjava.model;

import com.google.gson.annotations.SerializedName;

public class Ticker {

	@SerializedName("Bid")
	public double _bid;

	@SerializedName("Ask")
	public double _ask;

	@SerializedName("Last")
	public double _last;
}