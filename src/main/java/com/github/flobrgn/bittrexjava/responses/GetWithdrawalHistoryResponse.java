package com.github.flobrgn.bittrexjava.responses;

import com.github.flobrgn.bittrexjava.model.Withdrawal;
import com.google.gson.annotations.SerializedName;
import java.util.List;

class GetWithdrawalHistoryResponse extends Response {

    @SerializedName("result")
    public List<Withdrawal> _result;

}