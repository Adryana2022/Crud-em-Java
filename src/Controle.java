import java.util.ArrayList;

public class Controle {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public boolean criar(int id, String nome, String email, String telefone) {
        for (Contato contato : contatos) {
            if (contato.getId() == id) {
                return false;
            }
        }

        contatos.add(new Contato(id, nome, email, telefone));
        return true;
    }

    public Contato ler(int id) {
        for (Contato contato : contatos) {
            if (contato.getId() == id) {
                return contato;
            }
        }

        return null;
    }

    public boolean atualizar(int id, String nome, String email, String telefone) {
        for (Contato contato : contatos) {
            if (contato.getId() == id) {
                contato.setNome(nome);
                contato.setEmail(email);
                contato.setTelefone(telefone);
                return true;
            }
        }

        return false;
    }

    public boolean excluir(int id) {
        for (Contato contato : contatos) {
            if (contato.getId() == id) {
                contatos.remove(contato);
                return true;
            }
        }

        return false;
    }
}
