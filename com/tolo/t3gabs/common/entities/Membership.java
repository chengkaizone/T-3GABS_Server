package com.tolo.t3gabs.common.entities;

import java.util.Date;

/**
 * 会员类
 *
 */
public class Membership implements java.io.Serializable{
	
	private static final long serialVersionUID = -13452089130992L;
	/**
	 * 会员编号
	 */
	private int mebID;
	
	/**
	 * 会员卡号
	 */
	private String mebCard;
	
	/**
	 * 会员密码
	 */
	private String mebPassword;
	
	
	/**
	 * 会员姓名
	 */
	private String mebName;
	
	
	/**
	 * 会员性别
	 */
	private String mebGender;
	
	
	/**
	 * 会员生日
	 */
	private Date mebBirthday;
	
	
	/**
	 * 会员证件类型
	 */
	private String mebCertificateType;
	
	
	/**
	 * 会员证件号码
	 */
	private String mebCertificateNumber;
	
	
	/**
	 * 会员电话1
	 */
	private String mebTelNum1;
	
	
	/**
	 * 会员电话2
	 */
	private String mebTelNum2;
	
	
	/**
	 * 会员所在省份
	 */
	private String mebProvince;
	
	/**
	 * 会员所在城市
	 */
	private String mebCity;
	
	
	/**
	 * 会员通信地址
	 */
	private String mebAddress;
	
	/**
	 * 邮政编码
	 */
	private String mebPostZip;
	/*
	 * zonglicheng
	 */
	
	private String accountMileage; //mmmmmmmmmm
	/*
	 * keyonglicheng
	 */
	private String availableMileage;//mmmmmmmmmmm
	/*
	 * huiyuandengji
	 */
	private String membRank;// mmmmmmmmmmmm
	

	public String getAccountMileage() {
		return accountMileage;
	}

	public void setAccountMileage(String accountMileage) {
		this.accountMileage = accountMileage;
	}

	public String getAvailableMileage() {
		return availableMileage;
	}

	public void setAvailableMileage(String availableMileage) {
		this.availableMileage = availableMileage;
	}

	public String getMembRank() {
		return membRank;
	}

	public void setMembRank(String membRank) {
		this.membRank = membRank;
	}

	public Membership() {
		super();
	}

	public String getMebAddress() {
		return mebAddress;
	}

	public void setMebAddress(String mebAddress) {
		this.mebAddress = mebAddress;
	}
	


	public Date getMebBirthday() {
		return mebBirthday;
	}

	public void setMebBirthday(Date mebBirthday) {
		this.mebBirthday = mebBirthday;
	}

	public String getMebCard() {
		return mebCard;
	}

	public void setMebCard(String mebCard) {
		this.mebCard = mebCard;
	}

	public String getMebCertificateNumber() {
		return mebCertificateNumber;
	}

	public void setMebCertificateNumber(String mebCertificateNumber) {
		this.mebCertificateNumber = mebCertificateNumber;
	}

	public String getMebCertificateType() {
		return mebCertificateType;
	}

	public void setMebCertificateType(String mebCertificateType) {
		this.mebCertificateType = mebCertificateType;
	}

	public String getMebCity() {
		return mebCity;
	}

	public void setMebCity(String mebCity) {
		this.mebCity = mebCity;
	}

	public String getMebGender() {
		return mebGender;
	}

	public void setMebGender(String mebGender) {
		this.mebGender = mebGender;
	}

	public int getMebID() {
		return mebID;
	}

	public void setMebID(int mebID) {
		this.mebID = mebID;
	}

	public String getMebName() {
		return mebName;
	}

	public void setMebName(String mebName) {
		this.mebName = mebName;
	}

	public String getMebPassword() {
		return mebPassword;
	}

	public void setMebPassword(String mebPassword) {
		this.mebPassword = mebPassword;
	}

	public String getMebPostZip() {
		return mebPostZip;
	}

	public void setMebPostZip(String mebPostZip) {
		this.mebPostZip = mebPostZip;
	}

	public String getMebProvince() {
		return mebProvince;
	}

	public void setMebProvince(String mebProvince) {
		this.mebProvince = mebProvince;
	}

	public String getMebTelNum1() {
		return mebTelNum1;
	}

	public void setMebTelNum1(String mebTelNum1) {
		this.mebTelNum1 = mebTelNum1;
	}

	public String getMebTelNum2() {
		return mebTelNum2;
	}

	public void setMebTelNum2(String mebTelNum2) {
		this.mebTelNum2 = mebTelNum2;
	}


}
