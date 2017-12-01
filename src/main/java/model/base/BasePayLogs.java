package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePayLogs<M extends BasePayLogs<M>> extends Model<M> implements IBean {

	public M setLogId(java.lang.Integer logId) {
		set("log_id", logId);
		return (M)this;
	}

	public java.lang.Integer getLogId() {
		return get("log_id");
	}

	public M setOrderId(java.lang.Integer orderId) {
		set("order_id", orderId);
		return (M)this;
	}

	public java.lang.Integer getOrderId() {
		return get("order_id");
	}

	public M setOrderSn(java.lang.Long orderSn) {
		set("order_sn", orderSn);
		return (M)this;
	}

	public java.lang.Long getOrderSn() {
		return get("order_sn");
	}

	public M setOrderAmount(java.math.BigDecimal orderAmount) {
		set("order_amount", orderAmount);
		return (M)this;
	}

	public java.math.BigDecimal getOrderAmount() {
		return get("order_amount");
	}

	public M setOrderType(java.lang.Integer orderType) {
		set("order_type", orderType);
		return (M)this;
	}

	public java.lang.Integer getOrderType() {
		return get("order_type");
	}

	public M setPayTime(java.util.Date payTime) {
		set("pay_time", payTime);
		return (M)this;
	}

	public java.util.Date getPayTime() {
		return get("pay_time");
	}

}