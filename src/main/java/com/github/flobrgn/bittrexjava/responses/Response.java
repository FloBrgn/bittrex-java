package com.github.flobrgn.bittrexjava.responses;

import com.google.gson.annotations.SerializedName;

abstract class Response {

	@SerializedName("success")
	public boolean _success;

	@SerializedName("message")
	public String _message;

}