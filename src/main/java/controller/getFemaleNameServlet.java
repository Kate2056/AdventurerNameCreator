package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FemaleNameCreator;

/**
 * Servlet implementation class getNameServlet
 */
@WebServlet("/getFemaleNameServlet")
public class getFemaleNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFemaleNameServlet() {
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
		FemaleNameCreator userFemaleAdventureName = new FemaleNameCreator(userFirstLetter, userBirthMonth, userBirthDateInt);
		request.setAttribute("userAdventurerName", userFemaleAdventureName);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}

