/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class Home_UI extends javax.swing.JFrame {

    /**
     * Creates new form Home_UI
     */
    public Home_UI() {
        initComponents();
        title.setBackground(new Color(174, 124, 90, 180));   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        btn_tk = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_logout5 = new javax.swing.JLabel();
        btn_quanli = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_logout6 = new javax.swing.JLabel();
        btn_thongke = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_logout7 = new javax.swing.JLabel();
        btn_caidat = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_logout8 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_logout9 = new javax.swing.JLabel();
        btn_ban = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_logout10 = new javax.swing.JLabel();
        bgimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 609));
        setMinimumSize(new java.awt.Dimension(878, 563));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(950, 609));
        getContentPane().setLayout(null);

        title.setBackground(new java.awt.Color(174, 124, 90));
        title.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("                           Phần mềm quản lý quán Cà Phê");
        title.setOpaque(true);
        getContentPane().add(title);
        title.setBounds(0, 30, 1060, 60);

        btn_tk.setBackground(new java.awt.Color(255, 255, 255));
        btn_tk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tkMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_48px.png"))); // NOI18N

        btn_logout5.setBackground(new java.awt.Color(255, 31, 31,0));
        btn_logout5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_logout5.setText("   Tài khoản");

        javax.swing.GroupLayout btn_tkLayout = new javax.swing.GroupLayout(btn_tk);
        btn_tk.setLayout(btn_tkLayout);
        btn_tkLayout.setHorizontalGroup(
            btn_tkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_tkLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(35, 35, 35))
            .addGroup(btn_tkLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_logout5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btn_tkLayout.setVerticalGroup(
            btn_tkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_tkLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(btn_tk);
        btn_tk.setBounds(460, 160, 120, 120);

        btn_quanli.setBackground(new java.awt.Color(255, 255, 255));
        btn_quanli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_quanliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_quanliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_quanliMouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file_48px.png"))); // NOI18N

        btn_logout6.setBackground(new java.awt.Color(255, 31, 31,0));
        btn_logout6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_logout6.setText("     Quản lý");

        javax.swing.GroupLayout btn_quanliLayout = new javax.swing.GroupLayout(btn_quanli);
        btn_quanli.setLayout(btn_quanliLayout);
        btn_quanliLayout.setHorizontalGroup(
            btn_quanliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_quanliLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btn_logout6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_quanliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(33, 33, 33))
        );
        btn_quanliLayout.setVerticalGroup(
            btn_quanliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_quanliLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(btn_quanli);
        btn_quanli.setBounds(660, 160, 120, 120);

        btn_thongke.setBackground(new java.awt.Color(255, 255, 255));
        btn_thongke.setForeground(new java.awt.Color(255, 255, 255));
        btn_thongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_thongkeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_thongkeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_thongkeMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/input_48px.png"))); // NOI18N

        btn_logout7.setBackground(new java.awt.Color(255, 31, 31,0));
        btn_logout7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_logout7.setText("Thống kê");

        javax.swing.GroupLayout btn_thongkeLayout = new javax.swing.GroupLayout(btn_thongke);
        btn_thongke.setLayout(btn_thongkeLayout);
        btn_thongkeLayout.setHorizontalGroup(
            btn_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_thongkeLayout.createSequentialGroup()
                .addGroup(btn_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_thongkeLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel9))
                    .addGroup(btn_thongkeLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btn_logout7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        btn_thongkeLayout.setVerticalGroup(
            btn_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_thongkeLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(btn_thongke);
        btn_thongke.setBounds(260, 350, 120, 120);

        btn_caidat.setBackground(new java.awt.Color(255, 255, 255));
        btn_caidat.setForeground(new java.awt.Color(255, 255, 255));
        btn_caidat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_caidatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_caidatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_caidatMouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/setting_48px.png"))); // NOI18N

        btn_logout8.setBackground(new java.awt.Color(255, 31, 31,0));
        btn_logout8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_logout8.setText("      Cài đặt");

        javax.swing.GroupLayout btn_caidatLayout = new javax.swing.GroupLayout(btn_caidat);
        btn_caidat.setLayout(btn_caidatLayout);
        btn_caidatLayout.setHorizontalGroup(
            btn_caidatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_caidatLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btn_logout8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_caidatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(35, 35, 35))
        );
        btn_caidatLayout.setVerticalGroup(
            btn_caidatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_caidatLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(btn_caidat);
        btn_caidat.setBounds(460, 350, 120, 120);

        btn_logout.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout_48px.png"))); // NOI18N

        btn_logout9.setBackground(new java.awt.Color(255, 31, 31,0));
        btn_logout9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_logout9.setText("   Đăng xuất");

        javax.swing.GroupLayout btn_logoutLayout = new javax.swing.GroupLayout(btn_logout);
        btn_logout.setLayout(btn_logoutLayout);
        btn_logoutLayout.setHorizontalGroup(
            btn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_logoutLayout.createSequentialGroup()
                .addGroup(btn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_logoutLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btn_logout9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btn_logoutLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel11)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        btn_logoutLayout.setVerticalGroup(
            btn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_logoutLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(btn_logout);
        btn_logout.setBounds(660, 350, 120, 120);

        btn_ban.setBackground(new java.awt.Color(255, 255, 255));
        btn_ban.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_banMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_banMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_banMouseExited(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dollar_64px.png"))); // NOI18N

        btn_logout10.setBackground(new java.awt.Color(255, 31, 31,0));
        btn_logout10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_logout10.setText("    Bán hàng");

        javax.swing.GroupLayout btn_banLayout = new javax.swing.GroupLayout(btn_ban);
        btn_ban.setLayout(btn_banLayout);
        btn_banLayout.setHorizontalGroup(
            btn_banLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_banLayout.createSequentialGroup()
                .addGroup(btn_banLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_banLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12))
                    .addGroup(btn_banLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btn_logout10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        btn_banLayout.setVerticalGroup(
            btn_banLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_banLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(btn_ban);
        btn_ban.setBounds(260, 160, 120, 120);

        bgimg.setBackground(new java.awt.Color(102, 102, 102));
        bgimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bghome (1).jpg"))); // NOI18N
        getContentPane().add(bgimg);
        bgimg.setBounds(0, 0, 1060, 570);

        setSize(new java.awt.Dimension(1059, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        if(Run.tk.GetLv()==0 || Run.tk.GetLv()==1 || Run.chotCa==true){
            System.exit(0);
        }else{
            DL_ChotCa dl = new DL_ChotCa(this, true);
            dl.setVisible(true);
        }
        setColorHome(btn_logout);
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_banMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_banMouseClicked
        setColorHome(btn_ban);
        this.setVisible(false);
        Run.menuBan();
    }//GEN-LAST:event_btn_banMouseClicked

    private void btn_banMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_banMouseEntered
        setColorHome(btn_ban);
    }//GEN-LAST:event_btn_banMouseEntered

    private void btn_banMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_banMouseExited
        resetColorHome(btn_ban);
    }//GEN-LAST:event_btn_banMouseExited

    private void btn_tkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tkMouseEntered
        setColorHome(btn_tk);
    }//GEN-LAST:event_btn_tkMouseEntered

    private void btn_tkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tkMouseExited
        resetColorHome(btn_tk);
    }//GEN-LAST:event_btn_tkMouseExited

    private void btn_tkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tkMouseClicked
        setColorHome(btn_tk);
        this.setVisible(false);
        Run.menuTK();
    }//GEN-LAST:event_btn_tkMouseClicked

    private void btn_quanliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quanliMouseClicked
        setColorHome(btn_quanli);
        if(Run.tk.GetLv()==0 || Run.tk.GetLv()==1){
            Run.menuQL();
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập !!!");
        }
    }//GEN-LAST:event_btn_quanliMouseClicked

    private void btn_quanliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quanliMouseEntered
        setColorHome(btn_quanli);
    }//GEN-LAST:event_btn_quanliMouseEntered

    private void btn_quanliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quanliMouseExited
        resetColorHome(btn_quanli);
    }//GEN-LAST:event_btn_quanliMouseExited

    private void btn_thongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_thongkeMouseClicked
        setColorHome(btn_thongke);
        if(Run.tk.GetLv()==0 || Run.tk.GetLv()==1){
            Run.menuTHK();
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập !!!");
        }
    }//GEN-LAST:event_btn_thongkeMouseClicked

    private void btn_thongkeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_thongkeMouseEntered
        setColorHome(btn_thongke);
    }//GEN-LAST:event_btn_thongkeMouseEntered

    private void btn_thongkeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_thongkeMouseExited
        resetColorHome(btn_thongke);
    }//GEN-LAST:event_btn_thongkeMouseExited

    private void btn_caidatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_caidatMouseClicked
        setColorHome(btn_caidat);
        Run.menuTT();
        this.setVisible(false);
    }//GEN-LAST:event_btn_caidatMouseClicked

    private void btn_caidatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_caidatMouseEntered
        setColorHome(btn_caidat);
    }//GEN-LAST:event_btn_caidatMouseEntered

    private void btn_caidatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_caidatMouseExited
        resetColorHome(btn_caidat);
    }//GEN-LAST:event_btn_caidatMouseExited

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        setColorHome(btn_logout);
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        resetColorHome(btn_logout);
    }//GEN-LAST:event_btn_logoutMouseExited
    
    public void setColorHome(JPanel panel){
        panel.setBackground(new Color(239, 191, 115));
    }
    
    public void resetColorHome(JPanel panel){
        panel.setBackground(Color.white);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgimg;
    private javax.swing.JPanel btn_ban;
    private javax.swing.JPanel btn_caidat;
    private javax.swing.JPanel btn_logout;
    private javax.swing.JLabel btn_logout10;
    private javax.swing.JLabel btn_logout5;
    private javax.swing.JLabel btn_logout6;
    private javax.swing.JLabel btn_logout7;
    private javax.swing.JLabel btn_logout8;
    private javax.swing.JLabel btn_logout9;
    private javax.swing.JPanel btn_quanli;
    private javax.swing.JPanel btn_thongke;
    private javax.swing.JPanel btn_tk;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
