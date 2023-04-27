package com.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class ProcedureUtil {

		public void callUpdateCity() {
			Connection con=DBUtil.getMySQLConnection();
			
			try {
				CallableStatement cs = con.prepareCall("call employee.insertemployee()");
				boolean b = cs.execute();
				System.out.println(b);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			ProcedureUtil pu= new ProcedureUtil();
			pu.callUpdateCity();
		}
}