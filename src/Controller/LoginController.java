
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;


public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        //Pegar usuario da view
        Usuario usuario = helper.obterModelo();
        //pesquisar usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if (usuarioAutenticado != null) {
            //navegar para o menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuario ou senha invalidos");
        }
        //Se o usuario e senha estiver q nem o do banco, direcionar para o menu
       //Senão mostrar na tela, " Usuario ou senha Invalidos "
       
    }
    
    public void fizTarefa(){
        System.out.println("Busquei no banco");
        this.view.exibeMensagem("Executei a tarefa");
    }
}































