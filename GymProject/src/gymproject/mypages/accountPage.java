
package gymproject.mypages;

import gymproject.Dtcon;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class accountPage extends javax.swing.JInternalFrame {

    
    // For entpass
    String checkEquvalance = null;
    String MasterString = null;
    
    //Database Init
    
    Dtcon d = new Dtcon();
    Connection c = d.getconnection();
    Statement st;
    PreparedStatement ps;
    
    
    boolean chngpassflag = false;
    String AdminLogPass = "aman";
    boolean bb = true;
    
    void setani(JLabel lb) {
        lb.setBackground(new Color(0,165,255));
        lb.setForeground(new Color(0,0,0));
    }
    
    void resetani(JLabel lb) {
        lb.setBackground(new Color(0,0,0));
        lb.setForeground(new Color(255,255,255));
    }
    
    public accountPage() {
        initComponents();
        Toolkit tool = Toolkit.getDefaultToolkit();
            int x = (int) tool.getScreenSize().getWidth();
            int y = (int) tool.getScreenSize().getHeight();
            y-=30;
        this.setSize(x, y);
        picBack.setSize(x, y);
        forntBoard.setSize(x, y);
        
        
        forntBoard.setVisible(true);
        logpan.setVisible(true);
        chgpass.setVisible(false);
        adpschng.setVisible(false);
        clrdb.setVisible(false);
        cngdd.setVisible(false);
        cngpasspanal.setVisible(false);
        
    }

    public void setinit() {
        forntBoard.setVisible(true);
        logpan.setVisible(true);
        chgpass.setVisible(false);
        adpschng.setVisible(false);
        clrdb.setVisible(false);
        cngdd.setVisible(false);
        cngpasspanal.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        forntBoard = new javax.swing.JPanel();
        logpan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ingat = new javax.swing.JPasswordField();
        chgpass = new javax.swing.JLabel();
        adpschng = new javax.swing.JLabel();
        clrdb = new javax.swing.JLabel();
        cngdd = new javax.swing.JLabel();
        cngpasspanal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        changepass = new javax.swing.JLabel();
        entpass = new javax.swing.JPasswordField();
        picBack = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1253, 687));
        getContentPane().setLayout(null);

        forntBoard.setMinimumSize(new java.awt.Dimension(1375, 770));
        forntBoard.setOpaque(false);
        forntBoard.setPreferredSize(new java.awt.Dimension(1375, 770));

        logpan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        logpan.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Password");

        ingat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ingat.setForeground(new java.awt.Color(255, 255, 255));
        ingat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 165, 250), 2, true));
        ingat.setOpaque(false);
        ingat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ingatKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout logpanLayout = new javax.swing.GroupLayout(logpan);
        logpan.setLayout(logpanLayout);
        logpanLayout.setHorizontalGroup(
            logpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logpanLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(logpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ingat)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        logpanLayout.setVerticalGroup(
            logpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logpanLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(ingat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        chgpass.setBackground(new java.awt.Color(0, 0, 0));
        chgpass.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        chgpass.setForeground(new java.awt.Color(255, 255, 255));
        chgpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chgpass.setText("Change login Password");
        chgpass.setOpaque(true);
        chgpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chgpassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chgpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chgpassMouseExited(evt);
            }
        });

        adpschng.setBackground(new java.awt.Color(0, 0, 0));
        adpschng.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        adpschng.setForeground(new java.awt.Color(255, 255, 255));
        adpschng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adpschng.setText("Change Admin pass");
        adpschng.setToolTipText("Track Recent Aactivity");
        adpschng.setOpaque(true);
        adpschng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adpschngMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adpschngMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adpschngMouseExited(evt);
            }
        });

        clrdb.setBackground(new java.awt.Color(0, 0, 0));
        clrdb.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        clrdb.setForeground(new java.awt.Color(255, 255, 255));
        clrdb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clrdb.setText("Clear DataBase");
        clrdb.setToolTipText("Delete All Unwanted Data");
        clrdb.setOpaque(true);
        clrdb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrdbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clrdbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clrdbMouseExited(evt);
            }
        });

        cngdd.setBackground(new java.awt.Color(0, 0, 0));
        cngdd.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        cngdd.setForeground(new java.awt.Color(255, 255, 255));
        cngdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cngdd.setText("Change Due Date");
        cngdd.setToolTipText("Change Due Date of any Traniee");
        cngdd.setOpaque(true);
        cngdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cngddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cngddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cngddMouseExited(evt);
            }
        });

        javax.swing.GroupLayout forntBoardLayout = new javax.swing.GroupLayout(forntBoard);
        forntBoard.setLayout(forntBoardLayout);
        forntBoardLayout.setHorizontalGroup(
            forntBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forntBoardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(forntBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(forntBoardLayout.createSequentialGroup()
                        .addGroup(forntBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(forntBoardLayout.createSequentialGroup()
                                .addComponent(chgpass, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 836, Short.MAX_VALUE)
                                .addComponent(adpschng, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(forntBoardLayout.createSequentialGroup()
                                .addComponent(clrdb, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cngdd, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))
                    .addGroup(forntBoardLayout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(logpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        forntBoardLayout.setVerticalGroup(
            forntBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forntBoardLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(forntBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chgpass, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adpschng, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(logpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(forntBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clrdb, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cngdd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );

        getContentPane().add(forntBoard);
        forntBoard.setBounds(0, 0, 1360, 770);

        cngpasspanal.setMinimumSize(new java.awt.Dimension(1375, 770));
        cngpasspanal.setOpaque(false);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jPanel3.setOpaque(false);

        changepass.setFont(new java.awt.Font("Segoe Script", 1, 32)); // NOI18N
        changepass.setForeground(new java.awt.Color(255, 255, 255));
        changepass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changepass.setText("Current Password");

        entpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        entpass.setForeground(new java.awt.Color(255, 255, 255));
        entpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 165, 250), 2, true));
        entpass.setOpaque(false);
        entpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entpassKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(entpass)
                    .addComponent(changepass, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(changepass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(entpass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cngpasspanalLayout = new javax.swing.GroupLayout(cngpasspanal);
        cngpasspanal.setLayout(cngpasspanalLayout);
        cngpasspanalLayout.setHorizontalGroup(
            cngpasspanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cngpasspanalLayout.createSequentialGroup()
                .addContainerGap(473, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(433, 433, 433))
        );
        cngpasspanalLayout.setVerticalGroup(
            cngpasspanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cngpasspanalLayout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276))
        );

        getContentPane().add(cngpasspanal);
        cngpasspanal.setBounds(0, 0, 1360, 770);

        picBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        picBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/NotiImg/accPage.jpg"))); // NOI18N
        picBack.setMaximumSize(new java.awt.Dimension(1375, 770));
        picBack.setMinimumSize(new java.awt.Dimension(1375, 770));
        picBack.setPreferredSize(new java.awt.Dimension(1375, 770));
        getContentPane().add(picBack);
        picBack.setBounds(0, 0, 1375, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingatKeyPressed
        if(evt.getKeyCode()==10) {
            
            
            try {
                String query = "SELECT * FROM passtable WHERE `ID`=2;";
                st = c.createStatement();
                ResultSet rss = st.executeQuery(query);
                while(rss.next()) {
                    MasterString = rss.getString(2);
                }
            }
            catch(SQLException ex) {
                System.err.println("line 576  =>  "+ex);
            }
            char[] passin = ingat.getPassword();
            String typedCode = null;
            try {
                typedCode = passin[0] + "" + passin[1] + "" + passin[2] + "" + passin[3];
                typedCode = "";
                int i = 0;
                while(true) {
                    try {
                        typedCode += passin[i]+"";
                        i++;
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        break;
                    }
                }
                if(typedCode.equals(MasterString))
                {
                    forntBoard.setVisible(true);
                    logpan.setVisible(false);
                    chgpass.setVisible(true);
                    adpschng.setVisible(true);
                    clrdb.setVisible(true);
                    cngdd.setVisible(true);
                    cngpasspanal.setVisible(false);
                    typedCode = "";
                    checkEquvalance = "";
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "The password is incorrct. Please Try again.");
                }
            }
            catch(ArrayIndexOutOfBoundsException ae) {
                JOptionPane.showMessageDialog(rootPane, "Please enter atleast 4 char");
            }

            
        }
        
    }//GEN-LAST:event_ingatKeyPressed

    private void clrdbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrdbMouseEntered
        setani(clrdb);
    }//GEN-LAST:event_clrdbMouseEntered

    private void clrdbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrdbMouseExited
        resetani(clrdb);
    }//GEN-LAST:event_clrdbMouseExited

    private void cngddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cngddMouseEntered
        setani(cngdd);
    }//GEN-LAST:event_cngddMouseEntered

    private void cngddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cngddMouseExited
        resetani(cngdd);
    }//GEN-LAST:event_cngddMouseExited

    private void chgpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chgpassMouseEntered
        setani(chgpass);
    }//GEN-LAST:event_chgpassMouseEntered

    private void chgpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chgpassMouseExited
        resetani(chgpass);
    }//GEN-LAST:event_chgpassMouseExited

    private void adpschngMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adpschngMouseEntered
        setani(adpschng);
    }//GEN-LAST:event_adpschngMouseEntered

    private void adpschngMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adpschngMouseExited
        resetani(adpschng);
    }//GEN-LAST:event_adpschngMouseExited

    private void entpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entpassKeyPressed
        int key = evt.getKeyCode();
        if(chngpassflag == false) {
            if(key == 16) {
                JOptionPane.showMessageDialog(rootPane, "Don't Press Shift Key", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            else if(key>=106 || key<=95 && (key <= 47 || key >= 58)) {
                if(key != 10 && key != 8) {   
                    if(key == 27) {
                        changepass.setText("Current Password");
                        forntBoard.setVisible(true);
                        logpan.setVisible(false);
                        chgpass.setVisible(true);
                        adpschng.setVisible(true);
                        clrdb.setVisible(true);
                        cngdd.setVisible(true);
                        cngpasspanal.setVisible(false);
                    }
                    else {
                        JOptionPane.showMessageDialog(rootPane, "Please press Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    entpass.setText("");
                }
            }
            if(evt.getKeyCode()==10) {
                if(null != changepass.getText()) 
                    switch (changepass.getText()) {
                        case "ReEnter Password":
                            char[] passin = entpass.getPassword();
                            String typedCode = null;
                            try {

                                typedCode = passin[0] + "" + passin[1] + "" + passin[2] + "" + passin[3];
                            }
                            catch(ArrayIndexOutOfBoundsException ae) {
                                JOptionPane.showMessageDialog(rootPane, "Please enter atleast 4 char");
                                break;
                            }
                            if(typedCode.equals(checkEquvalance))
                            {
                                try {
                                    String query = "UPDATE passtable SET `Pass` = "+checkEquvalance+" WHERE `ID` =1;";
                                    ps = c.prepareStatement(query);
                                    ps.executeUpdate();
                                    JOptionPane.showMessageDialog(null,"Password Changed Succesfully.\nPress esc key to go back");
                                    changepass.setText("Current Password");
                                    entpass.setText("");
                                    typedCode = "";
                                    checkEquvalance = "";
                                } 
                                catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(rootPane, "Unable to update error code name accountPage=>entpassKeyPrssed");
                                    entpass.setText("");
                                    Logger.getLogger(accountPage.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Password not Matched . Please Try again.");
                                entpass.setText("");
                            }

                            break;




                        case "New Password":
                            passin = entpass.getPassword();
                            try {

                                checkEquvalance = passin[0] + "" + passin[1] + "" + passin[2] + "" + passin[3];
                                changepass.setText("ReEnter Password");
                                entpass.setText("");
                            }
                            catch(ArrayIndexOutOfBoundsException ae) {
                                JOptionPane.showMessageDialog(rootPane, "Please enter atleast 4 char");
                                break;
                            }
                            break;




                        case "Current Password":
                            try {
                                String query = "SELECT * FROM passtable WHERE `ID`=1;";
                                st = c.createStatement();
                                ResultSet rss = st.executeQuery(query);
                                while(rss.next()) {
                                    MasterString = rss.getString(2);
                                }
                            }
                            catch(SQLException ex) {
                                System.err.println("line 390  =>  "+ex);
                            }
                            passin = entpass.getPassword();
                            typedCode = null;
                            try {

                                typedCode = passin[0] + "" + passin[1] + "" + passin[2] + "" + passin[3];
                            }
                            catch(ArrayIndexOutOfBoundsException ae) {
                                JOptionPane.showMessageDialog(rootPane, "Please enter atleast 4 char");
                                break;
                            }

                            if(typedCode.equals(MasterString))
                            {
                                changepass.setText("New Password");
                                entpass.setText("");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "The password is incorrct. Please Try again.");
                            }
                            break;
                        default:
                            break;
                    }
            }
        }
        else {
            if(key>=106 || key<=95 && (key <= 47 || key >= 58) && (key<65 || key>90 ) && key != 16) {
                if(key != 10 && key != 8) {   
                    if(key == 27) {
                        changepass.setText("Current Password");
                        forntBoard.setVisible(true);
                        logpan.setVisible(false);
                        chgpass.setVisible(true);
                        adpschng.setVisible(true);
                        clrdb.setVisible(true);
                        cngdd.setVisible(true);
                        cngpasspanal.setVisible(false);
                    }
                    else {
                        JOptionPane.showMessageDialog(rootPane, "Please press Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    entpass.setText("");
                }
            }
            if(evt.getKeyCode()==10) {
                if(null != changepass.getText()) 
                    switch (changepass.getText()) {
                        case "ReEnter Password":
                            char[] passin = entpass.getPassword();
                            String typedCode = null;
                            try {
                                typedCode = passin[0] + "" + passin[1] + "" + passin[2] + "" + passin[3];
                                typedCode = "";
                                int i = 0;
                                while(true) {
                                    try {
                                        typedCode += passin[i]+"";
                                        i++;
                                    }
                                    catch(ArrayIndexOutOfBoundsException e){
                                        break;
                                    }
                                }
                            }
                            catch(ArrayIndexOutOfBoundsException ae) {
                                JOptionPane.showMessageDialog(rootPane, "Please enter atleast 4 char");
                                break;
                            }
                            if(typedCode.equals(checkEquvalance))
                            {
                                try {
                                    String query = "UPDATE passtable SET `Pass` = '"+checkEquvalance+"' WHERE `ID` =2;";
                                    ps = c.prepareStatement(query);
                                    ps.executeUpdate();
                                    JOptionPane.showMessageDialog(null,"Password Changed Succesfully.\nPress esc key to go back");
                                    changepass.setText("Current Password");
                                    entpass.setText("");
                                    typedCode = "";
                                    checkEquvalance = "";
                                } 
                                catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(rootPane, "Unable to update error code name accountPage=>entpassKeyPrssed");
                                    entpass.setText("");
                                    Logger.getLogger(accountPage.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Password not Matched . Please Try again.");
                                entpass.setText("");
                            }

                            break;




                        case "New Password":
                            passin = entpass.getPassword();
                            try {
                                checkEquvalance = passin[0] + "" + passin[1] + "" + passin[2] + "" + passin[3];
                                checkEquvalance = "";
                                int i = 0;
                                while(true) {
                                    try {
                                        checkEquvalance += passin[i]+"";
                                        i++;
                                    }
                                    catch(ArrayIndexOutOfBoundsException e){
                                        break;
                                    }
                                }
                                changepass.setText("ReEnter Password");
                                entpass.setText("");
                            }
                            catch(ArrayIndexOutOfBoundsException ae) {
                                JOptionPane.showMessageDialog(rootPane, "Please enter atleast 4 char");
                                break;
                            }
                            break;




                        case "Current Password":
                            try {
                                String query = "SELECT * FROM passtable WHERE `ID`=2;";
                                st = c.createStatement();
                                ResultSet rss = st.executeQuery(query);
                                while(rss.next()) {
                                    MasterString = rss.getString(2);
                                }
                            }
                            catch(SQLException ex) {
                                System.err.println("line 576  =>  "+ex);
                            }
                            passin = entpass.getPassword();
                            typedCode = null;
                            try {
                                typedCode = passin[0] + "" + passin[1] + "" + passin[2] + "" + passin[3];
                                typedCode = "";
                                int i = 0;
                                while(true) {
                                    try {
                                        typedCode += passin[i]+"";
                                        i++;
                                    }
                                    catch(ArrayIndexOutOfBoundsException e){
                                        break;
                                    }
                                }
                            }
                            catch(ArrayIndexOutOfBoundsException ae) {
                                JOptionPane.showMessageDialog(rootPane, "Please enter atleast 4 char");
                                break;
                            }

                            if(typedCode.equals(MasterString))
                            {
                                changepass.setText("New Password");
                                entpass.setText("");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "The password is incorrct. Please Try again.");
                            }
                            break;
                        default:
                            break;
                    }
            }
        }
    }//GEN-LAST:event_entpassKeyPressed

    private void chgpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chgpassMouseClicked
        forntBoard.setVisible(false);
        logpan.setVisible(false);
        chgpass.setVisible(false);
        adpschng.setVisible(false);
        clrdb.setVisible(false);
        cngdd.setVisible(false);
        cngpasspanal.setVisible(true);
        chngpassflag = false;
    }//GEN-LAST:event_chgpassMouseClicked

    private void adpschngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adpschngMouseClicked
        forntBoard.setVisible(false);
        logpan.setVisible(false);
        chgpass.setVisible(false);
        adpschng.setVisible(false);
        clrdb.setVisible(false);
        cngdd.setVisible(false);
        cngpasspanal.setVisible(true);
        chngpassflag = true;
    }//GEN-LAST:event_adpschngMouseClicked

    private void clrdbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrdbMouseClicked
        int select = JOptionPane.showConfirmDialog(null, "It will delete all completed Task and recent payment history Form your Database\n\nContinue?", "Alart!", JOptionPane.YES_NO_OPTION );
        if(select == 0) {
            try {
                String query = "DELETE FROM tasks WHERE `Completed` = 0;";
                ps = c.prepareStatement(query);
                ps.executeUpdate();
                query = "DELETE FROM history;";
                ps = c.prepareStatement(query);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "All COMPLETED Task and recent payment history deleted Successfully");
            } catch (SQLException ex) {
                Logger.getLogger(accountPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_clrdbMouseClicked

    private void cngddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cngddMouseClicked
        TableSelector ts = new TableSelector();
        ts.setVisible(true);
        ts.payinfo();
    }//GEN-LAST:event_cngddMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adpschng;
    private javax.swing.JLabel changepass;
    private javax.swing.JLabel chgpass;
    private javax.swing.JLabel clrdb;
    private javax.swing.JLabel cngdd;
    private javax.swing.JPanel cngpasspanal;
    private javax.swing.JPasswordField entpass;
    private javax.swing.JPanel forntBoard;
    private javax.swing.JPasswordField ingat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel logpan;
    private javax.swing.JLabel picBack;
    // End of variables declaration//GEN-END:variables
}
