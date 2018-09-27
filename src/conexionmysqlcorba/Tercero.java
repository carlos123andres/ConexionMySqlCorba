package conexionmysqlcorba;

import java.sql.*;
import Terceros.*;



public class Tercero extends TerceroPOA {
    
    
    
    Conexion objConec=new Conexion();

    @Override
    public boolean insertarTercero(String nombre, String apellidos, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarTercero(int id, String nombre, String apellidos, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarTercero(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean consultarTercero(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdwn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
            
}
