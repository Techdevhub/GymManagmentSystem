
package gymproject.mypages;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.JLabel;


public class TaskPage extends javax.swing.JInternalFrame {

    
    
    GridBagLayout layout = new GridBagLayout();
    AnimationClass AC = new AnimationClass();
    
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
    
    public void setColor(JLabel lb)
    {
        lb.setBackground(new Color(12,20,104));
    }
    
    public void resetColor(JLabel lb)
    {
        lb.setBackground(new Color(102,102,102));
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        page2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        head2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        page3 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        head3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        page4 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        head4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Empty = new javax.swing.JPanel();
        TaskPage_DownPic = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1253, 687));
        getContentPane().setLayout(null);

        TaskPage_UpPanal.setOpaque(false);

        Hide_Pan.setOpaque(false);
        Hide_Pan.setLayout(null);

        Completed.setBackground(new java.awt.Color(102, 102, 102));
        Completed.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        Completed.setForeground(new java.awt.Color(240, 240, 240));
        Completed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Completed.setText("Completed");
        Completed.setOpaque(true);
        Completed.addMouseListener(new java.awt.event.MouseAdapter() {
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

        View_Task.setBackground(new java.awt.Color(102, 102, 102));
        View_Task.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        View_Task.setForeground(new java.awt.Color(240, 240, 240));
        View_Task.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Task.setText("View Task");
        View_Task.setOpaque(true);
        View_Task.addMouseListener(new java.awt.event.MouseAdapter() {
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

        Edit_Task.setBackground(new java.awt.Color(102, 102, 102));
        Edit_Task.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        Edit_Task.setForeground(new java.awt.Color(240, 240, 240));
        Edit_Task.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit_Task.setText("Edit Task");
        Edit_Task.setOpaque(true);
        Edit_Task.addMouseListener(new java.awt.event.MouseAdapter() {
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

        New_Task.setBackground(new java.awt.Color(102, 102, 102));
        New_Task.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        New_Task.setForeground(new java.awt.Color(240, 240, 240));
        New_Task.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Task.setText("New Task");
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

        Dynamic_Contanier.setOpaque(false);

        Mover.setBackground(new java.awt.Color(12, 20, 104));
        Mover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Menu_20px.png"))); // NOI18N
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

        head1.setBackground(new java.awt.Color(41, 19, 45));
        head1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        head1.setForeground(new java.awt.Color(255, 255, 255));
        head1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head1.setText("Create New Task");

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

        Title.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 255, 0));
        Title.setText("Tesk Title");
        Title.setToolTipText("Tesk Title");
        Title.setBorder(null);
        Title.setOpaque(false);
        Title.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TitleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TitleFocusLost(evt);
            }
        });

        jScrollPane1.setOpaque(false);

        dis.setBackground(new java.awt.Color(41, 19, 45));
        dis.setColumns(20);
        dis.setForeground(new java.awt.Color(255, 255, 255));
        dis.setRows(5);
        dis.setText("Discription");
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

        jDateChooser1.setBackground(new java.awt.Color(41, 19, 45));
        jDateChooser1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(41, 19, 45));
        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Save");
        jLabel2.setOpaque(true);

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
                            .addComponent(Title)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1))
                        .addGap(103, 103, 103)
                        .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        page1Layout.setVerticalGroup(
            page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(page1Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        display.add(page1, "card2");

        page2.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(41, 19, 45));

        head2.setBackground(new java.awt.Color(41, 19, 45));
        head2.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        head2.setForeground(new java.awt.Color(255, 255, 255));
        head2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head2.setText("View All Task");

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

        jTable1.setBackground(new java.awt.Color(41, 19, 45));
        jTable1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "AB", "JA", "NA"},
                {"2", "CD", "JA", "NA"},
                {"3", "EF", "JA", "NA"},
                {"4", "GH", "JA", "NA"},
                {"5", "IJ", "JA", "NA"},
                {"6", "KL", "JA", "NA"},
                {"7", "MN", "JA", "NA"},
                {"8", "OP", "JA", "NA"},
                {"9", "QR", "JA", "NA"},
                {"10", "ST", "JA", null}
            },
            new String [] {
                "Task Number", "Task Name", "Task Details", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(41, 19, 45));
        jTable1.setRowHeight(50);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(41, 19, 45));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Click here to edit any Task.");
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        display.add(page2, "card3");

        page3.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(41, 19, 45));

        head3.setBackground(new java.awt.Color(41, 19, 45));
        head3.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        head3.setForeground(new java.awt.Color(255, 255, 255));
        head3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head3.setText("Edit Task");

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

        jTextArea2.setBackground(new java.awt.Color(41, 19, 45));
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("Disccription");
        jScrollPane3.setViewportView(jTextArea2);

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 255, 0));
        jTextField2.setText("Tesk Title");
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);

        jDateChooser2.setBackground(new java.awt.Color(41, 19, 45));
        jDateChooser2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(41, 19, 45));
        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Save");
        jLabel3.setOpaque(true);

        jComboBox1.setBackground(new java.awt.Color(41, 19, 45));
        jComboBox1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 255, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select To EDIT", "AB", "BC", "CD", "EF", "GH", "HI", "JH" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 19, 45)));

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
                            .addComponent(jTextField2)
                            .addComponent(jScrollPane3))
                        .addGap(103, 103, 103)
                        .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))))
        );
        page3Layout.setVerticalGroup(
            page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(page3Layout.createSequentialGroup()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        display.add(page3, "card4");

        page4.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(41, 19, 45));

        head4.setBackground(new java.awt.Color(41, 19, 45));
        head4.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        head4.setForeground(new java.awt.Color(255, 255, 255));
        head4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head4.setText("Completed Task");

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

        jTable2.setBackground(new java.awt.Color(41, 19, 45));
        jTable2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "AB", "JA", "NA"},
                {"2", "CD", "JA", "NA"},
                {"3", "EF", "JA", "NA"},
                {"4", "GH", "JA", "NA"},
                {"5", "IJ", "JA", "NA"},
                {"6", "KL", "JA", "NA"},
                {"7", "MN", "JA", "NA"},
                {"8", "OP", "JA", "NA"},
                {"9", "QR", "JA", "NA"},
                {"10", "ST", "JA", null}
            },
            new String [] {
                "Task Number", "Task Name", "Task Details", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(41, 19, 45));
        jTable2.setRowHeight(50);
        jTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable2.setSelectionForeground(new java.awt.Color(41, 19, 45));
        jScrollPane4.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Click here to Create new Task.");
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
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
        Empty.setVisible(false);
        page1.setVisible(false);
        page2.setVisible(true);
        page3.setVisible(false);
        page4.setVisible(false);
        
        Hide_Pan.setVisible(false);
        noti++;
    }//GEN-LAST:event_View_TaskMouseReleased

    private void Edit_TaskMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Edit_TaskMouseReleased
        Empty.setVisible(false);
        page1.setVisible(false);
        page2.setVisible(false);
        page3.setVisible(true);
        page4.setVisible(false);
        
        Hide_Pan.setVisible(false);
        noti++;
    }//GEN-LAST:event_Edit_TaskMouseReleased

    private void CompletedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompletedMouseReleased
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
        noti++;
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        Empty.setVisible(false);
        page1.setVisible(true);
        page2.setVisible(false);
        page3.setVisible(false);
        page4.setVisible(false);
        
        Hide_Pan.setVisible(false);
        noti++;
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Completed;
    private javax.swing.JPanel Dynamic_Contanier;
    private javax.swing.JLabel Edit_Task;
    private javax.swing.JPanel Empty;
    private javax.swing.JPanel Hide_Pan;
    private javax.swing.JLabel Mover;
    private javax.swing.JLabel New_Task;
    private javax.swing.JLabel TaskPage_DownPic;
    private javax.swing.JPanel TaskPage_UpPanal;
    private javax.swing.JTextField Title;
    private javax.swing.JLabel View_Task;
    private javax.swing.JTextArea dis;
    private javax.swing.JPanel display;
    private javax.swing.JLabel head1;
    private javax.swing.JLabel head2;
    private javax.swing.JLabel head3;
    private javax.swing.JLabel head4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel page1;
    private javax.swing.JPanel page2;
    private javax.swing.JPanel page3;
    private javax.swing.JPanel page4;
    // End of variables declaration//GEN-END:variables
}
