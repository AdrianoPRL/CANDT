/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.candt.pi3;



    import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
public class DAOProduto extends BDconexao{

  public List<Produto> listar() {

    String query = "SELECT id, nome, descricao, "
	    + "vl_compra, vl_venda, categoria, "
	    + "dt_cadastro FROM produto";

    List<Produto> lista = null;
    try (Connection conn = obterConexao();
	    PreparedStatement stmt = conn.prepareStatement(query);
	    ResultSet resultados = stmt.executeQuery()) {

      lista = new ArrayList<Produto>();
      while (resultados.next()) {
	Produto p = new Produto();
	p.setId(resultados.getLong("id"));
	p.setNome(resultados.getString("nome"));
	p.setDescricao(resultados.getString("descricao"));
	p.setValorCompra(resultados.getBigDecimal("vl_compra"));
	p.setValorVenda(resultados.getBigDecimal("vl_venda"));
	p.setDescricao(resultados.getString("categoria"));
	p.setDtCadastro(resultados.getTimestamp("dt_cadastro"));
	lista.add(p);
      }
    } catch (SQLException ex) {
      System.err.println(ex.getMessage());
    } catch (ClassNotFoundException ex) {
      System.err.println(ex.getMessage());
    }
    return lista;
  }

  public Produto obter(long id) {
    String query = "SELECT * FROM produto WHERE (id=?)";

    Produto prod = new Produto();
    try (Connection conn = obterConexao();
	    PreparedStatement stmt = conn.prepareStatement(query)) {

      stmt.setLong(1, id);
      try (ResultSet resultados = stmt.executeQuery()) {

	if (resultados.next()) {
	  prod = new Produto();
	  prod.setId(resultados.getLong("id"));
	  prod.setNome(resultados.getString("nome"));
	  prod.setDescricao(resultados.getString("descricao"));
	  prod.setValorCompra(resultados.getBigDecimal("vl_compra"));
	  prod.setValorVenda(resultados.getBigDecimal("vl_venda"));
	  prod.setDescricao(resultados.getString("categoria"));
	  prod.setDtCadastro(resultados.getTimestamp("dt_cadastro"));
	}
      }
    } catch (SQLException ex) {
      System.err.println(ex.getMessage());
    } catch (ClassNotFoundException ex) {
      System.err.println(ex.getMessage());
    }
    return prod;
  }


  public void incluirComTransacao(Produto p) {

    String query = "INSERT INTO produto "
	    + "(nome, descricao, vl_compra, vl_venda, "
	    + "categoria, dt_cadastro) "
	    + "VALUES (?, ?, ?, ?, ?, ?)";
       
    try (Connection conn = obterConexao()) {
      conn.setAutoCommit(false); 
      try (PreparedStatement stmt
	      = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
	stmt.setString(1, p.getNome());
	stmt.setString(2, p.getDescricao());
	stmt.setBigDecimal(3, p.getValorCompra());
	stmt.setBigDecimal(4, p.getValorVenda());
	stmt.setString(5, p.getCategorias());
	stmt.setTimestamp(6, new java.sql.Timestamp(System.currentTimeMillis()));

	stmt.executeUpdate();


	try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
	  if (generatedKeys.next()) {
	      long idNovo = generatedKeys.getLong(1);
	    p.setId(idNovo);
	   

	
	  }

	}
	conn.commit();
      } catch (SQLException ex) {
	conn.rollback();    
	System.err.println(ex.getMessage());
      }

    } catch (SQLException ex) {
      System.err.println(ex.getMessage());
    } catch (ClassNotFoundException ex) {
      System.err.println(ex.getMessage());
    }
   
  }
   public Produto procurar(String nome) {
    String query = "SELECT * FROM produto WHERE (nome=?)";

    Produto prod = null;
    try (Connection conn = obterConexao();
	    PreparedStatement stmt = conn.prepareStatement(query)) {

      stmt.setString(1, nome);
      try (ResultSet resultados = stmt.executeQuery()) {

	if (resultados.next()) {
	  prod = new Produto();
	  prod.setId(resultados.getLong("id"));
	  prod.setNome(resultados.getString("nome"));
	  prod.setDescricao(resultados.getString("descricao"));
	  prod.setValorCompra(resultados.getBigDecimal("vl_compra"));
	  prod.setValorVenda(resultados.getBigDecimal("vl_venda"));
	  prod.setCategorias(resultados.getString("categoria"));
	  prod.setDtCadastro(resultados.getTimestamp("dt_cadastro"));
	}
      }
    } catch (SQLException ex) {
      System.err.println(ex.getMessage());
    } catch (ClassNotFoundException ex) {
      System.err.println(ex.getMessage());
    }
    return prod;
  }
   public void excluir(long ID)  {
        String sql = "DELETE FROM Produto WHERE (id=?)";
        Connection connection = null;

        try (Connection conn = obterConexao();
	    PreparedStatement stmt = conn.prepareStatement(sql)) {;
            stmt.setLong(1, ID);
            stmt.execute();
        } 
         catch (SQLException ex) {
      System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
      System.err.println(ex.getMessage());
    }
}
   public  void Atualizar(Produto produto) {
   String sql = "UPDATE produto SET nome=?, descricao=?, vl_venda=?,vl_compra=?, categoria=?, dt_cadastro=?"
                + "WHERE (id=?)";
    
        try (Connection conn = obterConexao();
	    PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setBigDecimal(3, produto.getValorCompra());
            stmt.setBigDecimal(4, produto.getValorVenda());
              stmt.setString(5, produto.getCategorias());
               Timestamp t = new Timestamp(produto.getDtCadastro().getTime());
              stmt.setTimestamp(6,t);
              stmt.setLong(7,produto.getId());
              stmt.execute();
    }
     catch (SQLException ex) {
      System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
      System.err.println(ex.getMessage());
    }
   }
}

