package com.jdbc.connection;

import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	void add() throws ClassNotFoundException, SQLException {
		String insert = "insert into tblStudent values(2,'Anvee' , 'pune' , 1234)";
		Statement st = DbConnection.getConnection().createStatement();
		st.executeUpdate(insert);
		System.out.println("Data Inserted ");
	}

}
