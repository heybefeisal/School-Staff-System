/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ettprojekt;

import static ettprojekt.EttProjekt.idb;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import oru.inf.InfException;

/**
 *
 * @author Christoffer
 */
public class inlaggFrame extends javax.swing.JPanel {

    String filename = null;
    String filename1 = null;
    private String ID;
    private Validering val;
    private projektBloggen blogg;
    private String namnet;
    private String userId;
    private UtbildningProjektFlode utbildningBloggen;
    private FormellaBlogg formellaBloggen;
    private InformellaBlogg informellaBloggen;
    int idOther;

    /**
     * Creates new form inlaggFrame
     *
     */
    public inlaggFrame() {
        initComponents();
        val = new Validering();
        spara.setVisible(false);
        User u = User.getInstance();
        idOther = u.getOtherID();
    }

    public String getText() {
        return txtInlagg.getText();
    }

    public String getTitel() {
        return txtTitel.getText();
    }

    public void setText(String text) {

        txtInlagg.setText(text);
    }

    public void setTitel(String titel) {
        txtTitel.setText(titel);
    }

    public void setID(String id) {
        ID = id;
    }

    public String getID() {
        return ID;
    }

    public void setEditable() {
        txtTitel.setEditable(false);
        txtInlagg.setEditable(false);
        bifogaBild.setVisible(false);
        btnFil.setVisible(false);
    }

    public void setSkapare(String namn) {
        namnet = namn;
        lblProfil.setText(namn);

    }

    public void setBild(String id) {
        System.out.println("testbild 123");
        String fraga = ("SELECT BILD FROM INLAGG WHERE INLAGG_ID = '" + id + "';");
        System.out.println(fraga);
        try {
            String bilden = idb.fetchSingle(fraga);
            //bilden = idb.fetchSingle(fraga);
            System.out.println(bilden);
            System.out.println(id);
            try {
                bilden = bilden.replaceAll("\\s+", "");
                filename = bilden;
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(bilden).getImage().getScaledInstance(135, 200, Image.SCALE_SMOOTH));
                bild.setIcon(imageIcon);
            } catch (NullPointerException n) {
            }
        } catch (InfException e) {

        }
        bild.setText("");
    }

    public void setFil(String id) {
        String fraga = ("SELECT FILE FROM INLAGG WHERE INLAGG_ID = '" + id + "';");
        System.out.println(fraga + " setFilFraga");
        try {
            String filen = idb.fetchSingle(fraga);
            System.out.println(fraga + " setFilFil");
            try {
                filen = filen.replaceAll("\\s+", "");
                filename1 = filen;
                System.out.println(filename1);
                jlabelFil.setText(filename1);
            } catch (NullPointerException n) {
            }
        } catch (InfException e) {
        }
    }

    public String getSkapare() {
        return namnet;
    }

    public void setOsynlig() {
        taBort.setVisible(false);
        redigera.setVisible(false);
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
        txtTitel = new javax.swing.JTextField();
        txtInlagg = new java.awt.TextArea();
        taBort = new javax.swing.JButton();
        redigera = new javax.swing.JButton();
        spara = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();
        lblProfil = new javax.swing.JLabel();
        bild = new javax.swing.JLabel();
        bifogaBild = new javax.swing.JButton();
        btnFil = new javax.swing.JButton();
        jlabelFil = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(698, 358));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        txtTitel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitelActionPerformed(evt);
            }
        });

        taBort.setText("Ta bort");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        redigera.setText("Redigera");
        redigera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigeraActionPerformed(evt);
            }
        });

        spara.setText("Spara");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilder/loggo_liten.png"))); // NOI18N

        lblRubrik.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblRubrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProfilMouseClicked(evt);
            }
        });

        bild.setText(" ");
        bild.setMaximumSize(new java.awt.Dimension(20, 16));
        bild.setMinimumSize(new java.awt.Dimension(20, 16));

        bifogaBild.setText("Bifoga Bild");
        bifogaBild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bifogaBildActionPerformed(evt);
            }
        });

        btnFil.setText("Bifoga Fil");
        btnFil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilActionPerformed(evt);
            }
        });

        jlabelFil.setMaximumSize(new java.awt.Dimension(20, 300));
        jlabelFil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelFilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spara)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlabelFil, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFil)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(redigera)
                                    .addGap(66, 66, 66)
                                    .addComponent(taBort))
                                .addComponent(txtInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bifogaBild)
                            .addComponent(bild, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTitel, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(lblProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(bild, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redigera)
                    .addComponent(taBort)
                    .addComponent(bifogaBild)
                    .addComponent(btnFil)
                    .addComponent(jlabelFil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spara)
                .addGap(141, 141, 141))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
        try {

            String fraga1 = "DELETE FROM INLAGG WHERE INLAGG_ID = '" + ID + "'";

            String fraga2 = "DELETE FROM PROJEKT_INLAGG WHERE INLAGG_ID = '" + ID + "'";

            String fraga3 = "DELETE FROM SKAPA_INLAGG WHERE INLAGG_ID = '" + ID + "'";

            idb.delete(fraga2);
            idb.delete(fraga3);
            idb.delete(fraga1);
            JOptionPane.showMessageDialog(null, "Inlagg har raderats");
            if (EttProjekt.siffraVilken == 1) {
                blogg.dispose();
                new projektBloggen().setVisible(true);
            } else if (EttProjekt.siffraVilken == 2) {
                utbildningBloggen.dispose();
                new UtbildningProjektFlode().setVisible(true);
            } else if (EttProjekt.siffraVilken == 3) {
                formellaBloggen.dispose();
                new FormellaBlogg().setVisible(true);
            } else if (EttProjekt.siffraVilken == 4) {
                informellaBloggen.dispose();
                new InformellaBlogg().setVisible(true);
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }

    }//GEN-LAST:event_taBortActionPerformed

    public void projektAgare() {
        try {
            User u = User.getInstance();
            int id = u.getID();
            String stringId = Integer.toString(id);
            bloggLayout l = new bloggLayout();
            String projekt = l.getProjektNamn();
            String fraga = "SELECT AGARE FROM PROJEKT WHERE PROJEKTNAMN = '" + projekt + "'";
            String agarId = idb.fetchSingle(fraga);

            if (stringId.equals(agarId)) {
                taBort.setVisible(true);
                redigera.setVisible(true);
            } else {
                setOsynlig();

            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "FEL");
        }
    }

    public void utbildningAgare() {
        try {
            User u = User.getInstance();
            int id = u.getID();
            String stringId = Integer.toString(id);
            bloggLayout l = new bloggLayout();
            String projekt = l.getProjektNamn();
            String fraga = "SELECT AGARE FROM UTBILDNING WHERE UTBILDNINGSNAMN = '" + projekt + "'";
            String agarId = idb.fetchSingle(fraga);

            if (stringId.equals(agarId)) {
                taBort.setVisible(true);
                redigera.setVisible(true);
            } else {
                setOsynlig();

            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "FEL");
        }
    }

    public void inlaggAgare() {
        try {
            User u = User.getInstance();
            int id = u.getID();
            String stringId = Integer.toString(id);
            String fraga1 = "SELECT FIRST_NAME FROM USERS WHERE USER_ID = '" + stringId + "'";
            String fraga2 = "SELECT LAST_NAME FROM USERS WHERE USER_ID = '" + stringId + "'";
            String fornamn = idb.fetchSingle(fraga1);
            String efternamn = idb.fetchSingle(fraga2);
            String helaNamnet = fornamn + " " + efternamn;
            System.out.println(helaNamnet);
            System.out.println(namnet);

            if (helaNamnet.equals(namnet)) {
                taBort.setVisible(true);
                redigera.setVisible(true);
            } else {
                setOsynlig();
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }

    }

    public void setProjektBloggen(projektBloggen projektBloggen) {
        blogg = projektBloggen;
    }

    public void setUtbildningBloggen(UtbildningProjektFlode utbildningBlogg) {
        utbildningBloggen = utbildningBlogg;
    }

    public void setFormellaBloggen(FormellaBlogg formellBlogg) {
        formellaBloggen = formellBlogg;

    }

    public void setInFormellaBloggen(InformellaBlogg informellBlogg) {
        informellaBloggen = informellBlogg;

    }
    private void redigeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraActionPerformed
        spara.setVisible(true);
        txtTitel.setEditable(true);
        txtInlagg.setEditable(true);


    }//GEN-LAST:event_redigeraActionPerformed

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        try {
            String nyText = txtInlagg.getText();
            System.out.println(nyText);
            String nyTitel = txtTitel.getText();
            System.out.println(nyTitel);

            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(new Date());
            System.out.println(ID);
            String fraga5 = "UPDATE INLAGG SET DATUM= '" + date + "', TEXT ='" + nyText + "' , TITEL = '" + nyTitel + "', INLAGG_ID ='" + ID + "' WHERE INLAGG_ID = '" + ID + "'";
            System.out.println(fraga5);
            idb.update(fraga5);
            JOptionPane.showMessageDialog(null, "Inlägg har uppdaterats");
            setEditable();
            spara.setVisible(false);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_sparaActionPerformed

    public void setLabelOsynlig() {
        lblProfil.setVisible(false);
    }

    public String getUserId() {
        return userId;
    }
    private void lblProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProfilMouseClicked
        try {
            String fornamnet = namnet.split(" ")[0];
            String efternamnet = namnet.split(" ")[1];
            String fraga = "SELECT USER_ID FROM USERS WHERE FIRST_NAME = '" + fornamnet + "'AND LAST_NAME = '" + efternamnet + "'";
            String anvandare = idb.fetchSingle(fraga);
            idOther = Integer.parseInt(anvandare);
            User.otherUserId = idOther;
            new profilFlode().setVisible(true);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }

    }//GEN-LAST:event_lblProfilMouseClicked

    private void bifogaBildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bifogaBildActionPerformed
        String bilden = filePicker.filePicker();
        try {
            bilden = bilden.replaceAll("\\s+", "");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(bilden).getImage().getScaledInstance(bild.getWidth(), bild.getHeight(), Image.SCALE_SMOOTH));
            bild.setIcon(imageIcon);
            nyttInlagg.filename = bilden;
        } catch (NullPointerException i) {
        }
    }//GEN-LAST:event_bifogaBildActionPerformed

    private void txtTitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitelActionPerformed

    private void btnFilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilActionPerformed
        String file = filePicker.filePicker();
        jlabelFil.setText(file);
        nyttInlagg.filename1 = file;
    }//GEN-LAST:event_btnFilActionPerformed

    private void jlabelFilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelFilMouseClicked
        if (!(jlabelFil.getText() == "")) {
            try {
                filePicker.fileDownload(jlabelFil.getText());
            } catch (InfException ex) {
                Logger.getLogger(inlaggFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(inlaggFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jlabelFilMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bifogaBild;
    private javax.swing.JLabel bild;
    private javax.swing.JButton btnFil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabelFil;
    private javax.swing.JLabel lblProfil;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JButton redigera;
    private javax.swing.JButton spara;
    private javax.swing.JButton taBort;
    private java.awt.TextArea txtInlagg;
    private javax.swing.JTextField txtTitel;
    // End of variables declaration//GEN-END:variables
}