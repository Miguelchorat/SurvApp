package modelo;

import java.awt.Image;
import javax.swing.ImageIcon;
import util.TipoAvatar;
import util.Protocolo;
import vista.DialogElegirAvatar;
import vista.PanelGeneral;


/**
 *
 * @author chorat
 */
public class ModeloAvatar extends javax.swing.JPanel implements Protocolo{

    
    private TipoAvatar avatar;
    private PanelGeneral pg;
    private DialogElegirAvatar dialog;
    
    public ModeloAvatar(TipoAvatar avatar,PanelGeneral pg,DialogElegirAvatar dialog) {
        this.avatar = avatar;
        this.pg = pg;
        this.dialog = dialog;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAvatar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(75, 75));
        setMinimumSize(new java.awt.Dimension(75, 75));
        setPreferredSize(new java.awt.Dimension(75, 75));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabelAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAvatar.setMaximumSize(new java.awt.Dimension(75, 75));
        jLabelAvatar.setMinimumSize(new java.awt.Dimension(75, 75));
        jLabelAvatar.setPreferredSize(new java.awt.Dimension(75, 75));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        pg.getVp().getPanelInicial().getPanelGeneral().getPanelAjustes().setAvatar(avatar.getNumero());
        this.dialog.setVisible(false);
    }//GEN-LAST:event_formMouseClicked
    
    public void rellenar(int ancho,int alto){ 
        Image img = new ImageIcon(getClass().getResource(avatar.getUrl())).getImage();
        ImageIcon avatarIcon = new ImageIcon(img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
        jLabelAvatar.setIcon(avatarIcon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAvatar;
    // End of variables declaration//GEN-END:variables
}
