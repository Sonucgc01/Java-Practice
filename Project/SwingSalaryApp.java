package Project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

// Employee class
class Employee {
    String name;
    double basic, hra, allowance, gross, tax, net;
    String grade;

    public Employee(String name, double basic, double hra, double allowance) {
        this.name = name;
        this.basic = basic;
        this.hra = hra;
        this.allowance = allowance;
        calculate();
    }

    private void calculate() {
        gross = basic + (basic * hra / 100) + allowance;
        tax = gross > 100000 ? gross * 0.2 : (gross > 50000 ? gross * 0.1 : 0);
        net = gross - tax;

        if (net > 100000) grade = "Platinum";
        else if (net > 75000) grade = "Gold";
        else if (net > 50000) grade = "Silver";
        else grade = "Bronze";
    }
}

// Main Swing App
public class SwingSalaryApp extends JFrame {

    private JTextField nameField, basicField, hraField, allowanceField;
    private JButton addButton, clearButton, deleteButton;
    private JTable table;
    private DefaultTableModel model;

    private ArrayList<Employee> employees = new ArrayList<>();

    public SwingSalaryApp() {
        setTitle("Employee Salary Management");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panels
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        JPanel buttonPanel = new JPanel();
        JPanel tablePanel = new JPanel(new BorderLayout());

        // Input fields
        nameField = new JTextField();
        basicField = new JTextField();
        hraField = new JTextField();
        allowanceField = new JTextField();

        inputPanel.setBorder(BorderFactory.createTitledBorder("Employee Details"));
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Basic Salary:"));
        inputPanel.add(basicField);
        inputPanel.add(new JLabel("HRA %:"));
        inputPanel.add(hraField);
        inputPanel.add(new JLabel("Allowance:"));
        inputPanel.add(allowanceField);

        // Buttons
        addButton = new JButton("Add Employee");
        clearButton = new JButton("Clear Fields");
        deleteButton = new JButton("Delete Employee");

        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(deleteButton);

        // Table
        model = new DefaultTableModel(
                new String[]{"Name", "Basic", "HRA", "Allowance", "Gross", "Tax", "Net", "Grade"}, 0
        );
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        tablePanel.setBorder(BorderFactory.createTitledBorder("Employee Salary Report"));
        tablePanel.add(scrollPane, BorderLayout.CENTER);

        // Layout
        setLayout(new BorderLayout(10, 10));
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(tablePanel, BorderLayout.SOUTH);

        // Actions
        addButton.addActionListener(e -> addEmployee());
        clearButton.addActionListener(e -> clearFields());
        deleteButton.addActionListener(e -> deleteEmployee());
    }

    // Add employee
    private void addEmployee() {
        try {
            String name = nameField.getText();
            double basic = Double.parseDouble(basicField.getText());
            double hra = Double.parseDouble(hraField.getText());
            double allowance = Double.parseDouble(allowanceField.getText());

            Employee emp = new Employee(name, basic, hra, allowance);
            employees.add(emp);

            model.addRow(new Object[]{
                    emp.name, emp.basic, emp.hra, emp.allowance,
                    emp.gross, emp.tax, emp.net, emp.grade
            });

            clearFields();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please enter valid numeric values.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // Delete employee
    private void deleteEmployee() {
        int selectedRow = table.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please select a row to delete.",
                    "No Selection",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this employee?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            employees.remove(selectedRow);
            model.removeRow(selectedRow);
        }
    }

    // Clear fields
    private void clearFields() {
        nameField.setText("");
        basicField.setText("");
        hraField.setText("");
        allowanceField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingSalaryApp().setVisible(true));
    }
}
