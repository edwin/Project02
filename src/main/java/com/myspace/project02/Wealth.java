package com.myspace.project02;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Wealth implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Salary")
	private java.math.BigInteger salary;
	@org.kie.api.definition.type.Label(value = "Status")
	private java.lang.String status;

	public Wealth() {
	}

	public java.math.BigInteger getSalary() {
		return this.salary;
	}

	public void setSalary(java.math.BigInteger salary) {
		this.salary = salary;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public Wealth(java.math.BigInteger salary, java.lang.String status) {
		this.salary = salary;
		this.status = status;
	}

}