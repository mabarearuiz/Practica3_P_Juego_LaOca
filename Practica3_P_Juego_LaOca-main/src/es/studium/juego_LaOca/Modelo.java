package es.studium.juego_LaOca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo
{
	// En esta clase todo lo relacionado a la conexi�n con la base de datos.
	// Y la l�gica.

	// Constructor para luego crear objetos de esta clase.
	// Para conectar JAVA con MYSQL.
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/la_oca"; // Aqu� nombre de la base de datos.
	String login = "eva";
	String password = "eva";
	String sentencia = ""; // Vac�o para que sirva para otros elementos luego, se ve en toda la clase.

	Connection connection = null; // Objeto "connection", para conectarnos a la base de datos.
	Statement statement = null; // Objeto, permite ejecutar sentencias SQL.
	ResultSet rs = null; // Objeto, para guardar toda la informaci�n que nos devuelve la base de datos.

	public Modelo()
	{
		connection = this.conectar();
	}

	
	// M�todo CONECTAR.
	public Connection conectar()
	{
		// Aqu� la conexi�n con la base de datos.
		try
		{
			// Cargar los controladores para el acceso a la BD.
			Class.forName(driver);

			// Aqu� se conectan.
			// Establecer la conexi�n con la BD Empresa.
			return (DriverManager.getConnection(url, login, password)); // Devolver un objeto de la clase conexi�n.
		}

		catch (ClassNotFoundException cnfe)
		{
			System.out.println("Error 1-" + cnfe.getMessage());
		}

		catch (SQLException sqle)
		{
			System.out.println("Error 2-" + sqle.getMessage());
		}
		
		return null; // Si no conseguimos conectarnos, no devuelve una conexi�n nula, no se conecta.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/* Para comprobar que se realiza la conexi�n con la base de datos.
	
	public static void main(String[] args)
	{
		Modelo modelo = new Modelo();
		
		if(modelo.conectar() != null
		{
			System.out.println("Conexi�n realizada a la base de datos");
		}
		else
		{
			System.out.println("Error al conectar a la base de datos");
		}
	}
	
	*/
}
