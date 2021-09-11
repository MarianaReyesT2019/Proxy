/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {
    
    public static void main(String[] args){
        Cuenta c = new Cuenta(1478, "Marina Reyes", 500.00);
        
        ICuenta cuentaProxy = new CuentaProxy();
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c, 50);
        c = cuentaProxy.retirarDinero(c, 20);
      
        
    }
    
}
