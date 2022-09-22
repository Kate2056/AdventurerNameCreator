package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NameCreator;

/**
 * Servlet implementation class getNameServlet
 */
@WebServlet("/getNameServlet")
public class getNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userFirstLetter = request.getParameter("userFirstLetter");
		String userBirthMonth = request.getParameter("userBirthMonth");
		String userBirthDate = request.getParameter("userBirthDate");
		int userBirthDateInt;
		try {
			userBirthDateInt = Integer.valueOf(userBirthDate);
		}catch(Exception e) {
			userBirthDateInt = 0;
		}
		NameCreator userAdventureName = new NameCreator(userFirstLetter, userBirthMonth, userBirthDateInt);
		request.setAttribute("userAdventurerName", userAdventureName);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
