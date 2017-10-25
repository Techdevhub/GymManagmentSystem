
package gymproject;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;


public class Attendance_Paan extends javax.swing.JFrame {

    int xM;
    int yM;
    int selection_call = 0;
    
    boolean balance = true;
    
    
    public Attendance_Paan() {
        initComponents();
    }

    public void view()
    {
        selection_call = 0;
    }
    
    public void edit()
    {
        selection_call = 1;
    }
    
    void close()
    {
        this.dispose();
    }
    public void setColor1(JLabel lb)
    {
        lb.setBackground(new Color(240,240,240));
    }
    
    public void resetColor1(JLabel lb)
    {
        lb.setBackground(new Color(255,255,255));
    }
    public void setColor(JLabel lb)
    {
        lb.setBackground(new Color(255,0,0));
    }
    
    public void resetColor(JLabel lb)
    {
        lb.setBackground(new Color(255,255,255));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Panal = new javax.swing.JPanel();
        Up_panal = new javax.swing.JPanel();
        closss = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Down_Panal = new javax.swing.JPanel();
        View_Attendence = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Table_Pane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ID = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        Next = new javax.swing.JLabel();
        View_Time = new javax.swing.JPanel();
        Save = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Table_Pane1 = new javax.swing.JScrollPane();
        Time_table = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setOpacity(0.95F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        Main_Panal.setBackground(new java.awt.Color(255, 255, 255));

        Up_panal.setBackground(new java.awt.Color(255, 255, 255));

        closss.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 11, 109));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Attendance");
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

        Down_Panal.setBackground(new java.awt.Color(255, 255, 255));
        Down_Panal.setLayout(new java.awt.CardLayout());

        View_Attendence.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Gym ");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Images/Treadmill_20px.png"))); // NOI18N
        jLabel3.setText("Managment System");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Images/Settings_20px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 11, 109));
        jLabel5.setText("Scanner / Attendance..");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 11, 109));
        jLabel6.setText("View Attendance________________________________________");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Table_Pane.setBackground(new java.awt.Color(255, 255, 255));
        Table_Pane.setOpaque(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTable1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(36, 11, 109));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Amit", "2/5/96", "9865653268"},
                {"2", "Shubham", "8/4/96", "9465875632"},
                {"3", "Sagar", "26/9/96", "9854784565"},
                {"4", "Bipin", "29/12/92", "8462358753"},
                {"5", "Naresh", "6/8/98", "9865321470"},
                {"6", "Sanket", "9/8/96", "9865214352"},
                {"7", "Anurag", "7/8/96", "8564325875"},
                {"8", "Tripathi", "25/9/89", "7569841235"},
                {"9", "Aman", "15/8/99", "9464685532"},
                {"10", "Sanjay", "8/9/89", "7548462351"},
                {"11", "Binaye", "14/2/96", "8546231547"},
                {"12", "Kunal", "30/1/98", null}
            },
            new String [] {
                "ID", "Name", "DOB", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(35);
        jTable1.setRowMargin(3);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionForeground(new java.awt.Color(36, 11, 109));
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        Table_Pane.setViewportView(jTable1);

        Name.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        Name.setText("Enter Name");
        Name.setToolTipText("Enter Name");
        Name.setBorder(null);
        Name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameFocusLost(evt);
            }
        });

        ID.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        ID.setText("Enter Phone Number");
        ID.setToolTipText("Enter Phone Number");
        ID.setBorder(null);
        ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDFocusLost(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("OR");

        Next.setBackground(new java.awt.Color(255, 255, 255));
        Next.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        Next.setForeground(new java.awt.Color(102, 102, 102));
        Next.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Next.setText("Next");
        Next.setOpaque(true);
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NextMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NextMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout View_AttendenceLayout = new javax.swing.GroupLayout(View_Attendence);
        View_Attendence.setLayout(View_AttendenceLayout);
        View_AttendenceLayout.setHorizontalGroup(
            View_AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(View_AttendenceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(View_AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(View_AttendenceLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(View_AttendenceLayout.createSequentialGroup()
                        .addComponent(Table_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(View_AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(View_AttendenceLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(View_AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name)
                                    .addComponent(jSeparator1)
                                    .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(jSeparator2)))
                            .addGroup(View_AttendenceLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, View_AttendenceLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        View_AttendenceLayout.setVerticalGroup(
            View_AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_AttendenceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(View_AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(View_AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(View_AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(View_AttendenceLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Table_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(View_AttendenceLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Next)))
                .addContainerGap())
        );

        Down_Panal.add(View_Attendence, "card2");

        View_Time.setBackground(new java.awt.Color(255, 255, 255));

        Save.setBackground(new java.awt.Color(255, 255, 255));
        Save.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        Save.setForeground(new java.awt.Color(102, 102, 102));
        Save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Save.setText("Save");
        Save.setOpaque(true);
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SaveMouseReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Images/Treadmill_20px.png"))); // NOI18N
        jLabel8.setText("Managment System");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Gym ");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Images/Settings_20px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(36, 11, 109));
        jLabel11.setText("Scanner / Attendance..");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 21)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(36, 11, 109));
        jLabel12.setText("View Attendance________________________________________");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Table_Pane1.setBackground(new java.awt.Color(255, 255, 255));
        Table_Pane1.setOpaque(false);

        Time_table.setAutoCreateRowSorter(true);
        Time_table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Time_table.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Time_table.setForeground(new java.awt.Color(36, 11, 109));
        Time_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "05:30", "08:30"},
                {"2", "05:30", "08:30"},
                {"3", "05:30", "08:30"},
                {"4", "05:30", "08:30"},
                {"5", "05:30", "08:30"},
                {"6", "05:30", "08:30"},
                {"7", "05:30", "08:30"},
                {"8", "05:30", "08:30"},
                {"9", "05:30", "08:30"},
                {"10", "05:30", "08:30"},
                {"11", "05:30", "08:30"},
                {"12", "05:30", "08:30"},
                {"13", "05:30", "08:30"},
                {"14", "05:30", "08:30"},
                {"15", "18:50", "20:10"},
                {"16", "18:50", "20:10"},
                {"17", "18:50", "20:10"},
                {"18", "18:50", "20:10"},
                {"19", "18:50", "20:10"},
                {"20", "18:50", "20:10"},
                {"21", "18:50", "20:10"},
                {"22", "18:50", "20:10"},
                {"23", "18:50", "20:10"},
                {"24", "18:50", "20:10"},
                {"25", "18:50", "20:10"},
                {"26", "18:50", "20:10"},
                {"27", "18:50", "20:10"},
                {"28", "18:50", "20:10"},
                {"29", "19:25", "21:05"},
                {"30", "19:25", "21:05"}
            },
            new String [] {
                "Date", "Entry Time", "Exit time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Time_table.setGridColor(new java.awt.Color(255, 255, 255));
        Time_table.setRowHeight(35);
        Time_table.setRowMargin(3);
        Time_table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        Time_table.setSelectionForeground(new java.awt.Color(36, 11, 109));
        Time_table.setSurrendersFocusOnKeystroke(true);
        Time_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Time_tableMouseClicked(evt);
            }
        });
        Table_Pane1.setViewportView(Time_table);

        jComboBox1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Out", "Nov", "Dec" }));

        jComboBox2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("OR");

        javax.swing.GroupLayout View_TimeLayout = new javax.swing.GroupLayout(View_Time);
        View_Time.setLayout(View_TimeLayout);
        View_TimeLayout.setHorizontalGroup(
            View_TimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(View_TimeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(View_TimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(View_TimeLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(View_TimeLayout.createSequentialGroup()
                        .addComponent(Table_Pane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(View_TimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(View_TimeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(View_TimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, View_TimeLayout.createSequentialGroup()
                                        .addGap(0, 43, Short.MAX_VALUE)
                                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(View_TimeLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        View_TimeLayout.setVerticalGroup(
            View_TimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_TimeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(View_TimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(View_TimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(View_TimeLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Save))
                    .addGroup(View_TimeLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Table_Pane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(503, 503, 503))
        );

        Down_Panal.add(View_Time, "card3");

        javax.swing.GroupLayout Main_PanalLayout = new javax.swing.GroupLayout(Main_Panal);
        Main_Panal.setLayout(Main_PanalLayout);
        Main_PanalLayout.setHorizontalGroup(
            Main_PanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Up_panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Down_Panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Main_PanalLayout.setVerticalGroup(
            Main_PanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_PanalLayout.createSequentialGroup()
                .addComponent(Up_panal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Down_Panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_Panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_Panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(988, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void NextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseEntered
        setColor1(Next);
    }//GEN-LAST:event_NextMouseEntered

    private void NextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseExited
        resetColor1(Next);
    }//GEN-LAST:event_NextMouseExited

    private void Time_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Time_tableMouseClicked
        if(selection_call == 1)
        {
            int cnt = Time_table.getSelectedRowCount();
            if(cnt == 1)
            {
                int sel_col , sel_row, selInc ;
                String hrr , mii ;
                sel_col = Time_table.getSelectedColumn();

                if(sel_col == 1)
                {
                    sel_row = Time_table.getSelectedRow();
                    selInc = sel_row + 1;
                    hrr = JOptionPane.showInputDialog(null, "Enter Hour of date "+ selInc , "Enter Entry Time", INFORMATION_MESSAGE);
                    mii = JOptionPane.showInputDialog(null, "Enter min of date "+ selInc , "Enter Entry Time", INFORMATION_MESSAGE);

                    Time_table.setValueAt(hrr+":"+mii, sel_row, sel_col);
                }
                if(sel_col == 2)
                {
                    sel_row = Time_table.getSelectedRow();
                    selInc = sel_row + 1;
                    hrr = JOptionPane.showInputDialog(null, "Enter Hour of date "+ selInc , "Enter Exit Time", INFORMATION_MESSAGE);
                    mii = JOptionPane.showInputDialog(null, "Enter min of date "+ selInc , "Enter Exit Time", INFORMATION_MESSAGE);

                    Time_table.setValueAt(hrr+":"+mii, sel_row, sel_col);
                }
            }
        }
    }//GEN-LAST:event_Time_tableMouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseEntered
        setColor1(Save);
    }//GEN-LAST:event_SaveMouseEntered

    private void SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseExited
        resetColor1(Save);
    }//GEN-LAST:event_SaveMouseExited

    private void NextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseReleased
        View_Attendence.setVisible(false);
        View_Time.setVisible(true);
    }//GEN-LAST:event_NextMouseReleased

    private void SaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseReleased
        View_Attendence.setVisible(true);
        View_Time.setVisible(false);
    }//GEN-LAST:event_SaveMouseReleased

    private void NameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFocusGained
        if("Enter Name".equals(Name.getText())) Name.setText("");
    }//GEN-LAST:event_NameFocusGained

    private void NameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFocusLost
        if("".equals(Name.getText())) Name.setText("Enter Name");
    }//GEN-LAST:event_NameFocusLost

    private void IDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDFocusGained
        if("Enter Phone Number".equals(ID.getText())) ID.setText("");
    }//GEN-LAST:event_IDFocusGained

    private void IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDFocusLost
        if("".equals(ID.getText())) ID.setText("Enter Phone Number");
    }//GEN-LAST:event_IDFocusLost

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        if(balance==true) JOptionPane.showMessageDialog(null, "Please Close This Window First");
    }//GEN-LAST:event_formWindowDeactivated

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Attendance_Paan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance_Paan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance_Paan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance_Paan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance_Paan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Down_Panal;
    private javax.swing.JTextField ID;
    private javax.swing.JPanel Main_Panal;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Next;
    private javax.swing.JLabel Save;
    private javax.swing.JScrollPane Table_Pane;
    private javax.swing.JScrollPane Table_Pane1;
    private javax.swing.JTable Time_table;
    private javax.swing.JPanel Up_panal;
    private javax.swing.JPanel View_Attendence;
    private javax.swing.JPanel View_Time;
    private javax.swing.JLabel closss;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
