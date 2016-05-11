package mapatematico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lelguea
 */
public class Integrante {

    public Integrante(String ID, String Instancia) {
        this.ID = ID;
        this.Instancia = Instancia;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Integrante{" + "ID=" + ID + ", Instancia=" + Instancia + '}';
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getInstancia() {
        return Instancia;
    }

    public void setInstancia(String Instancia) {
        this.Instancia = Instancia;
    }
        
        public String ID;
        public String Instancia;
    
}
