package com.jdbc.connection;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Student obj = new Student();
		obj.add();
		Delete d = new Delete();
		d.delete();

	}

}
