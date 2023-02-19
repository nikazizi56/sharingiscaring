import javax.swing.*; // btl ke ni
import java.awt.*;

public class StudentRegistrationForm extends JFrame {
    private JLabel lb01, lb02, lb03, lb04, lb05, lb06, lb07, lb08, lb09, lb10, lb11, lb12, lb13, lb14, lb15, lb16, lb17,
            lb18, lb19, lb20, lb21, lb22;
    private JTextField tfName, tfDob, tfAddress, tfCity, tfState, tfZipCode, tfCountry, tfPhone, tfEmail, tfCourseName;
    private JRadioButton rbRegular, rbPremium, rbVip;
    private ButtonGroup bgMembershipType;
    private JCheckBox cbCash, cbCheque, cbCreditCard;
    private JButton btnSubmit, btnClear;

    public StudentRegistrationForm() {
        // Set window properties
        setTitle("Student Registration Form");
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create labels
        lb01 = new JLabel("Student Registration Form");
        lb02 = new JLabel("PERSONAL INFORMATION");
        lb03 = new JLabel("NAME");
        lb04 = new JLabel("DATE OF BIRTH");
        lb05 = new JLabel("CONTACT INFORMATION");
        lb06 = new JLabel("ADDRESS");
        lb07 = new JLabel("CITY");
        lb08 = new JLabel("PROVINCE/STATE");
        lb09 = new JLabel("ZIP CODE");
        lb10 = new JLabel("COUNTRY");
        lb11 = new JLabel("PHONE");
        lb12 = new JLabel("EMAIL");
        lb13 = new JLabel("MEMBERSHIP TYPE");
        lb14 = new JLabel("Regular");
        lb15 = new JLabel("Premium");
        lb16 = new JLabel("VIP");
        lb17 = new JLabel("COURSE INFORMATION");
        lb18 = new JLabel("COURSE NAME");
        lb19 = new JLabel("PAYMENT DETAILS");
        lb20 = new JLabel("Cash");
        lb21 = new JLabel("Cheque");
        lb22 = new JLabel("Credit Card");

        // Set label positions and sizes
        lb01.setBounds(60, 20, 400, 25);
        lb02.setBounds(20, 60, 300, 20);
        lb03.setBounds(20, 100, 100, 20);
        lb04.setBounds(20, 130, 100, 20);
        lb05.setBounds(20, 160, 300, 20);
        lb06.setBounds(20, 200, 100, 20);
        lb07.setBounds(20, 230, 100, 20);
        lb08.setBounds(20, 260, 100, 20);
        lb09.setBounds(20, 290, 100, 20);
        lb10.setBounds(20, 320, 100, 20);
        lb11.setBounds(20, 350, 100, 20);
        lb12.setBounds(20, 380, 100, 20);
        lb13.setBounds(20, 420, 200, 20);
        lb14.setBounds(20, 450, 100, 20);
        lb15.setBounds(100, 450, 100, 20);
        lb16.setBounds(180, 450, 100, 20);
        lb17.setBounds(20, 490, 300, 20);
        lb18.setBounds(20, 530, 100, 20);
        lb19.setBounds(20, 570, 150, 20);
        lb20.setBounds(20, 600, 100, 20);
        lb21.setBounds(100, 600, 100, 20);
        lb22.setBounds(180, 600, 100, 20);

        lb01.setFont(new Font("Arial", Font.BOLD, 22));
        lb02.setFont(new Font("Arial", Font.BOLD, 18));
        lb05.setFont(new Font("Arial", Font.BOLD, 18));
        lb13.setFont(new Font("Arial", Font.BOLD, 18));
        lb17.setFont(new Font("Arial", Font.BOLD, 18));

        // Create text fields
        tfName = new JTextField();
        tfDob = new JTextField();
        tfAddress = new JTextField();
        tfCity = new JTextField();
        tfState = new JTextField();
        tfZipCode = new JTextField();
        tfCountry = new JTextField();
        tfPhone = new JTextField();
        tfEmail = new JTextField();
        tfCourseName = new JTextField();

        // Set text field positions and sizes
        tfName.setBounds(130, 100, 200, 20);
        tfDob.setBounds(130, 130, 200, 20);
        tfAddress.setBounds(130, 200, 200, 20);
        tfCity.setBounds(130, 230, 200, 20);
        tfState.setBounds(130, 260, 200, 20);
        tfZipCode.setBounds(130, 290, 200, 20);
        tfCountry.setBounds(130, 320, 200, 20);
        tfPhone.setBounds(130, 350, 200, 20);
        tfEmail.setBounds(130, 380, 200, 20);
        tfCourseName.setBounds(130, 530, 200, 20);

        // Create radio buttons for membership type
        rbRegular = new JRadioButton("Regular");
        rbPremium = new JRadioButton("Premium");
        rbVip = new JRadioButton("VIP");

        // Create button group for radio buttons
        bgMembershipType = new ButtonGroup();
        bgMembershipType.add(rbRegular);
        bgMembershipType.add(rbPremium);
        bgMembershipType.add(rbVip);

        // Set radio button positions and sizes
        rbRegular.setBounds(20, 470, 80, 20);
        rbPremium.setBounds(100, 470, 80, 20);
        rbVip.setBounds(180, 470, 80, 20);

        // Create check boxes for payment details
        cbCash = new JCheckBox("Cash");
        cbCheque = new JCheckBox("Cheque");
        cbCreditCard = new JCheckBox("Credit Card");

        // Set check box positions and sizes
        cbCash.setBounds(20, 620, 80, 20);
        cbCheque.setBounds(100, 620, 80, 20);
        cbCreditCard.setBounds(180, 620, 100, 20);

        // Create buttons
        btnSubmit = new JButton("Submit");
        btnClear = new JButton("Clear");

        // Set button positions and sizes
        btnSubmit.setBounds(200, 660, 80, 30);
        btnClear.setBounds(290, 660, 80, 30);

        // Add components to the frame
        add(lb01);
        add(lb02);
        add(lb03);
        add(lb04);
        add(lb05);
        add(lb06);
        add(lb07);
        add(lb08);
        add(lb09);
        add(lb10);
        add(lb11);
        add(lb12);
        add(lb13);
        add(lb14);
        add(lb15);
        add(lb16);
        add(lb17);
        add(lb18);
        add(lb19);
        add(lb20);
        add(lb21);
        add(lb22);
        add(tfName);
        // Add the rest of the components to the frame
        add(tfDob);
        add(tfAddress);
        add(tfCity);
        add(tfState);
        add(tfZipCode);
        add(tfCountry);
        add(tfPhone);
        add(tfEmail);
        add(tfCourseName);
        add(rbRegular);
        add(rbPremium);
        add(rbVip);
        add(cbCash);
        add(cbCheque);
        add(cbCreditCard);
        add(btnSubmit);
        add(btnClear);

        // Set the frame properties
        setTitle("Student Registration Form");
        setSize(400, 750);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout of the frame
        setLayout(null);

        // Make the frame visible
        setVisible(true);
    }

    // Entry point of the program
    public static void main(String[] args) {
        // Create an instance of the StudentRegistrationForm class
        new StudentRegistrationForm();
    }
}
