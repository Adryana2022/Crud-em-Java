import javax.swing.*;

public class Tela extends JFrame {
    private JLabel labelId, labelNome, labelEmail, labelTelefone;
    private JTextField campoId, campoNome, campoEmail, campoTelefone;
    private JTextArea textArea;
    private JButton botaoCriar, botaoLer, botaoAtualizar, botaoExcluir;

    public Tela() {
        super("CRUD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        labelId = new JLabel("ID:");
        labelId.setBounds(50, 50, 50, 30);
        add(labelId);

        campoId = new JTextField();
        campoId.setBounds(110, 50, 100, 30);
        add(campoId);

        labelNome = new JLabel("Nome:");
        labelNome.setBounds(50, 100, 50, 30);
        add(labelNome);

        campoNome = new JTextField();
        campoNome.setBounds(110, 100, 200, 30);
        add(campoNome);

        labelEmail = new JLabel("E-mail:");
        labelEmail.setBounds(50, 150, 50, 30);
        add(labelEmail);

        campoEmail = new JTextField();
        campoEmail.setBounds(110, 150, 200, 30);
        add(campoEmail);

        labelTelefone = new JLabel("Telefone:");
        labelTelefone.setBounds(50, 200, 50, 30);
        add(labelTelefone);

        campoTelefone = new JTextField();
        campoTelefone.setBounds(110, 200, 100, 30);
        add(campoTelefone);

        textArea = new JTextArea();
        textArea.setBounds(350, 50, 200, 200);
        textArea.setEditable(false);
        add(textArea);

        botaoCriar = new JButton("Criar");
        botaoCriar.setBounds(50, 250, 80, 30);
        add(botaoCriar);

        botaoLer = new JButton("Ler");
        botaoLer.setBounds(140, 250, 80, 30);
        add(botaoLer);

        botaoAtualizar = new JButton("Atualizar");
        botaoAtualizar.setBounds(230, 250, 100, 30);
        add(botaoAtualizar);

        botaoExcluir = new JButton("Excluir");
        botaoExcluir.setBounds(340, 250, 80, 30);
        add(botaoExcluir);

        setLayout(null);
        setVisible(true);
    }

    public JTextField getCampoId() {
        return campoId;
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public JTextField getCampoTelefone() {
        return campoTelefone;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JButton getBotaoCriar() {
        return botaoCriar;
    }

    public JButton getBotaoLer() {
        return botaoLer;
    }

    public JButton getBotaoAtualizar() {
        return botaoAtualizar;
    }

    public JButton getBotaoExcluir() {
        return botaoExcluir;
    }
}
