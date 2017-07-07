package fr.eni.qcm.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.qcm.service.RecapQuestionReponseService;
import fr.eni.qcm.service.SauvegardeQuestionreponseService;

/**
 * Servlet implementation class CalculResultatServlet
 */
@WebServlet("/CalculResultatServlet")
public class CalculResultatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculResultatServlet() {
        super();
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

		Enumeration<String> names = request.getParameterNames();
		HashMap<Integer, List<Integer>> questionReponses = new HashMap<Integer,  List<Integer>>();

		
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			
			int idQuestion = Integer.parseInt(name.substring(8,name.length()-2));
			
			
			String[] rep = request.getParameterValues(name);
			List<Integer> tabRepInt = new ArrayList<Integer>();
			//on parse en int
			for (String string : rep) {
				System.out.println(string);
				tabRepInt.add(Integer.parseInt(string));
			}

			System.out.println(rep.toString());
			System.out.println("----");
			
			
			questionReponses.put(idQuestion, tabRepInt);
			
			
			
		}
		
		//Sauvegarde
		SauvegardeQuestionreponseService serviceSauve = new SauvegardeQuestionreponseService();
		serviceSauve.sauvegarde(questionReponses);
		
		//Récap
		RecapQuestionReponseService recapService = new RecapQuestionReponseService();
		int[] tab = recapService.recap(questionReponses);
		
		request.setAttribute("nbBon", tab[0]);
		request.setAttribute("nbFaux", tab[1]);
		RequestDispatcher rd = request.getRequestDispatcher("resultat.jsp");
		rd.forward(request, response);
		
	}

}
