package com.github.flobrgn.bittrexjava.model;

import com.google.gson.annotations.SerializedName;

public class Order {

	@SerializedName("Uuid")
	public String _uuid;

	@SerializedName("AccountId")
	public String _accountId;

	@SerializedName("OrderUuid")
	public String _orderUuid;

	@SerializedName("Exchange")
	public String _exchange;

	@SerializedName("Type")
	public String _type;

	@SerializedName("Quantity")
	public double _quantity;

	@SerializedName("QuantityRemaining")
	public double _quantityRemaining;

	@SerializedName("Limit")
	public double _limit;

	@SerializedName("Reserved")
	public double _reserved;

	@SerializedName("ReserveRemaining")
	public double _reserveRemaining;

	@SerializedName("CommissionReserved")
	public double _commissionReserved;

	@SerializedName("CommissionReserveRemaining")
	public double _commissionReserveRemaining;

	@SerializedName("CommissionPaid")
	public double _commissionPaid;

	@SerializedName("Price")
	public double _price;

	@SerializedName("PricePerUnit")
	public double _pricePerUnit;

	@SerializedName("Opened")
	public String _opened;

	@SerializedName("Closed")
	public String _closed;

	@SerializedName("IsOpen")
	public boolean _isOpen;

	@SerializedName("Sentinel")
	public String _sentinel;

	@SerializedName("CancelInitiated")
	public boolean _cancelInitiated;

	@SerializedName("ImmediateOrCancel")
	public boolean _immediateOrCancel;

	@SerializedName("IsConditional")
	public boolean _isConditional;

	@SerializedName("Condition")
	public String _condition;

	@SerializedName("ConditionTarget")
	public double _conditionTarget;
}