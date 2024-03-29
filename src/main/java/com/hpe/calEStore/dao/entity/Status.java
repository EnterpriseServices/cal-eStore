package com.hpe.calEStore.dao.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Status generated by hbm2java
 */
@Entity
@Table(name = "STATUS")
public class Status implements java.io.Serializable {

	private Integer statusId;
	private String statusName;
	private String isCnclAllowedInd;
	private Set<OrderStatus> orderStatuses = new HashSet<OrderStatus>(0);
	private Set<PurchaseOrder> purchaseOrders = new HashSet<PurchaseOrder>(0);

	public Status() {
		// Do nothing... Hibernate needs this mandatory
	}

	public Status(String statusName, String isCnclAllowedInd) {
		this.statusName = statusName;
		this.isCnclAllowedInd = isCnclAllowedInd;
	}

	public Status(String statusName, String isCnclAllowedInd,
			Set<OrderStatus> orderStatuses, Set<PurchaseOrder> purchaseOrders) {
		this.statusName = statusName;
		this.isCnclAllowedInd = isCnclAllowedInd;
		this.orderStatuses = orderStatuses;
		this.purchaseOrders = purchaseOrders;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "STATUS_ID", unique = true, nullable = false)
	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	@Column(name = "STATUS_NAME", nullable = false, length = 20)
	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Column(name = "IS_CNCL_ALLOWED_IND", nullable = false, length = 2)
	public String getIsCnclAllowedInd() {
		return this.isCnclAllowedInd;
	}

	public void setIsCnclAllowedInd(String isCnclAllowedInd) {
		this.isCnclAllowedInd = isCnclAllowedInd;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
	public Set<OrderStatus> getOrderStatuses() {
		return this.orderStatuses;
	}

	public void setOrderStatuses(Set<OrderStatus> orderStatuses) {
		this.orderStatuses = orderStatuses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
	public Set<PurchaseOrder> getPurchaseOrders() {
		return this.purchaseOrders;
	}

	public void setPurchaseOrders(Set<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}

}
