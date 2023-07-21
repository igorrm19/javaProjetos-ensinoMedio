
package com.mycompany.bixim;

import Service.AnimalService;
import Util.Login;
import static java.awt.SystemColor.menu;
import java.util.Scanner;



public class BIXIM {
  
    public BIXIM(){}        
    

    public static void main(String[] args) {
       String opcao = null; 
       Login cadrastar = new Login(); 
       AnimalService anse = new AnimalService();
        
       System.out.println("========================================");
       System.out.println(" Bem-vindo ao sistema de petishop BIXIM");
       System.out.println("========================================");
       
       
       
       System.out.println("Porfavor informe seu usuario e senha: ");
       cadrastar.login(); //chamo o metodo de cadrasto da classe Login 
   
       System.out.println("Insira a senha e o usuario cadrastado: ");
       cadrastar.cadrastar();  //chamo o metodo de login da classe Login
       
       cadrastar.Logar(); //chamo o metodo de validação de login na classe Login
       
       
       System.out.println("========================================");
       System.out.println("Ola " + cadrastar.usuario + " oque deseja fazer?");  
       System.out.println("caso deseje termina a operação digiti 0");
       System.out.println("==================MENU==================");
       
       
       System.out.println("1 -  Cadrasto do animal 1");
       System.out.println("2 -  Cadrasto dos serviços");
       System.out.println("3 -  Lançamento de atendimeto");
       System.out.println("4 -  Listar dados dos animais");
       System.out.println("5 -  Listar dados do serviço");
       System.out.println("6 -  Listar atendimentos cadrastados");
       System.out.println("7 -  Emitir nota fiscal");
       System.out.println("8 -  Limpar banco de dados");
       System.out.println("9 -  Relatorio - maior valor do atendimento do animal");
       System.out.println("10 - Relatorio - menor valor do atendimento do animal");
       System.out.println("11-  Relatorio - totalizar atendimento dos animais");
       
       
       //menu de opçãoes
     
      Scanner scan = new Scanner(System.in); 
 for(int a = 0; a <= 2;){
  int menu = scan.nextInt();
       
       switch(menu){
           case 0:
               System.exit(0);  //o loop é infinito ate aperta 0
                 break;
           case 1: 
            System.out.println("=====MENU=DE=OPCAO=DO=ANIMAL=====");
            System.out.println("1 - Inserir animal");
            System.out.println("2 - Deletar animar");
            System.out.println("3 - Alterar animal"); 
            System.out.println("Digiti zero para voltar ao menu anterior!");
            System.out.println("==================================");
              int animal = scan.nextInt();
                 switch(animal){
                     case 0:
                          System.exit(0);
                         break;
                     case 1:
                          System.out.println("==================================");
                          System.out.println("Inserir animal");
                          System.out.println("==================================");
                          anse.inserirAnimal(animal, opcao, opcao, opcao);
                          break;
                     case 2:
                          System.out.println("==================================");
                          System.out.println("Deletar animar");
                          System.out.println("==================================");
                          anse.removerAnimal(animal, null, null, null);
                         break;
                     case 3:
                          System.out.println("==================================");
                          System.out.println("Alterar animal");
                          System.out.println("==================================");
                          anse.alterarAnimal(animal, opcao, opcao, opcao);
                         break;
                 }
                 break;
           case 2:
            System.out.println("=====MENU=DE=OPCAO=DO=SERVICE=====");
            System.out.println("1 - Inserir serviço");
            System.out.println("2 - Deletar serviço");
            System.out.println("3 - Alterar serviço"); 
            System.out.println("Digiti zero para voltar ao menu anterior!");
            System.out.println("==================================");
                 int service = scan.nextInt();
                 switch(service){
                     case 0:
                          System.exit(0);
                         break;
                     case 1:
                          System.out.println("==================================");
                          System.out.println("Inserir serviço");
                          System.out.println("==================================");
                         break;
                     case 2:
                          System.out.println("==================================");
                          System.out.println("Deletar serviço");
                          System.out.println("==================================");
                         break;
                     case 3:
                          System.out.println("==================================");
                          System.out.println("Alterar serviço");
                          System.out.println("==================================");
                         break;
                 }
                 break;
           case 3:
            System.out.println("==================================");
            System.out.println("Lançamento de atendimeto");
            System.out.println("==================================");
            anse.CadrastarAnimal(service=0, opcao, opcao, opcao);
                 break;
           case 4:
            System.out.println("==================================");
            System.out.println("Listar dados dos animais");
            System.out.println("==================================");   
            anse.MostrarAnimal();
                 break;
           case 5:
            System.out.println("==================================");
            System.out.println("Listar dados do serviço");
            System.out.println("==================================");    
                 break;
           case 6:
            System.out.println("==================================");
            System.out.println("Listar atendimentos cadrastados");
            System.out.println("==================================");
                 break;
           case 7:
            System.out.println("==================================");
            System.out.println("Emitir nota fiscal");
            System.out.println("==================================");
                 break;
           case 8:
            System.out.println("==================================");
            System.out.println(" Limpar banco de dados");
            System.out.println("==================================");
                 break;
           case 9:
            System.out.println("==================================");
            System.out.println("Relatorio - maior valor do atendimento do animal");
            System.out.println("==================================");
                 break;
           case 10:
            System.out.println("==================================");
            System.out.println("Relatorio - menor valor do atendimento do animal");
            System.out.println("==================================");
                 break;
           case 11:
            System.out.println("==================================");
            System.out.println("Relatorio - totalizar atendimento dos animais");
            System.out.println("==================================");
                 break;      
       } 
          
     }
          
   }
    
}






