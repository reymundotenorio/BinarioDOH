/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binariodoh;

/**
 *
 * @author Reymundo Tenorio
 */
public class BinarioOctal extends Thread{
    
    private String num;
    private String octal;
    
    @Override
    public void run(){
        
    
   int n = Integer.parseInt(this.num,2);
    this.octal=Integer.toOctalString(n);
     
        
    }
     public void setBinarioOctal(String numero) {
        this.num=numero;
    }
   public String getBinarioOctal(){
       return this.octal;
   }
    
}
