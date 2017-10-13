package org.zerok.web;

import java.sql.*;

import org.junit.Test;

public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL-false&serverTimezone=Asia/Seoul";

	private static final String USER = "root";

	private static final String PW = "1234";

	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);

		try (Connection conn = DriverManager.getConnection(URL, USER, PW)) {

			System.out.println(conn);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
