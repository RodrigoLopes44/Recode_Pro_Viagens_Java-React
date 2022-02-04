package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Local;

public class LocalDAO {
	
	public void save(Local local) {		

		String sql = "INSERT INTO Local(id_local, cidade, estado)" + "VALUES(?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			
			// Método de conexão
			conn = ConnectionFactory.createConnectionSQLServer();
			
			// Método de preparo para execução
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, local.getId_local());

			pstm.setString(2, local.getCidade());

			pstm.setString(3, local.getEstado());
			

			// Execução das instruções SQL
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			// Finaliza a conexão
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removeById(int id) {
		
		String sql = "DELETE FROM Local WHERE id_local = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update(Local local) {
		String sql = "UPDATE Local SET id_local= ?, cidade = ?, estado = ? WHERE id_local = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			
			conn = ConnectionFactory.createConnectionSQLServer();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, local.getId_local());

			pstm.setString(2, local.getCidade());

			pstm.setString(3, local.getEstado());

			// Executa a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fecha as conexões
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Local> getLocais() {

		String sql = "SELECT * FROM Local";

		List<Local> local = new ArrayList<Local>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, faça
			while (rset.next()) {
				Local locais = new Local();

				// Recupera o id do banco e atribui ele ao objeto
				locais.setId_local(rset.getInt("Id_local"));

				// Recupera a Cidade no banco e atribui ele ao objeto
				locais.setCidade(rset.getString("Cidade"));

				// Recupera o Estado do banco e atribui ele ao objeto
				locais.setEstado(rset.getString("Estado"));				

				// Adiciona o contato recuperado, a lista de contatos
				local.add(locais);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return local;
	}
}