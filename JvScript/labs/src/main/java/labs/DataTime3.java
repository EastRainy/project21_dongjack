package labs;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import labs.blz.Today;

/**
 * Servlet implementation class DataTime
 */
@WebServlet("/Today3")
public class DataTime3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataTime3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Today today = new Today();
		
		int hour = today.getHour();
		int min = today.getMin();
		int sec = today.getSec();
		
		String result = "%s시 %s분 %s초";
		String html = String.format(result,hour,min,sec);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/today.jsp");
		request.setAttribute("now", html);
		rd.forward(request, response);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
