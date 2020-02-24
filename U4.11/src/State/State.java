/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author Jose Luis Perez
 */
public class State {

    private String estado1;
    private String estado2;
    private int poblacion1;  
    private int poblacion2;
    private City ciudad;
    
    public State(String estado1, 
                       int poblacion1,
                          String estado2,
                                int poblacion2,
                                   String nameCiudad,
                                         int poblacionCiudad){
        
        this.estado1 = estado1;
        this.poblacion1 = poblacion1;
        this.estado2 = estado2;
        this.poblacion2 = poblacion2;
        this.ciudad = new City(nameCiudad, poblacionCiudad);
    }
    
    private class City {
        private String nameCiudad;
        private int poblacionCiudad;
        private City(String nameCiudad, int poblacionCiudad){
            this.nameCiudad = nameCiudad;
            this.poblacionCiudad = poblacionCiudad;
        }
        
        @Override
        public String toString() {
            return this.nameCiudad + this.poblacionCiudad;
        }    
    }
    
    public String getEstado1(){
        return this.estado1;
    }
    
    public int getPoblacion1(){
        return this.poblacion1;
    }
    
    public String getEstado2(){
        return this.estado2;
    }
    
    public int getPoblacion2(){
        return this.poblacion2;
    }
    
    public String getCiudad(){
        return this.ciudad + "";
    }
}