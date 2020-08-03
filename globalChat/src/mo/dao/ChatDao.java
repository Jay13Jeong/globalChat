package mo.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import mo.vo.Chat;

public class ChatDao {

	public ArrayList<Chat> selectAll(Connection conn) {
		ArrayList<Chat> list = new ArrayList<Chat>();
		Statement stmt = null;
		ResultSet rset = null;
		String query = "select * from chat";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Chat c = new Chat();
				
				c.setName(rset.getString("name"));
				c.setContent(rset.getString("content"));
				c.setTime(rset.getDate("time"));
				
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

}
