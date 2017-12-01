package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSpecialWxapp<M extends BaseSpecialWxapp<M>> extends Model<M> implements IBean {

	public M setSpecialId(java.lang.Integer specialId) {
		set("special_id", specialId);
		return (M)this;
	}

	public java.lang.Integer getSpecialId() {
		return get("special_id");
	}

	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	public java.lang.Integer getUserId() {
		return get("user_id");
	}

	public M setSpecialName(java.lang.String specialName) {
		set("special_name", specialName);
		return (M)this;
	}

	public java.lang.String getSpecialName() {
		return get("special_name");
	}

	public M setSpecialImg(java.lang.String specialImg) {
		set("special_img", specialImg);
		return (M)this;
	}

	public java.lang.String getSpecialImg() {
		return get("special_img");
	}

	public M setSpecialIntroduction(java.lang.String specialIntroduction) {
		set("special_introduction", specialIntroduction);
		return (M)this;
	}

	public java.lang.String getSpecialIntroduction() {
		return get("special_introduction");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public M setSort(java.lang.Integer sort) {
		set("sort", sort);
		return (M)this;
	}

	public java.lang.Integer getSort() {
		return get("sort");
	}

	public M setIsDelete(java.lang.Boolean isDelete) {
		set("is_delete", isDelete);
		return (M)this;
	}

	public java.lang.Boolean getIsDelete() {
		return get("is_delete");
	}

}