package lab9;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String[] books = request.getParameterValues("books");
		ArrayList<Books> bookList = new ArrayList<Books>();
		for(int i = 0; i < books.length; i++) {
			bookList.add(new Books(books[i]));
		}
		request.setAttribute("mybooks", bookList);
		request.getRequestDispatcher("DisplayTheList.jsp").forward(request, response);
	}

}
