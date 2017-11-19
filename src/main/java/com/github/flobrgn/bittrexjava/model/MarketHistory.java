package com.github.flobrgn.bittrexjava.model;

import com.google.gson.annotations.SerializedName;

public class MarketHistory {

	@SerializedName("Id")
	public int _id;

	@SerializedName("TimeStamp")
	public String _timeStamp;

	@SerializedName("Quantity")
	public double _quantity;

	@SerializedName("Price")
	public double _price;

	@SerializedName("Total")
	public double _total;

	@SerializedName("FillType")
	public String _fillType;

	@SerializedName("OrderType")
	public String _orderType;
}