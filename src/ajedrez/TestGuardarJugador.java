package ajedrez;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestGuardarJugador {

    private static final String url ="jdbc:mysql://localhost:3306/CampeonatoAjedrez";
    private static final String user ="root";
    private static final String password ="";

    public static void main(String[] args) throws Exception {
        vaciarBaseDeDatos();
        Participante jugador = new Participante("Belén", new Jugador("123", "Maestro"), "Jose Villena", new Pais("España", 123));
        new GuardarParticipante(url, user, password).guardar(jugador);
    }

    public static void vaciarBaseDeDatos() throws SQLException {
        Connection conexion = DriverManager.getConnection(url, user, password);
        execute(conexion, "DELETE FROM PARTICIPANTES");
        execute(conexion, "DELETE FROM PAISES");
        execute(conexion, "DELETE FROM JUGADORES");
        conexion.close();
    }

    private static void execute(Connection conexion, String query) throws SQLException {
        PreparedStatement preparedStatement = conexion.prepareStatement(query);
        preparedStatement.execute();
        preparedStatement.close();
    }
}
