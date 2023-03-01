import java.sql.*;

public class Criar {
    private DatabaseConnection db;

    public Criar(DatabaseConnection db) {
        this.db = db;
    }

    public boolean criarRegistro(String nome, String email, String telefone) {
        try {
            Connection conn = db.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO usuarios (nome, email, telefone) VALUES (?, ?, ?)");
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, telefone);
            int rows = stmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
