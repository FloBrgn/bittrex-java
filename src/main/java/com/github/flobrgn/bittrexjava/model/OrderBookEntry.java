package com.github.flobrgn.bittrexjava.model;

import com.google.gson.annotations.SerializedName;

public class OrderBookEntry {

	@SerializedName("Quantity")
	public double _quantity;

	@SerializedName("Rate")
	public double _rate;

}