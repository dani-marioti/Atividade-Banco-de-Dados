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
        
        String insertString = "INSERT INTO Locador (id, cpf, nome, endereco) VALUES (?, ?, ?, ?)";
        
        try (
        		Connection con = DriverManager.getConnection(connectionUrl); 
        		PreparedStatement stmt = con.prepareStatement(insertString);
        	) {
        	Locador l1 = new Locador(1, 12345678911, "Daniela", 999999911);
        	stmt.setInt(1, l1.getId());
        	stmt.setInt(2, l1.getCPF());
        	stmt.setString(3, l1.getNome());
        	stmt.setInt(4, l1.getTelefone());
        	
        	stmt.executeUpdate();
        	
        	Locador l2 = new Locador(2, 44444444444, "Claudio", 999999922);
        	stmt.setInt(1, l2.getId());
        	stmt.setInt(2, l2.getCPF());
        	stmt.setString(3, l2.getNome());
        	stmt.setInt(4, l2.getTelefone());
        	
        	stmt.executeUpdate();
        	
        	Locador l3 = new Locador(3, 55555555555, "Cristina", 999999933);
        	stmt.setInt(1, l3.getId());
        	stmt.setInt(2, l3.getCPF());
        	stmt.setString(3, l3.getNome());
        	stmt.setInt(4, l3.getTelefone());
        	
        	stmt.executeUpdate();

        } catch (SQLException e) {
        	e.printStackTrace();
        }
     
        try (
        		Connection con = DriverManager.getConnection(connectionUrl); 
        		Statement stmt = con.createStatement();
        	) {
        	
            String SQL = "SELECT * FROM Locador";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
            	Locador l = new Locador();
            	l.setId(rs.getInt("id")); 
            	l.setCPF(rs.getInt("cpf"));
            	l.setNome(rs.getString("nome"));
            	l.setTelefone(rs.getInt("telefone"));
            	
            	System.out.println(l);
            }
        }
  
        catch (SQLException e) {
            e.printStackTrace();
        }

	}

}