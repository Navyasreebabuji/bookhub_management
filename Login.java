
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame{
    private final JLabel username;
    private final JLabel password;
 private JTextField textField1, textField2;
 private final JButton LoginButton,reset;
    public Login()
    {
       username = new JLabel("User Name:");
        password = new JLabel("Password:");
       textField1=new JTextField(10);
        textField2=new JTextField(10);
          LoginButton = new JButton("Login");
          reset=new JButton("Reset");
         setTitle("System");
        setSize(400, 150);
        setLayout(new GridLayout(3,2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
      add(username);
      add(textField1);
      add(password);
     add(textField2);
       add(LoginButton);
       add(reset);
        setVisible(true);
        LoginButton.addActionListener((ActionEvent ae) -> {
            String name1 = textField1.getText();
            String pass=textField2.getText();
           if (name1.equals("nav") && pass.equals("123")) {
              bookhub_management lib=new bookhub_management();
              lib.setVisible(true);

           } else {
               JOptionPane.showMessageDialog(null, "Login not success");
           }
       });
        reset.addActionListener((ActionEvent ae) -> {
          textField1.setText("");
          textField2.setText("");
       });
    }     
    public static void main(String []arg) {
     new Login();
   
    }

}