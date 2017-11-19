package com.github.flobrgn.bittrexjava.responses;

import com.github.flobrgn.bittrexjava.model.Order;
import com.google.gson.annotations.SerializedName;

class GetOrderResponse extends Response {

    @SerializedName("result")
    public Order _result;
}