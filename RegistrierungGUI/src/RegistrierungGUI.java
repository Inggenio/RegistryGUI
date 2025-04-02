import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrierungGUI {

	JFrame window = new JFrame("Registrierung");
	JPanel panel = new JPanel();
	GridBagLayout layout = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	BorderLayout borderLayout = new BorderLayout();

	ButtonGroup rButtons = new ButtonGroup();
	JRadioButton rBtn1 = new JRadioButton();
	JRadioButton rBtn2 = new JRadioButton();
	JRadioButton rBtn3 = new JRadioButton();

	JButton sendButton = new JButton("Formular Senden");



	//Buttons
	//Anrede
	String[] anredeOptionen = {"Bitte wählen","Herr","Frau"};
	JComboBox anrede = new JComboBox<>(anredeOptionen);
	JLabel lblAnrede = new JLabel("Anrede");


	//Name
	JLabel lblName = new JLabel("Name");
	JTextField textName = new JTextField(20);

	//Vorname
	JLabel lblVorname = new JLabel("Vorname");
	JTextField textVorname = new JTextField(20);

	//Email
	JLabel lblEmail = new JLabel("E-Mail");
	JTextField textEmail = new JTextField(20);

	//Geburtsdatum
	JLabel lblGeburts = new JLabel("Geburtsdatum (TT/MM/JJJJ)");
	JTextField textGeburts = new JTextField(10);

	//Passwort
	JLabel lblPasswort = new JLabel("Passwort (*)");
	JPasswordField textPasswort = new JPasswordField(10);
	JLabel lblPasswort2 = new JLabel("Passwort Wiederholen(*)");
	JPasswordField textPasswort2 = new JPasswordField(10);

	JLabel lblGeneral = new JLabel("Bitte wählen Sie ein Kurs");
	JLabel lblKurs1 = new JLabel("Kurs 1");
	JLabel lblKurs2 = new JLabel("Kurs 2");
	JLabel lblKurs3 = new JLabel("Kurs 3");

	JLabel lblAGB = new JLabel("Ich akzeptiere die Allgemeinen Geschäftsbedingungen");
	JCheckBox checkBox = new JCheckBox();




	public void go(){

		//Layout
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5,5,5,5);
		gbc.weightx = 0.2;
		gbc.gridwidth = 5;
		gbc.ipadx = 10;
		gbc.ipady = 10;



		//Panel Deifnition
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setToolTipText("Y esto");
		panel.setLayout(layout);


		//Buttons und Felder
		//Label Alignment
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVorname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGeburts.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAnrede.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPasswort.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPasswort2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKurs1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKurs2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKurs3.setHorizontalAlignment(SwingConstants.RIGHT);

		//Anrede
		anrede.setBackground(Color.GRAY);
		anrede.setSelectedIndex(0);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.weightx = 0.1;
		panel.add(lblAnrede,gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.weightx = 0.1;
		panel.add(anrede,gbc);


		//Name
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 0.1;
		panel.add(lblName,gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.weightx = 0.1;
		panel.add(textName,gbc);

		//Vorname
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 0.1;
		panel.add(lblVorname,gbc);

		gbc.gridx = 4;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.weightx = 0.1;
		panel.add(textVorname,gbc);

		//Email
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		gbc.weightx = 0.1;
		panel.add(lblEmail,gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		gbc.weightx = 0.1;
		panel.add(textEmail,gbc);

		//Geburtsdatum
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 0.1;
		panel.add(lblGeburts,gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		gbc.weightx = 0.1;
		panel.add(textGeburts,gbc);

		gbc.insets = new Insets(30,5,5,5);

		//Passwort
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 0.1;
		panel.add(lblPasswort,gbc);

		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		gbc.weightx = 0.1;
		panel.add(textPasswort,gbc);

		gbc.insets = new Insets(5,5,5,5);

		//Passwort Wiederholen
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 0.1;
		panel.add(lblPasswort2,gbc);

		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		gbc.weightx = 0.1;
		panel.add(textPasswort2,gbc);

		gbc.insets = new Insets(15,5,5,5);

		//Radio Buttons
		rButtons.add(rBtn1);
		rButtons.add(rBtn2);
		rButtons.add(rBtn3);

		rBtn1.setBackground(Color.LIGHT_GRAY);
		rBtn2.setBackground(Color.LIGHT_GRAY);
		rBtn3.setBackground(Color.LIGHT_GRAY);

		gbc.gridx = 0;
		gbc.gridy = 6;
		panel.add(lblGeneral,gbc);

		gbc.insets = new Insets(5,5,5,5);

		gbc.gridx = 0;
		gbc.gridy = 7;
		panel.add(lblKurs1,gbc);

		gbc.gridx = 1;
		gbc.gridy = 7;
		panel.add(rBtn1,gbc);

		gbc.gridx = 0;
		gbc.gridy = 8;
		panel.add(lblKurs2,gbc);

		gbc.gridx = 1;
		gbc.gridy = 8;
		panel.add(rBtn2,gbc);

		gbc.gridx = 0;
		gbc.gridy = 9;
		panel.add(lblKurs3,gbc);

		gbc.gridx = 1;
		gbc.gridy = 9;
		panel.add(rBtn3,gbc);


		//Checkbox
		checkBox.setBackground(Color.LIGHT_GRAY);
		checkBox.setHorizontalAlignment(SwingConstants.RIGHT);
		gbc.gridx = 0;
		gbc.gridy = 10;
		panel.add(checkBox,gbc);

		gbc.gridx = 1;
		gbc.gridy = 10;
		panel.add(lblAGB,gbc);


		gbc.insets = new Insets(15,5,5,5);

		gbc.gridx = 1;
		gbc.gridy = 11;
		gbc.gridwidth = 2;
		panel.add(sendButton, gbc);


		// Window Definition
		window.add(panel);
		window.setSize(new Dimension(1000,800));
		window.setVisible(true);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		//Send Button Action
		checker();

	}
	private void checker(){
		ActionListener sendFormular = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = textName.getText().trim();
				String vorname = textVorname.getText().trim();
				String email = textEmail.getText().trim();
				String geburtsdatum = textGeburts.getText().trim();
				String passwort1 = textPasswort.getText();
				String passwort2 = textPasswort2.getText();

				if (	name.isEmpty() ||
						vorname.isEmpty() ||
						email.isEmpty() ||
						geburtsdatum.isEmpty() ||
						passwort1.isEmpty() ||
						passwort2.isEmpty()){
					JOptionPane.showMessageDialog(window, "Bitte füllen Sie alle Felder aus!", "Fehler", JOptionPane.ERROR_MESSAGE);
					return;
				}
				//E-Mail RegEx zum Checken
				if (!isValidEmail(email)) {
					JOptionPane.showMessageDialog(window, "Bitte geben Sie eine gültige E-Mail-Adresse ein!", "E-Mail Adresse Fehler", JOptionPane.ERROR_MESSAGE);
					return;
				}

				// Echtes Datum? (z.B. nicht 32/01/2023)
				if (!isValidDate(geburtsdatum)) {
					JOptionPane.showMessageDialog(window, "Das Datum ist ungültig!", "Datum Fehler", JOptionPane.ERROR_MESSAGE);
					return;
				}

				//Passwort-Stimmung Checker
				if (!isPasswordMatch(passwort1,passwort2)) {
					JOptionPane.showMessageDialog(window, "Die Passwörter stimmen nicht überein!", "Passwort Stimmung Fehler", JOptionPane.ERROR_MESSAGE);
					return;
				}
				//Passwort-Stimmung Checker
				if (!isValidPasswort(passwort1,passwort2)) {
					JOptionPane.showMessageDialog(window, "Muss mindestens einen Großbuchstaben enthalten\n" +
							"Muss mindestens einen Kleinbuchstaben enthalten\n" +
							"Muss mindestens eine Ziffer (Zahl) enthalten\n" +
							"Muss mindestens ein Sonderzeichen enthalten\n" +
							"Das Passwort muss mindestens 8 Zeichen lang sein", "Passwort Fehler", JOptionPane.ERROR_MESSAGE);
					return;
				}

				//Zumindest ein Button ausgewählt
				if (rButtons.getSelection() == null) {
					JOptionPane.showMessageDialog(window, "Bitte wählen Sie einen Kurs aus!", "Fehler", JOptionPane.ERROR_MESSAGE);
					return;
				}

				//Checked CheckBox
				if (checkBox == null) {
					JOptionPane.showMessageDialog(window, "Sie müssen die AGB Abstimmen", "Fehler", JOptionPane.ERROR_MESSAGE);
					return;
				}
				System.out.println("Name Ok?: " + !name.isEmpty() + " - " + name);
				System.out.println("Vorname Ok: " + !vorname.isEmpty() + " - " + vorname);
				System.out.println("Emailcheck: "+ isValidEmail(email)+ ": " + email);
				System.out.println("Geburtsdatum: " + geburtsdatum);
				System.out.println("Passwort1: " + passwort1);
				System.out.println("Passwort2: " + passwort2);
				System.out.println("Passwort Korrekt: " + isValidPasswort(passwort1,passwort2));
				System.out.println("Kurs Ausgewählt?: " + rButtons.getSelection());
				System.out.println("Checkbox gecheckt: " + checkBox.isSelected());

				if (!name.isEmpty() &&
						!vorname.isEmpty() &&
						isValidEmail(email) &&
						isValidDate(geburtsdatum) &&
						isValidPasswort(passwort1, passwort2) &&
						checkBox.isSelected()){

					JOptionPane.showMessageDialog(window, "Formular erfolgreich gesendet!", "Erfolg", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(window, "Bitte füllen Sie alle Felder korrekt aus.", "Fehler", JOptionPane.ERROR_MESSAGE);
				}
			}

		};
		sendButton.addActionListener(sendFormular);
	}
	private boolean isValidDate(String datum){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		try {
			dateFormat.parse(datum);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}
	private boolean isValidEmail(String email) {
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	private boolean isValidPasswort(String pass1, String pass2){
		String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!.]).{8,}$";
		Pattern pattern = Pattern.compile(passwordRegex);

		boolean isMatch1 = pattern.matcher(pass1).matches();
		boolean isMatch2 = pattern.matcher(pass2).matches();
		boolean match = pass1.equals(pass2);
		return isMatch1 && isMatch2 && match;
	}
	private boolean isPasswordMatch(String pass1, String pass2){
		return pass1.equals(pass2);
	}

}
