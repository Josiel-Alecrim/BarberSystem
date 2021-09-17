/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario; 

/**
 *
 * @author Uchiha
 */
public class Main {
    
    public static void main(String[] args){
        
        String nome = "Josiel";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "barba", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        
        Cliente cliente = new Cliente(1, "josiel","Rua Teste", "9292929292");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "barbeiro", "senha");
        System.out.println(usuario.getNome());
        
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "30/11/2020 09:15");
        System.out.println(agendamento.getCliente().getNome());
    }
}




















