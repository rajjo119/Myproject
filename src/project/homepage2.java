/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.UIManager.getString;
import net.proteanit.sql.DbUtils;
import project.homepage;
/**
 *
 * @author gaurav ambildhuke
 */
public class homepage2 extends javax.swing.JFrame {
 Connection con= null;
 Connection con2= null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    /**
     * Creates new form homepage2
     */
    public homepage2() {
        initComponents();
        con=MySqlConnect.connectDB();
        this.setLocationRelativeTo(null);
    }
     public homepage2(String user,String psw) {
        initComponents();
        con=MySqlConnect.connectDB();
        con2=MySqlConnect.connectDB2();
         update(0,user,psw);
         update2(user);
    }
    private void update(int n,String user,String psw){
     try {
         if(n==1){
         String sql="select * from stud ";
         pre=con.prepareStatement(sql);
         rs=pre.executeQuery(sql);
       
       }
         else{
               String sql="select * from stud where id='"+user+"' and password='"+psw+"'";
         pre=con.prepareStatement(sql);
         rs=pre.executeQuery(sql);
         while(rs.next()){   
         sname.setText(rs.getString("fname")+" "+rs.getString("lname"));
         rollno.setText(rs.getString("id"));
         mob.setText(rs.getString("mobile"));
         email.setText(rs.getString("email"));
         }
         }
     }catch (Exception e) {
         //JOptionPane.showMessageDialog(null,e);
     }
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        sname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        mob = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 700, 800));

        jPanel4.setBackground(new java.awt.Color(0, 204, 0));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Details");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\gaurav ambildhuke\\Downloads\\icons8-user (5).png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 153));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setText("roll no");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(220, 90, 155, 25);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setText("mobile number");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(220, 150, 190, 25);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setText("Email Id");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(220, 210, 155, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\gaurav ambildhuke\\Downloads\\icons8-user (7).png")); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(60, 10, 100, 120);

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 0, 51));
        jLabel28.setText("student name");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(220, 30, 170, 31);

        sname.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jPanel3.add(sname);
        sname.setBounds(470, 30, 250, 30);

        email.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jPanel3.add(email);
        email.setBounds(470, 200, 250, 30);

        rollno.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jPanel3.add(rollno);
        rollno.setBounds(470, 90, 250, 30);

        mob.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jPanel3.add(mob);
        mob.setBounds(470, 140, 250, 30);

        jPanel5.setBackground(new java.awt.Color(0, 204, 0));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Attendence Details");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\gaurav ambildhuke\\Downloads\\icons8-user (5).png")); // NOI18N

        jPanel6.setBackground(new java.awt.Color(102, 255, 153));
        jPanel6.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("Course");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(30, 20, 130, 31);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel11.setText("Faculty ");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(170, 20, 155, 30);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel13.setText("Percentage");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(770, 20, 155, 30);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel14.setText("Attended Classes");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(520, 20, 210, 30);

        jLabel15.setText("Lab.OSST");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(20, 360, 100, 30);

        jLabel16.setText("SHRI.PROF.S.G.POLE");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(150, 230, 140, 30);

        jLabel17.setText("TOC");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(20, 110, 100, 30);

        jLabel19.setText("SE");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(20, 150, 100, 30);

        jLabel18.setText("DAA");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(20, 70, 100, 30);

        jLabel20.setText("-");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(320, 190, 140, 30);

        jLabel21.setText("SMT.PROF.P.V.KULKARNI");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(150, 110, 140, 30);

        jLabel22.setText("1");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(150, 110, 140, 30);

        jLabel23.setText("SHRI.P.D.PATHAK");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(150, 150, 140, 30);

        jLabel24.setText("PROF.S.G.SHIKALPURE");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(150, 270, 140, 30);

        jLabel25.setText("-");
        jPanel6.add(jLabel25);
        jLabel25.setBounds(780, 230, 140, 30);

        jLabel26.setText("-");
        jPanel6.add(jLabel26);
        jLabel26.setBounds(320, 110, 140, 30);

        jLabel27.setText("-");
        jPanel6.add(jLabel27);
        jLabel27.setBounds(320, 150, 140, 30);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel12.setText("Total Classes");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(310, 20, 190, 30);

        jLabel29.setText("OS");
        jPanel6.add(jLabel29);
        jLabel29.setBounds(20, 190, 100, 30);

        jLabel30.setText("COA");
        jPanel6.add(jLabel30);
        jLabel30.setBounds(20, 230, 100, 30);

        jLabel31.setText("Lab.DAA");
        jPanel6.add(jLabel31);
        jLabel31.setBounds(20, 270, 100, 30);

        jLabel32.setText("Lab.PIJ");
        jPanel6.add(jLabel32);
        jLabel32.setBounds(20, 300, 100, 30);

        jLabel33.setText("Lab.OS");
        jPanel6.add(jLabel33);
        jLabel33.setBounds(20, 330, 100, 30);

        jLabel34.setText("SMT.PROF.A.M.KHAN");
        jPanel6.add(jLabel34);
        jLabel34.setBounds(150, 360, 140, 30);

        jLabel35.setText("PROF.S.G.SHIKALPURE");
        jPanel6.add(jLabel35);
        jLabel35.setBounds(150, 70, 140, 30);
        jPanel6.add(jLabel36);
        jLabel36.setBounds(150, 300, 140, 30);

        jLabel37.setText("SMT.V.A.INJAMURI");
        jPanel6.add(jLabel37);
        jLabel37.setBounds(150, 190, 140, 30);

        jLabel38.setText("SMT.V.A.INJAMURI");
        jPanel6.add(jLabel38);
        jLabel38.setBounds(150, 330, 140, 30);

        jLabel39.setText("-");
        jPanel6.add(jLabel39);
        jLabel39.setBounds(780, 150, 140, 30);

        jLabel40.setText("-");
        jPanel6.add(jLabel40);
        jLabel40.setBounds(320, 230, 140, 30);

        jLabel41.setText("-");
        jPanel6.add(jLabel41);
        jLabel41.setBounds(530, 190, 140, 30);

        jLabel42.setText("-");
        jPanel6.add(jLabel42);
        jLabel42.setBounds(780, 190, 140, 30);

        jLabel43.setText("-");
        jPanel6.add(jLabel43);
        jLabel43.setBounds(530, 230, 140, 30);
        jPanel6.add(jLabel44);
        jLabel44.setBounds(320, 70, 140, 30);
        jPanel6.add(jLabel45);
        jLabel45.setBounds(530, 70, 140, 30);
        jPanel6.add(jLabel46);
        jLabel46.setBounds(780, 60, 140, 30);

        jLabel47.setText("-");
        jPanel6.add(jLabel47);
        jLabel47.setBounds(780, 110, 140, 30);

        jLabel48.setText("-");
        jPanel6.add(jLabel48);
        jLabel48.setBounds(530, 110, 140, 30);

        jLabel49.setText("-");
        jPanel6.add(jLabel49);
        jLabel49.setBounds(530, 150, 140, 30);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(620, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(homepage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage2().setVisible(true);
            }
        });
    }
      public void show_info(String user, String pasword) {
               JOptionPane.showMessageDialog(null,"Welcome user");
            update(0,user,pasword);
           }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel mob;
    private javax.swing.JLabel rollno;
    private javax.swing.JLabel sname;
    // End of variables declaration//GEN-END:variables

    private void update2(String user) {
        int a,b,percent;
        try{
        String sql="select * from fac where username='"+user+"'";
         pre=con2.prepareStatement(sql);
         rs=pre.executeQuery(sql);
         while(rs.next()){
         switch(rs.getString("course")){
             case "DAA": 
                         a=(Integer)rs.getObject("total");
                         b= (Integer)rs.getObject("attend");
                         percent=b*100/a;
                         jLabel44.setText(Integer.toString(a));
                         jLabel45.setText(Integer.toString(b));
                         jLabel46.setText(Integer.toString(percent));
                         break;
            case "TOC": 
                         a=(Integer)rs.getObject("total");
                         b= (Integer)rs.getObject("attend");
                         percent=b*100/a;
                         jLabel26.setText(Integer.toString(a));
                         jLabel48.setText(Integer.toString(b));
                         jLabel47.setText(Integer.toString(percent));
                         break;
            case "SE": 
                         a=(Integer)rs.getObject("total");
                         b= (Integer)rs.getObject("attend");
                         percent=b*100/a;
                         jLabel27.setText(Integer.toString(a));
                         jLabel49.setText(Integer.toString(b));
                         jLabel39.setText(Integer.toString(percent));
                         break;
            case "OS": 
                         a=(Integer)rs.getObject("total");
                         b= (Integer)rs.getObject("attend");
                         percent=b*100/a;
                         jLabel20.setText(Integer.toString(a));
                         jLabel41.setText(Integer.toString(b));
                         jLabel42.setText(Integer.toString(percent));
                         break;
            case "COA": 
                         a=(Integer)rs.getObject("total");
                         b= (Integer)rs.getObject("attend");
                         percent=b*100/a;
                         jLabel40.setText(Integer.toString(a));
                         jLabel43.setText(Integer.toString(b));
                         jLabel25.setText(Integer.toString(percent));
                         break;
         }
           }
         }
     catch (Exception e) {
         JOptionPane.showMessageDialog(null,e);
     }
}
}
