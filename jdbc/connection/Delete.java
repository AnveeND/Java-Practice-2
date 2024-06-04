package com.jdbc.connection;

import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	void delete() throws ClassNotFoundException, SQLException {
		String del = "Delete from tblStudent where id=1";
		Statement st = DbConnection.getConnection().createStatement();
		st.executeUpdate(del);
		System.out.println("Data deleted");
	}

}
