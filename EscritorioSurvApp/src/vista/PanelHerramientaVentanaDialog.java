package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/**
 *
 * @author chorat
 */
public class PanelHerramientaVentanaDialog extends javax.swing.JPanel{

    private int x;
    private int y;
    private JDialog jDialog;
    
    public PanelHerramientaVentanaDialog() {
    }

    public PanelHerramientaVentanaDialog(JDialog dialog,String titulo) {
        initComponents();
        rellenarImg();
        this.setBackground(new Color(50,150,250));
        this.jDialog=dialog;
        jPanelCerrar.setBackground(new Color(0,0,0,100));        
        jLabelTitulo.setText(titulo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanelCerrar = new javax.swing.JPanel();
        imgCerrar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(350, 25));
        setMinimumSize(new java.awt.Dimension(350, 25));
        setPreferredSize(new java.awt.Dimension(350, 25));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTitulo.setText("    SURVAPP");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(270, 25));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(270, 25));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(270, 25));

        jPanelCerrar.setMaximumSize(new java.awt.Dimension(25, 25));
        jPanelCerrar.setMinimumSize(new java.awt.Dimension(25, 25));
        jPanelCerrar.setOpaque(false);
        jPanelCerrar.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCerrarMouseExited(evt);
            }
        });

        imgCerrar.setForeground(new java.awt.Color(204, 0, 0));
        imgCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCerrar.setMaximumSize(new java.awt.Dimension(25, 25));
        imgCerrar.setMinimumSize(new java.awt.Dimension(25, 25));
        imgCerrar.setPreferredSize(new java.awt.Dimension(25, 25));
        imgCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelCerrarLayout = new javax.swing.GroupLayout(jPanelCerrar);
        jPanelCerrar.setLayout(jPanelCerrarLayout);
        jPanelCerrarLayout.setHorizontalGroup(
            jPanelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCerrarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(imgCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCerrarLayout.setVerticalGroup(
            jPanelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point ubicacion = MouseInfo.getPointerInfo().getLocation();
        jDialog.setLocation(ubicacion.x-x,ubicacion.y-y);
    }//GEN-LAST:event_formMouseDragged

    private void imgCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCerrarMouseClicked
        try {
            jDialog.dispose();            
        } catch (NullPointerException npe){
            jDialog.dispose();
        }               
    }//GEN-LAST:event_imgCerrarMouseClicked

    private void jPanelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseEntered
        jDialog.revalidate();
        jDialog.repaint();
        jPanelCerrar.setBackground(new Color(205,0,0,220));
    }//GEN-LAST:event_jPanelCerrarMouseEntered

    private void jPanelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseExited
        jDialog.revalidate();
        jDialog.repaint();
        jPanelCerrar.setBackground(new Color(0,0,0,100));        
    }//GEN-LAST:event_jPanelCerrarMouseExited
    
    public void rellenarImg(){
        Image img1 = new ImageIcon(getClass().getResource("/imagen/cerrar.png")).getImage();
        ImageIcon imgIcono1 = new ImageIcon(img1.getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        imgCerrar.setIcon(imgIcono1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgCerrar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCerrar;
    // End of variables declaration//GEN-END:variables
}
