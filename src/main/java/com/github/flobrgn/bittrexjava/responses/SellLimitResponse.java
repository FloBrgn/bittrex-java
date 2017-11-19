package com.github.flobrgn.bittrexjava.responses;

import com.github.flobrgn.bittrexjava.model.Uuid;
import com.google.gson.annotations.SerializedName;

class SellLimitResponse extends Response {

    @SerializedName("result")
    public Uuid _result;
}