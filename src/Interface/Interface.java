package Interface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Construtores.*;

public class Interface {
    private static JPanel panel;
    private static CardLayout cardLayout;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interface Veículos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600); // Definindo o tamanho da janela como 800x600 pixels
        frame.setLocationRelativeTo(null); // Centralizando a janela na tela

        panel = new JPanel();
        cardLayout = new CardLayout();
        panel.setLayout(cardLayout);

        // Painel de botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // Configurando layout com margem de 20 pixels

        JButton cadastrarButton = new JButton("1 - Cadastrar veículo");
        JButton atualizarButton = new JButton("2 - Atualizar veículo");
        JButton verButton = new JButton("3 - Ver veículos");
        JButton deletarButton = new JButton("4 - Deletar veículo");

        // Adicionando ação aos botões
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirOpcoes("Cadastrar veículo");
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirOpcoes("Atualizar veículo");
            }
        });

        verButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirOpcoes("Ver veículos");
            }
        });

        deletarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirOpcoes("Deletar veículo");
            }
        });

        buttonPanel.add(cadastrarButton);
        buttonPanel.add(atualizarButton);
        buttonPanel.add(verButton);
        buttonPanel.add(deletarButton);

        panel.add(buttonPanel, "botaoPanel");

        // Painel de opções
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JLabel label = new JLabel("Opções:");

        JButton caminhaoButton = new JButton("1 - Caminhão");
        JButton onibusButton = new JButton("2 - Ônibus");
        JButton automovelButton = new JButton("3 - Automóvel");
        JButton voltarButton = new JButton("4 - Voltar");

        // Adicionando ação para voltar ao painel de botões quando o botão "Voltar" for clicado
        voltarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                voltarParaBotoes();
            }
        });

        optionsPanel.add(label);
        optionsPanel.add(caminhaoButton);
        optionsPanel.add(onibusButton);
        optionsPanel.add(automovelButton);
        optionsPanel.add(voltarButton);

        panel.add(optionsPanel, "opcoesPanel");

        // Exibindo painel de botões inicialmente
        cardLayout.show(panel, "botaoPanel");

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }

    private static void exibirOpcoes(String titulo) {
        cardLayout.show(panel, "opcoesPanel");
        JFrame.getFrames()[0].setTitle(titulo);
    }

    private static void voltarParaBotoes() {
        cardLayout.show(panel, "botaoPanel");
        JFrame.getFrames()[0].setTitle("Interface Veículos");
    }
}

