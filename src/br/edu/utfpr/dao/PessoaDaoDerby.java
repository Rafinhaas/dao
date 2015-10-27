/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;
import java.sql.*;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoDerby implements Dao{
    
    Statement stmt;

    //Quando construir um objeto dessa classe, vai conectar no banco
    public PessoaDaoDerby() {
        String username = "master";
        String password = "123";
        String url = "jdbc:derby://localhost:1527/MeuBancoDeDados";
        //depois disso, posso mandar conectar
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
            System.out.println("Conexão estabelecida");
        }catch(SQLException se){
            System.out.println("Mensagem: "+se.getMessage());
        }
    }    

    @Override
    public void adicionar(Pessoa p) {
        String instrucao = "INSERT INTO PESSOA (NOME, SOBRENOME, IDADE) VALUES(" + "'" + p.getNome() + "', "
                                                                                 + "'" + p.getSobrenome() + "', " 
                                                                                 + p.getIdade() + ")";
        System.out.println(instrucao);
        try {
            stmt.executeUpdate(instrucao);
        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
    }

    @Override
    public void remover(Pessoa p) {
        String instrucao = "DELETE FROM PESSOA WHERE NOME = '" + p.getNome() + "'";
        System.out.println(instrucao);
        try {
            stmt.executeUpdate(instrucao);
        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
    }

    @Override
    public void listarTudo() {

    }
    
}
