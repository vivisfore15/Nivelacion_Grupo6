package Modelo;

public class LibroDTO {

	private String Isbn;
	private String Titulo;
	private String Editorial;
	private String Autor;
	private int No_Paginas;
	
	
	public LibroDTO(String isbn, String titulo, String editorial, String autor, int no_Paginas) {
		Isbn = isbn;
		Titulo = titulo;
		Editorial = editorial;
		Autor = autor;
		No_Paginas = no_Paginas;
	}

	public String getIsbn() {
		return Isbn;
	}

	public void setIsbn(String isbn) {
		Isbn = isbn;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getNo_Paginas() {
		return No_Paginas;
	}

	public void setNo_Paginas(int no_Paginas) {
		No_Paginas = no_Paginas;
	}
	
	
	
}
