package com.sxt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sxt.entity.Condition;
import com.sxt.entity.Emp;

public interface EmpDao {

	public int  insertEmp(Emp emp);
	
	public List<Emp> selectEmps();
	
	public int deleteEmp(Integer empNo);
	
	public int deleteEmps(int[] empNos);
	
	public List<Emp> selectEmpsByCondition(@Param("eName")String eName,@Param("sal") Integer sal);
	
	public List<Emp> selectEmpsByCondition1(Condition condition);
	
	public int updateEmps(Emp emps);
	
	//验证
	public Emp selectEmpByName(String eName);
}
