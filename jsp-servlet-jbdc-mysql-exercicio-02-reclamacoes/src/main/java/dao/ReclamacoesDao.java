package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Reclamacoes;
import model.TipoProblema;


public class ReclamacoesDao {
	
	private void printSQLException(SQLException ex) {
	    for (Throwable e : ex) {
	        if (e instanceof SQLException) {
	            e.printStackTrace(System.err);
	            System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	            System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	            System.err.println("Message: " + e.getMessage());
	            Throwable t = ex.getCause();
	            while (t != null) {
	                System.out.println("Cause: " + t);
	                t = t.getCause();
	            }
	        }
	    }
	}
	
	public int registraReclamacao(Reclamacoes reclamacao) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO reclamacao" +
	            "  (id, endereco, tipoDoProblema, descricaoDoProblema) VALUES " +
	            " (?, ?, ?, ?);";
		int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/db_jsp_servlet_reclamacoes?useSSL=false", "root", "root");

        	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, reclamacao.getEndereco());
            preparedStatement.setString(3, reclamacao.getTipoDoProblema().name());
            preparedStatement.setString(4, reclamacao.getDescricaoDoProblema());
            
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();
            
        } catch (SQLException e) {
        	printSQLException(e);
        }
        return result;
	}

}
