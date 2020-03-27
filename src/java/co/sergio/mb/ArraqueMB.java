/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.sergio.mb;

import co.sergio.dao.OperacionVeh;
import co.sergio.dto.Vehiculo;
import javax.inject.Named;

/**
 *
 * @author Sala 30
 */
@Named(value = "arraqueMB")
public class ArraqueMB {

    /**
     * Creates a new instance of ArraqueMB
     */
    public ArraqueMB() {
        
    }
    public String mensaje() {
        System.out.println(" Ingreso- - - - - - - - ");
        OperacionVeh oper = new OperacionVeh();
        int x = oper.crear(new Vehiculo());
        System.out.println(" Guuardo - - - - - - - - "+x);
        return "";
    }
}
