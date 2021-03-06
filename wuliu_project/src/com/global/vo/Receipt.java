package com.global.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Receipt generated by MyEclipse Persistence Tools
 */

public class Receipt implements java.io.Serializable {

	// Fields

	private Integer receiptid;

	private Deliveryspot deliveryspot;

	private String carno;

	private String fromname;

	private String toname;

	private String createtime;

	private String remark;

	private String receiptno;

	private Employee employee;

	private Integer flag;

	private String rtype;

	private Set receiptdetailes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Receipt() {
	}

	/** full constructor */
	public Receipt(Deliveryspot deliveryspot, String carno, String fromname,
			String toname, String createtime, String remark, Set receiptdetailes) {
		this.deliveryspot = deliveryspot;
		this.carno = carno;
		this.fromname = fromname;
		this.toname = toname;
		this.createtime = createtime;
		this.remark = remark;
		this.receiptdetailes = receiptdetailes;
	}

	// Property accessors

	public Integer getReceiptid() {
		return this.receiptid;
	}

	public void setReceiptid(Integer receiptid) {
		this.receiptid = receiptid;
	}

	public Deliveryspot getDeliveryspot() {
		return this.deliveryspot;
	}

	public void setDeliveryspot(Deliveryspot deliveryspot) {
		this.deliveryspot = deliveryspot;
	}

	public String getCarno() {
		return this.carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}

	public String getFromname() {
		return this.fromname;
	}

	public void setFromname(String fromname) {
		this.fromname = fromname;
	}

	public String getToname() {
		return this.toname;
	}

	public void setToname(String toname) {
		this.toname = toname;
	}

	public String getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getReceiptdetailes() {
		return this.receiptdetailes;
	}

	public void setReceiptdetailes(Set receiptdetailes) {
		this.receiptdetailes = receiptdetailes;
	}

	public String getReceiptno() {
		return receiptno;
	}

	public void setReceiptno(String receiptno) {
		this.receiptno = receiptno;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getRtype() {
		return rtype;
	}

	public void setRtype(String rtype) {
		this.rtype = rtype;
	}

}