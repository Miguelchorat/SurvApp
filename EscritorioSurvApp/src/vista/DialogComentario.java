package vista;

import com.google.gson.reflect.TypeToken;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import modelo.Busqueda;
import modelo.Comentario;
import modelo.ModeloComentario;
import util.Protocolo;
/**
 *
 * @author chorat
 */
public class DialogComentario extends javax.swing.JDialog implements Protocolo{
    
    private PanelGeneral panelGeneral;
    private int pagina;
    private GridBagConstraints grid;
    private List<Comentario> listaComentarios;
    private static final int PAGINAS = 7;
    private int id;
    
    public DialogComentario(java.awt.Frame parent, boolean modal, PanelGeneral panelGeneral, int id) {
        this.panelGeneral = panelGeneral;
        initComponents();
        pagina = PAGINAS;
        grid = new GridBagConstraints();
        grid.weightx=35; 
        grid.insets=new Insets(10,10,10,10);
        listaComentarios = new ArrayList<>();
        jButtonAtras.setEnabled(false);
        this.id = id;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        panelHerramientaVentanaDialog = new vista.PanelHerramientaVentanaDialog();
        jButtonSiguiente = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jScrollPaneComentarios = new javax.swing.JScrollPane();
        jPanelComentarios = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(380, 525));
        setMinimumSize(new java.awt.Dimension(380, 525));
        setModal(true);
        setUndecorated(true);
        setResizable(false);

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 150, 250)));
        Panel.setMaximumSize(new java.awt.Dimension(380, 525));
        Panel.setMinimumSize(new java.awt.Dimension(380, 525));

        panelHerramientaVentanaDialog = new vista.PanelHerramientaVentanaDialog(this,"VER COMENTARIOS");

        
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

        jScrollPaneComentarios.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneComentarios.setBorder(null);
        jScrollPaneComentarios.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneComentarios.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneComentarios.setMaximumSize(new java.awt.Dimension(378, 2500));
        jScrollPaneComentarios.setMinimumSize(new java.awt.Dimension(378, 435));
        jScrollPaneComentarios.setPreferredSize(new java.awt.Dimension(378, 435));

        jPanelComentarios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelComentarios.setMaximumSize(new java.awt.Dimension(378, 2500));
        jPanelComentarios.setMinimumSize(new java.awt.Dimension(378, 435));
        jPanelComentarios.setLayout(new java.awt.GridBagLayout());
        jScrollPaneComentarios.setViewportView(jPanelComentarios);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHerramientaVentanaDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPaneComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(panelHerramientaVentanaDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        if(pagina>=PAGINAS){
            pagina+=PAGINAS;
            jButtonAtras.setEnabled(true);
        }
        busqueda();
        if(listaComentarios.size()<PAGINAS){
            jButtonSiguiente.setEnabled(false);
        }
        busqueda();
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        jButtonSiguiente.setEnabled(true);
        if(pagina>PAGINAS){
            pagina-=PAGINAS;
        }
        if(pagina==PAGINAS)
        jButtonAtras.setEnabled(false);
        busqueda();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    public void busqueda(){
        try {
            VistaPrincipal vp = panelGeneral.getVp();
            vp.getSalida().writeInt(LISTAR_COMENTARIOS);
            Busqueda busqueda = new Busqueda(id,pagina+"");
            vp.getSalida().writeUTF(vp.getGson().toJson(busqueda));
            TypeToken<List<Comentario>> token = new TypeToken<List<Comentario>>() {};
            listaComentarios = vp.getGson().fromJson((String) vp.getEntrada().readUTF(), token.getType());
            generarComentarios();
            if(listaComentarios.size()<PAGINAS)
                jButtonSiguiente.setEnabled(false);
        } catch (IOException ex) {
        }
    }
    
    public void generarComentarios(){
         int y = 1;
        int x = 1;
        jPanelComentarios.removeAll();
        jPanelComentarios.repaint();
        jPanelComentarios.revalidate();
        
        for(int i=0;i<listaComentarios.size();i++){

            ModeloComentario mComentario = new ModeloComentario(panelGeneral,listaComentarios.get(i),this);                                    
            mComentario.getjLabelDescripcion().setText("<html>"+listaComentarios.get(i).getDescripcion()+"</html>");
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            mComentario.getjLabelFecha().setText(df.format(listaComentarios.get(i).getFecha_creacion()));
            mComentario.getjLabelUsuario().setText(listaComentarios.get(i).getUsuario().getNombre());
            
            Image img = new ImageIcon(getClass().getResource("/imagen/"+listaComentarios.get(i).getUsuario().getAvatar()+".png")).getImage();
            ImageIcon icono = new ImageIcon(img.getScaledInstance(53, 53, Image.SCALE_SMOOTH));
            mComentario.getjLabelIcono().setIcon(icono);
            
            grid.gridx = x;
            grid.gridy = y;
            jPanelComentarios.add(mComentario,grid);
            y++;
            
        }  
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogComentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogComentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogComentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogComentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogComentario dialog = new DialogComentario(new javax.swing.JFrame(), true, null, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JPanel jPanelComentarios;
    private javax.swing.JScrollPane jScrollPaneComentarios;
    private vista.PanelHerramientaVentanaDialog panelHerramientaVentanaDialog;
    // End of variables declaration//GEN-END:variables
}
