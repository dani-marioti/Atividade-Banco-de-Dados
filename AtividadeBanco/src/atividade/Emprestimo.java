package atividade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Emprestimo {

	public static void main(String[] args) {

        String connectionUrl = "jdbc:sqlserver://localhost;databaseName=AtividadeBanco;user=atividadeEmp;password=123456";
        
        String insertString = "INSERT INTO Emprestimo (idEmp,idLivro,idLocador, tituloLivro, nomeLocador) VALUES (?, ?, ?, ?, ?)";
        
        try (
        		Connection con = DriverManager.getConnection(connectionUrl); 
        		PreparedStatement stmt = con.prepareStatement(insertString);
        	) {
        	
        	Livro e1 = new Livro(01, 2, 1, "Guerra e Paz", "Daniela");
        	stmt.setInt(1, e1.getId());
        	stmt.setInt(2, e1.getIdLivro());
        	stmt.setInt(3, e1.getIdLocador());
        	stmt.setString(3, e1.getTitulo());
        	stmt.setString(4, e1.getNomeLocador());
        	
        	stmt.executeUpdate();
        	
        	Livro e2 = new Livro(02, 1, 3, "Dom Quixote", "Cristina");
        	stmt.setInt(1, e2.getId());
        	stmt.setInt(2, e2.getIdLivro());
        	stmt.setInt(3, e2.getIdLocador());
        	stmt.setString(3, e2.getTitulo());
        	stmt.setString(4, e2.getLocador());
        	
        	stmt.executeUpdate();
        	
        	Livro e2 = new Livro(03, 1, 3, "Dom Quixote", "Daniela");
        	stmt.setInt(1, e3.getId());
        	stmt.setInt(2, e3.getIdLivro());
        	stmt.setInt(3, e3.getIdLocador());
        	stmt.setString(3, e3.getTitulo());
        	stmt.setString(4, e3.getLocador());
        	
        	stmt.executeUpdate();

        } catch (SQLException e) {
        	e.printStackTrace();
        }
     
     // faz um SELECT no banco
        try (
        		Connection con = DriverManager.getConnection(connectionUrl); 
        		Statement stmt = con.createStatement();
        	) {
        	
            String SQL = "SELECT tituloLivro, nomeLocador FROM Emprestimo INNER JOIN Locador ON Locador.id = Emprestimo.idLocador Where idLocador = 1"; // consulta de SELECT
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
            	Emprestimo e = new Emprestimo();
            	e.setId(rs.getInt("tituloLivro"));
            	e.setNome(rs.getString("nomeLocador"));

            	System.out.println(p); // imprime a emprestimos da Daniela
            }
        }

	}

}