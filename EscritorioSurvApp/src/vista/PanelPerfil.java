package vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author chorat
 */
public class PanelPerfil extends javax.swing.JPanel {

    private VistaPrincipal vp;
    private PanelGeneral panelGeneral;
    
    public PanelPerfil() {
    }
    
    public PanelPerfil(PanelGeneral panelGeneral) {
        this.vp = panelGeneral.getVp();
        this.panelGeneral = panelGeneral;
        initComponents();   
    }
    
    public void cargarDatos(){
        try{
            jLabelNombre.setText(vp.getUsuario().getNombre());
            Image img = new ImageIcon(getClass().getResource("/imagen/"+vp.getUsuario().getAvatar()+".png")).getImage();
            ImageIcon avatarIcon = new ImageIcon(img.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
            jLabelAvatar.setIcon(avatarIcon);
        }catch(NullPointerException npe){}
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jLabelAjustes = new javax.swing.JLabel();
        PanelAvatar = new javax.swing.JPanel();
        jLabelAvatar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(50, 150, 250));
        setForeground(new java.awt.Color(50, 150, 250));
        setMaximumSize(new java.awt.Dimension(250, 50));
        setMinimumSize(new java.awt.Dimension(250, 50));
        setPreferredSize(new java.awt.Dimension(250, 50));

        jLabelNombre.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Prueba");
        jLabelNombre.setMaximumSize(new java.awt.Dimension(125, 14));
        jLabelNombre.setMinimumSize(new java.awt.Dimension(125, 14));
        jLabelNombre.setPreferredSize(new java.awt.Dimension(125, 14));

        jLabelAjustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAjustes.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabelAjustes.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabelAjustes.setPreferredSize(new java.awt.Dimension(50, 50));
        jLabelAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAjustesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAjustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAjustesMouseExited(evt);
            }
        });

        PanelAvatar.setBackground(new java.awt.Color(255, 255, 255));
        PanelAvatar.setOpaque(false);

        jLabelAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAvatar.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabelAvatar.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabelAvatar.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout PanelAvatarLayout = new javax.swing.GroupLayout(PanelAvatar);
        PanelAvatar.setLayout(PanelAvatarLayout);
        PanelAvatarLayout.setHorizontalGroup(
            PanelAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(PanelAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelAvatarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 50, Short.MAX_VALUE)))
        );
        PanelAvatarLayout.setVerticalGroup(
            PanelAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PanelAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelAvatarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 50, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabelAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Image imgAjuste = new ImageIcon(getClass().getResource("/imagen/ajustes.png")).getImage();
        ImageIcon ajusteIcon = new ImageIcon(imgAjuste.getScaledInstance(35, 35, Image.SCALE_SMOOTH));
        jLabelAjustes.setIcon(ajusteIcon);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelAjustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAjustesMouseEntered
        vp.revalidate();
        vp.repaint();
        jLabelAjustes.setOpaque(true);
        jLabelAjustes.setBackground(new Color(100,140,255,120));
    }//GEN-LAST:event_jLabelAjustesMouseEntered

    private void jLabelAjustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAjustesMouseExited
        vp.revalidate();
        vp.repaint();
        jLabelAjustes.setOpaque(false);
    }//GEN-LAST:event_jLabelAjustesMouseExited

    private void jLabelAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAjustesMouseClicked
        panelGeneral.apagarPaneles();
        panelGeneral.getPanelAjustes().setVisible(true);
    }//GEN-LAST:event_jLabelAjustesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAvatar;
    private javax.swing.JLabel jLabelAjustes;
    private javax.swing.JLabel jLabelAvatar;
    private javax.swing.JLabel jLabelNombre;
    // End of variables declaration//GEN-END:variables
}
