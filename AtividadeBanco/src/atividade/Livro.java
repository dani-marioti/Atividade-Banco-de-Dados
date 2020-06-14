package atividade;

public class Livro {
	private int idLivro;
	private String titulo;
	private String autor;
	private int paginas;
	
	public Livro() { }
	
	public Livro(int idLivro, String titulo, String autor, int paginas) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Locador [idLivro=" + idLivro + ",titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
	}	
	
}