
package Service;

import java.util.Scanner;
import model.Animal;


public class AnimalService extends Animal{
   public int codigo = 111;
   public String nome = "xaquira";
   public String endereco = "rua cana verde";
   public String cidade = "Almenara-MG";
    
   public void inserirAnimal(int codigo, String endereco, String cidade, String nome){
        Scanner scan = new Scanner(System.in);
        
        for(int a = 0; a <= 2; a++){
        System.out.println("Adicionar codigo do animal: limiti 10 de cada informação");
        codigo = scan.nextInt();
        
        System.out.println("Adicionar endereco do animal: ");
        endereco = scan.next();
        
        System.out.println("Adicionar cidade do animal: ");
        cidade = scan.next();
        
        System.out.println("Adicionar nome do animal: ");
        nome = scan.next();
        }
        
        System.out.println("limiti de espaço preencido");
    }
    
    
    public void alterarAnimal(int codigo, String endereco, String cidade, String nome){
        
        Scanner scan = new Scanner(System.in);
        
        for(int b = 0; b <= 2; b++){
        System.out.println("Se deseja alterar o codigo do animal adicione o novo codigo caso nao queira repita o codigo antigo: Seu codigo atual é " + codigo);
        codigo = scan.nextInt();
        
        System.out.println("Se deseja alterar o endereco do animal adicione o novo endereco caso nao queira repita o endereco antigo: Seu endereco atual é " + endereco);
        endereco = scan.next();
        
        System.out.println("Se deseja alterar a cidade do animal adicione o novo cidade caso nao queira repita o cidade antigo: Seu cidade atual é " + cidade);
        cidade = scan.next();
        
        System.out.println("Se deseja alterar o nome do animal adicione o novo nome caso nao queira repita o nome antigo: Seu nome atual é " + nome);
        nome = scan.next();
        }
        
        System.out.println("limiti de espaço preencido");
     
    }
     
     
    public void removerAnimal(int codigo, String endereco, String cidade, String nome){
        
    
    
     
    }  
    
    public void linparDados(){
    
    }
    
     public void CadrastarAnimal(int codigo, String endereco, String cidade, String nome){
        Scanner scan = new Scanner(System.in);
        
        for(int a = 0; a <= 2; a++){
        System.out.println("Adicionar codigo do animal: limiti 20 de cada informação");
        codigo = scan.nextInt();
        
        System.out.println("Adicionar endereco do animal: ");
        endereco = scan.next();
        
        System.out.println("Adicionar cidade do animal: ");
        cidade = scan.next();
        
        System.out.println("Adicionar nome do animal: ");
        nome = scan.next();
        }
        
        System.out.println("limiti de espaço preencido");
        
        
    }
     
     public void MostrarAnimal(){
        
       System.out.println("dados do animal " + nome + codigo + cidade + endereco);
     }
    
    
    public  AnimalService(){
     
   }
    
     
}

