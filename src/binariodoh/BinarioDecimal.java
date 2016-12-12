/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binariodoh;

/**
 *
 * @author Reymundo Tenorio
 */
public class BinarioDecimal extends Thread{
    
   private String num;
   private String decimal;
    
    @Override
    public void run(){
     

    int n = Integer.parseInt(this.num,2);
    this.decimal=Integer.toString(n);


    }
    
   public void setBinarioDecimal(String numero) {
        this.num=numero;
    }
   
   public String getBinarioDecimal(){
       return this.decimal;
   }

    
}
