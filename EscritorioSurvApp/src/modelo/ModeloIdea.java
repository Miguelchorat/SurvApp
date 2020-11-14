package modelo;

import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import util.Protocolo;
import vista.DialogComentario;
import vista.DialogEliminar;
import vista.DialogIdea;
import vista.DialogMensaje;
import vista.PanelGeneral;
import vista.VistaPrincipal;

/**
 *
 * @author chorat
 */
public class ModeloIdea extends javax.swing.JPanel implements Protocolo{
    
    private PanelGeneral panelGeneral;
    private Idea idea;
    
    public ModeloIdea(PanelGeneral panelGeneral,Idea idea) {
        initComponents();
        this.panelGeneral = panelGeneral;
        this.idea = idea;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanelSeparador = new javax.swing.JPanel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelNombreAutor = new javax.swing.JLabel();
        jLabelEliminar = new javax.swing.JLabel();
        jLabelEditar = new javax.swing.JLabel();
        PanelRespuestas = new javax.swing.JPanel();
        jLabelRespuesta1 = new javax.swing.JLabel();
        jLabelTituloTema = new javax.swing.JLabel();
        jLabelTema = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelComentario = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(600, 200));
        setMinimumSize(new java.awt.Dimension(600, 200));
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
        jLabelDescripcion.setMaximumSize(new java.awt.Dimension(300, 75));
        jLabelDescripcion.setMinimumSize(new java.awt.Dimension(300, 75));
        jLabelDescripcion.setPreferredSize(new java.awt.Dimension(300, 75));

        jLabelFecha.setBackground(new java.awt.Color(50, 150, 250));
        jLabelFecha.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(50, 150, 250));
        jLabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelFecha.setText("Fecha");
        jLabelFecha.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelAutor.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(50, 150, 250));
        jLabelAutor.setText("Autor:");
        jLabelAutor.setMaximumSize(new java.awt.Dimension(57, 20));
        jLabelAutor.setMinimumSize(new java.awt.Dimension(57, 20));
        jLabelAutor.setName(""); // NOI18N
        jLabelAutor.setPreferredSize(new java.awt.Dimension(57, 20));

        jLabelNombreAutor.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelNombreAutor.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombreAutor.setText("---");
        jLabelNombreAutor.setMaximumSize(new java.awt.Dimension(140, 22));
        jLabelNombreAutor.setMinimumSize(new java.awt.Dimension(140, 22));
        jLabelNombreAutor.setPreferredSize(new java.awt.Dimension(140, 22));

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

        PanelRespuestas.setBackground(new java.awt.Color(255, 255, 255));
        PanelRespuestas.setMaximumSize(new java.awt.Dimension(270, 75));
        PanelRespuestas.setMinimumSize(new java.awt.Dimension(270, 75));
        PanelRespuestas.setPreferredSize(new java.awt.Dimension(270, 75));

        jLabelRespuesta1.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        jLabelRespuesta1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRespuesta1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelRespuesta1.setMaximumSize(new java.awt.Dimension(270, 75));
        jLabelRespuesta1.setMinimumSize(new java.awt.Dimension(270, 75));
        jLabelRespuesta1.setPreferredSize(new java.awt.Dimension(270, 75));

        javax.swing.GroupLayout PanelRespuestasLayout = new javax.swing.GroupLayout(PanelRespuestas);
        PanelRespuestas.setLayout(PanelRespuestasLayout);
        PanelRespuestasLayout.setHorizontalGroup(
            PanelRespuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRespuesta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelRespuestasLayout.setVerticalGroup(
            PanelRespuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRespuesta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabelTituloTema.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelTituloTema.setForeground(new java.awt.Color(50, 150, 250));
        jLabelTituloTema.setText("Tema:");

        jLabelTema.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelTema.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTema.setText("---");
        jLabelTema.setMaximumSize(new java.awt.Dimension(140, 22));
        jLabelTema.setMinimumSize(new java.awt.Dimension(140, 22));
        jLabelTema.setPreferredSize(new java.awt.Dimension(140, 22));

        jLabelId.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(102, 102, 102));
        jLabelId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelId.setMaximumSize(new java.awt.Dimension(97, 19));
        jLabelId.setMinimumSize(new java.awt.Dimension(97, 19));
        jLabelId.setPreferredSize(new java.awt.Dimension(97, 19));

        jLabelComentario.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelComentario.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelComentario.setPreferredSize(new java.awt.Dimension(25, 25));
        jLabelComentario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelComentarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 578, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabelTituloTema)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTema, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabelComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jPanelSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTituloTema, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        Image logoEliminar = new ImageIcon(getClass().getResource("/imagen/eliminar.png")).getImage();
        ImageIcon logoIconEliminar = new ImageIcon(logoEliminar.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        jLabelEliminar.setIcon(logoIconEliminar);
        Image logoInfo = new ImageIcon(getClass().getResource("/imagen/editar.png")).getImage();
        ImageIcon logoIconInfo = new ImageIcon(logoInfo.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        jLabelEditar.setIcon(logoIconInfo);
        Image logoInfo1 = new ImageIcon(getClass().getResource("/imagen/lista.png")).getImage();
        ImageIcon logoIconInfo1 = new ImageIcon(logoInfo1.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        jLabelComentario.setIcon(logoIconInfo1);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarMouseClicked
        try {
            DialogEliminar eliminar = new DialogEliminar(panelGeneral.getVp(),true,"¿Estás seguro de eliminar la idea?","ELIMINAR");
            eliminar.setVisible(true);
            int result = eliminar.getResultado();
            if(result == 1){
                VistaPrincipal vp = panelGeneral.getVp();
                vp.iniciarSocket();
                vp.getSalida().writeInt(ELIMINAR_IDEA);
                vp.getSalida().writeInt(idea.getId());
                result = vp.getEntrada().readInt();
                if(result==ELIMINAR_IDEA_EXITOSA){
                    DialogMensaje dialog = new DialogMensaje(panelGeneral.getVp(), true, "Fue eliminado satisfactoriamente");
                    dialog.setVisible(true);
                }
                else{
                    DialogMensaje dialog = new DialogMensaje(panelGeneral.getVp(), true, "No se pudo eliminar por un error inesperado");
                    dialog.setVisible(true);
                }
                panelGeneral.getPanelIdea().busqueda();
            }
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jLabelEliminarMouseClicked

    private void jLabelEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditarMouseClicked
        DialogIdea dialog = new DialogIdea(panelGeneral.getVp(),true,panelGeneral,idea.getId());        
        dialog.cargarDatos();
        dialog.setVisible(true);
    }//GEN-LAST:event_jLabelEditarMouseClicked

    private void jLabelComentarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelComentarioMouseClicked
        DialogComentario dialog = new DialogComentario(panelGeneral.getVp(),true,panelGeneral,idea.getId());
        dialog.busqueda();
        dialog.revalidate();
        dialog.repaint();
        dialog.setVisible(true);
    }//GEN-LAST:event_jLabelComentarioMouseClicked

    public JLabel getjLabelDescripcion() {
        return jLabelDescripcion;
    }

    public JLabel getjLabelFecha() {
        return jLabelFecha;
    }

    public JLabel getjLabelNombreAutor() {
        return jLabelNombreAutor;
    }

    public JLabel getjLabelRespuesta1() {
        return jLabelRespuesta1;
    }

    public JLabel getjLabelId() {
        return jLabelId;
    }
    
    public JLabel getjLabelTema() {
        return jLabelTema;
    }

    public JLabel getjLabelTitulo() {
        return jLabelTitulo;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelRespuestas;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelComentario;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEditar;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNombreAutor;
    private javax.swing.JLabel jLabelRespuesta1;
    private javax.swing.JLabel jLabelTema;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloTema;
    private javax.swing.JPanel jPanelSeparador;
    // End of variables declaration//GEN-END:variables
}
