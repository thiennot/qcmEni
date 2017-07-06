package fr.eni.qcm.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.qcm.service.QCMService;
import fr.eni.qcm.service.QuestionService;
import fr.eni.qcm.dto.PageQuestionDTO;
import fr.eni.qcm.dto.QCMDTO;


/**
 * Servlet implementation class listerQCMServlet
 */
@WebServlet("/AfficherQuestionsServlet")
public class AfficherQuestionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AfficherQuestionsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idQCM = Integer.parseInt(request.getParameter("radioQCM"));
		if(request.getSession().getAttribute("qcm")==null){ 
			QuestionService service = new QuestionService();
			PageQuestionDTO listQuestions = service.getQuestions(idQCM);
			request.getSession().setAttribute("qcm",listQuestions);
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher("listeQuestion.jsp");
		rd.forward(request, response);
	}

}
