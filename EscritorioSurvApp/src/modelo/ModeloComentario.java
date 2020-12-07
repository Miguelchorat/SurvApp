package modelo;

import java.io.IOException;
import javax.swing.JLabel;
import util.Protocolo;
import vista.DialogComentario;
import vista.DialogEliminar;
import vista.DialogMensaje;
import vista.PanelGeneral;
import vista.VistaPrincipal;

/**
 *
 * @author chorat
 */
public class ModeloComentario extends javax.swing.JPanel implements Protocolo{

    private PanelGeneral panelGeneral;
    private Comentario comentario;
    private DialogComentario dialog;
    
    public ModeloComentario(PanelGeneral panelGeneral,Comentario comentario,DialogComentario dialog) {
        initComponents();
        this.panelGeneral = panelGeneral;
        this.comentario = comentario;
        this.dialog = dialog;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAvatar = new javax.swing.JPanel();
        jLabelIcono = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        setMaximumSize(new java.awt.Dimension(345, 85));
        setMinimumSize(new java.awt.Dimension(345, 85));
        setPreferredSize(new java.awt.Dimension(345, 85));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        PanelAvatar.setBackground(new java.awt.Color(255, 255, 255));
        PanelAvatar.setMaximumSize(new java.awt.Dimension(53, 53));
        PanelAvatar.setMinimumSize(new java.awt.Dimension(53, 53));
        PanelAvatar.setPreferredSize(new java.awt.Dimension(53, 53));

        jLabelIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcono.setMaximumSize(new java.awt.Dimension(53, 53));
        jLabelIcono.setMinimumSize(new java.awt.Dimension(53, 53));
        jLabelIcono.setPreferredSize(new java.awt.Dimension(53, 53));

        javax.swing.GroupLayout PanelAvatarLayout = new javax.swing.GroupLayout(PanelAvatar);
        PanelAvatar.setLayout(PanelAvatarLayout);
        PanelAvatarLayout.setHorizontalGroup(
            PanelAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAvatarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelAvatarLayout.setVerticalGroup(
            PanelAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabelUsuario.setFont(new java.awt.Font("Rubik", 1, 11)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(50, 150, 250));
        jLabelUsuario.setText("Miguel");

        jLabelDescripcion.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDescripcion.setText("Descripción del comentario");
        jLabelDescripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelFecha.setFont(new java.awt.Font("Rubik", 1, 11)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(50, 150, 250));
        jLabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelFecha.setText("00-00-000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        try {
            DialogEliminar eliminar = new DialogEliminar(null,true,"¿Estás seguro de eliminar el comentario?","ELIMINAR");
            eliminar.setVisible(true);
            int result = eliminar.getResultado();
            if(result == 1){
                VistaPrincipal vp = panelGeneral.getVp();
                vp.getSalida().writeInt(ELIMINAR_COMENTARIO);
                vp.getSalida().writeInt(comentario.getId());
                result = vp.getEntrada().readInt();
                if(result==ELIMINAR_COMENTARIO_EXITOSO){
                    DialogMensaje dialogMsj = new DialogMensaje(null, true, "Fue eliminado satisfactoriamente");
                    dialogMsj.setVisible(true);
                    dialog.busqueda();
                }
                else{
                    DialogMensaje dialogMsj = new DialogMensaje(null, true, "No se pudo eliminar por un error inesperado");
                    dialogMsj.setVisible(true);
                }
                panelGeneral.getPanelIdea().busqueda();
            }
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_formMouseClicked

    public JLabel getjLabelDescripcion() {
        return jLabelDescripcion;
    }

    public JLabel getjLabelIcono() {
        return jLabelIcono;
    }

    public JLabel getjLabelUsuario() {
        return jLabelUsuario;
    }

    public JLabel getjLabelFecha() {
        return jLabelFecha;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAvatar;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelUsuario;
    // End of variables declaration//GEN-END:variables
}
