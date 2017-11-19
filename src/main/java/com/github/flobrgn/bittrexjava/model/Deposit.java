package com.github.flobrgn.bittrexjava.model;

import com.google.gson.annotations.SerializedName;

public class Deposit {
	@SerializedName("PaymentUuid")
	public String _paymentUuid;

	@SerializedName("Currency")
	public String _currency;

	@SerializedName("Amount")
	public double _amount;

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
	public String _txId;

	@SerializedName("Canceled")
	public boolean _canceled;

	@SerializedName("InvalidAddress")
	public boolean _invalidAddress;

}