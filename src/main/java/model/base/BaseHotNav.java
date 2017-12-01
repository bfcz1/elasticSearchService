package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseHotNav<M extends BaseHotNav<M>> extends Model<M> implements IBean {

	public M setNavId(java.lang.Integer navId) {
		set("nav_id", navId);
		return (M)this;
	}

	public java.lang.Integer getNavId() {
		return get("nav_id");
	}

	public M setNavName(java.lang.String navName) {
		set("nav_name", navName);
		return (M)this;
	}

	public java.lang.String getNavName() {
		return get("nav_name");
	}

	public M setNavSort(java.lang.Integer navSort) {
		set("nav_sort", navSort);
		return (M)this;
	}

	public java.lang.Integer getNavSort() {
		return get("nav_sort");
	}

	public M setIsDelete(java.lang.Boolean isDelete) {
		set("is_delete", isDelete);
		return (M)this;
	}

	public java.lang.Boolean getIsDelete() {
		return get("is_delete");
	}

}