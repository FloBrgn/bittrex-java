package com.github.flobrgn.bittrexjava.responses;

import com.github.flobrgn.bittrexjava.model.DepositAddress;
import com.google.gson.annotations.SerializedName;

class GetDepositAddressResponse extends Response {

    @SerializedName("result")
    public DepositAddress _result;
}