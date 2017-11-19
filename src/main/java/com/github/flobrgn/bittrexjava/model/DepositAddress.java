package com.github.flobrgn.bittrexjava.model;

import com.google.gson.annotations.SerializedName;

public class DepositAddress {

	@SerializedName("Currency")
	public String _currency;

	@SerializedName("Address")
	public String _address;
}