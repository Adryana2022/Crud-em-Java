import java.sql.*;

public class Excluir {
    private DatabaseConnection db;

    public Excluir(DatabaseConnection db) {
        this.db = db;
    }

    public boolean excluirRegistro(int id) {
        try {
            Connection conn = db.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM usuarios WHERE id = ?");
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
