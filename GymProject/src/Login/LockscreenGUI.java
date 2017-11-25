package Login;


import TrayBar.DisplayTrayIcon;
import gymproject.Dtcon;
import gymproject.FirstPage;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LockscreenGUI extends javax.swing.JFrame
{ 
    //Recent Task active Intilization
    
    int h = 0;
    int m = 0;
    boolean bb = true;
    boolean stop = true;
    int hour = 0;
    int min = 0;
    int sec = 0;
    int workingID = 0;
    
    //Init Complete
    
    //Database Init
    
    Dtcon d = new Dtcon();
    Connection c = d.getconnection();
    Statement st;
    PreparedStatement ps;
    
    //Complete
    
    public String MasterString = "2626";
    
    FirstPage fp = new FirstPage();
    
    int chr1,chr2,chr3,chr4;
    
    String ttitle,tdis;
    
    int buttonClick;
    
    int count =0;
    
    public boolean flag = false;
    
    String name = null, phoneno = null;
    int paid=0;
    
    ImageIcon selected = new ImageIcon(getClass().getResource("/Login/Images/circle_filled.png"));
    ImageIcon unselected = new ImageIcon(getClass().getResource("/Login/Images/circle_unfilled.png"));
    
    void updatepass() {
        try {
            String query = "SELECT * FROM passtable WHERE `ID`=1;";
            st = c.createStatement();
            ResultSet rss = st.executeQuery(query);
            while(rss.next()) {
                MasterString = rss.getString(2);
            }
        }
        catch(SQLException ex) {
            System.err.println(ex);
        }
    }
    
    public LockscreenGUI()
    {
        initComponents();
        DisplayTrayIcon DTI = new DisplayTrayIcon();
        
        recarection();
        act();
        new Thread()
        {
            public void run()
            {
                while(bb)
                {
                    Calendar cal = new GregorianCalendar();
                    hour = cal.get(Calendar.HOUR_OF_DAY);
                    min = cal.get(Calendar.MINUTE);
                    sec = cal.get(Calendar.SECOND);
                    
                    if( hour == h && min == m)
                    {
                        if(stop)
                        {
                            JOptionPane.showMessageDialog(null, ttitle+"\n"+tdis,"Task Alart !",JOptionPane.INFORMATION_MESSAGE);
                            stop = false;
                            react();
                        }
                    }
                    try {
                        boolean flag = fp.setflag();
//                        System.out.println(flag);
                        if(flag == true)
                        {
                            recarection();
                            act();
                            fp.resetflag();
                        }
                        Thread.sleep(10000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(LockscreenGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
        
    }

    
    void duedateCrt()
    {
        try {
            String sql="SELECT * FROM fees ORDER BY due_date DESC;";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);

            Calendar cal1 = new GregorianCalendar();
            int yr = cal1.get(Calendar.YEAR);
            int mn = cal1.get(Calendar.MONTH);
            mn++;
            int day = cal1.get(Calendar.DATE);
            Calendar cal = new GregorianCalendar();
            int tyr,tmn,tday;
            
            Object[] obj = new Object[3];
            obj[0]="Reminder At 9:30";
            obj[1]="Reminder At 20:30";
            obj[2]="Posponed the date";
            
            while(rss.next())
            {
                Date date = rss.getDate(5);
                if(date == null)
                {
                    break;
                }
                cal.setTime(date);
                tyr = cal.get(Calendar.YEAR);
                tmn = cal.get(Calendar.MONTH);
                tmn++;
                tday = cal.get(Calendar.DATE);
                if(yr==tyr && mn==tmn && day==tday)
                {
                    paid = rss.getInt(3);
                    workingID = rss.getInt(1);
                    sql="SELECT `Fname`,`Lname`,`Ph_num` FROM `user` WHERE `ID`= "+workingID+" ;";
                    st= c.createStatement();
                    ResultSet rss1=st.executeQuery(sql);
                    while(rss1.next())
                    {
                        name = rss1.getString(1)+" "+rss1.getString(2);
                        phoneno = rss1.getString(3);
                    }
                    int num = JOptionPane.showOptionDialog(null, "Name  :- "+name+"\n\nPhone Number :- "+phoneno+
                            "\n\nPaid :-"+paid+"\n\n\nSelect Your Action.", 
                            "Due Date Complete.☻", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, obj, "Posponed the date");
                    switch (num) {
                        case 0:
                            {
                                try
                                {
                                    sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
                                            + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','9:30',1);";
                                    ps = c.prepareStatement(sql);
                                    ps.executeUpdate();
                                }
                                catch(SQLException e)
                                {
                                    try
                                    {
                                        sql="DELETE FROM tasks WHERE `name`='"+name+"';";
                                        ps = c.prepareStatement(sql);
                                        ps.executeUpdate();
                                        sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
                                                + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','7:30',1);";
                                        ps = c.prepareStatement(sql);
                                        ps.executeUpdate();
                                    }
                                    catch(SQLException ex)
                                    {
                                        JOptionPane.showMessageDialog(null, "Unable To Set task");
                                    }
                                }
                                break;
                            }
                        case 1:
                            {
                                try
                                {
                                    sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
                                            + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','20:30',1);";
                                    ps = c.prepareStatement(sql);
                                    ps.executeUpdate();
                                }
                                catch(SQLException e)
                                {
                                    try
                                    {
                                        sql="DELETE FROM tasks WHERE `name`='"+name+"';";
                                        ps = c.prepareStatement(sql);
                                        ps.executeUpdate();
                                        sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
                                                + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','20:30',1);";
                                        ps = c.prepareStatement(sql);
                                        ps.executeUpdate();
                                    }
                                    catch(SQLException ex)
                                    {
                                        JOptionPane.showMessageDialog(null, "Unable To Set task");
                                    }
                                }
                                break;
                            }
                        case 2:
                            JOptionPane.showMessageDialog(null, "If Date Excludes the Subcription Limit.\nThe Member can put in Unactive Member Catagory",
                                    "Alart!",JOptionPane.WARNING_MESSAGE);
                            LocalDate date1 = LocalDate.of(yr, mn, day) ;
                            datePicker1.setDate(date1);
                            JOptionPane.showMessageDialog(null,datePicker1,"Select Date To Be set",JOptionPane.INFORMATION_MESSAGE);
                            try
                            {
                                String query = "UPDATE fees SET due_date='"+datePicker1.toString()+"' WHERE `ID`="+workingID;
                                ps = c.prepareStatement(query);
                                ps.executeUpdate();
                            }
                            catch(SQLException exx)
                            {
                                JOptionPane.showMessageDialog(null, "Unable to set date Line 239");
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Database is Not connected");
            System.err.println("error" + e.getMessage());
        }
    }
    
    void duedatePrv()
    {
        try {
            String sql="SELECT * FROM fees ORDER BY due_date DESC;";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);

            Calendar cal1 = new GregorianCalendar();
            int yr = cal1.get(Calendar.YEAR);
            int mn = cal1.get(Calendar.MONTH);
            mn++;
            int day = cal1.get(Calendar.DATE);
            Calendar cal = new GregorianCalendar();
            int tyr,tmn,tday;
            
            Object[] obj = new Object[3];
            obj[0]="Reminder At 9:30";
            obj[1]="Reminder At 20:30";
            obj[2]="Posponed the date";
            
            while(rss.next())
            {
                Date date = rss.getDate(5);
                if(date == null)
                {
                    break;
                }
                cal.setTime(date);
                tyr = cal.get(Calendar.YEAR);
                tmn = cal.get(Calendar.MONTH);
                tmn++;
                tday = cal.get(Calendar.DATE);
                boolean modiflag = false;
                if(yr==tyr && mn==tmn && day>tday)
                {
                    modiflag=true;
                }
                else if(yr==tyr && mn>tmn)
                {
                    modiflag = true;
                }
                else if(yr>tyr)
                {
                    modiflag = true;
                }
                if(modiflag)
                {
                    paid = rss.getInt(3);
                    workingID = rss.getInt(1);
                    sql="SELECT `Fname`,`Lname`,`Ph_num` FROM `user` WHERE `ID`= "+workingID+" ;";
                    st= c.createStatement();
                    ResultSet rss1=st.executeQuery(sql);
                    while(rss1.next())
                    {
                        name = rss1.getString(1)+" "+rss1.getString(2);
                        phoneno = rss1.getString(3);
                    }
                    int num = JOptionPane.showOptionDialog(null, "Name  :- "+name+"\n\nPhone Number :- "+phoneno+
                            "\n\nPaid :-"+paid+"\n\n\nSelect Your Action.", 
                            "Due Date Complete.☻", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, obj, "Posponed the date");
                    switch (num) {
                        case 0:
                            {
                                try
                                {
                                    sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
                                            + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','9:30',1);";
                                    ps = c.prepareStatement(sql);
                                    ps.executeUpdate();
                                }
                                catch(SQLException e)
                                {
                                    try
                                    {
                                        sql="DELETE FROM tasks WHERE `name`='"+name+"';";
                                        ps = c.prepareStatement(sql);
                                        ps.executeUpdate();
                                        sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
                                                + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','7:30',1);";
                                        ps = c.prepareStatement(sql);
                                        ps.executeUpdate();
                                    }
                                    catch(SQLException ex)
                                    {
                                        JOptionPane.showMessageDialog(null, "Unable To Set task");
                                    }
                                }
                                break;
                            }
                        case 1:
                            {
                                try
                                {
                                    sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
                                            + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','20:30',1);";
                                    ps = c.prepareStatement(sql);
                                    ps.executeUpdate();
                                }
                                catch(SQLException e)
                                {
                                    try
                                    {
                                        sql="DELETE FROM tasks WHERE `name`='"+name+"';";
                                        ps = c.prepareStatement(sql);
                                        ps.executeUpdate();
                                        sql="INSERT INTO tasks(`name`,other,`date`,`time`,`Completed`) VALUES"
                                                + "('"+name+"','Phone Number :- "+phoneno+"\n\nPaid :-"+paid+".','"+yr+"-"+mn+"-"+day+"','20:30',1);";
                                        ps = c.prepareStatement(sql);
                                        ps.executeUpdate();
                                    }
                                    catch(SQLException ex)
                                    {
                                        JOptionPane.showMessageDialog(null, "Unable To Set task");
                                    }
                                }
                                break;
                            }
                        case 2:
                            JOptionPane.showMessageDialog(null, "If Date Excludes the Subcription Limit.\nThe Member can put in Unactive Member Catagory",
                                    "Alart!",JOptionPane.WARNING_MESSAGE);
                            LocalDate date1 = LocalDate.of(yr, mn, day) ;
                            datePicker1.setDate(date1);
                            JOptionPane.showMessageDialog(null,datePicker1,"Select Date To Be set",JOptionPane.INFORMATION_MESSAGE);
                            try
                            {
                                String query = "UPDATE fees SET due_date='"+datePicker1.toString()+"' WHERE `ID`="+workingID;
                                ps = c.prepareStatement(query);
                                ps.executeUpdate();
                            }
                            catch(SQLException exx)
                            {
                                JOptionPane.showMessageDialog(null, "Unable to set date Line 239");
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Database is Not connected");
            System.err.println("error" + e.getMessage());
        }
    }
    
    
    
    
    void lockpass()
    {
        count++;
        
        switch(count)
        {
            case 1:
                Code1.setIcon(selected);
                chr1 = buttonClick;
                break;
            case 2:
                Code2.setIcon(selected);
                chr2 = buttonClick;
                break;
            case 3:
                Code3.setIcon(selected);
                chr3 = buttonClick;
                break;
            case 4:
                Code4.setIcon(selected);
                
                chr4 = buttonClick;
                
                String typedCode = chr1 + "" + chr2 + "" + chr3 + "" + chr4;
                
                updatepass();
                
                if(typedCode.equals(MasterString))
                {
                    duedateCrt();
                    duedatePrv();
                    fp.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "The password is incorrct. Please Try again.");
                }
                
                Code1.setIcon(unselected);
                Code2.setIcon(unselected);
                Code3.setIcon(unselected);
                Code4.setIcon(unselected);
                
                count = 0;
                break;
            
        }
    }
    
    
    //task funtion
    
    void recarection()
    {
        try {
            String sql="SELECT * FROM `tasks` WHERE `Completed`=1 ORDER BY `time`;";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);

            Calendar cal1 = new GregorianCalendar();
            int yr = cal1.get(Calendar.YEAR);
            int mn = cal1.get(Calendar.MONTH);
            mn++;
            int day = cal1.get(Calendar.DATE);
            int hr = cal1.get(Calendar.HOUR_OF_DAY);
            int min = cal1.get(Calendar.MINUTE);
            Calendar cal = new GregorianCalendar();
            int tyr,tmn,tday;
            while(rss.next())
            {
                workingID = rss.getInt(1);
                Date date = rss.getDate(4);
                cal.setTime(date);
                tyr = cal.get(Calendar.YEAR);//taken year
                tmn = cal.get(Calendar.MONTH);//taken month
                tmn++;
                tday = cal.get(Calendar.DATE);//taken date
                
                if(yr==tyr && mn==tmn && day>tday)
                {
                    sql="UPDATE tasks SET `Completed`= 0 WHERE `ID`="+workingID+";";
                    PreparedStatement ps = c.prepareStatement(sql);
                    ps.executeUpdate();
                }
                else if(yr==tyr && mn>tmn)
                {
                    sql="UPDATE tasks SET `Completed`= 0 WHERE `ID`="+workingID+";";
                    PreparedStatement ps = c.prepareStatement(sql);
                    ps.executeUpdate();
                }
                else if(yr>tyr)
                {
                    sql="UPDATE tasks SET `Completed`= 0 WHERE `ID`="+workingID+";";
                    PreparedStatement ps = c.prepareStatement(sql);
                    ps.executeUpdate();
                }
                else if(yr==tyr && mn==tmn && day==tday)
                {
                    Time time = rss.getTime(5);
                    cal.setTime(time);
                    h = cal.get(Calendar.HOUR_OF_DAY);
                    m = cal.get(Calendar.MINUTE);
                    if(h==hr)
                    {
                        if(m<min)
                        {
                            sql="UPDATE tasks SET `Completed`= 0 WHERE `ID`="+workingID+";";
                            PreparedStatement ps = c.prepareStatement(sql);
                            ps.executeUpdate();
                        }
                    }
                    if(h<hr)
                    {
                        sql="UPDATE tasks SET `Completed`= 0 WHERE `ID`="+workingID+";";
                        PreparedStatement ps = c.prepareStatement(sql);
                        ps.executeUpdate();
                    }
                }
            }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Database is Not connected");
            System.err.println("error" + e.getMessage());
        }
    }
    
    void act()
    {
        try {
            String sql="SELECT * FROM `tasks` WHERE `Completed`=1 ORDER BY `time`;";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);

            Calendar cal1 = new GregorianCalendar();
            int yr = cal1.get(Calendar.YEAR);
            int mn = cal1.get(Calendar.MONTH);
            mn++;
            int day = cal1.get(Calendar.DATE);
            int hr = cal1.get(Calendar.HOUR_OF_DAY);
            int min = cal1.get(Calendar.MINUTE);
            Calendar cal = new GregorianCalendar();
            int tyr,tmn,tday;
            while(rss.next())
            {
                Date date = rss.getDate(4);
                cal.setTime(date);
                tyr = cal.get(Calendar.YEAR);
                tmn = cal.get(Calendar.MONTH);
                tmn++;
                tday = cal.get(Calendar.DATE);
                if(yr==tyr && mn==tmn && day==tday)
                {
                    ttitle = rss.getString(2);
                    tdis = rss.getString(3);
                    workingID = rss.getInt(1);
                    Time time = rss.getTime(5);
                    cal.setTime(time);
                    h = cal.get(Calendar.HOUR_OF_DAY);
                    m = cal.get(Calendar.MINUTE);
                    stop = true;
                    if(h==hr)
                    {
                        if(m>min)
                        {
                            break;
                        }
                    }
                    if(h>hr)
                    {
                        break;
                    }
                }
            }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Database is Not connected");
            System.err.println("error" + e.getMessage());
        }
    }
    
    void react()
    {
        try {
            
            String sql="UPDATE tasks SET `Completed`= 0 WHERE `ID`="+workingID+";";
            ps = c.prepareStatement(sql);
            ps.executeUpdate();
            
            sql="SELECT * FROM `tasks` WHERE `Completed`=1 ORDER BY `time`;";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);

            Calendar cal1 = new GregorianCalendar();
            int yr = cal1.get(Calendar.YEAR);
            int mn = cal1.get(Calendar.MONTH);
            mn++;
            int day = cal1.get(Calendar.DATE);
            int hr = cal1.get(Calendar.HOUR_OF_DAY);
            int min = cal1.get(Calendar.MINUTE);
            Calendar cal = new GregorianCalendar();
            int tyr,tmn,tday;
            while(rss.next())
            {
                stop = true;
                Date date = rss.getDate(4);
                cal.setTime(date);
                tyr = cal.get(Calendar.YEAR);
                tmn = cal.get(Calendar.MONTH);
                tmn++;
                tday = cal.get(Calendar.DATE);
                if(yr==tyr && mn==tmn && day==tday)
                {
                    ttitle = rss.getString(2);
                    tdis = rss.getString(3);
                    workingID = rss.getInt(1);
                    Time time = rss.getTime(5);
                    cal.setTime(time);
                    h = cal.get(Calendar.HOUR_OF_DAY);
                    m = cal.get(Calendar.MINUTE);
                    if(h==hr)
                    {
                        if(m>min)
                        {
                            break;
                        }
                    }
                    if(h>hr)
                    {
                        break;
                    }
                }
            }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Database is Not connected");
            System.err.println("error" + e.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        Button0 = new javax.swing.JLabel();
        Button9 = new javax.swing.JLabel();
        Button8 = new javax.swing.JLabel();
        Button7 = new javax.swing.JLabel();
        Button6 = new javax.swing.JLabel();
        Button5 = new javax.swing.JLabel();
        Button4 = new javax.swing.JLabel();
        Button3 = new javax.swing.JLabel();
        Button2 = new javax.swing.JLabel();
        Button1 = new javax.swing.JLabel();
        Code4 = new javax.swing.JLabel();
        Code3 = new javax.swing.JLabel();
        Code2 = new javax.swing.JLabel();
        Code1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lockscreen");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button0MouseReleased(evt);
            }
        });
        getContentPane().add(Button0, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 342, 60, 60));

        Button9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button9MouseReleased(evt);
            }
        });
        getContentPane().add(Button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 60, 60));

        Button8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button8MouseReleased(evt);
            }
        });
        getContentPane().add(Button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 270, 60, 60));

        Button7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button7MouseReleased(evt);
            }
        });
        getContentPane().add(Button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 270, 60, 60));

        Button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button6MouseReleased(evt);
            }
        });
        getContentPane().add(Button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 199, 60, 60));

        Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button5MouseReleased(evt);
            }
        });
        getContentPane().add(Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 199, 60, 60));

        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button4MouseReleased(evt);
            }
        });
        getContentPane().add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 199, 60, 60));

        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button3MouseReleased(evt);
            }
        });
        getContentPane().add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 60, 60));

        Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button2MouseReleased(evt);
            }
        });
        getContentPane().add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 130, 60, 60));

        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button1MouseReleased(evt);
            }
        });
        getContentPane().add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 130, 60, 60));

        Code4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Images/circle_unfilled.png"))); // NOI18N
        getContentPane().add(Code4, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 70, 15, 15));

        Code3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Images/circle_unfilled.png"))); // NOI18N
        getContentPane().add(Code3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 70, 15, 15));

        Code2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Images/circle_unfilled.png"))); // NOI18N
        getContentPane().add(Code2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 70, 15, 15));

        Code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Images/circle_unfilled.png"))); // NOI18N
        getContentPane().add(Code1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 70, 15, 15));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Images/numbers.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 295, 290));

        Heading.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("Enter Passcode");
        getContentPane().add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 120, 30));

        Background.setBackground(new java.awt.Color(103, 65, 114));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Images/background.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 295, 460));

        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/2new.jpg"))); // NOI18N
        jPanel1.add(jLabel2, "card2");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 0, 672, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseReleased
        buttonClick = 1;
        lockpass();
    }//GEN-LAST:event_Button1MouseReleased

    private void Button2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseReleased
        buttonClick = 2;
        lockpass();
    }//GEN-LAST:event_Button2MouseReleased

    private void Button3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseReleased
        buttonClick = 3;
        lockpass();
    }//GEN-LAST:event_Button3MouseReleased

    private void Button4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseReleased
        buttonClick = 4;
        lockpass();
    }//GEN-LAST:event_Button4MouseReleased

    private void Button5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseReleased
        buttonClick = 5;
        lockpass();
    }//GEN-LAST:event_Button5MouseReleased

    private void Button6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button6MouseReleased
        buttonClick = 6;
        lockpass();
    }//GEN-LAST:event_Button6MouseReleased

    private void Button7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseReleased
        buttonClick = 7;
        lockpass();
    }//GEN-LAST:event_Button7MouseReleased

    private void Button8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button8MouseReleased
        buttonClick = 8;
        lockpass();
    }//GEN-LAST:event_Button8MouseReleased

    private void Button9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseReleased
        buttonClick = 9;
        lockpass();
    }//GEN-LAST:event_Button9MouseReleased

    private void Button0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button0MouseReleased
        buttonClick = 0;
        lockpass();
    }//GEN-LAST:event_Button0MouseReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // code for gendral keys.
        
        if(evt.getKeyCode() == KeyEvent.VK_0)
        {
            buttonClick = 0;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_1)
        {
            buttonClick = 1;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_2)
        {
            buttonClick = 2;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_3)
        {
            buttonClick = 3;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_4)
        {
            buttonClick = 4;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_5)
        {
            buttonClick = 5;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_6)
        {
            buttonClick = 6;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_7)
        {
            buttonClick = 7;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_8)
        {
            buttonClick = 8;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_9)
        {
            buttonClick = 9;
            lockpass();
        }
        
        //Code for Num Pad Entry
        
        if(evt.getKeyCode() == KeyEvent.VK_NUMPAD0)
        {
            buttonClick = 0;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_NUMPAD1)
        {
            buttonClick = 1;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_NUMPAD2)
        {
            buttonClick = 2;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_NUMPAD3)
        {
            buttonClick = 3;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_NUMPAD4)
        {
            buttonClick = 4;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_NUMPAD5)
        {
            buttonClick = 5;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_NUMPAD6)
        {
            buttonClick = 6;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_NUMPAD7)
        {
            buttonClick = 7;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_NUMPAD8)
        {
            buttonClick = 8;
            lockpass();
        }
        if(evt.getKeyCode() == KeyEvent.VK_NUMPAD9)
        {
            buttonClick = 9;
            lockpass();
        }
    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[])
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LockscreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LockscreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LockscreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LockscreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                
                try {
                    Thread.sleep(1050);
                } catch (InterruptedException ex) {
                    Logger.getLogger(LockscreenGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                new LockscreenGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Button0;
    private javax.swing.JLabel Button1;
    private javax.swing.JLabel Button2;
    private javax.swing.JLabel Button3;
    private javax.swing.JLabel Button4;
    private javax.swing.JLabel Button5;
    private javax.swing.JLabel Button6;
    private javax.swing.JLabel Button7;
    private javax.swing.JLabel Button8;
    private javax.swing.JLabel Button9;
    private javax.swing.JLabel Code1;
    private javax.swing.JLabel Code2;
    private javax.swing.JLabel Code3;
    private javax.swing.JLabel Code4;
    private javax.swing.JLabel Heading;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
