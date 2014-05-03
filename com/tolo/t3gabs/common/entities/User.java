package com.tolo.t3gabs.common.entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * 用户类
 */
public class User implements Serializable {
	private static final long serialVersionUID = -371560756421779L;
	private int id;
	private String name;
	private String loginName;
	private String password;
	private String state;
	private String email;
	private Date registeTime;
	private Date lastLoginTime;
	/**
	 * 最后一次提交请求时间
	 */
	private Date lastActionTime;
	private int totalLoginTimes;
	private int totalLoginSeconds;
	private String certifyType;
	private String certifyNum;
	private String telephone;
	/**
	 * 相关乘客
	 */
	private List<Passenger> relativePassengers;
	private List<Contact> relativeContacts;
	private List<Subscription> subscriptions;
	// User类的构造方法里面自带
	public User() {
		relativePassengers = new ArrayList<Passenger>();
		relativeContacts = new ArrayList<Contact>();
		subscriptions = new ArrayList<Subscription>();
	}
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result+ ((loginName == null) ? 0 : loginName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final User other = (User) obj;
		if (loginName == null) {
			if (other.loginName != null)
				return false;
		} else if (!loginName.equals(other.loginName))
			return false;
		return true;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getRegisteTime() {
		return registeTime;
	}
	public void setRegisteTime(Date registeTime) {
		this.registeTime = registeTime;
	}
	public Date getLastActionTime() {
		return lastActionTime;
	}
	public void setLastActionTime(Date lastActionTime) {
		this.lastActionTime = lastActionTime;
	}
	public int getTotalLoginTimes() {
		return totalLoginTimes;
	}
	public void setTotalLoginTimes(int totalLoginTimes) {
		this.totalLoginTimes = totalLoginTimes;
	}
	public int getTotalLoginSeconds() {
		return totalLoginSeconds;
	}
	public void setTotalLoginSeconds(int totalLoginSeconds) {
		this.totalLoginSeconds = totalLoginSeconds;
	}
	//得到乘机人列表~
	public List<Passenger> getRelativePassengers() {
		return relativePassengers;
	}
	//设置乘机人列表~
	public void setRelativePassengers(List<Passenger> relativePassengers) {
		this.relativePassengers = relativePassengers;
	}
	//添加乘机人~
	public void addPassenger(Passenger pass) {
		relativePassengers.add(pass);
	}
	//添加联系人~
	public void addContacts(Contact cont) {
		relativeContacts.add(cont);
	}

	//添加短信
	public void addSubscription(Subscription sub) {
		subscriptions.add(sub);
	}
	
	public List<Contact> getRelativeContacts() {
		return relativeContacts;
	}

	public void setRelativeContacts(List<Contact> relativeContact) {
		this.relativeContacts = relativeContact;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public String getCertifyType() {
		return certifyType;
	}

	public void setCertifyType(String certifyType) {
		this.certifyType = certifyType;
	}

	public String getCertifyNum() {
		return certifyNum;
	}

	public void setCertifyNum(String certifyNum) {
		this.certifyNum = certifyNum;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
