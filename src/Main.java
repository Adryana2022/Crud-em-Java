public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle();
        Tela tela = new Tela();

        tela.getBotaoCriar().addActionListener(e -> {
            int id = Integer.parseInt(tela.getCampoId().getText());
            String nome = tela.getCampoNome().getText();
            String email = tela.getCampoEmail().getText();
            String telefone = tela.getCampoTelefone().getText();

            if (controle.criar(id, nome, email, telefone)) {
                tela.getTextArea().setText("Contato criado com sucesso!");
            } else {
                tela.getTextArea().setText("Erro ao criar contato.");
            }
        });

        tela.getBotaoLer().addActionListener(e -> {
            int id = Integer.parseInt(tela.getCampoId().getText());
            Contato contato = controle.ler(id);

            if (contato != null) {
                tela.getCampoNome().setText(contato.getNome());
                tela.getCampoEmail().setText(contato.getEmail());
                tela.getCampoTelefone().setText(contato.getTelefone());
                tela.getTextArea().setText("Contato lido com sucesso!");
            } else {
                tela.getTextArea().setText("Erro ao ler contato.");
            }
        });

        tela.getBotaoAtualizar().addActionListener(e -> {
            int id = Integer.parseInt(tela.getCampoId().getText());
            String nome = tela.getCampoNome().getText();
            String email = tela.getCampoEmail().getText();
            String telefone = tela.getCampoTelefone().getText();

            if (controle.atualizar(id, nome, email, telefone)) {
                tela.getTextArea().setText("Contato atualizado com sucesso!");
            } else {
                tela.getTextArea().setText("Erro ao atualizar contato.");
            }
        });

        tela.getBotaoExcluir().addActionListener(e -> {
            int id = Integer.parseInt(tela.getCampoId().getText());

            if (controle.excluir(id)) {
                tela.getCampoNome().setText("");
                tela.getCampoEmail().setText("");
                tela.getCampoTelefone().setText("");
                tela.getTextArea().setText("Contato excluído com sucesso!");
            } else {
                tela.getTextArea().setText("Erro ao excluir contato.");
            }
        });
    }
}

