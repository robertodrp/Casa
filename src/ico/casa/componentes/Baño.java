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
public class Baño {
    
   private String numeroDeSerieRegadera;
   private int numeroRegadera;
   private int numeroProductosPelo;
   private String nombrePapelDeBaño;
   private float cantidadDeAgua;

    public Baño() {
    }

    public Baño(String numeroDeSerieRegadera, int numeroRegadera, int numeroProductosPelo, String nombrePapelDeBaño, float cantidadDeAgua) {
        this.numeroDeSerieRegadera = numeroDeSerieRegadera;
        this.numeroRegadera = numeroRegadera;
        this.numeroProductosPelo = numeroProductosPelo;
        this.nombrePapelDeBaño = nombrePapelDeBaño;
        this.cantidadDeAgua = cantidadDeAgua;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNumeroDeSerieRegadera() {
        return numeroDeSerieRegadera;
    }

    public void setNumeroDeSerieRegadera(String numeroDeSerieRegadera) {
        this.numeroDeSerieRegadera = numeroDeSerieRegadera;
    }

    public int getNumeroRegadera() {
        return numeroRegadera;
    }

    public void setNumeroRegadera(int numeroRegadera) {
        this.numeroRegadera = numeroRegadera;
    }

    public int getNumeroProductosPelo() {
        return numeroProductosPelo;
    }

    public void setNumeroProductosPelo(int numeroProductosPelo) {
        this.numeroProductosPelo = numeroProductosPelo;
    }

    public String getNombrePapelDeBaño() {
        return nombrePapelDeBaño;
    }

    public void setNombrePapelDeBaño(String nombrePapelDeBaño) {
        this.nombrePapelDeBaño = nombrePapelDeBaño;
    }

    public float getCantidadDeAgua() {
        return cantidadDeAgua;
    }

    public void setCantidadDeAgua(float cantidadDeAgua) {
        this.cantidadDeAgua = cantidadDeAgua;
    }
    
}
