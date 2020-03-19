package org.loja.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.loja.config.ConfigDataSource;
import org.loja.entity.Pessoa;

public class RepositoryPessoa {
	private Connection connection;

	public RepositoryPessoa() {

		connection = ConfigDataSource.getConnection();
	}


	public void save(Pessoa p) {
        String sql = "insert into pessoa (nome,email,contato) values (?,?,?)";
        try {
			PreparedStatement ps = connection.prepareStatement(sql);			
			ps.setString(1, p.getNome());
			ps.setString(2, p.getEmail());
			ps.setString(3, p.getContact());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void update(Pessoa pessoa) {
        String sql = "update pessoa set nome=?, email=?,contato=? where idPessoa="+pessoa.getIdPessoa();
        try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, pessoa.getNome());
			ps.setString(2, pessoa.getEmail());
			ps.setString(3, pessoa.getContact());			
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void delete(int idPessoa) {
		String sql = "delete from pessoa where idPessoa=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, idPessoa);
			ps.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public List<Pessoa> getPessoas() {
		String sql = "select * from pessoa p limit 150";
		 List<Pessoa> pessoas = new ArrayList<Pessoa>();
		try {
			ResultSet rs = connection.prepareStatement(sql).executeQuery();
			while(rs.next()) {		
				Pessoa p = new Pessoa();
				p.setIdPessoa(rs.getInt(1));
				p.setNome(rs.getString(2));
				p.setEmail(rs.getString(3));
				p.setContact(rs.getString(4));
				pessoas.add(p);	
			}
			return pessoas;
		} catch (SQLException e) {
			
			return new ArrayList<Pessoa>();
		}
		
	}
	
	public Pessoa getPessoa( int idPessoa) {
		String sql = "select * from pessoa p where p.idPessoa = "+idPessoa;
		Pessoa p = new Pessoa();
		try {
			ResultSet rs = connection.prepareStatement(sql).executeQuery();
			if(rs.next()) {		
				
				p.setIdPessoa(rs.getInt(1));
				p.setNome(rs.getString(2));
				p.setEmail(rs.getString(3));
				p.setContact(rs.getString(4));
					
			}
			return p;
		} catch (SQLException e) {
			
			return null;
		}
		
	}
	
	public List<Pessoa> consultarPessoas( String busca) {
		String sql = "select * from pessoa p where p.nome like '"+busca+"%' ";
		 List<Pessoa> pessoas = new ArrayList<Pessoa>();
		try {
			ResultSet rs = connection.prepareStatement(sql).executeQuery();
			while(rs.next()) {		
				Pessoa p = new Pessoa();
				p.setIdPessoa(rs.getInt(1));
				p.setNome(rs.getString(2));
				p.setEmail(rs.getString(3));
				p.setContact(rs.getString(4));
				pessoas.add(p);	
			}
			return pessoas;
		} catch (SQLException e) {
			
			return null;
		}
		
	}

	
}
