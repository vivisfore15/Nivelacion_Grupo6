package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class LibroDAO {
	
	Conexion con=new Conexion();
	Connection conec=con.Conecta();
	PreparedStatement ps=null;
	ResultSet res=null;
	
	
	public boolean Inserta_Libro(LibroDTO lib) {
		boolean resul=false;
		
		try {
		String sql="insert into libro values(?,?,?,?,?)";	
		ps=conec.prepareStatement(sql);
		ps.setString(1, lib.getIsbn());
		ps.setString(2, lib.getTitulo());
		ps.setString(3, lib.getEditorial());
		ps.setString(4, lib.getAutor());
		ps.setInt(5, lib.getNo_Paginas());
		resul=ps.executeUpdate()>0;
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error al insertar libro: "+ex);
		}
		 return resul;
	}

}
