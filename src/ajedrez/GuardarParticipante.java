
package ajedrez;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GuardarParticipante {

    private final String url;
    private final String user;
    private final String password;

    public GuardarParticipante(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public void guardar(Participante participante) throws SQLException {
        Connection conexion = DriverManager.getConnection (url, user, password);
        insertarPais(participante.getPais(), conexion);
        insertarParticipante(participante, conexion);
        insertarJugador(participante.getJugador(), conexion);
        conexion.close();
    }

    private void insertarPais(Pais pais, Connection conexion) throws SQLException {
        PreparedStatement statement = conexion.prepareStatement("INSERT INTO paises(numPais, nombPais) VALUES(?, ?)");
        statement.setInt(1, pais.getNumPais());
        statement.setString(2, pais.getNomPais());
        statement.execute();
        statement.close();
    }

    private void insertarParticipante(Participante participante, Connection conexion) throws SQLException {
        PreparedStatement statement = conexion.prepareStatement("INSERT INTO participantes VALUES (?, ?, ?, ?)");
        statement.setString(1, participante.getNumSocio());
        statement.setString(2, participante.getNombre());
        statement.setString(3, participante.getDireccion());
        statement.setInt(4, participante.getPais().getNumPais());
        statement.execute();
        statement.close();
    }
    
  
	private void insertarJugador(Jugador jugador, Connection conexion) throws SQLException {
        PreparedStatement statement = conexion.prepareStatement("INSERT INTO jugadores VALUES (?, ?)");
        statement.setString(1, jugador.getNumSocio());
        statement.setString(2, jugador.getNivel());
        statement.execute();
        statement.close();
    }
    
       
}