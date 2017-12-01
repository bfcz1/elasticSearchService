package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCarts<M extends BaseCarts<M>> extends Model<M> implements IBean {

	public M setCartId(java.lang.Long cartId) {
		set("cart_id", cartId);
		return (M)this;
	}

	public java.lang.Long getCartId() {
		return get("cart_id");
	}

	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	public java.lang.Integer getUserId() {
		return get("user_id");
	}

	public M setSellUserId(java.lang.Integer sellUserId) {
		set("sell_user_id", sellUserId);
		return (M)this;
	}

	public java.lang.Integer getSellUserId() {
		return get("sell_user_id");
	}

	public M setProductId(java.lang.Integer productId) {
		set("product_id", productId);
		return (M)this;
	}

	public java.lang.Integer getProductId() {
		return get("product_id");
	}

	public M setSkuId(java.lang.Integer skuId) {
		set("sku_id", skuId);
		return (M)this;
	}

	public java.lang.Integer getSkuId() {
		return get("sku_id");
	}

	public M setProductName(java.lang.String productName) {
		set("product_name", productName);
		return (M)this;
	}

	public java.lang.String getProductName() {
		return get("product_name");
	}

	public M setProductPrice(java.math.BigDecimal productPrice) {
		set("product_price", productPrice);
		return (M)this;
	}

	public java.math.BigDecimal getProductPrice() {
		return get("product_price");
	}

	public M setProductNum(java.lang.Integer productNum) {
		set("product_num", productNum);
		return (M)this;
	}

	public java.lang.Integer getProductNum() {
		return get("product_num");
	}

	public M setSkuColor(java.lang.String skuColor) {
		set("sku_color", skuColor);
		return (M)this;
	}

	public java.lang.String getSkuColor() {
		return get("sku_color");
	}

	public M setSkuSize(java.lang.String skuSize) {
		set("sku_size", skuSize);
		return (M)this;
	}

	public java.lang.String getSkuSize() {
		return get("sku_size");
	}

	public M setIsDelete(java.lang.Boolean isDelete) {
		set("is_delete", isDelete);
		return (M)this;
	}

	public java.lang.Boolean getIsDelete() {
		return get("is_delete");
	}

}