/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

/**
 *
 * @author oxot12
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Avion DHL=new Avion();
        DHL.despejar();
        DHL.gasolina();
        DHL.maniobrableX();
        DHL.abordaje();
        DHL.despejar();
        DHL.turbinas();
        DHL.velocidad();
        
        Helicoptero guerra=new Helicoptero();
        guerra.gasolina();
        guerra.maniobrableF();
        guerra.helices();
        guerra.abordaje();
        guerra.velocidad();
        guerra.despejar();
        
        
        Automovil carro1=new Automovil();
        carro1.carretera();
        carro1.gasolina();
        carro1.abordaje();
        
        Motos kawasaki=new Motos();
        kawasaki.carretera();
        kawasaki.gasolina();
        kawasaki.velocidad();
        kawasaki.abordaje();
        
       
    }
    
}
