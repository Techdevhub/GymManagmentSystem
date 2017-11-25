
package gymproject.mypages;

import AppPackage.AnimationClass;
import gymproject.Dtcon;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TaskPage extends javax.swing.JInternalFrame {

    
    
    GridBagLayout layout = new GridBagLayout();
    AnimationClass AC = new AnimationClass();
    
    Dtcon d = new Dtcon();
    Connection c = d.getconnection();
    Statement st;
    PreparedStatement ps;
    
    public boolean flag = false;
    int mov1x,mov1y;
    int mov2x,mov2y;
    int mov3x,mov3y;
    int mov4x,mov4y;
    
    int noti = 1;
    
    public TaskPage() {
        initComponents();
        Toolkit tool = Toolkit.getDefaultToolkit();
            int x = (int) tool.getScreenSize().getWidth();
            int y = (int) tool.getScreenSize().getHeight();
            y-=30;
        this.setSize(x, y);
        TaskPage_DownPic.setSize(x,y);
        TaskPage_UpPanal.setSize(x,y);
        
        Hide_Pan.setVisible(false);
        
        Ani();
        
        Empty.setVisible(true);
        page1.setVisible(false);
        page2.setVisible(false);
        page3.setVisible(false);
        page4.setVisible(false);
    }
    
    void Ani()
    {
        mov1x = New_Task.getX();
        mov1y = New_Task.getY();
        AC.jLabelYUp(mov1y, 100, 2, 2, New_Task);
        
        mov2x = View_Task.getX();
        mov2y = View_Task.getY();
        AC.jLabelYUp(mov2y, 200, 2, 2, View_Task);
        
        mov3x = Edit_Task.getX();
        mov3y = Edit_Task.getY();
        AC.jLabelYUp(mov3y, 300, 2, 2, Edit_Task);
        
        mov4x = Completed.getX();
        mov4y = Completed.getY();
        AC.jLabelYUp(mov4y, 400, 2, 2, Completed);
    }
    
    void ReAni()
    {
        New_Task.setLocation(mov1x, mov1y);
        View_Task.setLocation(mov2x, mov2y);
        Edit_Task.setLocation(mov3x, mov3y);
        Completed.setLocation(mov4x, mov4y);
        
        AC.jLabelYUp(mov1y, 100, 1, 2, New_Task);
        AC.jLabelYUp(mov2y, 200, 2, 2, View_Task);
        AC.jLabelYUp(mov3y, 300, 3, 2, Edit_Task);
        AC.jLabelYUp(mov4y, 400, 4, 2, Completed);
    }
    
    void viewtableupdate()
    {
        try {
            String sql="select * from tasks WHERE `Completed`=1 ORDER BY `date` DESC ;";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);
            DefaultTableModel tab = (DefaultTableModel)viewTable.getModel();
            
            Object[] row = new Object[6];
            int inc = 0;
            
            while(tab.getRowCount()!=0)
            {
                tab.removeRow(0);
            }
            
            while(rss.next())
            {
                inc ++ ; 
                row[0]=inc;
                row[1]=rss.getString(2);
                row[2]=rss.getString(3);
                row[3]=rss.getDate(4);
                row[4]=rss.getTime(5);
                row[5]=rss.getInt(1);
                tab.addRow(row);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);
            Logger.getLogger(TaskPage.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    void compeletedtableupdate()
    {
        try {
            String sql="select * from tasks WHERE `Completed`=0 ORDER BY `date` DESC ;";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);
            DefaultTableModel tab = (DefaultTableModel)comTable.getModel();
            
            Object[] row = new Object[6];
            int inc = 0;
            
            while(tab.getRowCount()!=0)
            {
                tab.removeRow(0);
            }
            
            while(rss.next())
            {
                inc ++ ; 
                row[0]=inc;
                row[1]=rss.getString(2);
                row[2]=rss.getString(3);
                row[3]=rss.getDate(4);
                row[4]=rss.getTime(5);
                row[5]=rss.getInt(1);
                tab.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TaskPage.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    void setJcomboBox()
    {
        try {
            SelectionID.removeAllItems();
            SelectionID.addItem("Select Refer ID");
            String sql="select ID from tasks ORDER BY `date` DESC ;";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);
            while(rss.next())
            {
                SelectionID.addItem(rss.getString(1));
            }
            
        } catch (SQLException ex) {
            System.err.println(ex);
        } 
    }

    
    public void setColor(JLabel lb)
    {
        lb.setBackground(new Color(12,20,104));
    }
    
    public void resetColor(JLabel lb)
    {
        lb.setBackground(new Color(102,102,102));
    }
    
    public void setColorWhite(JLabel lb)
    {
        lb.setBackground(new Color(255,255,255));
    }
    
    public void setColorBrown(JLabel lb)
    {
        lb.setBackground(new Color(41,19,45));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TaskPage_UpPanal = new javax.swing.JPanel();
        Hide_Pan = new javax.swing.JPanel();
        Completed = new javax.swing.JLabel();
        View_Task = new javax.swing.JLabel();
        Edit_Task = new javax.swing.JLabel();
        New_Task = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Dynamic_Contanier = new javax.swing.JPanel();
        Mover = new javax.swing.JLabel();
        display = new javax.swing.JPanel();
        page1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        head1 = new javax.swing.JLabel();
        Title = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        dis = new javax.swing.JTextArea();
        SaveBtn1 = new javax.swing.JLabel();
        dateTimePicker1 = new com.github.lgooddatepicker.components.DateTimePicker();
        jLabel5 = new javax.swing.JLabel();
        page2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        head2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        page3 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        head3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        edit_dis = new javax.swing.JTextArea();
        edit_title = new javax.swing.JTextField();
        SaveBtn2 = new javax.swing.JLabel();
        SelectionID = new javax.swing.JComboBox<>();
        dateTimePicker2 = new com.github.lgooddatepicker.components.DateTimePicker();
        DeleteBtn = new javax.swing.JLabel();
        page4 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        head4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        comTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Empty = new javax.swing.JPanel();
        TaskPage_DownPic = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1253, 687));
        getContentPane().setLayout(null);

        TaskPage_UpPanal.setOpaque(false);

        Hide_Pan.setOpaque(false);
        Hide_Pan.setLayout(null);

        Completed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Completed.setText("Completed");
        Completed.setBackground(new java.awt.Color(102, 102, 102));
        Completed.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        Completed.setForeground(new java.awt.Color(240, 240, 240));
        Completed.setOpaque(true);
        Completed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompletedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CompletedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CompletedMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CompletedMouseReleased(evt);
            }
        });
        Hide_Pan.add(Completed);
        Completed.setBounds(10, 710, 190, 50);

        View_Task.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Task.setText("View Task");
        View_Task.setBackground(new java.awt.Color(102, 102, 102));
        View_Task.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        View_Task.setForeground(new java.awt.Color(240, 240, 240));
        View_Task.setOpaque(true);
        View_Task.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_TaskMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                View_TaskMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                View_TaskMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                View_TaskMouseReleased(evt);
            }
        });
        Hide_Pan.add(View_Task);
        View_Task.setBounds(10, 620, 190, 50);

        Edit_Task.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit_Task.setText("Edit Task");
        Edit_Task.setBackground(new java.awt.Color(102, 102, 102));
        Edit_Task.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        Edit_Task.setForeground(new java.awt.Color(240, 240, 240));
        Edit_Task.setOpaque(true);
        Edit_Task.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Edit_TaskMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Edit_TaskMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Edit_TaskMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Edit_TaskMouseReleased(evt);
            }
        });
        Hide_Pan.add(Edit_Task);
        Edit_Task.setBounds(10, 670, 190, 50);

        New_Task.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Task.setText("New Task");
        New_Task.setBackground(new java.awt.Color(102, 102, 102));
        New_Task.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        New_Task.setForeground(new java.awt.Color(240, 240, 240));
        New_Task.setOpaque(true);
        New_Task.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                New_TaskMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                New_TaskMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                New_TaskMouseReleased(evt);
            }
        });
        Hide_Pan.add(New_Task);
        New_Task.setBounds(10, 570, 190, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/CLS_30px.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        Hide_Pan.add(jLabel6);
        jLabel6.setBounds(10, 10, 30, 20);

        Dynamic_Contanier.setOpaque(false);

        Mover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Menu_20px.png"))); // NOI18N
        Mover.setBackground(new java.awt.Color(12, 20, 104));
        Mover.setOpaque(true);
        Mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MoverMouseReleased(evt);
            }
        });

        display.setOpaque(false);
        display.setLayout(new java.awt.CardLayout());

        page1.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(41, 19, 45));

        head1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head1.setText("Create New Task");
        head1.setBackground(new java.awt.Color(41, 19, 45));
        head1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        head1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head1, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        Title.setText("Tesk Title");
        Title.setBorder(null);
        Title.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 255, 0));
        Title.setOpaque(false);
        Title.setToolTipText("Tesk Title");
        Title.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TitleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TitleFocusLost(evt);
            }
        });

        jScrollPane1.setOpaque(false);

        dis.setColumns(20);
        dis.setRows(5);
        dis.setText("Discription");
        dis.setBackground(new java.awt.Color(41, 19, 45));
        dis.setForeground(new java.awt.Color(255, 255, 255));
        dis.setToolTipText("Discription");
        dis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                disFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                disFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(dis);

        SaveBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaveBtn1.setText("Save");
        SaveBtn1.setBackground(new java.awt.Color(41, 19, 45));
        SaveBtn1.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        SaveBtn1.setForeground(new java.awt.Color(51, 51, 255));
        SaveBtn1.setOpaque(true);
        SaveBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveBtn1MouseExited(evt);
            }
        });

        jLabel5.setText("Enter Date And Time");
        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout page1Layout = new javax.swing.GroupLayout(page1);
        page1.setLayout(page1Layout);
        page1Layout.setHorizontalGroup(
            page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page1Layout.createSequentialGroup()
                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(page1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(Title)
                            .addComponent(jSeparator1))
                        .addGap(84, 84, 84)
                        .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateTimePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page1Layout.createSequentialGroup()
                                .addComponent(SaveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))))
                .addContainerGap())
        );
        page1Layout.setVerticalGroup(
            page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTimePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SaveBtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        display.add(page1, "card2");

        page2.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(41, 19, 45));

        head2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head2.setText("View All Task");
        head2.setBackground(new java.awt.Color(41, 19, 45));
        head2.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        head2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head2, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "AB", "JA", "NA", null, null},
                {"2", "CD", "JA", "NA", null, null},
                {"3", "EF", "JA", "NA", null, null},
                {"4", "GH", "JA", "NA", null, null},
                {"5", "IJ", "JA", "NA", null, null},
                {"6", "KL", "JA", "NA", null, null},
                {"7", "MN", "JA", "NA", null, null},
                {"8", "OP", "JA", "NA", null, null},
                {"9", "QR", "JA", "NA", null, null},
                {"10", "ST", "JA", null, null, null}
            },
            new String [] {
                "Task Number", "Task Name", "Task Details", "Date", "Time", "Refer ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewTable.setBackground(new java.awt.Color(41, 19, 45));
        viewTable.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        viewTable.setForeground(new java.awt.Color(255, 255, 255));
        viewTable.setGridColor(new java.awt.Color(41, 19, 45));
        viewTable.setRowHeight(50);
        viewTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        viewTable.setSelectionForeground(new java.awt.Color(41, 19, 45));
        viewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(viewTable);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Click here to edit any Task.");
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout page2Layout = new javax.swing.GroupLayout(page2);
        page2.setLayout(page2Layout);
        page2Layout.setHorizontalGroup(
            page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page2Layout.createSequentialGroup()
                .addGroup(page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(page2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page2Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(294, 294, 294))
        );
        page2Layout.setVerticalGroup(
            page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        display.add(page2, "card3");

        page3.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(41, 19, 45));

        head3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head3.setText("Edit Task");
        head3.setBackground(new java.awt.Color(41, 19, 45));
        head3.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        head3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head3, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane3.setOpaque(false);

        edit_dis.setColumns(20);
        edit_dis.setRows(5);
        edit_dis.setText("Disccription");
        edit_dis.setBackground(new java.awt.Color(41, 19, 45));
        edit_dis.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(edit_dis);

        edit_title.setText("Tesk Title");
        edit_title.setBorder(null);
        edit_title.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        edit_title.setForeground(new java.awt.Color(0, 255, 0));
        edit_title.setOpaque(false);

        SaveBtn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaveBtn2.setText("Save");
        SaveBtn2.setBackground(new java.awt.Color(41, 19, 45));
        SaveBtn2.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        SaveBtn2.setForeground(new java.awt.Color(51, 51, 255));
        SaveBtn2.setOpaque(true);
        SaveBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveBtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveBtn2MouseExited(evt);
            }
        });

        SelectionID.setEditable(true);
        SelectionID.setMaximumRowCount(50);
        SelectionID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Refer ID", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        SelectionID.setBackground(new java.awt.Color(41, 19, 45));
        SelectionID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 19, 45)));
        SelectionID.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        SelectionID.setForeground(new java.awt.Color(0, 255, 0));
        SelectionID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SelectionIDItemStateChanged(evt);
            }
        });

        DeleteBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteBtn.setText("Delete");
        DeleteBtn.setBackground(new java.awt.Color(41, 19, 45));
        DeleteBtn.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(51, 51, 255));
        DeleteBtn.setOpaque(true);
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout page3Layout = new javax.swing.GroupLayout(page3);
        page3.setLayout(page3Layout);
        page3Layout.setHorizontalGroup(
            page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(page3Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page3Layout.createSequentialGroup()
                        .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_title)
                            .addComponent(jScrollPane3))
                        .addGap(84, 84, 84)
                        .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SelectionID, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SaveBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(page3Layout.createSequentialGroup()
                                .addComponent(dateTimePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(32, 32, 32))))
        );
        page3Layout.setVerticalGroup(
            page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(SelectionID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(edit_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(page3Layout.createSequentialGroup()
                        .addComponent(dateTimePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        display.add(page3, "card4");

        page4.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(41, 19, 45));

        head4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head4.setText("Completed Task");
        head4.setBackground(new java.awt.Color(41, 19, 45));
        head4.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        head4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head4, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(head4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        comTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "AB", "JA", "NA", null, null},
                {"2", "CD", "JA", "NA", null, null},
                {"3", "EF", "JA", "NA", null, null},
                {"4", "GH", "JA", "NA", null, null},
                {"5", "IJ", "JA", "NA", null, null},
                {"6", "KL", "JA", "NA", null, null},
                {"7", "MN", "JA", "NA", null, null},
                {"8", "OP", "JA", "NA", null, null},
                {"9", "QR", "JA", "NA", null, null},
                {"10", "ST", "JA", null, null, null}
            },
            new String [] {
                "Task Number", "Task Name", "Task Details", "Date", "Time", "refer ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        comTable.setBackground(new java.awt.Color(41, 19, 45));
        comTable.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        comTable.setForeground(new java.awt.Color(255, 255, 255));
        comTable.setGridColor(new java.awt.Color(41, 19, 45));
        comTable.setRowHeight(50);
        comTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        comTable.setSelectionForeground(new java.awt.Color(41, 19, 45));
        comTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(comTable);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Click here to Create new Task.");
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout page4Layout = new javax.swing.GroupLayout(page4);
        page4.setLayout(page4Layout);
        page4Layout.setHorizontalGroup(
            page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page4Layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(284, 284, 284)))
                .addContainerGap())
        );
        page4Layout.setVerticalGroup(
            page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        display.add(page4, "card5");

        Empty.setOpaque(false);

        javax.swing.GroupLayout EmptyLayout = new javax.swing.GroupLayout(Empty);
        Empty.setLayout(EmptyLayout);
        EmptyLayout.setHorizontalGroup(
            EmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1094, Short.MAX_VALUE)
        );
        EmptyLayout.setVerticalGroup(
            EmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );

        display.add(Empty, "card6");

        javax.swing.GroupLayout Dynamic_ContanierLayout = new javax.swing.GroupLayout(Dynamic_Contanier);
        Dynamic_Contanier.setLayout(Dynamic_ContanierLayout);
        Dynamic_ContanierLayout.setHorizontalGroup(
            Dynamic_ContanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dynamic_ContanierLayout.createSequentialGroup()
                .addComponent(Mover, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Dynamic_ContanierLayout.setVerticalGroup(
            Dynamic_ContanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dynamic_ContanierLayout.createSequentialGroup()
                .addComponent(Mover, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Dynamic_ContanierLayout.createSequentialGroup()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout TaskPage_UpPanalLayout = new javax.swing.GroupLayout(TaskPage_UpPanal);
        TaskPage_UpPanal.setLayout(TaskPage_UpPanalLayout);
        TaskPage_UpPanalLayout.setHorizontalGroup(
            TaskPage_UpPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaskPage_UpPanalLayout.createSequentialGroup()
                .addComponent(Hide_Pan, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Dynamic_Contanier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TaskPage_UpPanalLayout.setVerticalGroup(
            TaskPage_UpPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Hide_Pan, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Dynamic_Contanier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(TaskPage_UpPanal);
        TaskPage_UpPanal.setBounds(0, 0, 1360, 770);

        TaskPage_DownPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/taskPage.jpg"))); // NOI18N
        TaskPage_DownPic.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        TaskPage_DownPic.setIconTextGap(0);
        TaskPage_DownPic.setMaximumSize(new java.awt.Dimension(1797, 1006));
        TaskPage_DownPic.setMinimumSize(new java.awt.Dimension(1797, 1006));
        TaskPage_DownPic.setPreferredSize(new java.awt.Dimension(1797, 1006));
        getContentPane().add(TaskPage_DownPic);
        TaskPage_DownPic.setBounds(0, 0, 1380, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CompletedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompletedMouseEntered
        setColor(Completed);
    }//GEN-LAST:event_CompletedMouseEntered

    private void CompletedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompletedMouseExited
        resetColor(Completed);
    }//GEN-LAST:event_CompletedMouseExited

    private void View_TaskMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_TaskMouseEntered
        setColor(View_Task);
    }//GEN-LAST:event_View_TaskMouseEntered

    private void View_TaskMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_TaskMouseExited
        resetColor(View_Task);
    }//GEN-LAST:event_View_TaskMouseExited

    private void Edit_TaskMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_TaskMouseEntered
        setColor(Edit_Task);
    }//GEN-LAST:event_Edit_TaskMouseEntered

    private void Edit_TaskMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_TaskMouseExited
        resetColor(Edit_Task);
    }//GEN-LAST:event_Edit_TaskMouseExited

    private void MoverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMouseReleased
        if(noti % 2 == 0)
        {
            Hide_Pan.setVisible(false);
            noti++;
            Mover.setOpaque(true);
        }
        else
        {
            Hide_Pan.setVisible(true);
            noti++;
            Mover.setOpaque(false);
            ReAni();
        }
    }//GEN-LAST:event_MoverMouseReleased

    private void New_TaskMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_TaskMouseEntered
        setColor(New_Task);
    }//GEN-LAST:event_New_TaskMouseEntered

    private void New_TaskMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_TaskMouseExited
        resetColor(New_Task);
    }//GEN-LAST:event_New_TaskMouseExited

    private void New_TaskMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_TaskMouseReleased
        Empty.setVisible(false);
        page1.setVisible(true);
        page2.setVisible(false);
        page3.setVisible(false);
        page4.setVisible(false);
        
        Hide_Pan.setVisible(false);
        noti++;
    }//GEN-LAST:event_New_TaskMouseReleased

    private void View_TaskMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_TaskMouseReleased
        viewtableupdate();
        Empty.setVisible(false);
        page1.setVisible(false);
        page2.setVisible(true);
        page3.setVisible(false);
        page4.setVisible(false);
        
        Hide_Pan.setVisible(false);
        noti++;
    }//GEN-LAST:event_View_TaskMouseReleased

    private void Edit_TaskMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_TaskMouseReleased
        
    }//GEN-LAST:event_Edit_TaskMouseReleased

    private void CompletedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompletedMouseReleased
        compeletedtableupdate();
        Empty.setVisible(false);
        page1.setVisible(false);
        page2.setVisible(false);
        page3.setVisible(false);
        page4.setVisible(true);
        
        Hide_Pan.setVisible(false);
        noti++;
    }//GEN-LAST:event_CompletedMouseReleased

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        Empty.setVisible(false);
        page1.setVisible(false);
        page2.setVisible(false);
        page3.setVisible(true);
        page4.setVisible(false);
        
        Hide_Pan.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        Empty.setVisible(false);
        page1.setVisible(true);
        page2.setVisible(false);
        page3.setVisible(false);
        page4.setVisible(false);
        
        Hide_Pan.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseReleased

    private void TitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TitleFocusGained
        if("Tesk Title".equals(Title.getText())) Title.setText("");
    }//GEN-LAST:event_TitleFocusGained

    private void TitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TitleFocusLost
        if("".equals(Title.getText())) Title.setText("Tesk Title");
    }//GEN-LAST:event_TitleFocusLost

    private void disFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disFocusGained
        if("Discription".equals(dis.getText())) dis.setText("");
    }//GEN-LAST:event_disFocusGained

    private void disFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disFocusLost
        if("".equals(dis.getText())) dis.setText("Discription");
    }//GEN-LAST:event_disFocusLost

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Empty.setVisible(true);
        page1.setVisible(false);
        page2.setVisible(false);
        page3.setVisible(false);
        page4.setVisible(false);
        
        Hide_Pan.setVisible(false);
        noti ++ ; 
    }//GEN-LAST:event_jLabel6MouseClicked

    private void SaveBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtn1MouseEntered
        setColorWhite(SaveBtn1);
    }//GEN-LAST:event_SaveBtn1MouseEntered

    private void SaveBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtn1MouseExited
        setColorBrown(SaveBtn1);
    }//GEN-LAST:event_SaveBtn1MouseExited

    private void SaveBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtn2MouseEntered
        setColorWhite(SaveBtn2);
    }//GEN-LAST:event_SaveBtn2MouseEntered

    private void SaveBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtn2MouseExited
        setColorBrown(SaveBtn2);
    }//GEN-LAST:event_SaveBtn2MouseExited

    private void SaveBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtn1MouseClicked
        
        try {
            String dateselect = dateTimePicker1.getDatePicker().getDateStringOrEmptyString();
            String timeselect = dateTimePicker1.getTimePicker().getTimeStringOrEmptyString();
        
            String query = "INSERT INTO `database_central`.`tasks` (`ID`, `name`, `other`, `date`, `time`, `Completed`) VALUES (NULL, '"+Title.getText()+"', '"+dis.getText()+"', '"+dateselect+"', '"+timeselect+"', '1'); ";
            ps= c.prepareStatement(query);
            ps.executeUpdate();
            flag = true;
            JOptionPane.showMessageDialog(null, "Task Created");
            Title.setText("Tesk Title");
            dis.setText("Discription");
            viewtableupdate();
            Empty.setVisible(false);
            page1.setVisible(false);
            page2.setVisible(true);
            page3.setVisible(false);
            page4.setVisible(false);
        
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.err.println(ex);
            Logger.getLogger(TaskPage.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_SaveBtn1MouseClicked

    private void CompletedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompletedMouseClicked
        compeletedtableupdate();
    }//GEN-LAST:event_CompletedMouseClicked

    private void View_TaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_TaskMouseClicked
        viewtableupdate();
    }//GEN-LAST:event_View_TaskMouseClicked

    private void viewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTableMouseClicked
        if(evt.getClickCount() == 2)
        {
            int cnt = viewTable.getSelectedRowCount();
            if(cnt == 1)
            {
                int sel_col , sel_row ;
                sel_col = viewTable.getSelectedColumn();
                sel_row = viewTable.getSelectedRow();
                switch (sel_col) {
                    case 1:
                        JOptionPane.showMessageDialog(null, viewTable.getValueAt(sel_row, sel_col), "Name OF Task", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, viewTable.getValueAt(sel_row, sel_col), "Discription Of Task", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        int numpass = (int) viewTable.getValueAt(sel_row, 5);
                        
                        setJcomboBox();
                        try
                        {
                            String sql="select * from tasks WHERE ID = "+numpass+";";
                            st= c.createStatement();
                            ResultSet rss=st.executeQuery(sql);
                            while(rss.next())
                            {
                                SelectionID.setSelectedItem(rss.getInt(1));
                                edit_title.setText(rss.getString(2));
                                edit_dis.setText(rss.getString(3));
                                
                                Date dateee = rss.getDate(4);
                                Calendar cal = Calendar.getInstance();
                                cal.setTime(dateee);
                                int year = cal.get(Calendar.YEAR);
                                int month = cal.get(Calendar.MONTH);
                                month++;
                                int day = cal.get(Calendar.DAY_OF_MONTH);
                                LocalDate date = LocalDate.of(year, month, day) ;
                                dateTimePicker2.datePicker.setDate(date);//setdate

                                Time time = rss.getTime(5);
                                cal.setTime(time);
                                int h = cal.get(Calendar.HOUR_OF_DAY);
                                int m = cal.get(Calendar.MINUTE);
                                LocalTime ltime = LocalTime.of(h, m);
                                dateTimePicker2.timePicker.setTime(ltime);//settime
                            }
                        }
                        catch(SQLException e)
                        {
                            System.err.println(e.getMessage());
                        }
                        
                        
                        Empty.setVisible(false);
                        page1.setVisible(false);
                        page2.setVisible(false);
                        page3.setVisible(true);
                        page4.setVisible(false);

                        Hide_Pan.setVisible(false);
                                break; 
                }
            }
        }
    }//GEN-LAST:event_viewTableMouseClicked

    private void comTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comTableMouseClicked
        if(evt.getClickCount() == 2)
        {
            int cnt = comTable.getSelectedRowCount();
            if(cnt == 1)
            {
                int sel_col , sel_row ;
                sel_col = comTable.getSelectedColumn();
                sel_row = comTable.getSelectedRow();
                switch (sel_col) {
                    case 1:
                        JOptionPane.showMessageDialog(null, comTable.getValueAt(sel_row, sel_col), "Name OF Task", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, comTable.getValueAt(sel_row, sel_col), "Discription Of Task", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        int numpass = (int) comTable.getValueAt(sel_row, 5);
                        
                        setJcomboBox();
                        try
                        {
                            String sql="select * from tasks WHERE ID = "+numpass+";";
                            st= c.createStatement();
                            ResultSet rss=st.executeQuery(sql);
                            while(rss.next())
                            {
                                SelectionID.setSelectedItem(rss.getInt(1));
                                edit_title.setText(rss.getString(2));
                                edit_dis.setText(rss.getString(3));
                                
                                Date dateee = rss.getDate(4);
                                Calendar cal = Calendar.getInstance();
                                cal.setTime(dateee);
                                int year = cal.get(Calendar.YEAR);
                                int month = cal.get(Calendar.MONTH);
                                month++;
                                int day = cal.get(Calendar.DAY_OF_MONTH);
                                LocalDate date = LocalDate.of(year, month, day) ;
                                dateTimePicker2.datePicker.setDate(date);//setdate

                                Time time = rss.getTime(5);
                                cal.setTime(time);
                                int h = cal.get(Calendar.HOUR_OF_DAY);
                                int m = cal.get(Calendar.MINUTE);
                                LocalTime ltime = LocalTime.of(h, m);
                                dateTimePicker2.timePicker.setTime(ltime);//settime
                            }
                        }
                        catch(SQLException e)
                        {
                            System.err.println(e.getMessage());
                        }
                        
                        
                        Empty.setVisible(false);
                        page1.setVisible(false);
                        page2.setVisible(false);
                        page3.setVisible(true);
                        page4.setVisible(false);

                        Hide_Pan.setVisible(false);
                                break; 
                }
            }
        }
    }//GEN-LAST:event_comTableMouseClicked

    private void DeleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseEntered
        setColorWhite(DeleteBtn);
    }//GEN-LAST:event_DeleteBtnMouseEntered

    private void DeleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseExited
        setColorBrown(DeleteBtn);
    }//GEN-LAST:event_DeleteBtnMouseExited

    private void Edit_TaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_TaskMouseClicked
        setJcomboBox();
        
        Empty.setVisible(false);
        page1.setVisible(false);
        page2.setVisible(false);
        page3.setVisible(true);
        page4.setVisible(false);
        
        Hide_Pan.setVisible(false);
        noti++;
    }//GEN-LAST:event_Edit_TaskMouseClicked

    private void SelectionIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SelectionIDItemStateChanged
        int temp = SelectionID.getSelectedIndex();
        if(temp == 0)
        {
            edit_title.setText("Tesk Title");
            edit_dis.setText("Disccription");
        }
        else
        {
            try
            {
                String query = "SELECT * FROM tasks WHERE `ID`="+SelectionID.getSelectedItem()+";";
                st = c.createStatement();
                ResultSet rss = st.executeQuery(query);
                while(rss.next())
                {
                    edit_title.setText(rss.getString(2));//set title
                    edit_dis.setText(rss.getString(3));//set discription
                    
                    Date dateee = rss.getDate(4);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(dateee);
                    int year = cal.get(Calendar.YEAR);
                    int month = cal.get(Calendar.MONTH);
                    month++;
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    LocalDate date = LocalDate.of(year, month, day) ;
                    dateTimePicker2.datePicker.setDate(date);//setdate
                    
                    Time time = rss.getTime(5);
                    cal.setTime(time);
                    int h = cal.get(Calendar.HOUR_OF_DAY);
                    int m = cal.get(Calendar.MINUTE);
                    LocalTime ltime = LocalTime.of(h, m);
                    dateTimePicker2.timePicker.setTime(ltime);//settime
                    
                }
            }
            catch(SQLException ex)
            {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_SelectionIDItemStateChanged

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        int selection = SelectionID.getSelectedIndex();
        if(selection == 0)
        {
            JOptionPane.showMessageDialog(null, "Please select refer ID to delete");
        }
        else
        {
            int option = JOptionPane.showConfirmDialog(rootPane, "Delete It?");
            if(option == 0)
            {
                try {
                    String query = "DELETE FROM tasks WHERE `ID`="+SelectionID.getSelectedItem()+";";
                    ps = c.prepareStatement(query);
                    ps.executeUpdate();
                    flag =true;
                    JOptionPane.showMessageDialog(null, "Task Deleted");
                    viewtableupdate();
                    Empty.setVisible(false);
                    page1.setVisible(false);
                    page2.setVisible(true);
                    page3.setVisible(false);
                    page4.setVisible(false);
        
                } 
                catch (SQLException ex) {

                    System.err.println(ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void SaveBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtn2MouseClicked
        int selection = SelectionID.getSelectedIndex();
        if(selection == 0)
        {
            JOptionPane.showMessageDialog(null, "Please select refer ID to delete");
        }
        else
        {
            int option = JOptionPane.showConfirmDialog(rootPane, "Modify It?");
            if(option == 0)
            {
                try {
                    String dateselect = dateTimePicker2.getDatePicker().getDateStringOrEmptyString();
                    String timeselect = dateTimePicker2.getTimePicker().getTimeStringOrEmptyString();
                    String query = "UPDATE tasks SET `name`='"+edit_title.getText()+"',other='"+edit_dis.getText()+"',`date`='"+dateselect+"',`time`= '"+timeselect+"',`Completed`=1 WHERE `ID`="+SelectionID.getSelectedItem()+";";
                    ps = c.prepareStatement(query);
                    ps.executeUpdate();
                    flag = true;
                    JOptionPane.showMessageDialog(null, "Task Modified");
                    viewtableupdate();
                    Empty.setVisible(false);
                    page1.setVisible(false);
                    page2.setVisible(true);
                    page3.setVisible(false);
                    page4.setVisible(false);
        
                } 
                catch (SQLException ex) {

                    System.err.println(ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_SaveBtn2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Completed;
    private javax.swing.JLabel DeleteBtn;
    private javax.swing.JPanel Dynamic_Contanier;
    private javax.swing.JLabel Edit_Task;
    private javax.swing.JPanel Empty;
    private javax.swing.JPanel Hide_Pan;
    private javax.swing.JLabel Mover;
    private javax.swing.JLabel New_Task;
    private javax.swing.JLabel SaveBtn1;
    private javax.swing.JLabel SaveBtn2;
    private javax.swing.JComboBox<String> SelectionID;
    private javax.swing.JLabel TaskPage_DownPic;
    private javax.swing.JPanel TaskPage_UpPanal;
    private javax.swing.JTextField Title;
    private javax.swing.JLabel View_Task;
    private javax.swing.JTable comTable;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePicker1;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePicker2;
    private javax.swing.JTextArea dis;
    private javax.swing.JPanel display;
    private javax.swing.JTextArea edit_dis;
    private javax.swing.JTextField edit_title;
    private javax.swing.JLabel head1;
    private javax.swing.JLabel head2;
    private javax.swing.JLabel head3;
    private javax.swing.JLabel head4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel page1;
    private javax.swing.JPanel page2;
    private javax.swing.JPanel page3;
    private javax.swing.JPanel page4;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables
}
