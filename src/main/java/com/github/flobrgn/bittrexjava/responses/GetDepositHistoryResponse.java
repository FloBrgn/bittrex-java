package com.github.flobrgn.bittrexjava.responses;

import com.google.gson.annotations.SerializedName;
import java.util.List;

class GetDepositHistoryResponse<Deposit> extends Response {

    @SerializedName("result")
    public List<Deposit> _result;

}