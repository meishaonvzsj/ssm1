package com.sxt.service;

import java.util.List;

import com.sxt.entity.Condition;
import com.sxt.entity.Emp;

public interface EmpService {
	
	public boolean addEmp(Emp emp);
	
	public List<Emp> selectEmps();
	
	public boolean removeEmp(Integer empNo);
	
	public boolean removeEmps(int[] empNos);
	
	public List<Emp> selectEmpsByCondition(String eName,Integer sal);
	
	public List<Emp> selectEmpsByCondition1(Condition condition);
	
	public boolean updateEmps(Emp emps);
	
	//验证
	public Emp selectEmpByName(String eName);

}
