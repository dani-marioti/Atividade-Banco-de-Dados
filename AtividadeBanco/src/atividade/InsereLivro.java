package atividade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsereLocador {

	public static void main(String[] args) {

        String connectionUrl = "jdbc:sqlserver://localhost;databaseName=AtividadeBanco;user=atividadeEmp;password=123456";
        
        String insertString = "INSERT INTO Livro (idLivro, titulo, autor, paginas) VALUES (?, ?, ?, ?)";
        
        try (
        		Connection con = DriverManager.getConnection(connectionUrl); 
        		PreparedStatement stmt = con.prepareStatement(insertString);
        	) {
        	
        	Livro l1 = new Livro(1, "Dom Quixote", "Miguel de Cervantes", 100);
        	stmt.setInt(1, l1.getIdLivro());
        	stmt.setString(2, l1.getTitulo());
        	stmt.setString(3, l1.getAutor());
        	stmt.setInt(4, l1.getPaginas());
        	
        	stmt.executeUpdate();
        	
        	Livro l2 = new Livro(2, "Guerra e Paz", "Liev Tolstoi", 200);
        	stmt.setInt(1, l2.getIdLivro());
        	stmt.setString(2, l2.getTitulo());
        	stmt.setString(3, l2.getAutor());
        	stmt.setInt(4, l2.getPaginas());
        	
        	stmt.executeUpdate();
        	
        	Livro l3 = new Livro(3, "A Monstanha Magica", "Thomas Mann", 300);
        	stmt.setInt(1, l3.getIdLivro());
        	stmt.setString(2, l3.getTitulo());
        	stmt.setString(3, l3.getAutor());
        	stmt.setInt(4, l3.getPaginas());
        	
        	stmt.executeUpdate();

        } catch (SQLException e) {
        	e.printStackTrace();
        }
     
        try (
        		Connection con = DriverManager.getConnection(connectionUrl); 
        		Statement stmt = con.createStatement();
        	) {
        	
            String SQL = "SELECT * FROM Livro";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
            	Locador l = new Locador();
            	l.setIdLivro(rs.getInt("idLivro")); 
            	l.setTitulo(rs.getInt("titulo"));
            	l.setAutor(rs.getString("autor"));
            	l.setPaginas(rs.getInt("paginas"));
            	
            	System.out.println(l);
            }
        }
  
        catch (SQLException e) {
            e.printStackTrace();
        }

	}

}