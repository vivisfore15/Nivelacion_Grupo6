package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import Modelo.LibroDAO;
import Modelo.LibroDTO;

/**
 * Servlet implementation class Libro
 */
@WebServlet("/Libro")
public class Libro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Libro() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LibroDAO dao= new LibroDAO();
		if(request.getParameter("insertar")!=null) {
			
			String codigo,titulo,editorial,autor;
			int paginas;
			codigo=request.getParameter("isbn");
			titulo=request.getParameter("titulo");
			editorial=request.getParameter("editorial");
			autor=request.getParameter("autor");
			paginas=Integer.parseInt(request.getParameter("paginas"));
			LibroDTO lib= new LibroDTO(codigo,titulo,editorial,autor,paginas);
			if(dao.Inserta_Libro(lib)) {
				//JOptionPane.showMessageDialog(null, "");
				response.sendRedirect("Index.jsp?men=Se Registro Correctamente el Libro");
			}
			else {
				//JOptionPane.showMessageDialog(null, "");
			response.sendRedirect("Index.jsp?men=No se registro el Libro");
			}
		}
		
	}

}
