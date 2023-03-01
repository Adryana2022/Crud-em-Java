import java.sql.*;

public class Atualizar {
    private DatabaseConnection db;

    public Atualizar(DatabaseConnection db) {
        this.db = db;
    }

    public boolean atualizarRegistro(int id, String nome, String email, String telefone) {
        try {
            Connection conn = db.getConnection();
            PreparedStatement stmt = conn.prepareStatement("UPDATE usuarios SET nome = ?, email = ?, telefone = ? WHERE id = ?");
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, telefone);
            stmt.setInt(4, id);
            int rows = stmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
