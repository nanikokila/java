package org.sathya;

public class Department {

	private int deptId;
	private String deptName;
	private String deptHOD;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptHOD() {
		return deptHOD;
	}
	public void setDeptHOD(String deptHOD) {
		this.deptHOD = deptHOD;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptHOD=" + deptHOD + "]";
	}
	
	
}
