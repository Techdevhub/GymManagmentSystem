/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import com.github.lgooddatepicker.components.DatePicker;
import gymproject.BalanceDateConfrmation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Akka
 */
public class ComponantTest extends javax.swing.JFrame {

//    int h = 0;
//    int m = 0;
//    boolean bb = true;
//    boolean stop = true;
//    int hour = 0;
//    int min = 0;
//    int sec = 0;
//    int workingID = 0;
//    
//    //new changes
//    String name = null, phoneno = null;
//    int paid=0;
//    
//    
//    void duedateCrt()
//    {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_central?zeroDateTimeBehavior=convertToNull","root","26265");
//            String sql="SELECT * FROM fees ORDER BY due_date DESC;";
//            Statement st= cn.createStatement();
//            ResultSet rss=st.executeQuery(sql);
//
//            Calendar cal1 = new GregorianCalendar();
//            int yr = cal1.get(Calendar.YEAR);
//            int mn = cal1.get(Calendar.MONTH);
//            mn++;
//            int day = cal1.get(Calendar.DATE);
//            Calendar cal = new GregorianCalendar();
//            int tyr,tmn,tday;
//            
//            Object[] obj = new Object[3];
//            obj[0]="Reminder At 9:30";
//            obj[1]="Reminder At 20:30";
//            obj[2]="Posponed the date";
//            
//            while(rss.next())
//            {
//                Date date = rss.getDate(5);
//                if(date == null)
//                {
//                    break;
//                }
//                cal.setTime(date);
//                tyr = cal.get(Calendar.YEAR);
//                tmn = cal.get(Calendar.MONTH);
//                tmn++;
//                tday = cal.get(Calendar.DATE);
//                if(yr==tyr && mn==tmn && day==tday)
//                {
//                    paid = rss.getInt(3);
//                    workingID = rss.getInt(1);
//                    sql="SELECT `Fname`,`Lname`,`Ph_num` FROM `user` WHERE `ID`= "+workingID+" ;";
//                    st= cn.createStatement();
//                    ResultSet rss1=st.executeQuery(sql);
//                    while(rss1.next())
//                    {
//                        name = rss1.getString(1)+" "+rss1.getString(2);
//                        phoneno = rss1.getString(3);
//                    }
//                    int num = JOptionPane.showOptionDialog(null, "Name  :- "+name+"\n\nPhone Number :- "+phoneno+
//                            "\n\nPaid :-"+paid+"\n\n\nSelect Your Action.", 
//                            "Due Date Complete.☻", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, obj, "Posponed the date");
//                    switch (num) {
//                        case 0:
//                            {
//                                try
//                                {
//                                    sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
//                                            + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','9:30',1);";
//                                    PreparedStatement ps = cn.prepareStatement(sql);
//                                    ps.executeUpdate();
//                                }
//                                catch(SQLException e)
//                                {
//                                    try
//                                    {
//                                        sql="DELETE FROM tasks WHERE `name`='"+name+"';";
//                                        PreparedStatement ps = cn.prepareStatement(sql);
//                                        ps.executeUpdate();
//                                        sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
//                                                + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','9:30',1);";
//                                        ps = cn.prepareStatement(sql);
//                                        ps.executeUpdate();
//                                    }
//                                    catch(SQLException ex)
//                                    {
//                                        JOptionPane.showMessageDialog(null, "Unable To Set task");
//                                    }
//                                }
//                                break;
//                            }
//                        case 1:
//                            {
//                                try
//                                {
//                                    sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
//                                            + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','20:30',1);";
//                                    PreparedStatement ps = cn.prepareStatement(sql);
//                                    ps.executeUpdate();
//                                }
//                                catch(SQLException e)
//                                {
//                                    try
//                                    {
//                                        sql="DELETE FROM tasks WHERE `name`='"+name+"';";
//                                        PreparedStatement ps = cn.prepareStatement(sql);
//                                        ps.executeUpdate();
//                                        sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
//                                                + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','20:30',1);";
//                                        ps = cn.prepareStatement(sql);
//                                        ps.executeUpdate();
//                                    }
//                                    catch(SQLException ex)
//                                    {
//                                        JOptionPane.showMessageDialog(null, "Unable To Set task");
//                                    }
//                                }
//                                break;
//                            }
//                        case 2:
//                            JOptionPane.showMessageDialog(null, "If Date Excludes the Subcription Limit.\nThe Member can put in Unactive Member Catagory",
//                                    "Alart!",JOptionPane.WARNING_MESSAGE);
//                            LocalDate date1 = LocalDate.of(yr, mn, day) ;
//                            datePicker1.setDate(date1);
//                            JOptionPane.showMessageDialog(null,datePicker1,"Select Date To Be set",JOptionPane.INFORMATION_MESSAGE);
//                            try
//                            {
//                                String query = "UPDATE fees SET due_date='"+datePicker1.toString()+"' WHERE `ID`="+workingID;
//                                PreparedStatement ps = cn.prepareStatement(query);
//                                ps.executeUpdate();
//                            }
//                            catch(SQLException exx)
//                            {
//                                JOptionPane.showMessageDialog(null, "Unable to set date Line 239");
//                            }
//                            break;
//                        default:
//                            break;
//                    }
//                }
//            }
//        }
//        catch (ClassNotFoundException | SQLException e){
//            JOptionPane.showMessageDialog(null,"Database is Not connected");
//            System.err.println("error" + e.getMessage());
//        }
//    }
//    
//    void ttps()
//    {
//        try
//        {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_central?zeroDateTimeBehavior=convertToNull","root","26265");
//            String query = "SELECT * FROM tasks ORDER BY `date`;";
//            Statement st = cn.createStatement();
//            Time[] time = new Time[6];
//            int i =0;
//            ResultSet rss = st.executeQuery(query);
//            while (rss.next()) {
//                time[i]=rss.getTime(5);
//                i++;
//                if(i>6)
//                    break;
//            }
//            for (int j = 0; j < 6; j++) {
//                System.out.println(time[j]);
//            }
//        }
//        catch(ClassNotFoundException |SQLException  e)
//        {
//            Logger.getLogger(ComponantTest.class.getName()).log(Level.SEVERE, null, e);
//        } 
//    }
//    
//    void duedatePrv()
//    {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_central?zeroDateTimeBehavior=convertToNull","root","26265");
//            String sql="SELECT * FROM fees ORDER BY due_date DESC;";
//            Statement st= cn.createStatement();
//            ResultSet rss=st.executeQuery(sql);
//
//            Calendar cal1 = new GregorianCalendar();
//            int yr = cal1.get(Calendar.YEAR);
//            int mn = cal1.get(Calendar.MONTH);
//            mn++;
//            int day = cal1.get(Calendar.DATE);
//            Calendar cal = new GregorianCalendar();
//            int tyr,tmn,tday;
//            
//            Object[] obj = new Object[3];
//            obj[0]="Reminder At 9:30";
//            obj[1]="Reminder At 20:30";
//            obj[2]="Posponed the date";
//            
//            while(rss.next())
//            {
//                Date date = rss.getDate(5);
//                if(date == null)
//                {
//                    break;
//                }
//                cal.setTime(date);
//                tyr = cal.get(Calendar.YEAR);
//                tmn = cal.get(Calendar.MONTH);
//                tmn++;
//                tday = cal.get(Calendar.DATE);
//                boolean modiflag = false;
//                if(yr==tyr && mn==tmn && day>tday)
//                {
//                    modiflag=true;
//                }
//                else if(yr==tyr && mn>tmn)
//                {
//                    modiflag = true;
//                }
//                else if(yr>tyr)
//                {
//                    modiflag = true;
//                }
//                if(modiflag)
//                {
//                    paid = rss.getInt(3);
//                    workingID = rss.getInt(1);
//                    sql="SELECT `Fname`,`Lname`,`Ph_num` FROM `user` WHERE `ID`= "+workingID+" ;";
//                    st= cn.createStatement();
//                    ResultSet rss1=st.executeQuery(sql);
//                    while(rss1.next())
//                    {
//                        name = rss1.getString(1)+" "+rss1.getString(2);
//                        phoneno = rss1.getString(3);
//                    }
//                    int num = JOptionPane.showOptionDialog(null, "Name  :- "+name+"\n\nPhone Number :- "+phoneno+
//                            "\n\nPaid :-"+paid+"\n\n\nSelect Your Action.", 
//                            "Due Date Complete.☻", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, obj, "Posponed the date");
//                    switch (num) {
//                        case 0:
//                            {
//                                try
//                                {
//                                    sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
//                                            + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','9:30',1);";
//                                    PreparedStatement ps = cn.prepareStatement(sql);
//                                    ps.executeUpdate();
//                                }
//                                catch(SQLException e)
//                                {
//                                    try
//                                    {
//                                        sql="DELETE FROM tasks WHERE `name`='"+name+"';";
//                                        PreparedStatement ps = cn.prepareStatement(sql);
//                                        ps.executeUpdate();
//                                        sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
//                                                + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','9:30',1);";
//                                        ps = cn.prepareStatement(sql);
//                                        ps.executeUpdate();
//                                    }
//                                    catch(SQLException ex)
//                                    {
//                                        JOptionPane.showMessageDialog(null, "Unable To Set task");
//                                    }
//                                }
//                                break;
//                            }
//                        case 1:
//                            {
//                                try
//                                {
//                                    sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
//                                            + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','20:30',1);";
//                                    PreparedStatement ps = cn.prepareStatement(sql);
//                                    ps.executeUpdate();
//                                }
//                                catch(SQLException e)
//                                {
//                                    try
//                                    {
//                                        sql="DELETE FROM tasks WHERE `name`='"+name+"';";
//                                        PreparedStatement ps = cn.prepareStatement(sql);
//                                        ps.executeUpdate();
//                                        sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
//                                                + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','20:30',1);";
//                                        ps = cn.prepareStatement(sql);
//                                        ps.executeUpdate();
//                                    }
//                                    catch(SQLException ex)
//                                    {
//                                        JOptionPane.showMessageDialog(null, "Unable To Set task");
//                                    }
//                                }
//                                break;
//                            }
//                        case 2:
//                            JOptionPane.showMessageDialog(null, "If Date Excludes the Subcription Limit.\nThe Member can put in Unactive Member Catagory",
//                                    "Alart!",JOptionPane.WARNING_MESSAGE);
//                            LocalDate date1 = LocalDate.of(yr, mn, day) ;
//                            datePicker1.setDate(date1);
//                            JOptionPane.showMessageDialog(null,datePicker1,"Select Date To Be set",JOptionPane.INFORMATION_MESSAGE);
//                            try
//                            {
//                                String query = "UPDATE fees SET due_date='"+datePicker1.toString()+"' WHERE `ID`="+workingID;
//                                PreparedStatement ps = cn.prepareStatement(query);
//                                ps.executeUpdate();
//                            }
//                            catch(SQLException exx)
//                            {
//                                JOptionPane.showMessageDialog(null, "Unable to set date Line 239");
//                            }
//                            break;
//                        default:
//                            break;
//                    }
//                }
//            }
//        }
//        catch (ClassNotFoundException | SQLException e){
//            JOptionPane.showMessageDialog(null,"Database is Not connected");
//            System.err.println("error" + e.getMessage());
//        }
//    }
//    
    
    public ComponantTest() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnl.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        getContentPane().add(pnl);
        pnl.setBounds(181, 133, 256, 134);

        btn.setText("jButton1");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn);
        btn.setBounds(670, 11, 73, 23);

        setSize(new java.awt.Dimension(769, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        
        pnl.paintImmediately(188, 133, 256, 134);
        
        int i = 140;
        while(i<280) {
            try {
                pnl.setLocation(188, i);
                i=i+10;
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ComponantTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnActionPerformed

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
            java.util.logging.Logger.getLogger(ComponantTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComponantTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComponantTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComponantTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComponantTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
}
