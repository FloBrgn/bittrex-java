package com.github.flobrgn.bittrexjava.model;

import com.google.gson.annotations.SerializedName;

public class Balance {

	@SerializedName("Currency")
	public String _currency;

	@SerializedName("Balance")
	public double _balance;

	@SerializedName("Available")
	public double _available;

	@SerializedName("Pending")
	public double _pending;

	@SerializedName("CryptoAddress")
	public String _cryptoAddress;

	@SerializedName("Requested")
	public boolean _requested;

	@SerializedName("Uuid")
	public String _uuid;

}