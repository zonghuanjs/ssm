package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://127.0.0.1/test";
		String name = "com.mysql.jdbc.Driver";
		String user = "root";
		String password = null;
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			Class.forName(name);// 指定连接类型
			conn = DriverManager.getConnection(url, user, password);// 获取连接
			String sql = "insert into tb_test(name) values('哈哈')";
			pst = conn.prepareStatement(sql);// 准备执行语句
			int i = pst.executeUpdate();
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			conn.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
