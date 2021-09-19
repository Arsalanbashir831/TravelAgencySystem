package TravelWithFileHandling;

import com.intellij.openapi.ui.ComboBox;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.InputMismatchException;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField emailField;
	private JTextField contactField;
	private JTextField nameField;

	public Gui() {
		Exception exp=new Exception();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 411);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 484, 46);
		panel1.setBackground(SystemColor.desktop);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Arsalan Travel Agency\r\n");
		lblNewLabel.setBounds(150, 11, 189, 30);
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 11));
		lblNewLabel.setForeground(SystemColor.text);
		panel1.add(lblNewLabel);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(SystemColor.textHighlight);
		panel2.setBounds(0, 46, 110, 326);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JLabel Travel_label = new JLabel("Mode of Travel");
		Travel_label.setBounds(10, 42, 90, 23);
		Travel_label.setForeground(SystemColor.textHighlightText);
		panel2.add(Travel_label);
		
		JRadioButton rb1 = new JRadioButton("Train");
		rb1.setBounds(0, 82, 109, 23);
		
		panel2.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Plane");
		rb2.setBounds(0, 108, 109, 23);
		panel2.add(rb2);
		
		JRadioButton rb3 = new JRadioButton("Bus");
		rb3.setBounds(0, 134, 109, 23);
		panel2.add(rb3);
		
		JLabel label_packages = new JLabel("Packages");
		label_packages.setForeground(SystemColor.textHighlightText);
		label_packages.setBounds(21, 164, 79, 14);
		panel2.add(label_packages);
		
		JRadioButton rb4 = new JRadioButton("Single Package");
		rb4.setBounds(0, 185, 109, 23);
		panel2.add(rb4);
		
		JRadioButton rb5 = new JRadioButton("Premium Package");
		rb5.setBounds(0, 211, 109, 23);
		panel2.add(rb5);
		
		Panel panel3 = new Panel();
		panel3.setBackground(SystemColor.activeCaption);
		panel3.setBounds(110, 46, 374, 131);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		nameField = new JTextField();
		nameField.setBounds(75, 9, 240, 20);
		panel3.add(nameField);
		nameField.setColumns(10);
		
		
		
		contactField = new JTextField();
		contactField.setBounds(75, 40, 240, 20);
		panel3.add(contactField);
		contactField.setColumns(10);
		
		
		emailField = new JTextField();
		emailField.setBounds(75, 71, 240, 20);
		panel3.add(emailField);
		emailField.setColumns(10);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setForeground(new Color(255, 255, 255));
		nameLabel.setBounds(19, 12, 46, 14);
		panel3.add(nameLabel);
		
		JLabel contactLabel = new JLabel("Contact");
		contactLabel.setForeground(new Color(255, 255, 255));
		contactLabel.setBounds(19, 43, 46, 14);
		panel3.add(contactLabel);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setForeground(new Color(255, 255, 255));
		emailLabel.setBounds(26, 74, 39, 14);
		panel3.add(emailLabel);
		
		JComboBox sourceBox =new JComboBox();
		sourceBox.setModel(new DefaultComboBoxModel(new String[] {"Lahore", "Karachi", "Peshawar", "Quetta"}));
		sourceBox.setBounds(75, 111, 66, 20);
		panel3.add(sourceBox);
		
		JLabel Source = new JLabel("Source");
		Source.setForeground(new Color(255, 255, 255));
		Source.setBounds(29, 112, 46, 14);
		panel3.add(Source);
		
		JComboBox destinationBox=new ComboBox();
		destinationBox.setModel(new DefaultComboBoxModel(new String[] {"Lahore", "Karachi", "Peshawar", "Quetta"}));
		destinationBox.setBounds(249, 111, 66, 20);
		panel3.add(destinationBox);
		
		JLabel destination = new JLabel("Destination\r\n");
		destination.setForeground(new Color(255, 255, 255));
		destination.setBounds(181, 114, 66, 14);
		panel3.add(destination);
		
		ButtonGroup btnGroup=new ButtonGroup();
		
		btnGroup.add(rb1);
		btnGroup.add(rb2);
		btnGroup.add(rb3);
		
		ButtonGroup btnGroup2=new ButtonGroup();
		btnGroup2.add(rb4);
		btnGroup2.add(rb5);
		
		JButton submitButton = new JButton("Submit\r\n");
		submitButton.setBounds(192, 338, 89, 23);
		
	
		
		contentPane.add(submitButton);
		
		JButton resetButton = new JButton("Reset\r\n");
		resetButton.setBounds(292, 338, 89, 23);

		contentPane.add(resetButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(120, 183, 354, 144);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

			submitButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {

				// for name field
				 String name= nameField.getText();
				 if (name.equalsIgnoreCase(Exceptions.checkString(name)))
				 {
				 	textArea.setText("\n"+"name : "+name+"\n");
				 }
				 else 
				 {
					 JOptionPane.showConfirmDialog(null,"WRONG Name INPUT MESSAGE");
				 	throw new InputMismatchException("Illegal Argument");

				 }
					// Contact field
				 Long a = Exceptions.checkInt(contactField.getText());
				 if (a != null)
				 {
				 	textArea.append("\n"+"Contact : "+"0"+String.valueOf(a)+"\n");
				 }
				 else
				 {
					 JOptionPane.showConfirmDialog(null,"WRONG Contact INPUT MESSAGE");
					 throw new InputMismatchException("Illegal Argument");

				 }
				// Entering the remaining user input details on the required fields
				textArea.append("\n"+"Email : "+emailField.getText()+"\n");
				 textArea.append("\n"+"Source :"+sourceBox.getSelectedItem().toString()+"\n");
				 textArea.append("\n"+"Destination : "+destinationBox.getSelectedItem().toString()+"\n");
				//calling the method for selecting the Mode of travel  radio buttons and add text on textArea
				 setTextInTextArea(getSelectedButtonText(btnGroup),textArea);
				 // calculating fees on the bases of the package and mode of transfer
				 calcPay(getSelectedButtonText(btnGroup),getSelectedButtonText(btnGroup2),textArea);
				 FileHandling.writeFile(textArea);
				}

				});

			//reset Everything
		resetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
             textArea.setText(" ");
             emailField.setText(" ");
             nameField.setText(" ");
             contactField.setText(" ");
             sourceBox.setSelectedIndex(0);
             destinationBox.setSelectedIndex(0);
             btnGroup.clearSelection();
             btnGroup2.clearSelection();
			}
		});

	}
// method for selecting the mode of transfer
	public static void setTextInTextArea(String button, JTextArea area)
	{
		if (button != null) {

		if (button.equals("Train")) {
			area.append("Mode of Travel : "+button+"\n");

		}
		else if (button.equals("Plane"+"\n")) {
			area.append("Mode of Travel : "+button+"\n");
		}
		else if (button.equals("Bus"+"\n")) {
			area.append("Mode of Travel : "+button+"\n");
		}
		}
	}
// method for selecting the radio button by using the buttonGroup
	public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements();
        		buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
            
           
        }
		return null;

	}
// method for calculating the fees according the package and mode of transfer
	public static void calcPay(String button1 , String button2,JTextArea area ){
		if (button1 != null) {
			if (button1.equals("Train")&&button2.equals("Single Package")) {

				area.append(" Package : ");
				area.append(button2+"\n");
				area.append("Fees : ");
				area.append("10000");
			}
			else if (button1.equals("Plane")&&button2.equals("Single Package")) {
				area.append(" Package : ");
				area.append(button2+"\n");
				area.append("Fees : ");
				area.append("54000");
			}
			else if (button1.equals("Bus")&&button2.equals("Single Package")) {
				area.append(" Package : ");
				area.append(button2+"\n");
				area.append("Fees : ");
				area.append("3000");
			}
			else if (button1.equals("Bus")&&button2.equals("Premium Package")) {
				area.append(" Package : ");
				area.append(button2+"\n");
				area.append("Fees : ");
				area.append("10000");
			}

			else if (button1.equals("Train")&&button2.equals("Premium Package")) {
				area.append(" Package : ");
				area.append(button2+"\n");
				area.append("Fees : ");
				area.append("50000");
			}

			else if (button1.equals("Plane")&&button2.equals("Premium Package")) {
				area.append(" Package : ");
				area.append(button2+"\n");
				area.append("Fees : ");
				area.append("150000");
			}
		}
	}
}

	
