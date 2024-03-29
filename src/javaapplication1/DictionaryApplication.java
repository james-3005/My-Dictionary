/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import javax.swing.JOptionPane;

/**
 * @author Admin
 */
public class DictionaryApplication extends javax.swing.JFrame {
    public DictionaryCommandLine test = new DictionaryCommandLine();

    /**
     * Creates new form NewJFrame
     */
    public DictionaryApplication() {
        try {
            test.dictionaryManagement.insertFromFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();

    }

    public static void runApplication() {
        DictionaryApplication dictionaryApplication = new DictionaryApplication();
        dictionaryApplication.setLocation(475, 200);
        dictionaryApplication.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        botPanel = new javax.swing.JPanel();
        searchLabel = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        Mid = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        Lerftpanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        xemtatcatu = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        themsuatu = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        gioithieu = new javax.swing.JLabel();
        SearchPanel = new javax.swing.JPanel();
        vnpPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        soundLabel1 = new javax.swing.JLabel();
        vnField = new javax.swing.JLabel();
        headPanel = new javax.swing.JPanel();
        SwapLabel = new javax.swing.JLabel();
        engLabel = new javax.swing.JLabel();
        vnLabel = new javax.swing.JLabel();
        engPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        soundLabel = new javax.swing.JLabel();
        engFIeld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        prolabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favLabelMouseClicked(evt);
            }
        });

        headerPanel.setBackground(new java.awt.Color(131, 188, 243));
        headerPanel.setAlignmentX(0.0F);
        headerPanel.setAlignmentY(0.0F);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Image/icons8_google_translate_50px.png"))); // NOI18N
        titleLabel.setText("My Dictionary");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        botPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchLabel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        searchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Image/icons8_search_38px_1.png"))); // NOI18N
        searchLabel.setText("Tra Cứu");
        searchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchLabelMouseExited(evt);
            }
        });

        homeLabel.setBackground(new java.awt.Color(255, 255, 255));
        homeLabel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Image/icons8_home_38px.png"))); // NOI18N
        homeLabel.setText("Trang Chủ");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout botPanelLayout = new javax.swing.GroupLayout(botPanel);
        botPanel.setLayout(botPanelLayout);
        botPanelLayout.setHorizontalGroup(
            botPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botPanelLayout.createSequentialGroup()
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
        );
        botPanelLayout.setVerticalGroup(
            botPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Mid.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(255, 255, 255));

        Lerftpanel.setBackground(new java.awt.Color(153, 153, 255));
        Lerftpanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Image/icons8_google_translate_50px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("My Dictionary");

        javax.swing.GroupLayout LerftpanelLayout = new javax.swing.GroupLayout(Lerftpanel);
        Lerftpanel.setLayout(LerftpanelLayout);
        LerftpanelLayout.setHorizontalGroup(
            LerftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LerftpanelLayout.createSequentialGroup()
                .addGroup(LerftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LerftpanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel7))
                    .addGroup(LerftpanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        LerftpanelLayout.setVerticalGroup(
            LerftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LerftpanelLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new java.awt.Color(87, 125, 162));

        jPanel3.setBackground(new java.awt.Color(87, 125, 162));
        jPanel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        xemtatcatu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        xemtatcatu.setForeground(new java.awt.Color(255, 255, 255));
        xemtatcatu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xemtatcatu.setText("Xem tất cả từ");
        xemtatcatu.setToolTipText("");
        xemtatcatu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xemtatcatuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                themsuatuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                themsuatuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xemtatcatu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xemtatcatu, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(87, 125, 162));

        themsuatu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        themsuatu.setForeground(new java.awt.Color(255, 255, 255));
        themsuatu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        themsuatu.setText("Tra, chỉnh sửa my list");
        themsuatu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themsuatuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                themsuatuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                themsuatuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(themsuatu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(themsuatu, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(87, 125, 162));

        gioithieu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        gioithieu.setForeground(new java.awt.Color(255, 255, 255));
        gioithieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gioithieu.setText("Giới thiệu");
        gioithieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gioithieuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                themsuatuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                themsuatuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(gioithieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gioithieu, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addComponent(Lerftpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Lerftpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Mid.add(HomePanel, "card3");

        vnpPanel.setBackground(new java.awt.Color(51, 51, 255));
        vnpPanel.setPreferredSize(new java.awt.Dimension(131, 220));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VIỆT");

        soundLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Image/icons8_speaker_35px_1.png"))); // NOI18N
        soundLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soundLabel1MouseClicked(evt);
            }
        });

        vnField.setBackground(new java.awt.Color(102, 102, 255));
        vnField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vnField.setForeground(new java.awt.Color(255, 255, 255));
        vnField.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        vnField.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout vnpPanelLayout = new javax.swing.GroupLayout(vnpPanel);
        vnpPanel.setLayout(vnpPanelLayout);
        vnpPanelLayout.setHorizontalGroup(
            vnpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vnpPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(vnpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vnField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(vnpPanelLayout.createSequentialGroup()
                        .addComponent(soundLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addContainerGap())))
        );
        vnpPanelLayout.setVerticalGroup(
            vnpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vnpPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(vnpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soundLabel1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vnField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        SwapLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Image/icons8_replace_35px.png"))); // NOI18N
        SwapLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SwapLabelMouseClicked(evt);
            }
        });

        engLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        engLabel.setForeground(new java.awt.Color(26, 115, 232));
        engLabel.setText("Tiếng Anh");

        vnLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        vnLabel.setForeground(new java.awt.Color(26, 115, 232));
        vnLabel.setText("Tiếng VIệt");

        engPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(142, 145, 148));
        jLabel4.setText("ANH");

        soundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Image/icons8_speaker_35px.png"))); // NOI18N
        soundLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soundLabelMouseClicked(evt);
            }
        });

        engFIeld.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        engFIeld.setBorder(null);
        engFIeld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        engFIeld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                engFIeldKeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 0));
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Image/icons8_star_38px.png"))); // NOI18N

        prolabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout engPanelLayout = new javax.swing.GroupLayout(engPanel);
        engPanel.setLayout(engPanelLayout);
        engPanelLayout.setHorizontalGroup(
            engPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(engPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(engPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(engPanelLayout.createSequentialGroup()
                        .addComponent(engFIeld)
                        .addContainerGap())
                    .addGroup(engPanelLayout.createSequentialGroup()
                        .addComponent(soundLabel)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 672, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47))
                    .addGroup(engPanelLayout.createSequentialGroup()
                        .addComponent(prolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        engPanelLayout.setVerticalGroup(
            engPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(engPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(engPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soundLabel)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(engFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(engLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219)
                .addComponent(SwapLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addComponent(engPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPanelLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(engLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SwapLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(engPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(vnpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchPanelLayout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(vnpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Mid.add(SearchPanel, "card6");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Mid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 511, Short.MAX_VALUE)
                .addComponent(botPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                    .addContainerGap(68, Short.MAX_VALUE)
                    .addComponent(Mid, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void engFIeldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_engFIeldKeyTyped
        // TODO add your handling code here:
        if(evt.getKeyChar()=='\n')
        //DictionaryCommandLine test = new DictionaryCommandLine();
        try {
            //test.dictionaryManagement.insertFromFile();
            String s = engFIeld.getText();

                if (engLabel.getText() == "Tiếng Anh") {
                    vnField.setText(new Api().translateToVn(s));
                } else {
                    vnField.setText(new Api().translateToEng(s));
                }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_engFIeldKeyTyped

    private void SwapLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwapLabelMouseClicked
        // TODO add your handling code here:
        if (engLabel.getText() == "Tiếng Anh") {
            engLabel.setText("Tiếng Việt");
            vnLabel.setText("Tiếng Anh");
            jLabel4.setText("VIỆT");
            jLabel5.setText("ANH");
        } else {
            engLabel.setText("Tiếng Anh");
            vnLabel.setText("Tiếng Việt");
            jLabel4.setText("ANH");
            jLabel5.setText("VIỆT");
        }
    }//GEN-LAST:event_SwapLabelMouseClicked

    private void searchLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseEntered
        // TODO add your handling code here:
        if (evt.getSource() == homeLabel) {
            homeLabel.setForeground(new Color(199, 200, 202));
        }
 
        if (evt.getSource() == searchLabel) {
            searchLabel.setForeground(new Color(199, 200, 202));
        }
    }//GEN-LAST:event_searchLabelMouseEntered

    private void searchLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseExited
        if (evt.getSource() == homeLabel) {
            homeLabel.setForeground(Color.BLACK);
        }
        if (evt.getSource() == searchLabel) {
            searchLabel.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchLabelMouseExited

    private void favLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favLabelMouseClicked
        if (evt.getSource() == homeLabel) {
            SearchPanel.setVisible(false);
            HomePanel.setVisible(true);
        }
        if (evt.getSource() == searchLabel) {
            SearchPanel.setVisible(true);
            HomePanel.setVisible(false);
        }
    }//GEN-LAST:event_favLabelMouseClicked

    private void themsuatuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themsuatuMouseEntered
        if (evt.getSource() == xemtatcatu) {
            xemtatcatu.setForeground(new Color(199, 200, 202));
        }
        if (evt.getSource() == gioithieu) {
            gioithieu.setForeground(new Color(199, 200, 202));
        }
        if (evt.getSource() == themsuatu) {
            themsuatu.setForeground(new Color(199, 200, 202));
        }
    }//GEN-LAST:event_themsuatuMouseEntered

    private void themsuatuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themsuatuMouseExited
        if (evt.getSource() == xemtatcatu) {
            xemtatcatu.setForeground(Color.white);
        }
        if (evt.getSource() == gioithieu) {
            gioithieu.setForeground(Color.white);
        }
        if (evt.getSource() == themsuatu) {
            themsuatu.setForeground(Color.white);
        }
    }//GEN-LAST:event_themsuatuMouseExited

    private void themsuatuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themsuatuMouseClicked
        FrameChinhSua frameChinhSua = new FrameChinhSua(test);
        frameChinhSua.setLocation(475, 200);
        frameChinhSua.setDefaultCloseOperation(HIDE_ON_CLOSE);
        frameChinhSua.setVisible(true);
    }//GEN-LAST:event_themsuatuMouseClicked

    private void gioithieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gioithieuMouseClicked
        JOptionPane.showMessageDialog(this, "Trần Nhật Huy OOP", "Giới thiệu", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_gioithieuMouseClicked

    private void xemtatcatuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xemtatcatuMouseClicked
        FrameWord frameWord = new FrameWord();
        frameWord.setLocation(475, 200);
        frameWord.setDefaultCloseOperation(HIDE_ON_CLOSE);
        frameWord.setVisible(true);
    }//GEN-LAST:event_xemtatcatuMouseClicked

    private void soundLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soundLabelMouseClicked
        // TODO add your handling code here:
        String s= engFIeld.getText();
        new Api().speak(s);
    }//GEN-LAST:event_soundLabelMouseClicked

    private void soundLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soundLabel1MouseClicked
        // TODO add your handling code here:
        String s= vnField.getText();
        new Api().speak(s);
    }//GEN-LAST:event_soundLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
        //        new DictionaryApplication().setVisible(true);
        //    }
        //});
        runApplication();
        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel Lerftpanel;
    private javax.swing.JPanel Mid;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JLabel SwapLabel;
    private javax.swing.JPanel botPanel;
    private javax.swing.JTextField engFIeld;
    private javax.swing.JLabel engLabel;
    private javax.swing.JPanel engPanel;
    private javax.swing.JLabel gioithieu;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel prolabel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel soundLabel;
    private javax.swing.JLabel soundLabel1;
    private javax.swing.JLabel themsuatu;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel vnField;
    private javax.swing.JLabel vnLabel;
    private javax.swing.JPanel vnpPanel;
    private javax.swing.JLabel xemtatcatu;
    // End of variables declaration//GEN-END:variables
}
