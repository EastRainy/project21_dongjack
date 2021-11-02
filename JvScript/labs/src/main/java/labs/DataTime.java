package labs;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataTime
 */
@WebServlet("/Today")
public class DataTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataTime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		LocalDateTime today = LocalDateTime.now();
		
		int hour = today.getHour();
		int min = today.getMinute();
		int sec = today.getSecond();
		
		String result = "<html><head><title>현재시간</title></head>"
				+ "<body><h1>현재 시간은 %s시 %s분 %s초 입니다.</h1></body></html>";
		
		String html = String.format(result, hour, min, sec);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.write(html);
		
		out.close();
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
