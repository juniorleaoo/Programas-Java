/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.imc.conexao;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class Conexao {

    public Connection con;
    public Statement stmt;
    public ResultSet rs;

    String url = "jdbc:mysql://localhost/imc";
    String user = "root";
    String password = "1234";

    public void abrirConexao() {
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            if (con != null) {
                JOptionPane.showMessageDialog(null, "Conectado");
            } else {
                JOptionPane.showMessageDialog(null, "Não Conectado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void inserir(float peso, String nome, float altura, float calcIMC) {
        try {
            con = DriverManager.getConnection(url, user, password);

            stmt = con.createStatement();
            String sql;
            sql = "insert into imc (peso,nome,altura,calculoIMC) values ("
                    + Float.toString(peso)
                    + ","
                    + "'" + nome + "'"
                    + ","
                    + Float.toString(altura)
                    + ","
                    //+ String.format("%.3f", calcIMC)
                    + Float.toString(calcIMC)
                    + ")";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Inserido");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public String select(String nome) {
        String resultado = "";
        try {
            con = DriverManager.getConnection(url, user, password);
            String sql;
            sql = "SELECT calculoIMC FROM imc WHERE nome=" + "'" + nome + "'";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                resultado = rs.getString("calculoIMC");
                return resultado;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return "0";
    }
}
