package projectta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI_Login extends  JFrame {
    private JLabel nm,id,passwd;
    private JTextField us,pas;
    private JButton login;
    
    public GUI_Login() {
        
        setLayout(null);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //judul
        nm = new JLabel("APOTIK ANUGRAH");
        nm.setBounds(150, 30, 250, 20);
        add(nm);
        //id
        id = new JLabel("ID");
        id.setBounds(30, 75, 150, 30);
        add(id);
        
        us = new JTextField();
        us.setBounds(150, 75, 150, 30);
        add(us);
        
        passwd = new JLabel("PASSWORD");
        passwd.setBounds(30, 125, 150, 30);
        add(passwd);
        
        pas = new JTextField();
        pas.setBounds(150, 125, 150, 30);
        add(pas);
        
        login = new JButton("LOGIN");
        login.setBounds(125, 175, 100, 30);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(us.getText().equals("admin") && pas.getText().equals("admin")) {
                new GUI_MenuLogin().setVisible(true);
                dispose();
                }
            }
        });
        add(login);
        
    }
    
    
}
