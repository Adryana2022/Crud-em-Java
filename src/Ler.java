import java.sql.*;

public class Ler {
    private DatabaseConnection db;

    public Ler(DatabaseConnection db) {
        this.db = db;
    }

    public String lerRegistros() {
        try {
            Connection conn = db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");
            StringBuilder sb = new StringBuilder();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                sb.append(String.format("%d %s %s %s%n", id, nome, email, telefone));
            }
            return sb.toString();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

