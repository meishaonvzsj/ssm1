package com.sxt.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Dept implements Serializable {
  private Integer deptno;
  private String dname;
  private String loc;
  //private Set<Emp> emps=new HashSet<Emp>();
  
  public Dept(){
	  
  }
  
  public Dept(Integer deptno,String dname,String loc){
	 super();
	 this.deptno=deptno;
	 this.dname=dname;
	 this.loc=loc;
  }

public Integer getDeptno() {
	return deptno;
}
public void setDeptno(Integer deptno) {
	this.deptno = deptno;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}

//public Set<Emp> getEmps() {
//	return emps;
//}
//
//public void setEmps(Set<Emp> emps) {
//	this.emps = emps;
//}


  
}
