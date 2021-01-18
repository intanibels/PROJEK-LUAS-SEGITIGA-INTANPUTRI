/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.luassegitiga;
/**
 *
 * @author Intan
 */
public class PROJEKLuasSegitiga {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Program output = new Program();
        //membuat hasil output
        System.out.println(output.judul());
        output.perhitungan();
        System.out.println("Hasil : "+output.Hasil());
    }
}
