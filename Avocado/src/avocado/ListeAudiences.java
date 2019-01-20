/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avocado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Waul
 */
public class ListeAudiences extends javax.swing.JPanel {

    Connection conn = null;
    PreparedStatement req = null;
    ResultSet res = null;
    
   private static int IDtoMod;

    public static int getIDtoMod() {
        return IDtoMod;
    }

    public static void setIDtoMod(int IDtoMod) {
        ListeAudiences.IDtoMod = IDtoMod;
    }
    
    
public void AffichageAud(){
    conn = Avocado.DBConn();
    String sql = "SELECT affaires.Titre_Aff , juridictions.Titre_Juri , `Date_Aud`, `Statut_Aud`, confreres.Nom_Conf , `Comm_Aud` FROM `audiences`, affaires, juridictions, confreres WHERE affaires.Id_Aff = audiences.Id_Aff AND audiences.Id_Juri = juridictions.Id_Juri AND Id_Resp = confreres.Id_Conf";
    try{
        req = conn.prepareStatement(sql);
        res = req.executeQuery();
        int k= 0;
        int i = 0;
        if(res.next()){
                    res.last();
                    k=res.getRow();
                    res.beforeFirst();
                }
               Object[][] t=new Object[k][6];
        
        while(res.next())
        {
                   t[i][0]=res.getString(1);
                   t[i][1]=res.getString(2);
                   t[i][2]=res.getString(3);
                   t[i][3]=res.getString(4);
                   t[i][4]=res.getString(5);
                   t[i][5]=res.getString(6);
                   i++;
                }
               
                res.close();
         final String columnNames[] = {"Affaire","Juridiction","Date D'audience", "Statut De l'Audience", "Responsable", "Commentaire"};
         jTable1.setModel(new DefaultTableModel(t,columnNames));
         ListSelectionModel listMod =  jTable1.getSelectionModel();
         listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         listMod.addListSelectionListener(jTable1);
        
    }   catch (SQLException ex) {
            Logger.getLogger(ListeAudiences.class.getName()).log(Level.SEVERE, null, ex);
        }
}


public void AffichageAud(String s){
    s = s + "%";
    conn = Avocado.DBConn();
    String sql = "SELECT affaires.Titre_Aff , juridictions.Titre_Juri , `Date_Aud`, `Statut_Aud`, confreres.Nom_Conf , `Comm_Aud` FROM `audiences`, affaires, juridictions, confreres WHERE affaires.Id_Aff = audiences.Id_Aff AND audiences.Id_Juri = juridictions.Id_Juri AND Id_Resp = confreres.Id_Conf AND affaires.Titre_Aff LIKE ?";
    try{
        req = conn.prepareStatement(sql);
        req.setString(1, s);
        res = req.executeQuery();
        int k= 0;
        int i = 0;
        if(res.next()){
                    res.last();
                    k=res.getRow();
                    res.beforeFirst();
                }
               Object[][] t=new Object[k][6];
        
        while(res.next())
        {
                   t[i][0]=res.getString(1);
                   t[i][1]=res.getString(2);
                   t[i][2]=res.getString(3);
                   t[i][3]=res.getString(4);
                   t[i][4]=res.getString(5);
                   t[i][5]=res.getString(6);
                   i++;
                }
               
                res.close();
         final String columnNames[] = {"Affaire","Juridiction","Date D'audience", "Statut De l'Audience", "Responsable", "Commentaire"};
         jTable1.setModel(new DefaultTableModel(t,columnNames));
         ListSelectionModel listMod =  jTable1.getSelectionModel();
         listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         listMod.addListSelectionListener(jTable1);
        
    }   catch (SQLException ex) {
            Logger.getLogger(ListeAudiences.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void AffichageAudAuj() {
    conn = Avocado.DBConn();
    String sql = "SELECT affaires.Titre_Aff , juridictions.Titre_Juri , `Date_Aud`, `Statut_Aud`, confreres.Nom_Conf , `Comm_Aud` FROM `audiences`, affaires, juridictions, confreres WHERE affaires.Id_Aff = audiences.Id_Aff AND audiences.Id_Juri = juridictions.Id_Juri AND Id_Resp = confreres.Id_Conf AND `Date_Aud` = CURRENT_DATE";
    try{
        req = conn.prepareStatement(sql);
        res = req.executeQuery();
        int k= 0;
        int i = 0;
        if(res.next()){
                    res.last();
                    k=res.getRow();
                    res.beforeFirst();
                }
               Object[][] t=new Object[k][5];
        
        while(res.next())
        {
                   t[i][0]=res.getString(1);
                   t[i][1]=res.getString(2);
                   t[i][2]=res.getString(3);
                   t[i][3]=res.getString(4);
                   t[i][4]=res.getString(5);
                   i++;
                }
               
                res.close();
         final String columnNames[] = {"Affaire", "Juridiction" , "Statut De l'Audience", "Responsable", "Commentaire"};
         jTable1.setModel(new DefaultTableModel(t,columnNames));
         ListSelectionModel listMod =  jTable1.getSelectionModel();
         listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         listMod.addListSelectionListener(jTable1);
        
    }   catch (SQLException ex) {
            Logger.getLogger(ListeAudiences.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    /**
     * Creates new form ListesAffaires
     */
    public ListeAudiences() {
        initComponents();
        if(AudienceMenu.getbtnC() == 1) AffichageAud();
        else  if(AudienceMenu.getbtnC() == 2)AffichageAudAuj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("RECHERCHE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton1.setText("Supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        String s = Search.getText();
        AffichageAud(s);      // TODO add your handling code here:
    }//GEN-LAST:event_SearchKeyReleased

    private void SearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyTyped

    }//GEN-LAST:event_SearchKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        IDtoMod = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        MODIFY.setFrom(4);
        conn = Avocado.DBConn();
        String sql = "SELECT * FROM `Audiences` WHERE `Id_Aud` = ?";
        try{
            req = conn.prepareStatement(sql);
            req.setInt(1, IDtoMod);
            res = req.executeQuery();
            if(res.next()) {
                new MODIFY().setVisible(true);
                AjoutAudience.setToModify(res.getString("Id_Aff"), res.getString("Id_Juri"), res.getString("Statut_Aud"), res.getString("Id_Resp"), res.getString("Id_Sub"), res.getString("Comm_Aud"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ListeClients.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conn = Avocado.DBConn();
        String sql = "DELETE FROM `Audiences` WHERE `Id_Aud` = ?";
        try{
            req = conn.prepareStatement(sql);
            req.setInt(1, Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            req.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ListeClients.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Client Supprimé Avec Succés");
        AffichageAud();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
