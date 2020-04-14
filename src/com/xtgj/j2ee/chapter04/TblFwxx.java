package com.xtgj.j2ee.chapter04;

/**
 * TblFwxx entity. @author MyEclipse Persistence Tools
 */

public class TblFwxx implements java.io.Serializable {

	// Fields

	private TblFwxxId id;

	// Constructors

	/** default constructor */
	public TblFwxx() {
	}

	/** full constructor */
	public TblFwxx(TblFwxxId id) {
		this.id = id;
	}

	// Property accessors

	public TblFwxxId getId() {
		return this.id;
	}

	public void setId(TblFwxxId id) {
		this.id = id;
	}

}