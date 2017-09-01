package br.com.senac.candt.pi3;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDconexao {
  protected Connection obterConexao() throws SQLException, 
	  ClassNotFoundException {
    Connection conn = null;

    // Passo 1: Registrar o driver JDBC
    Class.forName("org.apache.derby.jdbc.ClientDataSource");

    // Passo 2: Abrir a conexão
    conn = DriverManager.getConnection(
	    "jdbc:derby://localhost:1527/Pi3;SecurityMechanism=3",
	    "app", // usuário BD
	    "app"); // senha BD
    return conn;
  }  
}
