package org.loja.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.loja.config.ConfigDataSource;
import org.loja.entity.Jogo;

public class RepositoryJogo {
	private Connection connection;

	public RepositoryJogo() {
		connection = ConfigDataSource.getConnection();
	}

	public void salvarJogo(Jogo jogo) {
		String sql = "insert into jogo (numero,disponivel) values (?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, jogo.getValue());
			ps.setBoolean(2, jogo.isDisponivel());
			ps.executeUpdate();
		} catch (Exception e) {

		}
	}

	public Jogo getJogo(String value) {
		System.out.println("Num: " + value);
		String sql = "SELECT * FROM jogo jg  WHERE jg.numero ='" + value + "' ";
		Jogo jogo = new Jogo();
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {

				jogo.setIdJogo(rs.getInt(1));
				jogo.setValue(rs.getString(2));
				jogo.setDisponivel(rs.getBoolean(3));

			}
			return jogo;
		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
			return jogo;
		}

	}

	public List<Jogo> getJogos(String value) {
		List<Jogo> jogos = new ArrayList<Jogo>();
		String sql="";
		if (Objects.isNull(value) || Objects.equals(value, "")) {
			sql = "SELECT * FROM jogo jg limit 12 ";
			
		} else {
			sql = "SELECT * FROM jogo jg where jg.numero like '%" + value + "%' limit 12 ";
		}

		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Jogo jogo = new Jogo();
				jogo.setIdJogo(rs.getInt(1));
				jogo.setValue(rs.getString(2));
				jogo.setDisponivel(rs.getBoolean(3));
				jogos.add(jogo);
			}
			return jogos;
		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
			return jogos;
		}

	}

	public static List<String> gerarMilhar() {

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 10000; i++) {

			if (i <= 9) {
				// System.out.println("000"+String.valueOf(i));
				list.add("000" + String.valueOf(i));
			}
			if (i > 9 && i <= 99) {
				// System.out.println( "00"+String.valueOf(i));
				list.add("00" + String.valueOf(i));
			}

			if (i > 99 && i <= 999) {
				// System.out.println( "0"+String.valueOf(i));
				list.add("0" + String.valueOf(i));
			}
			if (i > 999) {
				// System.out.println(String.valueOf(i));
				list.add(String.valueOf(i));
			}

		}

		return list;

	}

	public static void main(String[] args) {
		RepositoryJogo rj = new RepositoryJogo();
		Jogo jogo = rj.getJogo("0000");
		System.out.println("Value: " + rj.getJogos("000"));
		
		RepositoryPessoa repositoryPessoa = new RepositoryPessoa();
		System.out.println(repositoryPessoa.getPessoas());
	}

}
