package com.github.flobrgn.bittrexjava.responses;

import com.google.gson.annotations.SerializedName;
import com.github.flobrgn.bittrexjava.model.Uuid;

class BuyLimitResponse extends Response {

	@SerializedName("result")
	public Uuid _result;
}