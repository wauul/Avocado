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
public class ListeClients extends javax.swing.JPanel {

    Connection conn = null;
    PreparedStatement req = null;
    ResultSet res = null;

static int IDtoMod = 0;

    public static int getIDtoMod() {
        return IDtoMod;
    }

    public static void setIDtoMod(int IDtoMod) {
        ListeClients.IDtoMod = IDtoMod;
    }

    
public void AffichageClients(){
        conn = Avocado.DBConn();
    String sql = "SELECT `Id_Cli`, `Nom_Cli`, `Prenom_Cli`, `DateNaiss_Cli`, `Ville`, `Add_Cli`, `Tel_Cli`, `Email_Cli`, `Type_CarteID`, `Num_CarteId`, `RaiSoc_Cli` FROM `client` WHERE Type_Cli = 'Client'";
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
               Object[][] t=new Object[k][11];
        
        while(res.next())
        {
                   t[i][0]=res.getString(1);
                   t[i][1]=res.getString(2);
                   t[i][2]=res.getString(3);
                   t[i][3]=res.getString(4);
                   t[i][4]=res.getString(5);
                   t[i][5]=res.getString(6);
                   t[i][6]=res.getString(7);
                   t[i][7]=res.getString(8);
                   t[i][8]=res.getString(9);
                   t[i][9]=res.getString(10);
                   t[i][10]=res.getString(11);
                   i++;
                }
               
                res.close();
         final String columnNames[] = {"ID","Nom","Prénom","Date de naissance","Ville", "Adresse", "Numéro de téléphone", "Email", "Type De Document", "Numero De Carte", "Raison Social"};
         jTable1.setModel(new DefaultTableModel(t,columnNames));
         ListSelectionModel listMod =  jTable1.getSelectionModel();
         listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         listMod.addListSelectionListener(jTable1);
        
    }   catch (SQLException ex) {
            Logger.getLogger(ListeClients.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void AffichagePartieAdv() {
        conn = Avocado.DBConn();
    String sql = "SELECT `Id_Cli`, `Nom_Cli`, `Prenom_Cli`, `DateNaiss_Cli`, `Ville`, `Add_Cli`, `Tel_Cli`, `Email_Cli`, `Type_CarteID`, `Num_CarteId`, `RaiSoc_Cli` FROM `client` WHERE Type_Cli = 'Partie Adverse'";
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
               Object[][] t=new Object[k][11];
        
        while(res.next())
        {
                   t[i][0]=res.getString(1);
                   t[i][1]=res.getString(2);
                   t[i][2]=res.getString(3);
                   t[i][3]=res.getString(4);
                   t[i][4]=res.getString(5);
                   t[i][5]=res.getString(6);
                   t[i][6]=res.getString(7);
                   t[i][7]=res.getString(8);
                   t[i][8]=res.getString(9);
                   t[i][9]=res.getString(10);
                   t[i][10]=res.getString(11);
                   i++;
                }
               
                res.close();
         final String columnNames[] = {"ID","Nom","Prénom","Date de naissance","Ville", "Adresse", "Numéro de téléphone", "Email", "Type De Document", "Numero De Carte", "Raison Social"};
         jTable1.setModel(new DefaultTableModel(t,columnNames));
         ListSelectionModel listMod =  jTable1.getSelectionModel();
         listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         listMod.addListSelectionListener(jTable1);
        
    }   catch (SQLException ex) {
            Logger.getLogger(ListeClients.class.getName()).log(Level.SEVERE, null, ex);
        }
}




public void AffichageClients(String s){
    if(s == null) AffichageClients();
    else {
    conn = Avocado.DBConn();
        s = "%" + s + "%";
    String sql = "SELECT `Id_Cli`, `Nom_Cli`, `Prenom_Cli`, `DateNaiss_Cli`, `Ville`, `Add_Cli`, `Tel_Cli`, `Email_Cli`, `Type_CarteID`, `Num_CarteId`, `RaiSoc_Cli` FROM `client` WHERE Type_Cli = 'Client' AND `Nom_Cli` LIKE ?";
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
               Object[][] t=new Object[k][11];
        
        while(res.next())
        {
                   t[i][0]=res.getString(1);
                   t[i][1]=res.getString(2);
                   t[i][2]=res.getString(3);
                   t[i][3]=res.getString(4);
                   t[i][4]=res.getString(5);
                   t[i][5]=res.getString(6);
                   t[i][6]=res.getString(7);
                   t[i][7]=res.getString(8);
                   t[i][8]=res.getString(9);
                   t[i][9]=res.getString(10);
                   t[i][10]=res.getString(11);
                   i++;
                }
               
                res.close();
         final String columnNames[] = {"ID","Nom","Prénom","Date de naissance","Ville", "Adresse", "Numéro de téléphone", "Email", "Type De Document", "Numero De Carte", "Raison Social"};
         jTable1.setModel(new DefaultTableModel(t,columnNames));
         ListSelectionModel listMod =  jTable1.getSelectionModel();
         listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         listMod.addListSelectionListener(jTable1);
        
    }   catch (SQLException ex) {
            Logger.getLogger(ListeClients.class.getName()).log(Level.SEVERE, null, ex);
        }}
}

public void AffichagePartieAdv(String s) {
    if(s== null) AffichagePartieAdv();
    else{
        conn = Avocado.DBConn();
        s = "%" + s + "%";
    String sql = "SELECT `Id_Cli`, `Nom_Cli`, `Prenom_Cli`, `DateNaiss_Cli`, `Ville`, `Add_Cli`, `Tel_Cli`, `Email_Cli`, `Type_CarteID`, `Num_CarteId`, `RaiSoc_Cli` FROM `client` WHERE Type_Cli = 'Partie Adverse' AND `Nom_Cli` LIKE ?";
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
               Object[][] t=new Object[k][11];
        
        while(res.next())
        {
                   t[i][0]=res.getString(1);
                   t[i][1]=res.getString(2);
                   t[i][2]=res.getString(3);
                   t[i][3]=res.getString(4);
                   t[i][4]=res.getString(5);
                   t[i][5]=res.getString(6);
                   t[i][6]=res.getString(7);
                   t[i][7]=res.getString(8);
                   t[i][8]=res.getString(9);
                   t[i][9]=res.getString(10);
                   t[i][10]=res.getString(11);
                   i++;
                }
               
                res.close();
         final String columnNames[] = {"ID","Nom","Prénom","Date de naissance","Ville", "Adresse", "Numéro de téléphone", "Email", "Type De Document", "Numero De Carte", "Raison Social"};
         jTable1.setModel(new DefaultTableModel(t,columnNames));
         ListSelectionModel listMod =  jTable1.getSelectionModel();
         listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         listMod.addListSelectionListener(jTable1);
        
    }   catch (SQLException ex) {
            Logger.getLogger(ListeClients.class.getName()).log(Level.SEVERE, null, ex);
        }}
}
    /**
     * Creates new form ListesAffaires
     */
    public ListeClients() {
        initComponents();
        if(ClientMenu.getbtnC() == 1) AffichageClients();
        else if(ClientMenu.getbtnC() == 2) AffichagePartieAdv();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
                .addComponent(Search)
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

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel1.setText("Liste Des Client/Parties Adverse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyTyped
     
    }//GEN-LAST:event_SearchKeyTyped

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
       String s = Search.getText();
        if(ClientMenu.getbtnC() == 1) AffichageClients(s);
        else if(ClientMenu.getbtnC() == 2) AffichagePartieAdv(s);          // TODO add your handling code here:
    }//GEN-LAST:event_SearchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        IDtoMod = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        MODIFY.setFrom(1);
        conn = Avocado.DBConn();
        String sql = "SELECT * FROM `client` WHERE `Id_Cli` = ?";   
        try{
            req = conn.prepareStatement(sql);
            req.setInt(1, IDtoMod);
            res = req.executeQuery();
            if(res.next()) {
                new MODIFY().setVisible(true);
                AjoutClient.setToModify(res.getString("Add_Cli"), res.getString("DateNaiss_Cli"), res.getString("Email_Cli"), res.getString("Nom_Cli"), res.getString("Prenom_Cli"), res.getString("Num_CarteId"), res.getString("Type_Cli"), res.getString("RaiSoc_Cli"), res.getString("Tel_Cli"), res.getString("Type_CarteID"), res.getString("Ville"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListeClients.class.getName()).log(Level.SEVERE, null, ex);}
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conn = Avocado.DBConn();
        String sql = "DELETE FROM `client` WHERE `Id_Cli` = ?";
        try{
            req = conn.prepareStatement(sql);
            req.setInt(1, Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            req.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ListeClients.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Client Supprimé Avec Succés");
        if(ClientMenu.getbtnC() == 1) AffichageClients();
        else if(ClientMenu.getbtnC() == 2) AffichagePartieAdv(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void GetIds(){
        if(AjoutAffaire.getType_c() == 1) AjoutAffaire.setId_Cli(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
        else if(AjoutAffaire.getType_c() == 2) AjoutAffaire.setId_Adv(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
