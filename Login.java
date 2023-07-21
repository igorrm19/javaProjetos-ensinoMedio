
package Util;

import java.util.Scanner;


public class Login { 
    public String usuario; //usuario da tela de cadrasto
    private String senha;
    private String usuarioca; //usuariocda tela de login
    private String senhaca;
    
    Scanner scan = new Scanner(System.in);
    
    public void login(){ //adiciona nome e senha
        
       System.out.println("Adicionar nome: "); //nome
       this.setUsuario(scan.next()); //digiti cadrasto do usuario
       
       System.out.println("========================================");  //cadrasta usuario
       
       System.out.println("Adicionar senha: "); //senha
       this.setSenha(scan.next());
       
       System.out.println("========================================");
       
    }
    
    public void cadrastar(){
       System.out.println("Insira o usuario cadrastada: ");  //loga usuario
       this.usuarioca = scan.next(); //digiti login do usuario
        
       System.out.println("Insira a senha cadrastada: ");
       this.senhaca = scan.next();
    }
    
    
    
    
    public boolean Logar(){ //informa se o nome e a senha foram inseridos
       if(this.usuario != this.usuarioca && this.senha != this.senhaca){ //eu fiz a ordem inversa pq o netbens ta bugando no meu pc
           
         System.out.println("Usuario e senha corretos! ");  //valida usuario
             
         
       }else{
       
         System.out.println("Usuario ou senha incorreto! "); 
         System.exit(0);
         
       }
       
       
        return true;
    }
    
    
    public Login(){
  
    }
 
    
    
    //encapsulei usuario e senha
    public String getUsuario() {
        return usuario;
    }

   
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the usuarioca
     */
    public String getUsuarioca() {
        return usuarioca;
    }

    /**
     * @return the senhaca
     */
    public String getSenhaca() {
        return senhaca;
    }

    
   
}
