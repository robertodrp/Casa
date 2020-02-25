/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.casa.arquitectura;

import ico.casa.componentes.Baño;
import ico.casa.componentes.Cocina;
import ico.casa.componentes.Sala;

public class Cuartos {
    
    private float precio;
    private float tamaño;
    private String ubicacion;
    private Baño baño;
    private Cocina cocina;
    private Sala sala;
    
    public Cuartos() {
        
    }

    public Cuartos(float precio, float tamaño, String ubicacion, Baño baño, Cocina cocina, Sala sala) {
        this.precio = precio;
        this.tamaño = tamaño;
        this.ubicacion = ubicacion;
        this.baño = baño;
        this.cocina = cocina;
        this.sala = sala;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Baño getBaño() {
        return baño;
    }

    public void setBaño(Baño baño) {
        this.baño = baño;
    }

    public Cocina getCocina() {
        return cocina;
    }

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
       

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
