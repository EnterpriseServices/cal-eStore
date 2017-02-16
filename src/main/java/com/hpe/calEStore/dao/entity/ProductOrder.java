package com.hpe.calEStore.dao.entity;

// default package
// Generated Feb 15, 2017 5:41:54 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProductOrder generated by hbm2java
 */
@Entity
@Table(name = "product_order", catalog = "eshop")
public class ProductOrder implements java.io.Serializable {

	private ProductOrderId id;
	private PurchaseOrder purchaseOrder;
	private Product product;

	public ProductOrder() {
	}

	public ProductOrder(ProductOrderId id, PurchaseOrder purchaseOrder,
			Product product) {
		this.id = id;
		this.purchaseOrder = purchaseOrder;
		this.product = product;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "orderId", column = @Column(name = "ORDER_ID", nullable = false)),
			@AttributeOverride(name = "productId", column = @Column(name = "PRODUCT_ID", nullable = false)),
			@AttributeOverride(name = "qty", column = @Column(name = "QTY", nullable = false)) })
	public ProductOrderId getId() {
		return this.id;
	}

	public void setId(ProductOrderId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORDER_ID", nullable = false, insertable = false, updatable = false)
	public PurchaseOrder getPurchaseOrder() {
		return this.purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_ID", nullable = false, insertable = false, updatable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
