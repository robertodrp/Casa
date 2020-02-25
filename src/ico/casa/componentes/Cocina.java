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
public class Cocina {
    
    private int lavaplatos;
    private String comida;
    private float voltaje;
    private int vasos;
    private String marcaEstufa;

    public Cocina() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    public Cocina(int lavaplatos, String comida, float voltaje, int vasos, String marcaEstufa) {
        this.lavaplatos = lavaplatos;
        this.comida = comida;
        this.voltaje = voltaje;
        this.vasos = vasos;
        this.marcaEstufa = marcaEstufa;
    }

    public int getLavaplatos() {
        return lavaplatos;
    }

    public void setLavaplatos(int lavaplatos) {
        this.lavaplatos = lavaplatos;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public float getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(float voltaje) {
        this.voltaje = voltaje;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    public String getMarcaEstufa() {
        return marcaEstufa;
    }

    public void setMarcaEstufa(String marcaEstufa) {
        this.marcaEstufa = marcaEstufa;
    }

    
    
    
}
