package modelo;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Incidencia;
import util.EstadoIncidencia;
import util.Protocolo;
import vista.DialogEditarIncidencia;
import vista.DialogInfoIncidencia;
import vista.PanelGeneral;
import vista.VistaPrincipal;

/**
 *
 * @author chorat
 */
public class ModeloIncidencia extends javax.swing.JPanel implements Protocolo{

    
    private PanelGeneral panelGeneral;
    private Incidencia incidencia;
    private EstadoIncidencia estado;
    
    public ModeloIncidencia(PanelGeneral pg,Incidencia incidencia) {
        initComponents();
        this.setVisible(true);
        this.panelGeneral = pg;
        this.incidencia = incidencia;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanelSeparador = new javax.swing.JPanel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelTituloEstado = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelEliminar = new javax.swing.JLabel();
        jLabelEditar = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(600, 200));
        setMinimumSize(new java.awt.Dimension(600, 200));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 200));

        jLabelTitulo.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitulo.setText("Titulo");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(656, 40));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(656, 40));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(656, 40));

        jPanelSeparador.setBackground(new java.awt.Color(0, 0, 0));
        jPanelSeparador.setMaximumSize(new java.awt.Dimension(678, 2));
        jPanelSeparador.setMinimumSize(new java.awt.Dimension(678, 2));
        jPanelSeparador.setPreferredSize(new java.awt.Dimension(678, 2));

        javax.swing.GroupLayout jPanelSeparadorLayout = new javax.swing.GroupLayout(jPanelSeparador);
        jPanelSeparador.setLayout(jPanelSeparadorLayout);
        jPanelSeparadorLayout.setHorizontalGroup(
            jPanelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelSeparadorLayout.setVerticalGroup(
            jPanelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabelDescripcion.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        jLabelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDescripcion.setText("Descripcion");
        jLabelDescripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelFecha.setBackground(new java.awt.Color(50, 150, 250));
        jLabelFecha.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(50, 150, 250));
        jLabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelFecha.setText("Fecha");
        jLabelFecha.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelTituloEstado.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelTituloEstado.setForeground(new java.awt.Color(50, 150, 250));
        jLabelTituloEstado.setText("Estado:");

        jLabelEstado.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEstado.setText("---");

        jLabelEliminar.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelEliminar.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelEliminar.setPreferredSize(new java.awt.Dimension(25, 25));
        jLabelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEliminarMouseClicked(evt);
            }
        });

        jLabelEditar.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelEditar.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelEditar.setPreferredSize(new java.awt.Dimension(25, 25));
        jLabelEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditarMouseClicked(evt);
            }
        });

        jLabelInfo.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelInfo.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelInfo.setPreferredSize(new java.awt.Dimension(25, 25));
        jLabelInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInfoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelDescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTituloEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(227, 227, 227)
                                .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTituloEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEstado))
                    .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        Image logoEliminar = new ImageIcon(getClass().getResource("/imagen/eliminar.png")).getImage();
        ImageIcon logoIconEliminar = new ImageIcon(logoEliminar.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        jLabelEliminar.setIcon(logoIconEliminar);
        Image logoEditar = new ImageIcon(getClass().getResource("/imagen/editar.png")).getImage();
        ImageIcon logoIconEditar = new ImageIcon(logoEditar.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        jLabelEditar.setIcon(logoIconEditar);
        Image logoInfo = new ImageIcon(getClass().getResource("/imagen/info.png")).getImage();
        ImageIcon logoIconInfo = new ImageIcon(logoInfo.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        jLabelInfo.setIcon(logoIconInfo);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarMouseClicked
        try {
            if(!incidencia.getEstado().equals(estado.FINALIZADA)){
                JOptionPane.showMessageDialog(panelGeneral.getVp(), "La incidencia no ha sido resuelta.");
            }else{
                int result = JOptionPane.showConfirmDialog(panelGeneral.getVp(),"¿Estás seguro de eliminar la incidencia?","Eliminar incidencia",JOptionPane.YES_NO_OPTION);
                if(result == 0){
                    VistaPrincipal vp = panelGeneral.getVp();
                    vp.iniciarSocket();
                    vp.getSalida().writeInt(ELIMINAR_INCIDENCIA);
                    vp.getSalida().writeInt(incidencia.getId());
                    result = vp.getEntrada().readInt();
                    if(result==ELIMINAR_INCIDENCIA_EXITOSA)
                        JOptionPane.showMessageDialog(panelGeneral.getVp(), "Fue eliminado satisfactoriamente");
                    else
                        JOptionPane.showMessageDialog(panelGeneral.getVp(), "No se pudo eliminar por un error inesperado");
                    panelGeneral.getPanelIncidencia().busqueda();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ModeloIncidencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelEliminarMouseClicked

    private void jLabelInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInfoMouseClicked
        DialogInfoIncidencia dialog = new DialogInfoIncidencia(panelGeneral.getVp(), true, incidencia);
        dialog.setVisible(true);
    }//GEN-LAST:event_jLabelInfoMouseClicked

    private void jLabelEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditarMouseClicked
        DialogEditarIncidencia dialog = new DialogEditarIncidencia(panelGeneral.getVp(), true, panelGeneral, incidencia);
        dialog.setVisible(true);
        panelGeneral.getPanelIncidencia().busqueda();
    }//GEN-LAST:event_jLabelEditarMouseClicked
    
    public JLabel getjLabelDescripcion() {
        return jLabelDescripcion;
    }

    public JLabel getjLabelEstado() {
        return jLabelEstado;
    }

    public JLabel getjLabelFecha() {
        return jLabelFecha;
    }

    public JLabel getjLabelTitulo() {
        return jLabelTitulo;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEditar;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloEstado;
    private javax.swing.JPanel jPanelSeparador;
    // End of variables declaration//GEN-END:variables
}
