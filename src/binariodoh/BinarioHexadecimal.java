/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binariodoh;

/**
 *
 * @author Reymundo Tenorio
 */
public class BinarioHexadecimal extends Thread{
    
   private String num;
   private String hexa;
    
    @Override
    public void run(){
        
       
            int n = Integer.parseInt(this.num,2);
           this.hexa = Integer.toHexString(n);
            
           
    }
    
    public void setBinarioHexadecimal(String numero){
        this.num=numero;
    }
    
    public String getBinarioHexadecimal(){
        return this.hexa;
    }
    
}
