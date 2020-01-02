package com.deloitte.empl.applications;

import com.deloitte.empl.dao.Emp1Dao;
import com.deloitte.empl.dao.impl.Emp1DaoImpl;

public class DeleteRow {

	public static void main(String[] args) {
		Emp1Dao dao=new Emp1DaoImpl();
		dao.delEmp(7369);
		System.out.println("Row is deleted");

	}

}
