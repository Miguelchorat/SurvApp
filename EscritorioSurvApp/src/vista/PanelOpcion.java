
package vista;

import java.awt.Color;
import util.TipoBoton;

/**
 *
 * @author chorat
 */
public class PanelOpcion extends javax.swing.JPanel {

    private int seleccionado;
    private PanelGeneral panelGeneral;
    
    public PanelOpcion() {
    }
    
    public PanelOpcion(PanelGeneral panelGeneral) {
        this.panelGeneral = panelGeneral;
        initComponents();
        seleccionado = TipoBoton.INICIO;        
        estadoInicial();
    }
    
    public void estadoInicial(){
        colorBoton();
        PanelInicio.setBackground(new Color(50,150,250,255));
        jLabelInicio.setForeground(new Color(255,255,255,255));
        panelGeneral.getPanelInicio().setVisible(true);
    }
    
    public void colorBoton(){
        panelGeneral.revalidate();
        panelGeneral.repaint();
        PanelInicio.setBackground(new Color(50,150,250,0));
        PanelUsuario.setBackground(new Color(50,150,250,0));
        PanelIncidencias.setBackground(new Color(50,150,250,0));
        PanelIdeas.setBackground(new Color(50,150,250,0));
        PanelDenuncias.setBackground(new Color(50,150,250,0));
        jLabelInicio.setForeground(new Color(255,255,255,150));
        jLabelUsuarios.setForeground(new Color(255,255,255,150));
        jLabelIncidencias.setForeground(new Color(255,255,255,150));
        jLabelIdeas.setForeground(new Color(255,255,255,150));
        jLabelDenuncias.setForeground(new Color(255,255,255,150));
        panelGeneral.getPanelPerfil().getjLabelAjustes().setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInicio = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        PanelUsuario = new javax.swing.JPanel();
        jLabelUsuarios = new javax.swing.JLabel();
        PanelIncidencias = new javax.swing.JPanel();
        jLabelIncidencias = new javax.swing.JLabel();
        PanelIdeas = new javax.swing.JPanel();
        jLabelIdeas = new javax.swing.JLabel();
        PanelDenuncias = new javax.swing.JPanel();
        jLabelDenuncias = new javax.swing.JLabel();

        setBackground(new java.awt.Color(100, 140, 255));
        setMaximumSize(new java.awt.Dimension(250, 575));
        setMinimumSize(new java.awt.Dimension(250, 575));
        setPreferredSize(new java.awt.Dimension(250, 575));

        PanelInicio.setBackground(new java.awt.Color(50, 150, 250));
        PanelInicio.setMaximumSize(new java.awt.Dimension(230, 70));
        PanelInicio.setMinimumSize(new java.awt.Dimension(230, 70));
        PanelInicio.setPreferredSize(new java.awt.Dimension(230, 70));
        PanelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelInicioMouseExited(evt);
            }
        });

        jLabelInicio.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInicio.setText("INICIO");
        jLabelInicio.setMaximumSize(new java.awt.Dimension(204, 42));
        jLabelInicio.setMinimumSize(new java.awt.Dimension(204, 42));
        jLabelInicio.setPreferredSize(new java.awt.Dimension(204, 42));

        javax.swing.GroupLayout PanelInicioLayout = new javax.swing.GroupLayout(PanelInicio);
        PanelInicio.setLayout(PanelInicioLayout);
        PanelInicioLayout.setHorizontalGroup(
            PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelInicioLayout.setVerticalGroup(
            PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelUsuario.setBackground(new java.awt.Color(50, 150, 250));
        PanelUsuario.setMaximumSize(new java.awt.Dimension(230, 70));
        PanelUsuario.setMinimumSize(new java.awt.Dimension(230, 70));
        PanelUsuario.setPreferredSize(new java.awt.Dimension(230, 70));
        PanelUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelUsuarioMouseExited(evt);
            }
        });

        jLabelUsuarios.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabelUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuarios.setText("USUARIOS");
        jLabelUsuarios.setMaximumSize(new java.awt.Dimension(204, 42));
        jLabelUsuarios.setMinimumSize(new java.awt.Dimension(204, 42));
        jLabelUsuarios.setPreferredSize(new java.awt.Dimension(204, 42));

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelIncidencias.setBackground(new java.awt.Color(50, 150, 250));
        PanelIncidencias.setMaximumSize(new java.awt.Dimension(230, 70));
        PanelIncidencias.setMinimumSize(new java.awt.Dimension(230, 70));
        PanelIncidencias.setPreferredSize(new java.awt.Dimension(230, 70));
        PanelIncidencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelIncidenciasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelIncidenciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelIncidenciasMouseExited(evt);
            }
        });

        jLabelIncidencias.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabelIncidencias.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIncidencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIncidencias.setText("INCIDENCIAS");
        jLabelIncidencias.setMaximumSize(new java.awt.Dimension(204, 42));
        jLabelIncidencias.setMinimumSize(new java.awt.Dimension(204, 42));
        jLabelIncidencias.setPreferredSize(new java.awt.Dimension(204, 42));

        javax.swing.GroupLayout PanelIncidenciasLayout = new javax.swing.GroupLayout(PanelIncidencias);
        PanelIncidencias.setLayout(PanelIncidenciasLayout);
        PanelIncidenciasLayout.setHorizontalGroup(
            PanelIncidenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIncidenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIncidencias, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelIncidenciasLayout.setVerticalGroup(
            PanelIncidenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIncidenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIncidencias, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelIdeas.setBackground(new java.awt.Color(50, 150, 250));
        PanelIdeas.setMaximumSize(new java.awt.Dimension(230, 70));
        PanelIdeas.setMinimumSize(new java.awt.Dimension(230, 70));
        PanelIdeas.setPreferredSize(new java.awt.Dimension(230, 70));
        PanelIdeas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelIdeasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelIdeasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelIdeasMouseExited(evt);
            }
        });

        jLabelIdeas.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabelIdeas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIdeas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIdeas.setText("IDEAS");
        jLabelIdeas.setMaximumSize(new java.awt.Dimension(204, 42));
        jLabelIdeas.setMinimumSize(new java.awt.Dimension(204, 42));
        jLabelIdeas.setPreferredSize(new java.awt.Dimension(204, 42));

        javax.swing.GroupLayout PanelIdeasLayout = new javax.swing.GroupLayout(PanelIdeas);
        PanelIdeas.setLayout(PanelIdeasLayout);
        PanelIdeasLayout.setHorizontalGroup(
            PanelIdeasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIdeasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIdeas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelIdeasLayout.setVerticalGroup(
            PanelIdeasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIdeasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIdeas, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelDenuncias.setBackground(new java.awt.Color(50, 150, 250));
        PanelDenuncias.setMaximumSize(new java.awt.Dimension(230, 70));
        PanelDenuncias.setMinimumSize(new java.awt.Dimension(230, 70));
        PanelDenuncias.setPreferredSize(new java.awt.Dimension(230, 70));
        PanelDenuncias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelDenunciasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelDenunciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelDenunciasMouseExited(evt);
            }
        });

        jLabelDenuncias.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabelDenuncias.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDenuncias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDenuncias.setText("DENUNCIAS");
        jLabelDenuncias.setMaximumSize(new java.awt.Dimension(204, 42));
        jLabelDenuncias.setMinimumSize(new java.awt.Dimension(204, 42));
        jLabelDenuncias.setPreferredSize(new java.awt.Dimension(204, 42));

        javax.swing.GroupLayout PanelDenunciasLayout = new javax.swing.GroupLayout(PanelDenuncias);
        PanelDenuncias.setLayout(PanelDenunciasLayout);
        PanelDenunciasLayout.setHorizontalGroup(
            PanelDenunciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDenunciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDenuncias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelDenunciasLayout.setVerticalGroup(
            PanelDenunciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDenunciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDenuncias, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelIncidencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelIdeas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDenuncias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(PanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(PanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelIncidencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(PanelIdeas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(PanelDenuncias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PanelUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUsuarioMouseEntered
        panelGeneral.revalidate();
        panelGeneral.repaint();
        if(seleccionado!=TipoBoton.USUARIO){
            PanelUsuario.setBackground(new Color(50,150,250,100));
            jLabelUsuarios.setForeground(new Color(255,255,255,200));
        }
    }//GEN-LAST:event_PanelUsuarioMouseEntered

    private void PanelUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUsuarioMouseExited
        panelGeneral.revalidate();
        panelGeneral.repaint();
        if(seleccionado!=TipoBoton.USUARIO){
            PanelUsuario.setBackground(new Color(50,150,250,0));
            jLabelUsuarios.setForeground(new Color(255,255,255,150));
        }
    }//GEN-LAST:event_PanelUsuarioMouseExited

    private void PanelInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelInicioMouseEntered
        panelGeneral.revalidate();
        panelGeneral.repaint();
        if(seleccionado!=TipoBoton.INICIO){
            PanelInicio.setBackground(new Color(50,150,250,100));
            jLabelInicio.setForeground(new Color(255,255,255,200));
        }
    }//GEN-LAST:event_PanelInicioMouseEntered

    private void PanelInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelInicioMouseExited
        panelGeneral.revalidate();
        panelGeneral.repaint();
        if(seleccionado!=TipoBoton.INICIO){
            PanelInicio.setBackground(new Color(50,150,250,0));
            jLabelInicio.setForeground(new Color(255,255,255,150));
        }
    }//GEN-LAST:event_PanelInicioMouseExited

    private void PanelIncidenciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelIncidenciasMouseEntered
        panelGeneral.revalidate();
        panelGeneral.repaint();
        if(seleccionado!=TipoBoton.INCIDENCIA){
            PanelIncidencias.setBackground(new Color(50,150,250,100));
            jLabelIncidencias.setForeground(new Color(255,255,255,200));
        }
    }//GEN-LAST:event_PanelIncidenciasMouseEntered

    private void PanelIncidenciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelIncidenciasMouseExited
        panelGeneral.revalidate();
        panelGeneral.repaint();
        if(seleccionado!=TipoBoton.INCIDENCIA){
            PanelIncidencias.setBackground(new Color(50,150,250,0));
            jLabelIncidencias.setForeground(new Color(255,255,255,150));
        }
    }//GEN-LAST:event_PanelIncidenciasMouseExited

    private void PanelIdeasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelIdeasMouseEntered
        panelGeneral.revalidate();
        panelGeneral.repaint();
        if(seleccionado!=TipoBoton.IDEA){
            PanelIdeas.setBackground(new Color(50,150,250,100));
            jLabelIdeas.setForeground(new Color(255,255,255,200));
        }
    }//GEN-LAST:event_PanelIdeasMouseEntered

    private void PanelIdeasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelIdeasMouseExited
        panelGeneral.revalidate();
        panelGeneral.repaint();
        if(seleccionado!=TipoBoton.IDEA){
            PanelIdeas.setBackground(new Color(50,150,250,0));
            jLabelIdeas.setForeground(new Color(255,255,255,150));
        }
    }//GEN-LAST:event_PanelIdeasMouseExited

    private void PanelDenunciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDenunciasMouseEntered
        panelGeneral.revalidate();
        panelGeneral.repaint();
        if(seleccionado!=TipoBoton.DENUNCIA){
            PanelDenuncias.setBackground(new Color(50,150,250,100));
            jLabelDenuncias.setForeground(new Color(255,255,255,200));
        }
    }//GEN-LAST:event_PanelDenunciasMouseEntered

    private void PanelDenunciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDenunciasMouseExited
        panelGeneral.revalidate();
        panelGeneral.repaint();
        if(seleccionado!=TipoBoton.DENUNCIA){
            PanelDenuncias.setBackground(new Color(50,150,250,0));
            jLabelDenuncias.setForeground(new Color(255,255,255,150));
        }
    }//GEN-LAST:event_PanelDenunciasMouseExited

    private void PanelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelInicioMouseClicked
        colorBoton();
        PanelInicio.setBackground(new Color(50,150,250,255));
        jLabelInicio.setForeground(new Color(255,255,255,255));
        seleccionado = TipoBoton.INICIO;
        panelGeneral.apagarPaneles();
        panelGeneral.getPanelInicio().setVisible(true);        
    }//GEN-LAST:event_PanelInicioMouseClicked

    private void PanelUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelUsuarioMouseClicked
        colorBoton();
        PanelUsuario.setBackground(new Color(50,150,250,255));
        jLabelUsuarios.setForeground(new Color(255,255,255,255));
        seleccionado = TipoBoton.USUARIO;
        panelGeneral.apagarPaneles();
        panelGeneral.getPanelUsuario().setVisible(true);
        panelGeneral.getPanelUsuario().busqueda();
    }//GEN-LAST:event_PanelUsuarioMouseClicked

    private void PanelIncidenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelIncidenciasMouseClicked
        colorBoton();
        PanelIncidencias.setBackground(new Color(50,150,250,255));
        jLabelIncidencias.setForeground(new Color(255,255,255,255));
        seleccionado = TipoBoton.INCIDENCIA;
        panelGeneral.apagarPaneles();
        panelGeneral.getPanelIncidencia().setVisible(true);
        panelGeneral.getPanelIncidencia().busqueda();
    }//GEN-LAST:event_PanelIncidenciasMouseClicked

    private void PanelIdeasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelIdeasMouseClicked
        colorBoton();
        PanelIdeas.setBackground(new Color(50,150,250,255));
        jLabelIdeas.setForeground(new Color(255,255,255,255));
        seleccionado = TipoBoton.IDEA;
        panelGeneral.apagarPaneles();
        panelGeneral.getPanelIdea().setVisible(true);
        panelGeneral.getPanelIdea().busqueda();
    }//GEN-LAST:event_PanelIdeasMouseClicked

    private void PanelDenunciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDenunciasMouseClicked
        colorBoton();
        PanelDenuncias.setBackground(new Color(50,150,250,255));
        jLabelDenuncias.setForeground(new Color(255,255,255,255));
        seleccionado = TipoBoton.DENUNCIA;
        panelGeneral.apagarPaneles();
        panelGeneral.getPanelDenuncia().setVisible(true);
        panelGeneral.getPanelDenuncia().busqueda();
    }//GEN-LAST:event_PanelDenunciasMouseClicked

    public void setSeleccionado(int seleccionado) {
        this.seleccionado = seleccionado;
    }

    public int getSeleccionado() {
        return seleccionado;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDenuncias;
    private javax.swing.JPanel PanelIdeas;
    private javax.swing.JPanel PanelIncidencias;
    private javax.swing.JPanel PanelInicio;
    private javax.swing.JPanel PanelUsuario;
    private javax.swing.JLabel jLabelDenuncias;
    private javax.swing.JLabel jLabelIdeas;
    private javax.swing.JLabel jLabelIncidencias;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelUsuarios;
    // End of variables declaration//GEN-END:variables
}
