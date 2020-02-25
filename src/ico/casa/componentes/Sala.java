/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.casa.componentes;

/**
 *
 * @author Principal
 */
public class Sala {
    
    private String marcaTelevisor;
    private int sillones;
    private String marcaTelevision;
    private int mesa;
    private float voltaje;

    public Sala() {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    public Sala(String marcaTelevisor, int sillones, String marcaTelevision, int mesa, float voltaje) {
        this.marcaTelevisor = marcaTelevisor;
        this.sillones = sillones;
        this.marcaTelevision = marcaTelevision;
        this.mesa = mesa;
        this.voltaje = voltaje;
    }

    public String getMarcaTelevisor() {
        return marcaTelevisor;
    }

    public void setMarcaTelevisor(String marcaTelevisor) {
        this.marcaTelevisor = marcaTelevisor;
    }

    public int getSillones() {
        return sillones;
    }

    public void setSillones(int sillones) {
        this.sillones = sillones;
    }

    public String getMarcaTelevision() {
        return marcaTelevision;
    }

    public void setMarcaTelevision(String marcaTelevision) {
        this.marcaTelevision = marcaTelevision;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public float getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(float voltaje) {
        this.voltaje = voltaje;
    }

    
}