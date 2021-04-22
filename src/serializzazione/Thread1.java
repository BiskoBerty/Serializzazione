/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

/**
 *
 * @author galimberti.riccardoe
 */
public class Thread1 implements Runnable{
    private String[] nomi = {"Paolo" , "Paola", "JuanPaola", "PierPaolo", "GianPaolo", "GianPaola", "Gustavo"};
    private String[] cognomi = {"Verdi" , "Rossi", "Arancioni", "Neri", "Bianchi", "Gialli","LaMorte"};
    
    
    @Override
    public void run() {
        while(true){
            Studente s = new Studente(rngName(), rngSur(), rngNum());
            System.out.println(s.toString());
        }
    }
    
    public String rngName(){
        String s;
        return s = nomi[(int) (Math.random()*7)];
    }
    
    public String rngSur(){
        String s;
        return s = cognomi[(int) (Math.random()*7)];
    }
    
    public int rngNum(){
        return (int) (Math.random()*100);
    }
}
