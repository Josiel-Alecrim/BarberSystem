
package Servico;

import Model.Agendamento;

/**
 *
 * @author Uchiha
 */
public class Correio {
    
    public void NotificarPorEmail(Agendamento agendamento){
        String emailFormatado = formartarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        //Uso da classe de e-mail
        Email email = new Email("Agendamento BarberShop", emailFormatado, destinatario);
        email.enviar();
    }

    private String formartarEmail(Agendamento agendamento) {
        
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraformatada();
        float valor = agendamento.getValor();
        
        return "Olá " + nomeCliente + " Vai da um tapa no visual... Seu agendamento para " +
                servico + ", está marcado para o dia " + dataAgendamento +
                " ás "+ horaAgendamento + " O preço ficou R$ " + valor + " Forte Abraço!";
    }
}
