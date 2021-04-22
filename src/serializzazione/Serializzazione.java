/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author galimberti.riccardoe
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.run();
        
        Studente[] list = { new Studente("Mario", "Rossi" , 1),
            new Studente("Paolo", "Neri" , 2),
            new Studente("Giovanni", "Verdi" , 3)};
        
        try {
            FileOutputStream FO = new FileOutputStream("test.ser");
            ObjectOutputStream OS = new ObjectOutputStream(FO); 
            
            OS.writeObject(list);
            OS.flush();
            OS.close();
            FO.close();

            FileInputStream FI = new FileInputStream("test.ser");
            ObjectInputStream IS = new ObjectInputStream(FI);
            list = (Studente[])IS.readObject();
            for (Studente s : list) {
                System.out.println(s.toString());
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Impossibile trovare il file");
        } catch (IOException ex) {
            System.out.println("Hai rotto java");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe non trovata");
        }
    }
    
}
