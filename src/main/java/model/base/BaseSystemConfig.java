package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSystemConfig<M extends BaseSystemConfig<M>> extends Model<M> implements IBean {

	public M setConfigId(java.lang.Integer configId) {
		set("config_id", configId);
		return (M)this;
	}

	public java.lang.Integer getConfigId() {
		return get("config_id");
	}

	public M setClientVersion(java.lang.String clientVersion) {
		set("client_version", clientVersion);
		return (M)this;
	}

	public java.lang.String getClientVersion() {
		return get("client_version");
	}

	public M setClientPlatform(java.lang.Integer clientPlatform) {
		set("client_platform", clientPlatform);
		return (M)this;
	}

	public java.lang.Integer getClientPlatform() {
		return get("client_platform");
	}

	public M setVerifyStatus(java.lang.Integer verifyStatus) {
		set("verify_status", verifyStatus);
		return (M)this;
	}

	public java.lang.Integer getVerifyStatus() {
		return get("verify_status");
	}

	public M setDownloadUrl(java.lang.String downloadUrl) {
		set("download_url", downloadUrl);
		return (M)this;
	}

	public java.lang.String getDownloadUrl() {
		return get("download_url");
	}

}