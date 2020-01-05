package connection;

import java.sql.*;

public class ConnectionManager {
	private static final String URL = "jdbc:mysql://49.235.47.150:3306/user?serverTimezone=GMT%2B8&useSSL=false";
	private static final String driverName = "com.mysql.cj.jdbc.Driver";
	private static final String userName = "root";// root
	private static final String password = "123456";// 123456
	public static Connection getConnection()
	{
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(new SQLException("连接服务器失败"));
		}
		System.out.println("连接服务器成功");
		return connection;
	}
	private static void closeResultSet(ResultSet resultSet)
	{
		try {
			if(resultSet!=null)resultSet.close();			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(new SQLException("结果集关闭失败"));
		}
	}
	private static void closeStatement(PreparedStatement pStatement)
	{
		try {
			if(pStatement!=null)pStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(new SQLException("状态关闭失败"));
		}
	}
	private static void closeConnection(Connection conn)
	{
		try {
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(new SQLException("连接关闭失败"));
		}
	}
	public static void releaseAll(ResultSet rs,PreparedStatement pstatm,Connection con)
	{
		ConnectionManager.closeResultSet(rs);
		ConnectionManager.closeStatement(pstatm);
		ConnectionManager.closeConnection(con);
	}
}
