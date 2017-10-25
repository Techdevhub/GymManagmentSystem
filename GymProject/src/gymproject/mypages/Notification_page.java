
package gymproject.mypages;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JPanel;


public class Notification_page extends javax.swing.JInternalFrame {

    
    public Notification_page() {
        initComponents();
        Toolkit tool = Toolkit.getDefaultToolkit();
            int x = (int) tool.getScreenSize().getWidth();
            int y = (int) tool.getScreenSize().getHeight();
            y-=30;
        this.setSize(x, y);
        page_first.setVisible(true);
        recent.setVisible(false);
        task.setVisible(false);
        fees.setVisible(false);
    }

    void setColor(JPanel lb)
    {
        lb.setBackground(new Color(48,118,232));
    }
    
    void resetColor(JPanel lb)
    {
        lb.setBackground(new Color(255,255,255));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        head = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        page_first = new javax.swing.JPanel();
        feebtn = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        taskbtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        recentbtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        recent = new javax.swing.JPanel();
        recentback = new javax.swing.JLabel();
        pann = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        rehead = new javax.swing.JLabel();
        rename = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        reDateHeadfee = new javax.swing.JLabel();
        redatefee = new javax.swing.JLabel();
        retimefee = new javax.swing.JLabel();
        retimeHeadfee = new javax.swing.JLabel();
        redisbtn = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        repaya = new javax.swing.JLabel();
        repay = new javax.swing.JLabel();
        resp = new javax.swing.JSeparator();
        pann2 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        rehead2 = new javax.swing.JLabel();
        rename2 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        reDateHeadfee2 = new javax.swing.JLabel();
        redatefee2 = new javax.swing.JLabel();
        retimefee2 = new javax.swing.JLabel();
        retimeHeadfee2 = new javax.swing.JLabel();
        redisbtn2 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        repaya2 = new javax.swing.JLabel();
        repay2 = new javax.swing.JLabel();
        resp2 = new javax.swing.JSeparator();
        pann1 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        rehead1 = new javax.swing.JLabel();
        rename1 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        reDateHeadfee1 = new javax.swing.JLabel();
        redatefee1 = new javax.swing.JLabel();
        retimefee1 = new javax.swing.JLabel();
        retimeHeadfee1 = new javax.swing.JLabel();
        redisbtn1 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        repaya1 = new javax.swing.JLabel();
        repay1 = new javax.swing.JLabel();
        resp1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        task = new javax.swing.JPanel();
        taskback = new javax.swing.JLabel();
        titlepan = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        titleHead = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        DateHead = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        timeHead = new javax.swing.JLabel();
        disbtn = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        disHead = new javax.swing.JLabel();
        dis = new javax.swing.JLabel();
        spra = new javax.swing.JSeparator();
        morebtn = new javax.swing.JLabel();
        titlepan1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        titleHead1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        DateHead1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        timeHead1 = new javax.swing.JLabel();
        disbtn1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        disHead1 = new javax.swing.JLabel();
        dis1 = new javax.swing.JLabel();
        spra1 = new javax.swing.JSeparator();
        morebtn1 = new javax.swing.JLabel();
        titlepan2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        titleHead2 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        DateHead2 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        time2 = new javax.swing.JLabel();
        timeHead2 = new javax.swing.JLabel();
        disbtn2 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        disHead2 = new javax.swing.JLabel();
        dis2 = new javax.swing.JLabel();
        spra2 = new javax.swing.JSeparator();
        morebtn2 = new javax.swing.JLabel();
        nexttask = new javax.swing.JButton();
        fees = new javax.swing.JPanel();
        feesback = new javax.swing.JLabel();
        feepan = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        namehead = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        DateHeadfee = new javax.swing.JLabel();
        datefee = new javax.swing.JLabel();
        timefee = new javax.swing.JLabel();
        timeHeadfee = new javax.swing.JLabel();
        disbtn3 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        paya = new javax.swing.JLabel();
        pay = new javax.swing.JLabel();
        sp = new javax.swing.JSeparator();
        feepan1 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        namehead1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        DateHeadfee1 = new javax.swing.JLabel();
        datefee1 = new javax.swing.JLabel();
        timefee1 = new javax.swing.JLabel();
        timeHeadfee1 = new javax.swing.JLabel();
        disbtn4 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        paya1 = new javax.swing.JLabel();
        pay1 = new javax.swing.JLabel();
        sp1 = new javax.swing.JSeparator();
        feepan2 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        namehead2 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        DateHeadfee2 = new javax.swing.JLabel();
        datefee2 = new javax.swing.JLabel();
        timefee2 = new javax.swing.JLabel();
        timeHeadfee2 = new javax.swing.JLabel();
        disbtn5 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        paya2 = new javax.swing.JLabel();
        pay2 = new javax.swing.JLabel();
        sp2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(48, 118, 232));

        head.setBackground(new java.awt.Color(48, 118, 232));
        head.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        head.setForeground(new java.awt.Color(255, 255, 255));
        head.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/NotiImg/Notification_50px_3.png"))); // NOI18N
        head.setText("Notification");
        head.setIconTextGap(20);

        jLabel1.setBackground(new java.awt.Color(48, 118, 232));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Get Notification Details now");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(541, 541, 541)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.CardLayout());

        page_first.setBackground(new java.awt.Color(255, 255, 255));

        feebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 118, 232), 2, true));
        feebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feebtnMouseClicked(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/NotiImg/Customs_64px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(48, 118, 232));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Fee Notification");

        javax.swing.GroupLayout feebtnLayout = new javax.swing.GroupLayout(feebtn);
        feebtn.setLayout(feebtnLayout);
        feebtnLayout.setHorizontalGroup(
            feebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feebtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(feebtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        feebtnLayout.setVerticalGroup(
            feebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feebtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        taskbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 118, 232), 2, true));
        taskbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taskbtnMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/NotiImg/System Task_52px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(48, 118, 232));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Task");

        javax.swing.GroupLayout taskbtnLayout = new javax.swing.GroupLayout(taskbtn);
        taskbtn.setLayout(taskbtnLayout);
        taskbtnLayout.setHorizontalGroup(
            taskbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskbtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(taskbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        taskbtnLayout.setVerticalGroup(
            taskbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        recentbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 118, 232), 2, true));
        recentbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recentbtnMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/NotiImg/Recent Actors_50px_1.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(48, 118, 232));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Recent");

        javax.swing.GroupLayout recentbtnLayout = new javax.swing.GroupLayout(recentbtn);
        recentbtn.setLayout(recentbtnLayout);
        recentbtnLayout.setHorizontalGroup(
            recentbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentbtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(recentbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        recentbtnLayout.setVerticalGroup(
            recentbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout page_firstLayout = new javax.swing.GroupLayout(page_first);
        page_first.setLayout(page_firstLayout);
        page_firstLayout.setHorizontalGroup(
            page_firstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page_firstLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(recentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(taskbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(feebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        page_firstLayout.setVerticalGroup(
            page_firstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page_firstLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(page_firstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taskbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jPanel7.add(page_first, "card2");

        recent.setBackground(new java.awt.Color(255, 255, 255));

        recentback.setBackground(new java.awt.Color(255, 255, 255));
        recentback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        recentback.setForeground(new java.awt.Color(48, 118, 232));
        recentback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recentback.setText("BACK");
        recentback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 118, 232), 1, true));
        recentback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recentbackMouseClicked(evt);
            }
        });

        pann.setBackground(new java.awt.Color(255, 255, 255));

        jPanel17.setBackground(new java.awt.Color(48, 118, 232));

        rehead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rehead.setForeground(new java.awt.Color(255, 255, 255));
        rehead.setText("Name:-");

        rename.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rename.setForeground(new java.awt.Color(51, 255, 51));

        reDateHeadfee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reDateHeadfee.setForeground(new java.awt.Color(255, 255, 255));
        reDateHeadfee.setText("Date:-");

        redatefee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        redatefee.setForeground(new java.awt.Color(255, 0, 0));

        retimefee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        retimefee.setForeground(new java.awt.Color(255, 0, 0));

        retimeHeadfee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        retimeHeadfee.setForeground(new java.awt.Color(255, 255, 255));
        retimeHeadfee.setText("Time:-");

        redisbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        redisbtn.setForeground(new java.awt.Color(204, 204, 255));
        redisbtn.setText("View Payment");
        redisbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redisbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator19)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(reDateHeadfee, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redatefee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(retimeHeadfee, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retimefee, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rehead, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redisbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jSeparator20))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rehead, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rename, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redatefee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reDateHeadfee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retimefee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retimeHeadfee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(redisbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        repaya.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        repaya.setForeground(new java.awt.Color(255, 255, 255));
        repaya.setText("Pay Amount:-");

        repay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        repay.setForeground(new java.awt.Color(51, 255, 51));

        resp.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout pannLayout = new javax.swing.GroupLayout(pann);
        pann.setLayout(pannLayout);
        pannLayout.setHorizontalGroup(
            pannLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(repay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resp)
                    .addGroup(pannLayout.createSequentialGroup()
                        .addComponent(repaya)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pannLayout.setVerticalGroup(
            pannLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(repaya, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resp, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pann2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBackground(new java.awt.Color(48, 118, 232));

        rehead2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rehead2.setForeground(new java.awt.Color(255, 255, 255));
        rehead2.setText("Name:-");

        rename2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rename2.setForeground(new java.awt.Color(51, 255, 51));

        reDateHeadfee2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reDateHeadfee2.setForeground(new java.awt.Color(255, 255, 255));
        reDateHeadfee2.setText("Date:-");

        redatefee2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        redatefee2.setForeground(new java.awt.Color(255, 0, 0));

        retimefee2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        retimefee2.setForeground(new java.awt.Color(255, 0, 0));

        retimeHeadfee2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        retimeHeadfee2.setForeground(new java.awt.Color(255, 255, 255));
        retimeHeadfee2.setText("Time:-");

        redisbtn2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        redisbtn2.setForeground(new java.awt.Color(204, 204, 255));
        redisbtn2.setText("View Payment");
        redisbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redisbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rename2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator22)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(reDateHeadfee2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redatefee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(retimeHeadfee2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retimefee2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rehead2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redisbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jSeparator23))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rehead2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rename2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redatefee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reDateHeadfee2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retimefee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retimeHeadfee2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(redisbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        repaya2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        repaya2.setForeground(new java.awt.Color(255, 255, 255));
        repaya2.setText("Pay Amount:-");

        repay2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        repay2.setForeground(new java.awt.Color(51, 255, 51));

        resp2.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout pann2Layout = new javax.swing.GroupLayout(pann2);
        pann2.setLayout(pann2Layout);
        pann2Layout.setHorizontalGroup(
            pann2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pann2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(repay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resp2)
                    .addGroup(pann2Layout.createSequentialGroup()
                        .addComponent(repaya2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pann2Layout.setVerticalGroup(
            pann2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(repaya2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repay2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resp2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pann1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBackground(new java.awt.Color(48, 118, 232));

        rehead1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rehead1.setForeground(new java.awt.Color(255, 255, 255));
        rehead1.setText("Title:-");

        rename1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rename1.setForeground(new java.awt.Color(51, 255, 51));

        reDateHeadfee1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reDateHeadfee1.setForeground(new java.awt.Color(255, 255, 255));
        reDateHeadfee1.setText("Date:-");

        redatefee1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        redatefee1.setForeground(new java.awt.Color(255, 0, 0));

        retimefee1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        retimefee1.setForeground(new java.awt.Color(255, 0, 0));

        retimeHeadfee1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        retimeHeadfee1.setForeground(new java.awt.Color(255, 255, 255));
        retimeHeadfee1.setText("Time:-");

        redisbtn1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        redisbtn1.setForeground(new java.awt.Color(204, 204, 255));
        redisbtn1.setText("View Discription");
        redisbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redisbtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rename1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator25)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(reDateHeadfee1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redatefee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(retimeHeadfee1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retimefee1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rehead1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redisbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jSeparator26))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rehead1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rename1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redatefee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reDateHeadfee1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retimefee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retimeHeadfee1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(redisbtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        repaya1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        repaya1.setForeground(new java.awt.Color(255, 255, 255));
        repaya1.setText("Discription:-");

        repay1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        repay1.setForeground(new java.awt.Color(51, 255, 51));

        resp1.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout pann1Layout = new javax.swing.GroupLayout(pann1);
        pann1.setLayout(pann1Layout);
        pann1Layout.setHorizontalGroup(
            pann1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pann1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(repay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pann1Layout.createSequentialGroup()
                        .addComponent(repaya1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(resp1))
                .addContainerGap())
        );
        pann1Layout.setVerticalGroup(
            pann1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pann1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(repaya1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repay1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resp1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(48, 118, 232));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/NotiImg/Chevron Right_52px.png"))); // NOI18N

        javax.swing.GroupLayout recentLayout = new javax.swing.GroupLayout(recent);
        recent.setLayout(recentLayout);
        recentLayout.setHorizontalGroup(
            recentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentLayout.createSequentialGroup()
                .addComponent(recentback, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(pann, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(pann1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(pann2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jButton2))
        );
        recentLayout.setVerticalGroup(
            recentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recentLayout.createSequentialGroup()
                .addGap(0, 333, Short.MAX_VALUE)
                .addComponent(recentback, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(recentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pann1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pann2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pann, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.add(recent, "card3");

        task.setBackground(new java.awt.Color(255, 255, 255));

        taskback.setBackground(new java.awt.Color(255, 255, 255));
        taskback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        taskback.setForeground(new java.awt.Color(48, 118, 232));
        taskback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taskback.setText("BACK");
        taskback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 118, 232), 1, true));
        taskback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taskbackMouseClicked(evt);
            }
        });

        titlepan.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(48, 118, 232));

        titleHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleHead.setForeground(new java.awt.Color(255, 255, 255));
        titleHead.setText("Title:-");

        title.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        title.setForeground(new java.awt.Color(51, 255, 51));

        DateHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DateHead.setForeground(new java.awt.Color(255, 255, 255));
        DateHead.setText("Date:-");

        date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        date.setForeground(new java.awt.Color(255, 0, 0));

        time.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        time.setForeground(new java.awt.Color(255, 0, 0));

        timeHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeHead.setForeground(new java.awt.Color(255, 255, 255));
        timeHead.setText("Time:-");

        disbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        disbtn.setForeground(new java.awt.Color(204, 204, 255));
        disbtn.setText("View Discription");
        disbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(DateHead, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(timeHead, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleHead, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleHead, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateHead))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeHead))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        disHead.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        disHead.setForeground(new java.awt.Color(255, 255, 255));
        disHead.setText("Discription:-");

        dis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dis.setForeground(new java.awt.Color(51, 255, 51));

        spra.setForeground(new java.awt.Color(51, 255, 51));

        morebtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        morebtn.setForeground(new java.awt.Color(51, 255, 255));
        morebtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        morebtn.setText("More..");

        javax.swing.GroupLayout titlepanLayout = new javax.swing.GroupLayout(titlepan);
        titlepan.setLayout(titlepanLayout);
        titlepanLayout.setHorizontalGroup(
            titlepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(titlepanLayout.createSequentialGroup()
                        .addComponent(disHead, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spra)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlepanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(morebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        titlepanLayout.setVerticalGroup(
            titlepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disHead, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dis, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(morebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        titlepan1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(48, 118, 232));

        titleHead1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleHead1.setForeground(new java.awt.Color(255, 255, 255));
        titleHead1.setText("Title:-");

        title1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        title1.setForeground(new java.awt.Color(51, 255, 51));

        DateHead1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DateHead1.setForeground(new java.awt.Color(255, 255, 255));
        DateHead1.setText("Date:-");

        date1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 0, 0));

        time1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 0, 0));

        timeHead1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeHead1.setForeground(new java.awt.Color(255, 255, 255));
        timeHead1.setText("Time:-");

        disbtn1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        disbtn1.setForeground(new java.awt.Color(204, 204, 255));
        disbtn1.setText("View Discription");
        disbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disbtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(DateHead1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(timeHead1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleHead1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jSeparator5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleHead1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateHead1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeHead1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disbtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        disHead1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        disHead1.setForeground(new java.awt.Color(255, 255, 255));
        disHead1.setText("Discription:-");

        dis1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dis1.setForeground(new java.awt.Color(51, 255, 51));

        spra1.setForeground(new java.awt.Color(51, 255, 51));

        morebtn1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        morebtn1.setForeground(new java.awt.Color(51, 255, 255));
        morebtn1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        morebtn1.setText("More..");

        javax.swing.GroupLayout titlepan1Layout = new javax.swing.GroupLayout(titlepan1);
        titlepan1.setLayout(titlepan1Layout);
        titlepan1Layout.setHorizontalGroup(
            titlepan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepan1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlepan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(titlepan1Layout.createSequentialGroup()
                        .addComponent(disHead1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spra1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlepan1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(morebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        titlepan1Layout.setVerticalGroup(
            titlepan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disHead1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dis1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spra1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(morebtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        titlepan2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(48, 118, 232));

        titleHead2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleHead2.setForeground(new java.awt.Color(255, 255, 255));
        titleHead2.setText("Title:-");

        title2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        title2.setForeground(new java.awt.Color(51, 255, 51));

        DateHead2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DateHead2.setForeground(new java.awt.Color(255, 255, 255));
        DateHead2.setText("Date:-");

        date2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        date2.setForeground(new java.awt.Color(255, 0, 0));

        time2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        time2.setForeground(new java.awt.Color(255, 0, 0));

        timeHead2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeHead2.setForeground(new java.awt.Color(255, 255, 255));
        timeHead2.setText("Time:-");

        disbtn2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        disbtn2.setForeground(new java.awt.Color(204, 204, 255));
        disbtn2.setText("View Discription");
        disbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator7)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(DateHead2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(timeHead2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleHead2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jSeparator8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleHead2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateHead2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeHead2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        disHead2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        disHead2.setForeground(new java.awt.Color(255, 255, 255));
        disHead2.setText("Discription:-");

        dis2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dis2.setForeground(new java.awt.Color(51, 255, 51));

        spra2.setForeground(new java.awt.Color(51, 255, 51));

        morebtn2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        morebtn2.setForeground(new java.awt.Color(51, 255, 255));
        morebtn2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        morebtn2.setText("More..");

        javax.swing.GroupLayout titlepan2Layout = new javax.swing.GroupLayout(titlepan2);
        titlepan2.setLayout(titlepan2Layout);
        titlepan2Layout.setHorizontalGroup(
            titlepan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepan2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlepan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dis2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(titlepan2Layout.createSequentialGroup()
                        .addComponent(disHead2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spra2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlepan2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(morebtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        titlepan2Layout.setVerticalGroup(
            titlepan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlepan2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disHead2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dis2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spra2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(morebtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        nexttask.setBackground(new java.awt.Color(48, 118, 232));
        nexttask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/NotiImg/Chevron Right_52px.png"))); // NOI18N
        nexttask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nexttaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout taskLayout = new javax.swing.GroupLayout(task);
        task.setLayout(taskLayout);
        taskLayout.setHorizontalGroup(
            taskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskLayout.createSequentialGroup()
                .addComponent(taskback, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(titlepan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(titlepan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(titlepan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(nexttask))
        );
        taskLayout.setVerticalGroup(
            taskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nexttask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(taskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(taskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, taskLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(taskback, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(taskLayout.createSequentialGroup()
                        .addGroup(taskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(titlepan2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titlepan1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titlepan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(21, Short.MAX_VALUE))))
        );

        jPanel7.add(task, "card4");

        fees.setBackground(new java.awt.Color(255, 255, 255));

        feesback.setBackground(new java.awt.Color(255, 255, 255));
        feesback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        feesback.setForeground(new java.awt.Color(48, 118, 232));
        feesback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        feesback.setText("BACK");
        feesback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 118, 232), 1, true));
        feesback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feesbackMouseClicked(evt);
            }
        });

        feepan.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(48, 118, 232));

        namehead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namehead.setForeground(new java.awt.Color(255, 255, 255));
        namehead.setText("Name:-");

        name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(51, 255, 51));

        DateHeadfee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DateHeadfee.setForeground(new java.awt.Color(255, 255, 255));
        DateHeadfee.setText("Date:-");

        datefee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        datefee.setForeground(new java.awt.Color(255, 0, 0));

        timefee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timefee.setForeground(new java.awt.Color(255, 0, 0));

        timeHeadfee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeHeadfee.setForeground(new java.awt.Color(255, 255, 255));
        timeHeadfee.setText("Time:-");

        disbtn3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        disbtn3.setForeground(new java.awt.Color(204, 204, 255));
        disbtn3.setText("View Payment");
        disbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disbtn3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator10)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(DateHeadfee, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datefee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(timeHeadfee, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timefee, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namehead, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jSeparator11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namehead, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datefee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateHeadfee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timefee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeHeadfee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disbtn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        paya.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paya.setForeground(new java.awt.Color(255, 255, 255));
        paya.setText("Pay Amount:-");

        pay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pay.setForeground(new java.awt.Color(51, 255, 51));

        sp.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout feepanLayout = new javax.swing.GroupLayout(feepan);
        feepan.setLayout(feepanLayout);
        feepanLayout.setHorizontalGroup(
            feepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feepanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(feepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp)
                    .addGroup(feepanLayout.createSequentialGroup()
                        .addComponent(paya)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        feepanLayout.setVerticalGroup(
            feepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feepanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paya, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        feepan1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(48, 118, 232));

        namehead1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namehead1.setForeground(new java.awt.Color(255, 255, 255));
        namehead1.setText("Name:-");

        name1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name1.setForeground(new java.awt.Color(51, 255, 51));

        DateHeadfee1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DateHeadfee1.setForeground(new java.awt.Color(255, 255, 255));
        DateHeadfee1.setText("Date:-");

        datefee1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        datefee1.setForeground(new java.awt.Color(255, 0, 0));

        timefee1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timefee1.setForeground(new java.awt.Color(255, 0, 0));

        timeHeadfee1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeHeadfee1.setForeground(new java.awt.Color(255, 255, 255));
        timeHeadfee1.setText("Time:-");

        disbtn4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        disbtn4.setForeground(new java.awt.Color(204, 204, 255));
        disbtn4.setText("View Payment");
        disbtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disbtn4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator13)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(DateHeadfee1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datefee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(timeHeadfee1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timefee1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namehead1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disbtn4, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jSeparator14))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namehead1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datefee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateHeadfee1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timefee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeHeadfee1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disbtn4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        paya1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paya1.setForeground(new java.awt.Color(255, 255, 255));
        paya1.setText("Pay Amount:-");

        pay1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pay1.setForeground(new java.awt.Color(51, 255, 51));

        sp1.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout feepan1Layout = new javax.swing.GroupLayout(feepan1);
        feepan1.setLayout(feepan1Layout);
        feepan1Layout.setHorizontalGroup(
            feepan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feepan1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(feepan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp1)
                    .addGroup(feepan1Layout.createSequentialGroup()
                        .addComponent(paya1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        feepan1Layout.setVerticalGroup(
            feepan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feepan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paya1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pay1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        feepan2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(48, 118, 232));

        namehead2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namehead2.setForeground(new java.awt.Color(255, 255, 255));
        namehead2.setText("Name:-");

        name2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name2.setForeground(new java.awt.Color(51, 255, 51));

        DateHeadfee2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DateHeadfee2.setForeground(new java.awt.Color(255, 255, 255));
        DateHeadfee2.setText("Date:-");

        datefee2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        datefee2.setForeground(new java.awt.Color(255, 0, 0));

        timefee2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timefee2.setForeground(new java.awt.Color(255, 0, 0));

        timeHeadfee2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeHeadfee2.setForeground(new java.awt.Color(255, 255, 255));
        timeHeadfee2.setText("Time:-");

        disbtn5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        disbtn5.setForeground(new java.awt.Color(204, 204, 255));
        disbtn5.setText("View Payment");
        disbtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disbtn5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator16)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(DateHeadfee2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datefee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(timeHeadfee2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timefee2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namehead2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disbtn5, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jSeparator17))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namehead2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datefee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateHeadfee2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timefee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeHeadfee2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disbtn5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        paya2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paya2.setForeground(new java.awt.Color(255, 255, 255));
        paya2.setText("Pay Amount:-");

        pay2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pay2.setForeground(new java.awt.Color(51, 255, 51));

        sp2.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout feepan2Layout = new javax.swing.GroupLayout(feepan2);
        feepan2.setLayout(feepan2Layout);
        feepan2Layout.setHorizontalGroup(
            feepan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feepan2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(feepan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp2)
                    .addGroup(feepan2Layout.createSequentialGroup()
                        .addComponent(paya2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        feepan2Layout.setVerticalGroup(
            feepan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feepan2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paya2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pay2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(48, 118, 232));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/NotiImg/Chevron Right_52px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout feesLayout = new javax.swing.GroupLayout(fees);
        fees.setLayout(feesLayout);
        feesLayout.setHorizontalGroup(
            feesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feesLayout.createSequentialGroup()
                .addGroup(feesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feesback, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(feesLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(feepan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110)
                .addComponent(feepan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(feepan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        feesLayout.setVerticalGroup(
            feesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feesLayout.createSequentialGroup()
                .addGap(0, 337, Short.MAX_VALUE)
                .addComponent(feesback, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(feesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(feesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(feepan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(feepan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(feepan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.add(fees, "card5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void taskbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskbtnMouseClicked
        head.setText("Task Notification");
        resetColor(titlepan);
        resetColor(titlepan1);
        resetColor(titlepan2);
        
        disHead.setVisible(false);
        disHead1.setVisible(false);
        disHead2.setVisible(false);
        
        dis.setVisible(false);
        dis1.setVisible(false);
        dis2.setVisible(false);
        
        morebtn.setVisible(false);
        morebtn1.setVisible(false);
        morebtn2.setVisible(false);
        
        spra.setVisible(false);
        spra1.setVisible(false);
        spra2.setVisible(false);
        
        page_first.setVisible(false);
        recent.setVisible(false);
        task.setVisible(true);
        fees.setVisible(false);
    }//GEN-LAST:event_taskbtnMouseClicked

    private void recentbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recentbtnMouseClicked
        head.setText("Recent Notification");
        
        resetColor(pann);
        resetColor(pann1);
        resetColor(pann2);
        
        repaya.setVisible(false);
        repaya1.setVisible(false);
        repaya2.setVisible(false);
        
        repay.setVisible(false);
        repay1.setVisible(false);
        repay2.setVisible(false);
        
        resp.setVisible(false);
        resp1.setVisible(false);
        resp2.setVisible(false);
        
        page_first.setVisible(false);
        recent.setVisible(true);
        task.setVisible(false);
        fees.setVisible(false);
    }//GEN-LAST:event_recentbtnMouseClicked

    private void feebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feebtnMouseClicked
        head.setText("Fee Notification");
        resetColor(feepan);
        resetColor(feepan1);
        resetColor(feepan2);
        
        paya.setVisible(false);
        paya1.setVisible(false);
        paya2.setVisible(false);
        
        pay.setVisible(false);
        pay1.setVisible(false);
        pay2.setVisible(false);
        
        sp.setVisible(false);
        sp1.setVisible(false);
        sp2.setVisible(false);
        
        page_first.setVisible(false);
        recent.setVisible(false);
        task.setVisible(false);
        fees.setVisible(true);
    }//GEN-LAST:event_feebtnMouseClicked

    private void recentbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recentbackMouseClicked
        head.setText("Notification");
        page_first.setVisible(true);
        recent.setVisible(false);
        task.setVisible(false);
        fees.setVisible(false);
    }//GEN-LAST:event_recentbackMouseClicked

    private void taskbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskbackMouseClicked
        head.setText("Notification");
        page_first.setVisible(true);
        recent.setVisible(false);
        task.setVisible(false);
        fees.setVisible(false);
    }//GEN-LAST:event_taskbackMouseClicked

    private void feesbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesbackMouseClicked
        head.setText("Notification");
        page_first.setVisible(true);
        recent.setVisible(false);
        task.setVisible(false);
        fees.setVisible(false);
    }//GEN-LAST:event_feesbackMouseClicked

    private void nexttaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nexttaskActionPerformed
        resetColor(titlepan);
        resetColor(titlepan1);
        resetColor(titlepan2);
        
        disHead.setVisible(false);
        disHead1.setVisible(false);
        disHead2.setVisible(false);
        
        dis.setVisible(false);
        dis1.setVisible(false);
        dis2.setVisible(false);
        
        morebtn.setVisible(false);
        morebtn1.setVisible(false);
        morebtn2.setVisible(false);
        
        spra.setVisible(false);
        spra1.setVisible(false);
        spra2.setVisible(false);
    }//GEN-LAST:event_nexttaskActionPerformed

    private void disbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disbtnMouseClicked
        disHead.setVisible(true);
        dis.setVisible(true);
        morebtn.setVisible(true);
        spra.setVisible(true);
        setColor(titlepan);
    }//GEN-LAST:event_disbtnMouseClicked

    private void disbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disbtn1MouseClicked
        disHead1.setVisible(true);
        dis1.setVisible(true);
        morebtn1.setVisible(true);
        spra1.setVisible(true);
        setColor(titlepan1);
    }//GEN-LAST:event_disbtn1MouseClicked

    private void disbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disbtn2MouseClicked
        disHead2.setVisible(true);
        dis2.setVisible(true);
        morebtn2.setVisible(true);
        spra2.setVisible(true);
        setColor(titlepan2);
    }//GEN-LAST:event_disbtn2MouseClicked

    private void disbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disbtn3MouseClicked
        paya.setVisible(true);
        pay.setVisible(true);
        sp.setVisible(true);
        setColor(feepan);
    }//GEN-LAST:event_disbtn3MouseClicked

    private void disbtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disbtn4MouseClicked
        paya1.setVisible(true);
        pay1.setVisible(true);
        sp1.setVisible(true);
        setColor(feepan1);
    }//GEN-LAST:event_disbtn4MouseClicked

    private void disbtn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disbtn5MouseClicked
        paya2.setVisible(true);
        pay2.setVisible(true);
        sp2.setVisible(true);
        setColor(feepan2);
    }//GEN-LAST:event_disbtn5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        resetColor(feepan);
        resetColor(feepan1);
        resetColor(feepan2);
        
        paya.setVisible(false);
        paya1.setVisible(false);
        paya2.setVisible(false);
        
        pay.setVisible(false);
        pay1.setVisible(false);
        pay2.setVisible(false);
        
        sp.setVisible(false);
        sp1.setVisible(false);
        sp2.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void redisbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redisbtnMouseClicked
        repaya.setVisible(true);
        repay.setVisible(true);
        resp.setVisible(true);
        setColor(pann);
    }//GEN-LAST:event_redisbtnMouseClicked

    private void redisbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redisbtn1MouseClicked
        repaya1.setVisible(true);
        repay1.setVisible(true);
        resp1.setVisible(true);
        setColor(pann1);
    }//GEN-LAST:event_redisbtn1MouseClicked

    private void redisbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redisbtn2MouseClicked
        repaya2.setVisible(true);
        repay2.setVisible(true);
        resp2.setVisible(true);
        setColor(pann2);
    }//GEN-LAST:event_redisbtn2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateHead;
    private javax.swing.JLabel DateHead1;
    private javax.swing.JLabel DateHead2;
    private javax.swing.JLabel DateHeadfee;
    private javax.swing.JLabel DateHeadfee1;
    private javax.swing.JLabel DateHeadfee2;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel datefee;
    private javax.swing.JLabel datefee1;
    private javax.swing.JLabel datefee2;
    private javax.swing.JLabel dis;
    private javax.swing.JLabel dis1;
    private javax.swing.JLabel dis2;
    private javax.swing.JLabel disHead;
    private javax.swing.JLabel disHead1;
    private javax.swing.JLabel disHead2;
    private javax.swing.JLabel disbtn;
    private javax.swing.JLabel disbtn1;
    private javax.swing.JLabel disbtn2;
    private javax.swing.JLabel disbtn3;
    private javax.swing.JLabel disbtn4;
    private javax.swing.JLabel disbtn5;
    private javax.swing.JPanel feebtn;
    private javax.swing.JPanel feepan;
    private javax.swing.JPanel feepan1;
    private javax.swing.JPanel feepan2;
    private javax.swing.JPanel fees;
    private javax.swing.JLabel feesback;
    private javax.swing.JLabel head;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel morebtn;
    private javax.swing.JLabel morebtn1;
    private javax.swing.JLabel morebtn2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel namehead;
    private javax.swing.JLabel namehead1;
    private javax.swing.JLabel namehead2;
    private javax.swing.JButton nexttask;
    private javax.swing.JPanel page_first;
    private javax.swing.JPanel pann;
    private javax.swing.JPanel pann1;
    private javax.swing.JPanel pann2;
    private javax.swing.JLabel pay;
    private javax.swing.JLabel pay1;
    private javax.swing.JLabel pay2;
    private javax.swing.JLabel paya;
    private javax.swing.JLabel paya1;
    private javax.swing.JLabel paya2;
    private javax.swing.JLabel reDateHeadfee;
    private javax.swing.JLabel reDateHeadfee1;
    private javax.swing.JLabel reDateHeadfee2;
    private javax.swing.JPanel recent;
    private javax.swing.JLabel recentback;
    private javax.swing.JPanel recentbtn;
    private javax.swing.JLabel redatefee;
    private javax.swing.JLabel redatefee1;
    private javax.swing.JLabel redatefee2;
    private javax.swing.JLabel redisbtn;
    private javax.swing.JLabel redisbtn1;
    private javax.swing.JLabel redisbtn2;
    private javax.swing.JLabel rehead;
    private javax.swing.JLabel rehead1;
    private javax.swing.JLabel rehead2;
    private javax.swing.JLabel rename;
    private javax.swing.JLabel rename1;
    private javax.swing.JLabel rename2;
    private javax.swing.JLabel repay;
    private javax.swing.JLabel repay1;
    private javax.swing.JLabel repay2;
    private javax.swing.JLabel repaya;
    private javax.swing.JLabel repaya1;
    private javax.swing.JLabel repaya2;
    private javax.swing.JSeparator resp;
    private javax.swing.JSeparator resp1;
    private javax.swing.JSeparator resp2;
    private javax.swing.JLabel retimeHeadfee;
    private javax.swing.JLabel retimeHeadfee1;
    private javax.swing.JLabel retimeHeadfee2;
    private javax.swing.JLabel retimefee;
    private javax.swing.JLabel retimefee1;
    private javax.swing.JLabel retimefee2;
    private javax.swing.JSeparator sp;
    private javax.swing.JSeparator sp1;
    private javax.swing.JSeparator sp2;
    private javax.swing.JSeparator spra;
    private javax.swing.JSeparator spra1;
    private javax.swing.JSeparator spra2;
    private javax.swing.JPanel task;
    private javax.swing.JLabel taskback;
    private javax.swing.JPanel taskbtn;
    private javax.swing.JLabel time;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel time2;
    private javax.swing.JLabel timeHead;
    private javax.swing.JLabel timeHead1;
    private javax.swing.JLabel timeHead2;
    private javax.swing.JLabel timeHeadfee;
    private javax.swing.JLabel timeHeadfee1;
    private javax.swing.JLabel timeHeadfee2;
    private javax.swing.JLabel timefee;
    private javax.swing.JLabel timefee1;
    private javax.swing.JLabel timefee2;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel titleHead;
    private javax.swing.JLabel titleHead1;
    private javax.swing.JLabel titleHead2;
    private javax.swing.JPanel titlepan;
    private javax.swing.JPanel titlepan1;
    private javax.swing.JPanel titlepan2;
    // End of variables declaration//GEN-END:variables
}
