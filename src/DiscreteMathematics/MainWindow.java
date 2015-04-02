package DiscreteMathematics;

import javax.swing.*;

public class MainWindow extends JFrame {
    private JButton floorButton;
    private JButton fractionalPartButton;
    private JTextField input;
    private JButton ceilingButton;
    private JTextField output;
    private JPanel rootPanel;

    public MainWindow() {
        super("Discrete Mathematics - 1st list");
        ceilingButton.addActionListener(e -> {
            int ceiling = ListOne.ceiling(Double.parseDouble(input.getText()));
            output.setText(String.valueOf(ceiling));
        });

        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
        floorButton.addActionListener(e -> {
            int floor = ListOne.floor(Double.parseDouble(input.getText()));
            output.setText(String.valueOf(floor));
        });
        fractionalPartButton.addActionListener(e -> {
            double fractionalPart = ListOne.fractionalPart(Double.parseDouble(input.getText()));
            output.setText(String.valueOf(fractionalPart));
        });
    }
}
