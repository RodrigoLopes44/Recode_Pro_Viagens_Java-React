package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Cliente;

public class ClienteDAO {
	
	public void save(Cliente cliente) {		

		String sql = "INSERT INTO Cliente(id_cli, nome, cpf)" + "VALUES(?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			
			// Método de conexão
			conn = ConnectionFactory.createConnectionSQLServer();
			
			// Método de preparo para execução
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, cliente.getId_cli());

			pstm.setString(2, cliente.getNome());

			pstm.setString(3, cliente.getCpf());
			

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
		
		String sql = "DELETE FROM Cliente WHERE id_cli = ?";

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

	public void update(Cliente cliente) {
		String sql = "UPDATE Cliente SET id_cli= ?, nome = ?, cpf = ? WHERE id_cli= ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			
			conn = ConnectionFactory.createConnectionSQLServer();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, cliente.getId_cli());

			pstm.setString(2, cliente.getNome());

			pstm.setString(3, cliente.getCpf());

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

	public List<Cliente> getClientes() {

		String sql = "SELECT * FROM Cliente";

		List<Cliente> cliente = new ArrayList<Cliente>();

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
				Cliente clientes = new Cliente();

				// Recupera o id do banco e atribui ele ao objeto
				clientes.setId_cli(rset.getInt("Id_cli"));

				// Recupera a Cidade no banco e atribui ele ao objeto
				clientes.setNome(rset.getString("Nome"));

				// Recupera o Estado do banco e atribui ele ao objeto
				clientes.setCpf(rset.getString("CPF"));				

				// Adiciona o cliente recuperado, a lista de clientes
				cliente.add(clientes);
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
		return cliente;
	}

}
