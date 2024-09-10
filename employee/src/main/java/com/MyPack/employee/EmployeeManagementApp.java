package com.MyPack.employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class EmployeeManagementApp extends JFrame {
    private JTextField name, department, salary, email, dob, contact, position, address, id;
    private SessionFactory factory;

    public EmployeeManagementApp() {
        // Initialize Hibernate SessionFactory
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        // Set up JFrame
        setTitle("Employee Management System");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Title Label
        JLabel titleLabel = new JLabel("Employee Management System", JLabel.CENTER);
        titleLabel.setFont(new Font("Verdana", Font.BOLD, 28));
        titleLabel.setForeground(new Color(0x3C3B54));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        titleLabel.setBounds(0, 10, 600, 50);
        add(titleLabel);

        // ID Field
        JLabel lblID = new JLabel("Employee ID:");
        lblID.setBounds(20, 70, 100, 30);
        add(lblID);
        id = new JTextField();
        id.setBounds(130, 70, 150, 30);
        add(id);

        // Name Field
        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(20, 110, 100, 30);
        add(lblName);
        name = new JTextField();
        name.setBounds(130, 110, 150, 30);
        add(name);

        // Department Field
        JLabel lblDepartment = new JLabel("Department:");
        lblDepartment.setBounds(20, 150, 100, 30);
        add(lblDepartment);
        department = new JTextField();
        department.setBounds(130, 150, 150, 30);
        add(department);

        // Salary Field
        JLabel lblSalary = new JLabel("Salary:");
        lblSalary.setBounds(20, 190, 100, 30);
        add(lblSalary);
        salary = new JTextField();
        salary.setBounds(130, 190, 150, 30);
        add(salary);

        // Email Field
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 230, 100, 30);
        add(lblEmail);
        email = new JTextField();
        email.setBounds(130, 230, 150, 30);
        add(email);

        // DOB Field
        JLabel lblDOB = new JLabel("DOB:");
        lblDOB.setBounds(20, 270, 100, 30);
        add(lblDOB);
        dob = new JTextField();
        dob.setBounds(130, 270, 150, 30);
        add(dob);

        // Contact Field
        JLabel lblContact = new JLabel("Contact No:");
        lblContact.setBounds(20, 310, 100, 30);
        add(lblContact);
        contact = new JTextField();
        contact.setBounds(130, 310, 150, 30);
        add(contact);

        // Position Field
        JLabel lblPosition = new JLabel("Position:");
        lblPosition.setBounds(20, 350, 100, 30);
        add(lblPosition);
        position = new JTextField();
        position.setBounds(130, 350, 150, 30);
        add(position);

        // Address Field
        JLabel lblAddress = new JLabel("Address:");
        lblAddress.setBounds(20, 390, 100, 30);
        add(lblAddress);
        address = new JTextField();
        address.setBounds(130, 390, 150, 30);
        add(address);

        // Buttons
        JButton btnAdd = new JButton("Add Employee");
        btnAdd.setBounds(50, 450, 150, 30);
        add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEmployee();
            }
        });

        JButton btnView = new JButton("View All Employees");
        btnView.setBounds(220, 450, 160, 30);
        add(btnView);
        btnView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewEmployees();
            }
        });

        JButton btnDelete = new JButton("Delete Employee");
        btnDelete.setBounds(50, 490, 150, 30);
        add(btnDelete);
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteEmployee();
            }
        });

        JButton btnUpdate = new JButton("Update Employee");
        btnUpdate.setBounds(220, 490, 160, 30);
        add(btnUpdate);
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEmployee();
            }
        });

        setVisible(true);
    }

    private void addEmployee() {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        employee.setName(name.getText());
        employee.setDepartment(department.getText());
        employee.setSalary(Double.parseDouble(salary.getText()));
        employee.setEmail(email.getText());
        employee.setDOB(dob.getText());
        employee.setContactNo(contact.getText());
        employee.setPosition(position.getText());
        employee.setAddress(address.getText());

        session.save(employee);
        transaction.commit();
        session.close();

        JOptionPane.showMessageDialog(this, "Employee added successfully!");
    }

    private void viewEmployees() {
        // Create a new JFrame to display employee details
        JFrame viewFrame = new JFrame("All Employees");
        viewFrame.setSize(800, 600);
        viewFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        viewFrame.setLayout(new BorderLayout());

        // Create a table to display employee details
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Department");
        tableModel.addColumn("Salary");
        tableModel.addColumn("Email");
        
        JTable employeeTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(employeeTable);
        viewFrame.add(scrollPane, BorderLayout.CENTER);

        // Fetch employee data from the database
        Session session = factory.openSession();
        List<Employee> employees = session.createQuery("from Employee", Employee.class).list();
        session.close();

        // Populate the table with employee data
        for (Employee employee : employees) {
            tableModel.addRow(new Object[]{
                employee.getEmployeeID(),
                employee.getName(),
                employee.getDepartment(),
                employee.getSalary(),
                employee.getEmail()
            });
        }

        viewFrame.setVisible(true);
    }

    private void deleteEmployee() {
        int employeeId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Employee ID to Delete:"));

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class, employeeId);

        if (employee != null) {
            session.delete(employee);
            transaction.commit();
            JOptionPane.showMessageDialog(this, "Employee deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Employee not found!");
        }

        session.close();
    }

    private void updateEmployee() {
        int employeeId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Employee ID to update:"));

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class, employeeId);

        if (employee != null) {
            employee.setName(name.getText());
            employee.setDepartment(department.getText());
            employee.setSalary(Double.parseDouble(salary.getText()));
            employee.setEmail(email.getText());
            employee.setDOB(dob.getText());
            employee.setContactNo(contact.getText());
            employee.setPosition(position.getText());
            employee.setAddress(address.getText());

            session.update(employee);
            transaction.commit();
            JOptionPane.showMessageDialog(this, "Employee updated successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Employee not found!");
        }

        session.close();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmployeeManagementApp());
    }
}
