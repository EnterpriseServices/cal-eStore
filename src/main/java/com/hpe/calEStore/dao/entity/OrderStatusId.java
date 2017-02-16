package com.hpe.calEStore.dao.entity;

// default package
// Generated Feb 15, 2017 5:41:54 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrderStatusId generated by hbm2java
 */
@Embeddable
public class OrderStatusId implements java.io.Serializable {

	private int orderId;
	private int statusId;
	private Date lastModifiedTm;


	public OrderStatusId(int orderId, int statusId, Date lastModifiedTm) {
		this.orderId = orderId;
		this.statusId = statusId;
		this.lastModifiedTm = lastModifiedTm;
	}

	@Column(name = "ORDER_ID", nullable = false)
	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Column(name = "STATUS_ID", nullable = false)
	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	@Column(name = "LAST_MODIFIED_TM", nullable = false, length = 19)
	public Date getLastModifiedTm() {
		return this.lastModifiedTm;
	}

	public void setLastModifiedTm(Date lastModifiedTm) {
		this.lastModifiedTm = lastModifiedTm;
	}


	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getOrderId();
		result = 37 * result + this.getStatusId();
		result = 37
				* result
				+ (getLastModifiedTm() == null ? 0 : this.getLastModifiedTm()
						.hashCode());
		return result;
	}

}
