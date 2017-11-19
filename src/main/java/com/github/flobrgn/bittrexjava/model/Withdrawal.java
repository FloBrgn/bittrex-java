package com.github.flobrgn.bittrexjava.model;

import com.google.gson.annotations.SerializedName;

public class Withdrawal {

	@SerializedName("PaymentUuid")
	public String _paymentUuid;

	@SerializedName("Currency")
	public String _currency;

	@SerializedName("Amount")
	public String _amount;

	@SerializedName("Address")
	public String _address;

	@SerializedName("Opened")
	public String _opened;

	@SerializedName("Authorized")
	public boolean _authorized;

	@SerializedName("PendingPayment")
	public boolean _pendingPayment;

	@SerializedName("TxCost")
	public double _txCost;

	@SerializedName("TxId")
	public double _txId;

	@SerializedName("Canceled")
	public boolean _canceled;

	@SerializedName("InvalidAddress")
	public boolean _invalidAddress;
}