package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chorat
 */
public class PanelHerramientaVentana extends javax.swing.JPanel {

    private int x;
    private int y;
    private VistaPrincipal vp;
    
    public PanelHerramientaVentana() {
    }

    public PanelHerramientaVentana(VistaPrincipal vp) {
        initComponents();
        rellenarImg();
        this.setBackground(new Color(0,0,0,100));
        this.vp=vp;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgCerrar = new javax.swing.JLabel();
        imgMinimizar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1000, 25));
        setMinimumSize(new java.awt.Dimension(1000, 25));
        setPreferredSize(new java.awt.Dimension(1000, 25));
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

        imgCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCerrar.setMaximumSize(new java.awt.Dimension(25, 25));
        imgCerrar.setMinimumSize(new java.awt.Dimension(25, 25));
        imgCerrar.setPreferredSize(new java.awt.Dimension(25, 25));
        imgCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCerrarMouseClicked(evt);
            }
        });

        imgMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMinimizar.setMaximumSize(new java.awt.Dimension(25, 25));
        imgMinimizar.setMinimumSize(new java.awt.Dimension(25, 25));
        imgMinimizar.setPreferredSize(new java.awt.Dimension(25, 25));
        imgMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 934, Short.MAX_VALUE)
                .addComponent(imgMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point ubicacion = MouseInfo.getPointerInfo().getLocation();
        vp.setLocation(ubicacion.x-x,ubicacion.y-y);
    }//GEN-LAST:event_formMouseDragged

    private void imgCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCerrarMouseClicked
        /*int resultado = JOptionPane.showConfirmDialog(this,"¿Deseas salir?","Cerrar aplicación.",JOptionPane.YES_NO_OPTION);
        if(resultado==0)*/
        vp.dispose();
    }//GEN-LAST:event_imgCerrarMouseClicked

    private void imgMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMinimizarMouseClicked
        vp.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_imgMinimizarMouseClicked
    
    public void rellenarImg(){
        Image img1 = new ImageIcon(getClass().getResource("/imagen/cerrar.png")).getImage();
        ImageIcon imgIcono1 = new ImageIcon(img1.getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        imgCerrar.setIcon(imgIcono1);
        
        Image img2 = new ImageIcon(getClass().getResource("/imagen/minimizar.png")).getImage();
        ImageIcon imgIcono2 = new ImageIcon(img2.getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        imgMinimizar.setIcon(imgIcono2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgCerrar;
    private javax.swing.JLabel imgMinimizar;
    // End of variables declaration//GEN-END:variables
}
