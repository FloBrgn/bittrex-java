package com.github.flobrgn.bittrexjava.responses;

import com.github.flobrgn.bittrexjava.model.Balance;
import com.google.gson.annotations.SerializedName;
import java.util.List;

class GetBalancesResponse extends Response {

    @SerializedName("result")
    public List<Balance> _result;
}