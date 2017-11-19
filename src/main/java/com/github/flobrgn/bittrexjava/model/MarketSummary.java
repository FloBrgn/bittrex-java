package com.github.flobrgn.bittrexjava.model;

import com.google.gson.annotations.SerializedName;

public class MarketSummary {

	@SerializedName("MarketName")
	public String _marketName;

	@SerializedName("High")
	public double _high;

	@SerializedName("Low")
	public double _low;

	@SerializedName("Volume")
	public double _volume;

	@SerializedName("Last")
	public double _last;

	@SerializedName("BaseVolume")
	public double _baseVolume;

	@SerializedName("TimeStamp")
	public String _timeStamp;

	@SerializedName("Bid")
	public double _bid;

	@SerializedName("Ask")
	public double _ask;

	@SerializedName("OpenBuyOrders")
	public int _openBuyOrders;

	@SerializedName("OpenSellOrders")
	public int _openSellOrders;

	@SerializedName("PrevDay")
	public double _prevDay;

	@SerializedName("Created")
	public String _created;

	@SerializedName("DisplayMarketName")
	public String _displayMarketName;
}