package com.github.flobrgn.bittrexjava.model;

import com.google.gson.annotations.SerializedName;

public class Currency {

	@SerializedName("Currency")
	public String _currency;

	@SerializedName("CurrencyLong")
	public String _currencyLong;

	@SerializedName("MinConfirmation")
	public int _minConfirmation;

	@SerializedName("TxFee")
	public double _txFee;

	@SerializedName("IsActive")
	public boolean _isActive;

	@SerializedName("CoinType")
	public String _coinType;

	@SerializedName("BaseAddress")
	public String _baseAddress;

}
