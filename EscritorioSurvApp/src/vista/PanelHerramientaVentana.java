package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import util.Protocolo;
import static util.Protocolo.INICIAR_SESION;

/**
 *
 * @author chorat
 */
public class PanelHerramientaVentana extends javax.swing.JPanel implements Protocolo {

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
        jPanelCerrar.setBackground(new Color(0,0,0,100));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanelCerrar = new javax.swing.JPanel();
        imgCerrar = new javax.swing.JLabel();
        jPanelMinimizar = new javax.swing.JPanel();
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

        jLabelTitulo.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTitulo.setText("    SURVAPP");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(150, 25));

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

        jPanelMinimizar.setMaximumSize(new java.awt.Dimension(25, 25));
        jPanelMinimizar.setMinimumSize(new java.awt.Dimension(25, 25));
        jPanelMinimizar.setOpaque(false);
        jPanelMinimizar.setPreferredSize(new java.awt.Dimension(25, 25));

        imgMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMinimizar.setMaximumSize(new java.awt.Dimension(25, 25));
        imgMinimizar.setMinimumSize(new java.awt.Dimension(25, 25));
        imgMinimizar.setPreferredSize(new java.awt.Dimension(25, 25));
        imgMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMinimizarLayout = new javax.swing.GroupLayout(jPanelMinimizar);
        jPanelMinimizar.setLayout(jPanelMinimizarLayout);
        jPanelMinimizarLayout.setHorizontalGroup(
            jPanelMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(imgMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelMinimizarLayout.setVerticalGroup(
            jPanelMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 760, Short.MAX_VALUE)
                .addComponent(jPanelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        int resultado = JOptionPane.showConfirmDialog(vp,"¿Deseas salir?","Cerrar aplicación.",JOptionPane.YES_NO_OPTION);
        if(resultado==0){
            try {
                vp.iniciarSocket();
                vp.getSalida().writeInt(CERRAR_SESION);
                vp.getSalida().writeUTF(vp.getGson().toJson(vp.getUsuario()));
                vp.dispose();
            } catch (IOException ex) {
            } catch (NullPointerException npe){
                vp.dispose();
            }
        }
        
    }//GEN-LAST:event_imgCerrarMouseClicked

    private void imgMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMinimizarMouseClicked
        vp.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_imgMinimizarMouseClicked

    private void jPanelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseEntered
        vp.revalidate();
        vp.repaint();
        jPanelCerrar.setBackground(new Color(205,0,0,220));
    }//GEN-LAST:event_jPanelCerrarMouseEntered

    private void jPanelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCerrarMouseExited
        vp.revalidate();
        vp.repaint();
        jPanelCerrar.setBackground(new Color(0,0,0,100));        
    }//GEN-LAST:event_jPanelCerrarMouseExited
    
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
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCerrar;
    private javax.swing.JPanel jPanelMinimizar;
    // End of variables declaration//GEN-END:variables
}
