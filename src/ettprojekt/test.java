/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ettprojekt;

/**
 *
 * @author Christoffer
 */
public class test extends javax.swing.JFrame {

    public void createPost() {

        txtTitel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInlagg = new javax.swing.JTextArea();
        tagg1 = new javax.swing.JLabel();
        tagg2 = new javax.swing.JLabel();
        tagg3 = new javax.swing.JLabel();
        tagg4 = new javax.swing.JLabel();
        tagg5 = new javax.swing.JLabel();
        frameBild = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(698, 358));

        txtTitel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtTitel.setText("Titel");

        txtInlagg.setColumns(20);
        txtInlagg.setRows(5);
        txtInlagg.setText("BLOGGINLÄGG\n");
        jScrollPane1.setViewportView(txtInlagg);

        tagg1.setText("Tagg1");

        tagg2.setText("Tagg2");

        tagg3.setText("Tagg3");

        tagg4.setText("Tagg4");

        tagg5.setText("Tagg5");

        frameBild.setBackground(new java.awt.Color(0, 51, 51));

        jLabel6.setText("BILD");

        javax.swing.GroupLayout frameBildLayout = new javax.swing.GroupLayout(frameBild);
        frameBild.setLayout(frameBildLayout);
        frameBildLayout.setHorizontalGroup(
                frameBildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(frameBildLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel6)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameBildLayout.setVerticalGroup(
                frameBildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameBildLayout.createSequentialGroup()
                                .addContainerGap(125, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(119, 119, 119))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(154, 154, 154)
                                                .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(frameBild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(tagg1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tagg2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tagg3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tagg4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tagg5)))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(frameBild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tagg1)
                                        .addComponent(tagg2)
                                        .addComponent(tagg3)
                                        .addComponent(tagg4)
                                        .addComponent(tagg5))
                                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    // Variables declaration - do not modify                     
    private javax.swing.JPanel frameBild;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tagg1;
    private javax.swing.JLabel tagg2;
    private javax.swing.JLabel tagg3;
    private javax.swing.JLabel tagg4;
    private javax.swing.JLabel tagg5;
    private javax.swing.JTextArea txtInlagg;
    private javax.swing.JLabel txtTitel;
    // End of variables declaration
}
