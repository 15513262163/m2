package com.xtgj.j2ee.chapter04;

import java.sql.Timestamp;

/**
 * TblFwxxId entity. @author MyEclipse Persistence Tools
 */

public class TblFwxxId implements java.io.Serializable {

	// Fields

	private Integer fwid;
	private Integer uid;
	private Integer jdid;
	private Integer lxid;
	private Integer shi;
	private Integer ting;
	private String fwxx;
	private Double zj;
	private String title;
	private Timestamp date;
	private String telephone;
	private String lxr;

	// Constructors

	/** default constructor */
	public TblFwxxId() {
	}

	/** minimal constructor */
	public TblFwxxId(Integer fwid, String title) {
		this.fwid = fwid;
		this.title = title;
	}

	/** full constructor */
	public TblFwxxId(Integer fwid, Integer uid, Integer jdid, Integer lxid,
			Integer shi, Integer ting, String fwxx, Double zj, String title,
			Timestamp date, String telephone, String lxr) {
		this.fwid = fwid;
		this.uid = uid;
		this.jdid = jdid;
		this.lxid = lxid;
		this.shi = shi;
		this.ting = ting;
		this.fwxx = fwxx;
		this.zj = zj;
		this.title = title;
		this.date = date;
		this.telephone = telephone;
		this.lxr = lxr;
	}

	// Property accessors

	public Integer getFwid() {
		return this.fwid;
	}

	public void setFwid(Integer fwid) {
		this.fwid = fwid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getJdid() {
		return this.jdid;
	}

	public void setJdid(Integer jdid) {
		this.jdid = jdid;
	}

	public Integer getLxid() {
		return this.lxid;
	}

	public void setLxid(Integer lxid) {
		this.lxid = lxid;
	}

	public Integer getShi() {
		return this.shi;
	}

	public void setShi(Integer shi) {
		this.shi = shi;
	}

	public Integer getTing() {
		return this.ting;
	}

	public void setTing(Integer ting) {
		this.ting = ting;
	}

	public String getFwxx() {
		return this.fwxx;
	}

	public void setFwxx(String fwxx) {
		this.fwxx = fwxx;
	}

	public Double getZj() {
		return this.zj;
	}

	public void setZj(Double zj) {
		this.zj = zj;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLxr() {
		return this.lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TblFwxxId))
			return false;
		TblFwxxId castOther = (TblFwxxId) other;

		return ((this.getFwid() == castOther.getFwid()) || (this.getFwid() != null
				&& castOther.getFwid() != null && this.getFwid().equals(
				castOther.getFwid())))
				&& ((this.getUid() == castOther.getUid()) || (this.getUid() != null
						&& castOther.getUid() != null && this.getUid().equals(
						castOther.getUid())))
				&& ((this.getJdid() == castOther.getJdid()) || (this.getJdid() != null
						&& castOther.getJdid() != null && this.getJdid()
						.equals(castOther.getJdid())))
				&& ((this.getLxid() == castOther.getLxid()) || (this.getLxid() != null
						&& castOther.getLxid() != null && this.getLxid()
						.equals(castOther.getLxid())))
				&& ((this.getShi() == castOther.getShi()) || (this.getShi() != null
						&& castOther.getShi() != null && this.getShi().equals(
						castOther.getShi())))
				&& ((this.getTing() == castOther.getTing()) || (this.getTing() != null
						&& castOther.getTing() != null && this.getTing()
						.equals(castOther.getTing())))
				&& ((this.getFwxx() == castOther.getFwxx()) || (this.getFwxx() != null
						&& castOther.getFwxx() != null && this.getFwxx()
						.equals(castOther.getFwxx())))
				&& ((this.getZj() == castOther.getZj()) || (this.getZj() != null
						&& castOther.getZj() != null && this.getZj().equals(
						castOther.getZj())))
				&& ((this.getTitle() == castOther.getTitle()) || (this
						.getTitle() != null && castOther.getTitle() != null && this
						.getTitle().equals(castOther.getTitle())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null
						&& castOther.getDate() != null && this.getDate()
						.equals(castOther.getDate())))
				&& ((this.getTelephone() == castOther.getTelephone()) || (this
						.getTelephone() != null
						&& castOther.getTelephone() != null && this
						.getTelephone().equals(castOther.getTelephone())))
				&& ((this.getLxr() == castOther.getLxr()) || (this.getLxr() != null
						&& castOther.getLxr() != null && this.getLxr().equals(
						castOther.getLxr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFwid() == null ? 0 : this.getFwid().hashCode());
		result = 37 * result
				+ (getUid() == null ? 0 : this.getUid().hashCode());
		result = 37 * result
				+ (getJdid() == null ? 0 : this.getJdid().hashCode());
		result = 37 * result
				+ (getLxid() == null ? 0 : this.getLxid().hashCode());
		result = 37 * result
				+ (getShi() == null ? 0 : this.getShi().hashCode());
		result = 37 * result
				+ (getTing() == null ? 0 : this.getTing().hashCode());
		result = 37 * result
				+ (getFwxx() == null ? 0 : this.getFwxx().hashCode());
		result = 37 * result + (getZj() == null ? 0 : this.getZj().hashCode());
		result = 37 * result
				+ (getTitle() == null ? 0 : this.getTitle().hashCode());
		result = 37 * result
				+ (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result
				+ (getTelephone() == null ? 0 : this.getTelephone().hashCode());
		result = 37 * result
				+ (getLxr() == null ? 0 : this.getLxr().hashCode());
		return result;
	}

}