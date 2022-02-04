package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Cliente;
import br.com.crud.model.Local;
import br.com.crud.model.Viagem;

public class ViagemDAO {
	
	public void save(Viagem viagem) {		

		String sql = "INSERT INTO Viagem(id_viagem, dataIda, dataVolta, FK_id_cli, FK_id_local)" + "VALUES(?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			
			// Método de conexão
			conn = ConnectionFactory.createConnectionSQLServer();
			
			// Método de preparo para execução
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, viagem.getId_cli());

			pstm.setString(2, viagem.getDataIda());

			pstm.setString(3, viagem.getDataVolta());
			
			pstm.setInt(4, viagem.getId_cli());
			
			pstm.setInt(5, viagem.getId_local());
			
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
		
		String sql = "DELETE FROM Viagem WHERE id_viagem= ?";

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

	public void update(Viagem viagem) {
		String sql = "UPDATE Viagem SET id_viagem = ?, dataIda = ?, dataVolta = ?, FK_id_cli = ?, FK_id_local = ? WHERE id_viagem = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			
			conn = ConnectionFactory.createConnectionSQLServer();
			
			pstm = conn.prepareStatement(sql);
			
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, viagem.getId_cli());

			pstm.setString(2, viagem.getDataIda());

			pstm.setString(3, viagem.getDataVolta());
			
			pstm.setInt(4, viagem.getId_cli());
			
			pstm.setInt(5, viagem.getId_local());
			
			// Execução das instruções SQL
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

	public List<Viagem> getViagens() {

		String sql = "select * from Viagem as v inner join Cliente as c on v.FK_id_cli = c.id_cli inner join Local as l on v.FK_id_local = l.id_local";
		
		List<Viagem> viagem = new ArrayList<Viagem>();

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
				Viagem viagens = new Viagem();
				Cliente clientes = new Cliente();
				Local locais = new Local();

				// Recupera o id do banco e atribui ele ao objeto
				viagens.setId_viagem(rset.getInt("Id_viagem"));

				// Recupera a Cidade no banco e atribui ele ao objeto
				viagens.setDataIda(rset.getString("dataIda"));

				// Recupera o Estado do banco e atribui ele ao objeto
				viagens.setDataVolta(rset.getString("dataVolta"));
				
				clientes.setId_cli(rset.getInt("Id_cli"));
				
				clientes.setNome(rset.getString("nome"));
				
				clientes.setCpf(rset.getString("cpf"));
				
				viagens.setCliente(clientes);
				
				locais.setId_local(rset.getInt("Id_Local"));
				
				locais.setCidade(rset.getString("Cidade"));
				
				locais.setEstado(rset.getString("Estado"));
				
				viagens.setLocal(locais);				
				
				// Adiciona o cliente recuperado, a lista de clientes
				viagem.add(viagens);
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
		return viagem;
	}

}
