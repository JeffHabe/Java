package PracticeAccessDBSQL ;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.ResultSet ;
import java.sql.ResultSetMetaData ;
import java.sql.SQLException ;
import java.sql.Statement ;
import com.jeff.util.Print ;

public class conAccessDB
{

	public static void main ( String[] args ) throws SQLException
	{
		// 1.驅動程式
		try
		{
			Class.forName( "net.ucanaccess.jdbc.UcanaccessDriver" ) ;
		} catch (ClassNotFoundException e)
		{
			Print.println( "連線失敗" ) ;
			;
		}
		// 2. 連結資料庫&檔案路徑
		Connection conn = DriverManager.getConnection( "jdbc:ucanaccess://D:/KengWoNCHUFile/AccessDB/Temp.accdb" ) ;
		Statement smt = conn.createStatement() ;
		// 3.執行SQL
		ResultSet rSet = smt.executeQuery( "SELECT * from Orders" ) ;
		ResultSetMetaData rsmd = rSet.getMetaData() ;
		Print.println(
				rsmd.getColumnName( 1 ) + " \t " + rsmd.getColumnName( 2 ) + " \t " + rsmd.getColumnName( 3 ) + " \t " ) ;
		boolean running = true ;
		int i = 0 ;
		while (running)
		{
			if (rSet.next() && i < 100)
			{
				running = true ;
			} else
			{
				running = false ;
			}
			Print.println( rSet.getString( 1 ) + "\t" + rSet.getString( 2 ) + "\t" + rSet.getString( 3 ) ) ;

			i++ ;
		}
		// smt.execute( "DELETE * FROM Order" );
		conn.close() ;
	}

}
