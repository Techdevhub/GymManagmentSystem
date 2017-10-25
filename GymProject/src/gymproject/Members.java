
package gymproject;

import AppPackage.AnimationClass;
import gymproject.mypages.panals.PayFees;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Members extends javax.swing.JFrame {

    Dtcon d = new Dtcon();
    Connection c = d.getconnection();
    Statement st;
    
    int xM;
    int yM;
    int limit=1;
    boolean balance = true;
    AnimationClass AC = new AnimationClass();
    
    public Members() {
        initComponents();
        initTable();
        table.setVisible(false);
        text3.setVisible(false);
    }

    public void active()
    {
        head1.setText("Active");
        limit = 1;
    }
    
    public void unactive()
    {
        head1.setText("Unactive");
        limit = 0;
    }
    
    public void paid()
    {
        head1.setText("Paid");
    }
    
    public void setColor(JLabel lb)
    {
        lb.setBackground(new Color(255,0,0));
    }
    
    public void resetColor(JLabel lb)
    {
        lb.setBackground(new Color(51,153,51));
    }
    
    void close()
    {
        this.dispose();
    }
    
    void initTable()
    {
        try {
            String sql="select * from user WHERE Acitve="+limit+" ORDER BY `user`.`Fname` ASC LIMIT 10";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);
            DefaultTableModel tab = (DefaultTableModel)dis_table.getModel();
            
            Object[] row = new Object[4];
            
            while(tab.getRowCount()!=0)
            {
                tab.removeRow(0);
            }
            
            while(rss.next())
            {
                row[0]=rss.getInt(1);
                String name = rss.getString(2)+" "+rss.getString(3);
                row[1]=name;
                row[2]=rss.getLong(6);
                row[3]=rss.getLong(4);
                tab.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Up_panal = new javax.swing.JPanel();
        closss = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        head2 = new javax.swing.JLabel();
        head1 = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        srchbtn = new javax.swing.JButton();
        table = new javax.swing.JScrollPane();
        dis_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 51));
        setName("member_form"); // NOI18N
        setUndecorated(true);
        setOpacity(0.95F);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 51));

        Up_panal.setBackground(new java.awt.Color(51, 153, 51));

        closss.setBackground(new java.awt.Color(51, 153, 51));
        closss.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        closss.setForeground(new java.awt.Color(36, 11, 109));
        closss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closss.setText("X");
        closss.setOpaque(true);
        closss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closssMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closssMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closssMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 153, 51));
        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 11, 109));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Members");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Up_panalLayout = new javax.swing.GroupLayout(Up_panal);
        Up_panal.setLayout(Up_panalLayout);
        Up_panalLayout.setHorizontalGroup(
            Up_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Up_panalLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closss, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Up_panalLayout.setVerticalGroup(
            Up_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 51));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(25, 70, 25));
        jPanel3.setLayout(null);

        text3.setBackground(new java.awt.Color(25, 70, 25));
        text3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        text3.setForeground(new java.awt.Color(204, 204, 204));
        text3.setText("Search");
        jPanel3.add(text3);
        text3.setBounds(760, 30, 80, 30);

        text1.setBackground(new java.awt.Color(25, 70, 25));
        text1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        text1.setForeground(new java.awt.Color(204, 204, 204));
        text1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        text1.setText("/Recent Database");
        jPanel3.add(text1);
        text1.setBounds(50, 30, 170, 30);

        text2.setBackground(new java.awt.Color(25, 70, 25));
        text2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        text2.setForeground(new java.awt.Color(204, 204, 204));
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("....");
        jPanel3.add(text2);
        text2.setBounds(220, 30, 50, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 40, 860, 90);

        head2.setBackground(new java.awt.Color(51, 153, 51));
        head2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        head2.setForeground(new java.awt.Color(255, 255, 255));
        head2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        head2.setText("Member...");
        jPanel2.add(head2);
        head2.setBounds(160, 0, 120, 30);

        head1.setBackground(new java.awt.Color(51, 153, 51));
        head1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        head1.setForeground(new java.awt.Color(255, 255, 255));
        head1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        head1.setText("Active");
        jPanel2.add(head1);
        head1.setBounds(20, 0, 120, 30);

        searchText.setBackground(new java.awt.Color(51, 153, 51));
        searchText.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        searchText.setForeground(new java.awt.Color(255, 255, 255));
        searchText.setText("Enter Name");
        searchText.setToolTipText("Enter Name");
        searchText.setBorder(null);
        searchText.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchTextCaretUpdate(evt);
            }
        });
        searchText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFocusLost(evt);
            }
        });
        jPanel2.add(searchText);
        searchText.setBounds(30, 200, 180, 30);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(30, 230, 180, 20);

        srchbtn.setBackground(new java.awt.Color(51, 153, 51));
        srchbtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        srchbtn.setForeground(new java.awt.Color(0, 0, 255));
        srchbtn.setText("Search");
        srchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        srchbtn.setOpaque(false);
        srchbtn.setSelected(true);
        srchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchbtnActionPerformed(evt);
            }
        });
        jPanel2.add(srchbtn);
        srchbtn.setBounds(65, 270, 110, 30);

        table.setBackground(new java.awt.Color(51, 153, 51));
        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 51), 1, true));

        dis_table.setBackground(new java.awt.Color(51, 153, 51));
        dis_table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 51), 1, true));
        dis_table.setFont(new java.awt.Font("Lucida Bright", 0, 15)); // NOI18N
        dis_table.setForeground(new java.awt.Color(153, 255, 153));
        dis_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Aman", "5656", "888888"},
                {"2", "Aman", "4545", "777777"},
                {"3", "Aman", "7878", "999999"},
                {"4", "Aman", "1212", "44444"},
                {"5", "Aman", "4545", "55555"},
                {"6", "Aman", "65", "66666"},
                {"7", "Aman", "6589", "2222"},
                {"8", "Aman", "3256", "1113"},
                {"9", "Aman", "5478", "333"},
                {"10", "Aman", "2541", "22"}
            },
            new String [] {
                "ID", "Name", "Phone Number", "Addhar card"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dis_table.setGridColor(new java.awt.Color(51, 153, 51));
        dis_table.setRowHeight(30);
        dis_table.setSelectionBackground(new java.awt.Color(153, 255, 153));
        dis_table.setSelectionForeground(new java.awt.Color(51, 153, 51));
        table.setViewportView(dis_table);

        jPanel2.add(table);
        table.setBounds(280, 160, 550, 260);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Up_panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Up_panal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        if(balance==true) JOptionPane.showMessageDialog(null, "Please Close This Window First");
    }//GEN-LAST:event_formWindowDeactivated

    private void closssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closssMouseClicked
        balance = false;
        close();
    }//GEN-LAST:event_closssMouseClicked

    private void closssMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closssMouseEntered
        setColor(closss);
    }//GEN-LAST:event_closssMouseEntered

    private void closssMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closssMouseExited
        resetColor(closss);
    }//GEN-LAST:event_closssMouseExited

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x-xM, y-yM);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xM = evt.getX();
        yM = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void searchTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFocusGained
        if("Enter Name".equals(searchText.getText())) searchText.setText("");
    }//GEN-LAST:event_searchTextFocusGained

    private void searchTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFocusLost
        if("".equals(searchText.getText())) searchText.setText("Enter Name");
    }//GEN-LAST:event_searchTextFocusLost

    private void srchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchbtnActionPerformed
        if(!"Enter Name".equals(searchText.getText())) 
        {
            table.setVisible(true);
            text3.setVisible(true);
            text2.setText("/");
            AC.jLabelXLeft(760, 280, 2, 2, text3);
        } 
        else 
        {
            table.setVisible(false);
            text3.setVisible(false);
            text2.setText("....");
            AC.jLabelXRight(280, 760, 1, 20, text3);
        }
    }//GEN-LAST:event_srchbtnActionPerformed

    private void searchTextCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchTextCaretUpdate
        if("Enter Name".equals(searchText.getText()))
        {
            initTable();
        }
        else
        {
            try {
                String sql="select * from user WHERE concat(Fname,Lname) LIKE '%"+searchText.getText()+"%' AND Acitve="+limit;
                st= c.createStatement();
                ResultSet rss=st.executeQuery(sql);
                DefaultTableModel tab = (DefaultTableModel)dis_table.getModel();

                Object[] row = new Object[4];

                while(tab.getRowCount()!=0)
                {
                    tab.removeRow(0);
                }

                while(rss.next())
                {
                    row[0]=rss.getInt(1);
                    String name = rss.getString(2)+" "+rss.getString(3);
                    row[1]=name;
                    row[2]=rss.getLong(6);
                    row[3]=rss.getLong(4);
                    tab.addRow(row);
                }

            } catch (SQLException ex) {
                Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchTextCaretUpdate

    
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
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Members().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Up_panal;
    private javax.swing.JLabel closss;
    private javax.swing.JTable dis_table;
    private javax.swing.JLabel head1;
    private javax.swing.JLabel head2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton srchbtn;
    private javax.swing.JScrollPane table;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    // End of variables declaration//GEN-END:variables
}
