
package primos;


public class Primos {
  int n = 7 - 3;    
  int v[] = new int[100];
  int i;
  
  int x = 3, z = 1;
  int la = x - z;
  public void rept(){
      v[1] = x;
      v[2] = 3 + 2 ; //2 e a posicao, 3 a sub de 5 - 2
      v[3] = 3 + n ;
      
      for (i=0; i<10; i++) {
          
          System.out.printf(" " +  v[i]);
          
}
      
  
  }
   
    public static void main(String[] args) {
      Primos pp = new Primos();
      
      pp.rept();
    }
    
}
