package db;

import java.sql.*;
import java.util.Properties;

public class MetadataTest {
	public static void printColTypes(ResultSetMetaData rsmd) throws SQLException {
		int columns = rsmd.getColumnCount();
		for (int i = 1; i <= columns; i++) {
			int jdbcType = rsmd.getColumnType(i);
			String name = rsmd.getColumnTypeName(i);
			System.out.print("Column " + i + " is JDBC type " + jdbcType);
			System.out.println(", a DB2 " + name);
		}
	}

	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		String baseUrl = "jdbc:db2:";
		String server = "//shldvesdb001.tvlport.net:50004/";
		String database = "PSS_DEV";
		String url = baseUrl + server + database;
		Properties dbProperties = new Properties();
		dbProperties.put("user", "pssuser");
		dbProperties.put("password", "g0rmst3r");
		String query = "select * from pss.agent";
		try {
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			conn = DriverManager.getConnection(url, dbProperties);
			statement = conn.createStatement();
			rs = statement.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			printColTypes(rsmd);
			System.out.println("");

			int numberOfColumns = rsmd.getColumnCount();
			// print column headers
			for (int i = 1; i <= numberOfColumns; i++) {
				System.out.print((i > 1) ? ",  " : "");
				System.out.print(rsmd.getColumnName(i));
			}
			System.out.println();
			while (rs.next()) {
				for (int i = 1; i <= numberOfColumns; i++) {
					System.out.print((i > 1) ? ",  " : "");
					System.out.print(rs.getString(i));
				}
				System.out.println("");
			}
			statement.close();
			conn.close();
			System.out.println("Metadata test successful.");
		} catch (Exception e) {
			System.err.println(e);
		}

	}
}
