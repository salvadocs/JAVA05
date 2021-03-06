package Controlador;


/* Acesso a la base de datos:
 * - Con recorrido lineal -> nex()
 * - Con Statemen de s�lo lectura -> createStatement() (sin p�rametros. Opciones por defecto.
 * - Actualizaciones, Borrados, e inserciones directas a la BDs y no al ResulSet.
 */
import Modelo.Empleado;
import Vista.InterfazGrafica;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AccesoBD {

    public AccesoBD() {

    }

    public void mostrarEmpleadosConsola() {
        try {

            Connection con = getConnection();

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM empleado");
            ResultSetMetaData rsmd = rs.getMetaData();
            int ncol = rsmd.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= ncol; i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println("");
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String[] getApellidosDistintos() {
        String[] apellidos = null;
        try {
            Connection con = getConnection();

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT DISTINCT APELLIDO FROM empleado");
            ResultSetMetaData rsmd = rs.getMetaData();
            int ncol = rsmd.getColumnCount();
            rs.last();
            int nrows = rs.getRow();
            int cont = 1;
            
            apellidos = new String[nrows];
            apellidos[0] = "ninguno";
            rs.first();
            
            while (rs.next()) {
                for (int i = 1; i <= ncol; i++) {
                    apellidos[cont] = rs.getString(i);
                    cont++;
                }
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return apellidos;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        ArrayList<Empleado> lista = new ArrayList<>();
        try {

            Empleado emp;
            Connection con = getConnection();

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM empleado");
            ResultSetMetaData rsmd = rs.getMetaData();
            int ncol = rsmd.getColumnCount();

            while (rs.next()) {
                emp = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getFloat(6), new Date(rs.getDate(7).getTime()));
                lista.add(emp);

            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<Empleado> getListaFiltrada(String apellido) {
        ArrayList<Empleado> lista = new ArrayList<>();
        try {

            Empleado emp;
            Connection con = getConnection();

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM empleado WHERE APELLIDO LIKE '" + apellido + "'");
            ResultSetMetaData rsmd = rs.getMetaData();
            int ncol = rsmd.getColumnCount();

            while (rs.next()) {
                emp = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getFloat(6), new Date(rs.getDate(7).getTime()));
                lista.add(emp);

            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    public static void verfecha(){
        InterfazGrafica iterf = new InterfazGrafica();
        try{
             String date1 = iterf.getFechaFiltro1();
            String date2 = iterf.getFechaFiltro2();  
                    System.out.println(date1);
        System.out.println(date2);
        }catch(NullPointerException ex){
        }



    }
    
     public ArrayList<Empleado> getListaFiltradaFecha(String date1, String date2) {
        ArrayList<Empleado> listaAux = new ArrayList<>();
        System.out.println(date1);
        System.out.println(date2);
        
        try {
            
            Empleado emp;
            Connection con = getConnection();

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM empleado WHERE FECHAALTA BETWEEN '" + date1 + "' AND '" + date2 + "' ORDER BY FECHAALTA"); //COMILLAS SIMPLES PARA LA CONSULTA DE FECHAS
            ResultSetMetaData rsmd = rs.getMetaData();
            int ncol = rsmd.getColumnCount();

            while (rs.next()) {
                emp = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getFloat(6), new Date(rs.getDate(7).getTime()));
                listaAux.add(emp);

            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listaAux;

    }

    public Connection getConnection() {
        try {
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
            } catch (Exception e) {
                System.out.println("JDBC driver falied to load.");
            }
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa", "usuario", "usuario");

            return con;
        } catch (SQLNonTransientConnectionException cred) {
            JOptionPane.showMessageDialog(null, "Las credenciales introducidas son erróneas.", "Error", 0);
            return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean getConnection(String usuario, String contraseña) {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa", usuario, contraseña);

            return true;
        } catch (SQLNonTransientConnectionException cred) {
            return false;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
