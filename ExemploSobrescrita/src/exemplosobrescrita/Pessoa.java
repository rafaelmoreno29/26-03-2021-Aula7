/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosobrescrita;

/**
 *
 * @author Moreno
 */
public class Pessoa {

    private String email;
    private String celular;

    public Pessoa() {
    }

    public Pessoa(String email, String celular) {
        this.email = email;
        this.celular = celular;
    }

    @Override
    public String toString() {
        return imprimir();
    }
    
    
    public String imprimir(){
        return "E-mail: " + email + "\nCelular: " + celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
