package com.spring.boot.graphql.ai1tutorial.model;

public class Department {

	private String deptId;

	private String deptName;

	private DepartmentType deptType;
	
	
	
	public Department() {
		super();
	}

	public Department(String deptId, String deptName, DepartmentType deptType) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptType = deptType;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public DepartmentType getDeptType() {
		return deptType;
	}

	public void setDeptType(DepartmentType deptType) {
		this.deptType = deptType;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptType=" + deptType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptId == null) ? 0 : deptId.hashCode());
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
		Department other = (Department) obj;
		if (deptId == null) {
			if (other.deptId != null)
				return false;
		} else if (!deptId.equals(other.deptId))
			return false;
		return true;
	}
	
	

}
