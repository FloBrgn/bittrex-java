package com.github.flobrgn.bittrexjava.model;

import com.google.gson.annotations.SerializedName;

public class Market {

	@SerializedName("MarketCurrency")
	public String _marketCurrency;

	@SerializedName("BaseCurrency")
	public String _baseCurrency;

	@SerializedName("MarketCurrencyLong")
	public String _marketCurrencyLong;

	@SerializedName("BaseCurrencyLong")
	public String _baseCurrencyLong;

	@SerializedName("MinTradeSize")
	public double _minTradeSize;

	@SerializedName("MarketName")
	public String _marketName;

	@SerializedName("IsActive")
	public boolean _isActive;

	@SerializedName("Created")
	public String _created;

}
