
package gymproject.mypages;

import gymproject.Dtcon;
import gymproject.mypages.panals.PayFees;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TableSelector extends javax.swing.JFrame {

    
    Dtcon d = new Dtcon();
    Connection c = d.getconnection();
    Statement st;
    PreparedStatement ps;
    
    int xM;
    int yM;
    boolean ispay = false;
    
    public TableSelector() {
        initComponents();
    }

    void resetcolor(JLabel lb) {
        lb.setBackground(new Color(0,0,0));
    }
    
    void setcolor(JLabel lb) {
        lb.setBackground(new Color(30,30,30));
    }
    
    void updatedue() {
        try {
            String sql="SELECT * FROM history ORDER BY `ID` DESC ";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);
            DefaultTableModel tab = (DefaultTableModel)showtable.getModel();
            
            Object[] row = new Object[5];
            
            while(tab.getRowCount()!=0)
            {
                tab.removeRow(0);
            }
            
            while(rss.next())
            {
                row[0] = rss.getInt(2);
                sql = "SELECT * FROM user WHERE ID="+rss.getInt(2);
                st = c.createStatement();
                ResultSet temprss = st.executeQuery(sql);
                while(temprss.next()) {
                    String name = temprss.getString(2)+" "+temprss.getString(3);
                    row[1]=name;
                    row[2]=temprss.getObject(6);
                }
                row[3]=rss.getInt(3);
                row[4]=rss.getDate(4);
                tab.addRow(row);
                
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Line = 81");
            Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
        }
        ispay = false;
    }
    
    public void payinfo() {
        try {
            String sql="SELECT * FROM fees ORDER BY due_date DESC ";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);
            DefaultTableModel tab = (DefaultTableModel)showtable.getModel();
            
            Object[] row = new Object[5];
            
            while(tab.getRowCount()!=0)
            {
                tab.removeRow(0);
            }
            
            while(rss.next())
            {
                if(rss.getString(5)==null) {
                    break;
                }
                row[0] = rss.getInt(1);
                sql = "SELECT * FROM user WHERE ID="+rss.getInt(1);
                st = c.createStatement();
                ResultSet temprss = st.executeQuery(sql);
                while(temprss.next()) {
                    String name = temprss.getString(2)+" "+temprss.getString(3);
                    row[1]=name;
                    row[2]=temprss.getObject(6);
                }
                row[3]=rss.getInt(3);
                row[4]=rss.getDate(5);
                tab.addRow(row);
                
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Line = 122");
            Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
        }
        ispay = true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showtable = new javax.swing.JTable();
        heaad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(10, 10, 10));

        jPanel2.setBackground(new java.awt.Color(30, 30, 30));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(30, 30, 30));
        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 927, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        showtable.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        showtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "aman", "1254", "200", "5/8/17"},
                {"2", "karn", "1254", "300", "8/8/8"},
                {"3", "sanket", "4521", "400", "8"},
                {"4", "gabhne", "1254125412", "500", "8"},
                {"5", "naresh", "1254125412", "600", "8"},
                {"6", "hans", "1256325461", "700", null},
                {"7", "kancha", "2547896321", "800", "8"},
                {"8", "shital", "5468792135", "900", "8"},
                {"9", "bhavika", "9876543210", "1000", "8"},
                {"10", "darshana", "9876543210", "1100", "8"},
                {"11", "aarti", "0123456789", "1200", "8"},
                {"12", "pilu", "5896321470", "1300", "88"},
                {"13", "hirapure", "1598742360", "14", null}
            },
            new String [] {
                "ID", "Name", "Phone No.", "Amount", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showtable.setGridColor(new java.awt.Color(255, 255, 255));
        showtable.setRowHeight(40);
        showtable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        showtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(showtable);

        heaad.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        heaad.setForeground(new java.awt.Color(255, 255, 255));
        heaad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heaad.setText("Due Members");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heaad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heaad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(957, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        resetcolor(jLabel1);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        setcolor(jLabel1);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xM = evt.getX();
        yM = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xM, y-yM);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void showtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showtableMouseClicked
        if(evt.getClickCount()== 2) {
            if(ispay == true) {
                Calendar cal1 = new GregorianCalendar();
                int yr = cal1.get(Calendar.YEAR);
                int mn = cal1.get(Calendar.MONTH);
                mn++;
                int day = cal1.get(Calendar.DATE);
                int[] table_data = showtable.getSelectedRows();
                JOptionPane.showMessageDialog(null, "If Date Excludes the Subcription Limit.\nThe Member can put in Unactive Member Catagory",
                        "Alart!",JOptionPane.WARNING_MESSAGE);
                LocalDate date1 = LocalDate.of(yr, mn, day) ;
                datePicker1.setDate(date1);
                JOptionPane.showMessageDialog(null,datePicker1,"Select Date To Be set",JOptionPane.INFORMATION_MESSAGE);
                try
                {
                    String query = "UPDATE fees SET due_date='"+datePicker1.toString()+"' WHERE `ID`="+showtable.getValueAt(table_data[0], 0);;
                    ps = c.prepareStatement(query);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Date Updated successfully");
                    payinfo();
                }
                catch(SQLException exx)
                {
                    JOptionPane.showMessageDialog(null, "Unable to set date Line 239");
                }
            }
        }
    }//GEN-LAST:event_showtableMouseClicked

    
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
            java.util.logging.Logger.getLogger(TableSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableSelector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel heaad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable showtable;
    // End of variables declaration//GEN-END:variables
}
