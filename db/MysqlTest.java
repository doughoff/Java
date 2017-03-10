package db;

import java.sql.*;

public class MysqlTest {
	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://200-11:3306/test", "root", "password");
				Statement statement = connection.createStatement();)   // managed resources are closed at end
		{
			// performUpdate(statement);
			String query = "select * from test.person";
			ResultSet rs = statement.executeQuery(query);
			System.out.println(rs);

		} catch (SQLException e) {
			System.out.println(e);
		}
		System.out.println("Success.");
	}

	private static void performUpdate(Statement stmt) throws SQLException {
		int result = stmt.executeUpdate("INSERT INTO `test`.`person` " + "(`id`, `first_name`, `last_name`, `address`) "
				+ "VALUES (5, 'Jane', 'Smith', " + "'789 Main. St., Kansas City, MO 64152');");
		System.out.print("Result was ");
		switch (result) {
		case Statement.CLOSE_ALL_RESULTS:
			System.out.println("Statement.CLOSE_ALL_RESULTS");
			break;
		case Statement.CLOSE_CURRENT_RESULT:
			System.out.println("Statement.CLOSE_CURRENT_RESULT");
			break;
		case Statement.EXECUTE_FAILED:
			System.out.println("Statement.EXECUTE_FAILED");
			break;
		case Statement.KEEP_CURRENT_RESULT:
			System.out.println("Statement.KEEP_CURRENT_RESULT");
			break;
		case Statement.SUCCESS_NO_INFO:
			System.out.println("Statement.SUCCESS_NO_INFO");
			break;
		default:
			break;
		}
	}

}
