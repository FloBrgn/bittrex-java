package com.github.flobrgn.bittrexjava.responses;

import com.github.flobrgn.bittrexjava.model.Currency;
import com.google.gson.annotations.SerializedName;
import java.util.List;

class GetCurrenciesResponse extends Response {

	@SerializedName("result")
	public List<Currency> _result;
}