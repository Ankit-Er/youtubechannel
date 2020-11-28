package com.jdbc.example;

public class BussLayer {
	
	private DBManager db;
	
	public BussLayer() {
		db = new DBManager();
	}
	
	public void selectData() {
		db.selectRecords();
	}
	
	public void insertData(int sid, String name, String rollno, int marks) {
		String cmd = "insert into tbl_Student(sid, sname,rollno, marks) "
				+ "values('"+sid+"','"+name+"','"+rollno+"','"+marks+"')";
		if(db.RecordsManipulation(cmd))
			System.out.println("Record has been saved successfully!!");
		else
			System.out.println("Record has not been saved successfully!!");
	}
	
	public void updateData(int sid,int marks) {
		String cmd = "update tbl_Student set marks='"+marks+"' where sid='"+sid+"'";
		if(db.RecordsManipulation(cmd))
			System.out.println("Record has been updated successfully!!");
		else
			System.out.println("Record has not been updated successfully!!");
	}
	
	public void deleteData(int sid) {
		String cmd = "delete from tbl_Student where sid='"+sid+"'";
		if(db.RecordsManipulation(cmd))
			System.out.println("Record has been deleted successfully!!");
		else
			System.out.println("Record has not been deleted successfully!!");
	}
	
}
