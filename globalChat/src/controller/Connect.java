package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mo.service.ChatService;
import mo.vo.Chat;

/**
 * Servlet implementation class Connect
 */
@WebServlet("/connect")
public class Connect extends HttpServlet {
	private static final long serialVersionUID = 678665L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("hi");
		ArrayList<Chat> list = new ChatService().selectAll();
		request.setAttribute("list", list);
		if(list.size() > 0) {
			HttpSession s = request.getSession();
			s.setAttribute("list", list);
			response.sendRedirect("index.jsp");
		}else {
			System.out.println("디비에 데이터 없음");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
