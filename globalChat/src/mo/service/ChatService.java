package mo.service;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.util.ArrayList;

import mo.dao.ChatDao;
import mo.vo.Chat;

public class ChatService {
	ChatDao cdao = new ChatDao();
	public ArrayList<Chat> selectAll() {
		Connection conn = getConnection();
		ArrayList<Chat> list = cdao.selectAll(conn);
		close(conn);
		return list;
	}

}
