package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCarriers<M extends BaseCarriers<M>> extends Model<M> implements IBean {

	public M setCarrierId(java.lang.Integer carrierId) {
		set("carrier_id", carrierId);
		return (M)this;
	}

	public java.lang.Integer getCarrierId() {
		return get("carrier_id");
	}

	public M setCarrierName(java.lang.String carrierName) {
		set("carrier_name", carrierName);
		return (M)this;
	}

	public java.lang.String getCarrierName() {
		return get("carrier_name");
	}

	public M setCarrierCode(java.lang.String carrierCode) {
		set("carrier_code", carrierCode);
		return (M)this;
	}

	public java.lang.String getCarrierCode() {
		return get("carrier_code");
	}

	public M setIsDelete(java.lang.Boolean isDelete) {
		set("is_delete", isDelete);
		return (M)this;
	}

	public java.lang.Boolean getIsDelete() {
		return get("is_delete");
	}

}