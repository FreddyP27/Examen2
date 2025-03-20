package examen2.freddyarmando.perezcampos.examen.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import es.cursojava.Utils.UtilidadesBaseDeDatos;

import es.cursojava.utils.UtilidadesBD;

public class Main {
	private static final String CONSULTA_EMPLEADOS = "SELECT ID, NOMBRE, TIPO, PRECIO, CANTIDAD FROM TB_Productos;";
	private static Statement st = null;
	private static ResultSet rs = null;
	 
    public static void obtenerTodosLosProductos() {
        
        Connection conexion = UtilidadesBaseDeDatos.crearConexion();
		try {
			st = conexion.createStatement();
			rs = st.executeQuery(CONSULTA_EMPLEADOS);
			while(rs.next()) {
				int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String tipo =rs.getString("tipo");
                int precio=rs.getInt("precio");
                int cantidad=rs.getInt("cantidad");
                
				
		
			}

		}catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            UtilidadesBD.cierraConexion(conexion);
            try {
                st.close();
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //System.out.println("TERMINA");
        }
		
    }
    
   
		
	public static void main(String[] args) {
		Main m=new Main();
		
	}

}
