package com.deloitte.empl.applications;
import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.Emp1Dao;
import com.deloitte.empl.dao.impl.Emp1DaoImpl;

public class GetEmplByCode {

	public static void main(String[] args) {
		Emp1Dao dao = new Emp1DaoImpl();
		Emp e = dao.getEmpByCode(7902);
		System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getJob()+" "+e.getMgr()+" "+e.getHiredate()+" "+e.getSal()+" "+e.getComm()+" "+e.getDeptno());

	}

}
