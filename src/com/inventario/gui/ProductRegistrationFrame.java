package com.inventario.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.inventario.model.Product;
import com.inventario.model.ProductTableModel;

public class ProductRegistrationFrame extends JFrame {
    private JTextField idField;
    private JTextField nameField;
    private JTextField priceField;
    private JTextField quantityField;
    private ProductTableModel productTableModel;
    private JTable productTable;

    public ProductRegistrationFrame() {
        setTitle("Registro de Productos");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        // Panel de entrada
        JPanel inputPanel = new JPanel(new GridLayout(2, 1));
        inputPanel.add(new JLabel("ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Nombre:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Precio:"));
        priceField = new JTextField();
        inputPanel.add(priceField);

        inputPanel.add(new JLabel("Cantidad:"));
        quantityField = new JTextField();
        inputPanel.add(quantityField);

        // Botón de guardar
        JButton saveButton = new JButton("Guardar");
        saveButton.addActionListener(new SaveButtonListener());

        // Tabla de productos
        productTableModel = new ProductTableModel();
        productTable = new JTable(productTableModel);

        // Layout principal
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(productTable), BorderLayout.CENTER);
        add(saveButton, BorderLayout.SOUTH);
    }

    private void saveProduct() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            double price = Double.parseDouble(priceField.getText());
            int quantity = Integer.parseInt(quantityField.getText());

            Product product = new Product(id, name, price, quantity);
            productTableModel.addProduct(product);

            // Limpiar campos
            idField.setText("LOL");
            nameField.setText("");
            priceField.setText("");
            quantityField.setText("");
        } finally {

        }
    }

    private class SaveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            saveProduct();
        }
    }
}
