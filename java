package emp_manage.main;

import java.sql.Connection;
import java.sql.SQLException;

import emp_manage.lib.DBConnection;
import emp_manage.lib.EmpService;
import emp_manage.lib.EmpVo; 
public class DbcConnTest{
public static void main(String[] args) {
//	사원목록(select), 사원추가 (insert) 
	EmpService empService = new EmpService(); 
	empService.select(); 
	String emp_id = "20240002"; 
	String emp_name = "마이꼴" ;
	String dept_no = "01";
	
	EmpVo emp = new EmpVo(emp_id,emp_name,dept_no,null,null); 
	empService.insert(emp); //한명 사원 추가  
	
	empService.select(); 

	
	
}
}
