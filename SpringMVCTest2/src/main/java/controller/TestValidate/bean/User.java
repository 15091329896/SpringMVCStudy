package controller.TestValidate.bean;

public class User {
	private String uname;
	private String upwd;

	// 省略setter和getter方法
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}

	/**
	 * @return the upwd
	 */
	public String getUpwd() {
		return upwd;
	}

	/**
	 * @param upwd the upwd to set
	 */
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	/**
	 * 
	 */
	public User() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [uname=" + uname + ", upwd=" + upwd + "]";
	}

}