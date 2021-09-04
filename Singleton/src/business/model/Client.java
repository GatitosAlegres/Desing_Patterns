/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * @author IRVIN
 */
public class Client {
    
    private String lastName;
    private String firstName;
    private String dni;

    public Client(String lastName, 
                  String firstName, 
                  String dni) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dni = dni;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Apellidos: " + getLastName() + "\n" +
                "Nombres: " + getFirstName() + "\n" + 
                "DNI: " + getDni() + "\n\n";
    }
}
