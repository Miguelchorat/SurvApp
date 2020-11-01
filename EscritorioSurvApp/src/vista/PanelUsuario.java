package vista;

import com.google.gson.reflect.TypeToken;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Busqueda;
import modelo.ModeloTablaUsuarios;
import modelo.Usuario;
import util.Protocolo;

/**
 *
 * @author chorat
 */
public class PanelUsuario extends javax.swing.JPanel implements Protocolo{
    
    private PanelGeneral panelGeneral;
    private int pagina;
    private ModeloTablaUsuarios modelo;
    private List<Usuario> listaUsuarios;
    private static final int PAGINAS = 25;
    private VistaPrincipal vp;

    public PanelUsuario() {
    }
    
    public PanelUsuario(PanelGeneral panelGeneral) {
        this.panelGeneral = panelGeneral;
        vp = panelGeneral.getVp();
        initComponents();
        listaUsuarios = new ArrayList<Usuario>();
        jButtonAtras.setEnabled(false);
        this.pagina=PAGINAS;   
        modelo = new ModeloTablaUsuarios();
        jTableUsuarios.setModel(modelo);
        refrescarProyectos();
        tamañoJTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFiltro = new javax.swing.JPanel();
        jTextFieldFiltro = new javax.swing.JTextField();
        jLabelIconoFiltro = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonAtras = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 245, 245));
        setMaximumSize(new java.awt.Dimension(750, 625));
        setMinimumSize(new java.awt.Dimension(750, 625));
        setPreferredSize(new java.awt.Dimension(750, 625));

        panelFiltro.setBackground(new java.awt.Color(255, 255, 255));
        panelFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFiltro.setMaximumSize(new java.awt.Dimension(678, 35));
        panelFiltro.setMinimumSize(new java.awt.Dimension(678, 35));

        jTextFieldFiltro.setBorder(null);
        jTextFieldFiltro.setMaximumSize(new java.awt.Dimension(675, 33));
        jTextFieldFiltro.setMinimumSize(new java.awt.Dimension(675, 33));
        jTextFieldFiltro.setPreferredSize(new java.awt.Dimension(675, 33));
        jTextFieldFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFiltroKeyReleased(evt);
            }
        });

        jLabelIconoFiltro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconoFiltro.setMaximumSize(new java.awt.Dimension(33, 33));
        jLabelIconoFiltro.setMinimumSize(new java.awt.Dimension(33, 33));
        jLabelIconoFiltro.setPreferredSize(new java.awt.Dimension(33, 33));

        javax.swing.GroupLayout panelFiltroLayout = new javax.swing.GroupLayout(panelFiltro);
        panelFiltro.setLayout(panelFiltroLayout);
        panelFiltroLayout.setHorizontalGroup(
            panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        panelFiltroLayout.setVerticalGroup(
            panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelIconoFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Image logo = new ImageIcon(getClass().getResource("/imagen/buscar.png")).getImage();
        ImageIcon logoIcon = new ImageIcon(logo.getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        jLabelIconoFiltro.setIcon(logoIcon);

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane.setMaximumSize(new java.awt.Dimension(730, 504));
        jScrollPane.setMinimumSize(new java.awt.Dimension(730, 504));
        jScrollPane.setPreferredSize(new java.awt.Dimension(730, 504));

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableUsuarios.setMaximumSize(new java.awt.Dimension(730, 507));
        jTableUsuarios.setMinimumSize(new java.awt.Dimension(730, 507));
        jTableUsuarios.setPreferredSize(new java.awt.Dimension(730, 507));
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(jTableUsuarios);

        jButtonAtras.setBackground(new java.awt.Color(50, 150, 250));
        jButtonAtras.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setText("<<");
        jButtonAtras.setMaximumSize(new java.awt.Dimension(85, 35));
        jButtonAtras.setMinimumSize(new java.awt.Dimension(85, 35));
        jButtonAtras.setPreferredSize(new java.awt.Dimension(85, 35));
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonSiguiente.setBackground(new java.awt.Color(50, 150, 250));
        jButtonSiguiente.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jButtonSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSiguiente.setText(">>");
        jButtonSiguiente.setMaximumSize(new java.awt.Dimension(85, 35));
        jButtonSiguiente.setMinimumSize(new java.awt.Dimension(85, 35));
        jButtonSiguiente.setPreferredSize(new java.awt.Dimension(85, 35));
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltroKeyReleased
        pagina = PAGINAS;
        busqueda();
        jButtonSiguiente.setEnabled(true);
        if(listaUsuarios.size()<PAGINAS)
            jButtonSiguiente.setEnabled(false);
        jButtonAtras.setEnabled(false);
    }//GEN-LAST:event_jTextFieldFiltroKeyReleased

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        if(evt.getClickCount() == 2){
            JTable target = (JTable) evt.getSource();
            int row = target.getSelectedRow();
            Usuario user = null;
            for(Usuario u: listaUsuarios){
                if(u.getId()==(int)jTableUsuarios.getValueAt(row, 0)){
                    user = u;
                }
            }
            try {
                vp.iniciarSocket();
                vp.getSalida().writeInt(COMPROBAR_SESION);
                vp.getSalida().writeUTF(vp.getGson().toJson(user));
                int estado = vp.getEntrada().readInt();

                if(estado == COMPROBAR_SESION_EXITO){
                    DialogModificarUsuario modificarUsuario = new DialogModificarUsuario(panelGeneral.getVp(),true,panelGeneral,user);
                    modificarUsuario.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(vp,"La sesión esta iniciada por lo cual no se puede sus modificar datos.");
                }
            } catch (IOException ex) {
                Logger.getLogger(PanelUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTableUsuariosMouseClicked

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        jButtonSiguiente.setEnabled(true);
        if(pagina>PAGINAS){
            pagina-=PAGINAS;
        }
        if(pagina==PAGINAS)
        jButtonAtras.setEnabled(false);
        busqueda();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        if(pagina>=PAGINAS)
        pagina+=PAGINAS;
        jButtonAtras.setEnabled(true);
        busqueda();
        if(listaUsuarios.size()<PAGINAS){
            jButtonSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed
    
    public void busqueda(){
        try {            
            vp.iniciarSocket();
            vp.getSalida().writeInt(LISTAR_USUARIOS);
            Busqueda busqueda = new Busqueda(pagina,jTextFieldFiltro.getText());
            vp.getSalida().writeUTF(vp.getGson().toJson(busqueda));
            TypeToken<List<Usuario>> token = new TypeToken<List<Usuario>>() {};
            listaUsuarios = vp.getGson().fromJson((String) vp.getEntrada().readUTF(), token.getType());
            refrescarProyectos();
        } catch (IOException ex) {
            Logger.getLogger(PanelUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tamañoJTable(){
        jTableUsuarios.setRowHeight(20);
        jTableUsuarios.getColumn("ID").setPreferredWidth(10);
        jTableUsuarios.getColumn("AVATAR").setPreferredWidth(10);
        jTableUsuarios.getColumn("NOMBRE").setPreferredWidth(50);
        jTableUsuarios.getColumn("CORREO").setPreferredWidth(200);
        jTableUsuarios.getColumn("FECHA ALTA").setPreferredWidth(30);
        jTableUsuarios.getColumn("ADMINISTRAR").setPreferredWidth(35);
    }
    
    public void refrescarProyectos(){
        modelo.refreshTableModel(listaUsuarios); 
    } 
    
    public void vaciarLista(){
        listaUsuarios = new ArrayList<Usuario>();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabelIconoFiltro;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldFiltro;
    private javax.swing.JPanel panelFiltro;
    // End of variables declaration//GEN-END:variables
}
