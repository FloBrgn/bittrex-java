package com.github.flobrgn.bittrexjava.responses;

import com.google.gson.annotations.SerializedName;
import com.github.flobrgn.bittrexjava.model.Balance;

class GetBalanceResponse extends Response {

    @SerializedName("result")
    public Balance _result;
}