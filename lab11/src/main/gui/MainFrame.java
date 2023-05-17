/*
 * Created by JFormDesigner on Tue May 16 11:21:27 EEST 2023
 */

package main.gui;

import main.model.*;
import main.service.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * @author odinca
 */
public class MainFrame extends JFrame {
	private BankAccountService bankAccountService;
	private DefaultListModel<BankAccount> listModel;

	public MainFrame() {
		initComponents();
		bankAccountService = new BankAccountService();
		listModel = new DefaultListModel<>();
		list1.setModel(listModel);
		displayBankAccounts();
	}

	private void button1ActionPerformed(ActionEvent e) {
		// what happens when you click on the Add bank account button
		String accountNumber = textField1.getText();
		double balance = Double.parseDouble(textField2.getText());
		BankAccountType type = BankAccountType.valueOf(comboBox1.getSelectedItem().toString());
		String cardNumber = textField3.getText();
		bankAccountService.addBankAccount(new BankAccount(accountNumber, balance, type, cardNumber));

		JOptionPane.showMessageDialog(this, "The bank account was added.", "Info",
				JOptionPane.INFORMATION_MESSAGE);

		clearFields();
		displayBankAccounts();
	}

	private void clearFields() {
		textField1.setText("");
		textField2.setText("");
		textField3.setText("");
		comboBox1.setSelectedIndex(0);
	}

	private void displayBankAccounts() {
		listModel.clear();
		bankAccountService.getAllBankAccounts().forEach(bankAccount -> listModel.addElement(bankAccount));
	}

	private void menuItem1ActionPerformed(ActionEvent e) {
		// what happens when you click on the Exit menu item
		System.exit(0);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - odinca
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem1 = new JMenuItem();
		menu2 = new JMenu();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		label1 = new JLabel();
		textField1 = new JTextField();
		panel4 = new JPanel();
		label2 = new JLabel();
		textField2 = new JTextField();
		label3 = new JLabel();
		panel5 = new JPanel();
		label4 = new JLabel();
		comboBox1 = new JComboBox<>();
		panel6 = new JPanel();
		label5 = new JLabel();
		textField3 = new JTextField();
		panel7 = new JPanel();
		button1 = new JButton();
		scrollPane1 = new JScrollPane();
		list1 = new JList();

		//======== this ========
		setTitle("Banking app");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		var contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));

		//======== menuBar1 ========
		{

			//======== menu1 ========
			{
				menu1.setText("Options");

				//---- menuItem1 ----
				menuItem1.setText("Exit");
				menuItem1.addActionListener(e -> menuItem1ActionPerformed(e));
				menu1.add(menuItem1);
			}
			menuBar1.add(menu1);

			//======== menu2 ========
			{
				menu2.setText("About");
			}
			menuBar1.add(menu2);
		}
		setJMenuBar(menuBar1);

		//======== panel1 ========
		{
			panel1.setPreferredSize(new Dimension(800, 400));
			panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
					0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
					.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.
					red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
				beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}});
			panel1.setLayout(new GridLayout(1, 2));

			//======== panel2 ========
			{
				panel2.setLayout(new GridLayout(5, 1));

				//======== panel3 ========
				{
					panel3.setLayout(new FlowLayout(FlowLayout.LEFT));

					//---- label1 ----
					label1.setText("Account number:");
					panel3.add(label1);

					//---- textField1 ----
					textField1.setColumns(20);
					panel3.add(textField1);
				}
				panel2.add(panel3);

				//======== panel4 ========
				{
					panel4.setLayout(new FlowLayout(FlowLayout.LEFT));

					//---- label2 ----
					label2.setText("Balance:");
					panel4.add(label2);

					//---- textField2 ----
					textField2.setColumns(10);
					panel4.add(textField2);

					//---- label3 ----
					label3.setText("EUR");
					panel4.add(label3);
				}
				panel2.add(panel4);

				//======== panel5 ========
				{
					panel5.setLayout(new FlowLayout(FlowLayout.LEFT));

					//---- label4 ----
					label4.setText("Type:");
					panel5.add(label4);

					//---- comboBox1 ----
					comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
							"DEBIT",
							"SAVINGS"
					}));
					comboBox1.setEditable(true);
					panel5.add(comboBox1);
				}
				panel2.add(panel5);

				//======== panel6 ========
				{
					panel6.setLayout(new FlowLayout(FlowLayout.LEFT));

					//---- label5 ----
					label5.setText("Card number:");
					panel6.add(label5);

					//---- textField3 ----
					textField3.setColumns(16);
					panel6.add(textField3);
				}
				panel2.add(panel6);

				//======== panel7 ========
				{
					panel7.setLayout(new FlowLayout(FlowLayout.LEFT));

					//---- button1 ----
					button1.setText("Add bank account");
					button1.addActionListener(e -> button1ActionPerformed(e));
					panel7.add(button1);
				}
				panel2.add(panel7);
			}
			panel1.add(panel2);

			//======== scrollPane1 ========
			{
				scrollPane1.setViewportView(list1);
			}
			panel1.add(scrollPane1);
		}
		contentPane.add(panel1);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - odinca
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem menuItem1;
	private JMenu menu2;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JLabel label1;
	private JTextField textField1;
	private JPanel panel4;
	private JLabel label2;
	private JTextField textField2;
	private JLabel label3;
	private JPanel panel5;
	private JLabel label4;
	private JComboBox<String> comboBox1;
	private JPanel panel6;
	private JLabel label5;
	private JTextField textField3;
	private JPanel panel7;
	private JButton button1;
	private JScrollPane scrollPane1;
	private JList list1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
