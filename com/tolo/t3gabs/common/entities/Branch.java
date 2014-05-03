package com.tolo.t3gabs.common.entities;

/**
 * 营业网点类
 *
 */
public class Branch implements java.io.Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3847190257860317664L;

	/**
	 * 营业网点编号
	 */
	private int id;
	
	/**
	 * 营业网点名称
	 */
	private String name;

	/**
	 * 营业网点地址
	 */
	private String address;
	
	/**
	 * 营业网点电话
	 */
	private String telephone;
	
	/**
	 * 网点传真
	 */
	private String fax;
	
	/**
	 * 网点经理
	 */
	private User BranchManager;
	
	/**
	 * 网点省份
	 */
	private Province province;
	
	/**
	 * 网点城市
	 */
	private City city;
	
	private char type;
	
	private char state;
	
	
	
	public Branch(){}
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	
	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	public Province getProvince() {
		return province;
	}


	public void setProvince(Province province) {
		this.province = province;
	}


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public User getBranchManager() {
		return BranchManager;
	}

	public void setBranchManager(User branchManager) {
		BranchManager = branchManager;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public char getState() {
		return state;
	}


	public void setState(char state) {
		this.state = state;
	}


	public char getType() {
		return type;
	}


	public void setType(char type) {
		this.type = type;
	}


	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((name == null) ? 0 : name.hashCode());
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
		final Branch other = (Branch) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + "]";
	}
	

}
