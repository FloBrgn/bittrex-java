package com.github.flobrgn.bittrexjava.responses;

import com.github.flobrgn.bittrexjava.model.Order;
import com.google.gson.annotations.SerializedName;
import java.util.List;

class GetOrderHistoryResponse extends Response {

    @SerializedName("result")
    public List<Order> _result;
}