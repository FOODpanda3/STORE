/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ordersystem;

import javax.swing.JOptionPane;//For GUI components like buttons, labels, text fields, etc.
import java.awt.event.FocusAdapter;//To handle focus events on text fields for placeholder text behavior.
import java.awt.event.FocusEvent;//To handle focus events on text fields for placeholder text behavior.
import java.util.HashMap;//For storing the user data (username and password) in-memory.
import java.io.*;//For reading and writing the user database file (userDatabase.ser), which is a serialized file that stores the user credentials.

/**
 *
 * @author Jassen
 */
public class signup extends javax.swing.JFrame {
public static HashMap<String, String> userDatabase = new HashMap<>();
    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
         addPlaceholderText();
        loadUserDatabase();
    }
    public static void loadUserDatabase() {
        //Tries to read a file named userDatabase.ser where the user credentials are stored. If the file exists, it loads the serialized data into the userDatabase
        try {
            File file = new File("userDatabase.ser");
            if (file.exists()) {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream in = new ObjectInputStream(fileIn);
                userDatabase = (HashMap<String, String>) in.readObject();
                in.close();
                fileIn.close();
            } else {
                userDatabase = new HashMap<>(); // Initialize empty database if file doesn't exist
            }
        } catch (IOException | ClassNotFoundException e) {
            userDatabase = new HashMap<>(); // Initialize as empty if file doesn't exist or error occurs
        }
    }
    //Saves the current userDatabase to the userDatabase.ser file
      public static void saveUserDatabase() {
        try {
            FileOutputStream fileOut = new FileOutputStream("userDatabase.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(userDatabase);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving user data: " + e.getMessage());
        }
    }
      
    private void addPlaceholderText() {
        //Adds placeholder text to the username and password fields. It changes the text when the field gains or loses focus
        usertext.setText("Enter username");
        usertext.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                if (usertext.getText().equals("Enter username")) {
                    usertext.setText("");
                }
            }

            public void focusLost(FocusEvent evt) {
                if (usertext.getText().equals("")) {
                    usertext.setText("Enter username");
                }
            }
        });

        
        passtext.setEchoChar((char) 0); 
        passtext.setText("Enter password");
        passtext.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                if (String.valueOf(passtext.getPassword()).equals("Enter password")) {
                    passtext.setEchoChar('*');
                    passtext.setText("");
                }
            }

            public void focusLost(FocusEvent evt) {
                if (String.valueOf(passtext.getPassword()).equals("")) {
                    passtext.setText("Enter password");
                    passtext.setEchoChar((char) 0);
                }
            }
        });

        
        confirmpass.setText("Confirm password");
        confirmpass.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                if (String.valueOf(confirmpass.getPassword()).equals("Confirm password")) {
                    confirmpass.setText("");
                }
            }

            public void focusLost(FocusEvent evt) {
                if (String.valueOf(confirmpass.getPassword()).equals("")) {
                    confirmpass.setText("Confirm password");
                }
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usertext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passtext = new javax.swing.JPasswordField();
        signupbtn = new javax.swing.JButton();
        showpass = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        confirmpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(49, 121, 84));
        jPanel1.setForeground(new java.awt.Color(51, 102, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("ORDER SYSTEM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("SIGN IN HERE!!");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginbtn.setText("LOG IN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 190, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordersystem/1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 230, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("REGISTER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        usertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertextActionPerformed(evt);
            }
        });
        getContentPane().add(usertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 270, -1));

        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        passtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtextActionPerformed(evt);
            }
        });
        getContentPane().add(passtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 270, -1));

        signupbtn.setBackground(new java.awt.Color(49, 121, 82));
        signupbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signupbtn.setText("SIGN UP");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });
        getContentPane().add(signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        getContentPane().add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, -1, -1));

        jLabel1.setText("Confirm Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassActionPerformed(evt);
            }
        });
        getContentPane().add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
       //This method is triggered when the user clicks the "Show Password" checkbox
        if (showpass.isSelected()){
        passtext.setEchoChar((char)0);
        confirmpass.setEchoChar((char) 0);
        } else{
        passtext.setEchoChar('*');
        confirmpass.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
          login loginForm = new login();
        loginForm.setVisible(true);
         this.setVisible(false);
         //This method is triggered when the user clicks the "LOG IN" button. It opens the login form and hides the sign-up form
    }//GEN-LAST:event_loginbtnActionPerformed

    private void usertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertextActionPerformed

    private void passtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtextActionPerformed

    private void confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
      // Get username and password from text fields
    String username = this.usertext.getText();
    String password = new String(this.passtext.getPassword());

    // Check if username already exists
    if (userDatabase.containsKey(username)) {
        JOptionPane.showMessageDialog(this, "Username already exists!");
        return;
    }

    // Check if the username is "admin"
    if (username.equals("admin")) {
        userDatabase.put(username, password); // Save the admin user
        saveUserDatabase(); // Save after registering admin
        JOptionPane.showMessageDialog(this, "Admin User Registered Successfully!");
        // Optionally, navigate to the admin dashboard directly
        AdminDashboard adminDashboard = new AdminDashboard(); // Replace with your admin dashboard class
        adminDashboard.setVisible(true);
        this.setVisible(false); // Hide the signup window
    } else {
        // For normal users, save their data
        userDatabase.put(username, password);
        saveUserDatabase(); // Save after registering new user
        JOptionPane.showMessageDialog(this, "User Registered Successfully!");
        // Optionally, navigate to the login screen
        login loginForm = new login();
        loginForm.setVisible(true);
        this.setVisible(false);
    }
    }

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {
        login loginForm = new login();
        loginForm.setVisible(true);
        this.setVisible(false);
        //This method is triggered when the user clicks the "SIGN UP" button.
    }//GEN-LAST:event_signupbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passtext;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JButton signupbtn;
    private javax.swing.JTextField usertext;
    // End of variables declaration//GEN-END:variables
}
