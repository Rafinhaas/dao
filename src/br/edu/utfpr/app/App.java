/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.app;

import br.edu.utfpr.dao.Dao;
import br.edu.utfpr.dao.PessoaDaoArrayList;
import br.edu.utfpr.dao.PessoaDaoDerby;
import br.edu.utfpr.modelo.Pessoa;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class App {

    //psvm + tab
    public static void main(String[] args) {

        Dao dao = new PessoaDaoDerby();

        Pessoa joao = new Pessoa("Joao", "Silva", 20);
        Pessoa pedro = new Pessoa("Pedro", "Silva", 21);
        Pessoa jose = new Pessoa("Jose", "Silva", 22);

//        Dao dao = new PessoaDaoArrayList();
//        dao.adicionar(joao);
//        dao.adicionar(jose);
//        dao.adicionar(pedro);
//        
//        dao.listarTudo();
//        
//        System.out.println("\n\n -----Vamos remover");
        dao.listarTudo();
    }
}
