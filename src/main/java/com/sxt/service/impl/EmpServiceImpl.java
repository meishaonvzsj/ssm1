package com.sxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sxt.dao.EmpDao;
import com.sxt.entity.Condition;
import com.sxt.entity.Emp;
import com.sxt.service.EmpService;

@Service("empService")
public class EmpServiceImpl implements EmpService {

    @Resource(name="empDao")
	private EmpDao empDao;
	
    @Override
	public boolean addEmp(Emp emp) {
		
		return empDao.insertEmp(emp)>0?true:false;
	}

	@Override
	public List<Emp> selectEmps() {
		
		return empDao.selectEmps();
	}

	@Override
	public boolean removeEmp(Integer empNo) {
		
		return empDao.deleteEmp(empNo)>0?true:false;
	}

	@Override
	public boolean removeEmps(int[] empNos) {
		
		return empDao.deleteEmps(empNos)>0?true:false;
	}

	@Override
	public List<Emp> selectEmpsByCondition(String eName, Integer sal) {
	
		return empDao.selectEmpsByCondition(eName, sal);
	}

	@Override
	public List<Emp> selectEmpsByCondition1(Condition condition) {
		
		return empDao.selectEmpsByCondition1(condition);
	}

	@Override
	public boolean updateEmps(Emp emps) {
		
		return empDao.updateEmps(emps)>0?true:false;
	}

	
	//验证
	@Override
	public Emp selectEmpByName(String eName) {
		
		return empDao.selectEmpByName(eName);
	}

}
