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
import modelo.Incidencia;
import modelo.ModeloIncidencia;
import util.Protocolo;

/**
 *
 * @author chorat
 */
public class PanelIncidencia extends javax.swing.JPanel implements Protocolo{

    private PanelGeneral panelGeneral;
    private int pagina;
    private GridBagConstraints grid;
    private List<Incidencia> listaIncidencias;
    private static final int PAGINAS = 7;
    
    public PanelIncidencia() {
    }
    
    public PanelIncidencia(PanelGeneral panelGeneral) {
        this.panelGeneral = panelGeneral;
        initComponents();
        pagina = PAGINAS;
        grid = new GridBagConstraints();
        grid.weightx=35; 
        grid.insets=new Insets(10,10,10,10);
        listaIncidencias = new ArrayList<>();
        jButtonAtras.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFiltro = new javax.swing.JPanel();
        jTextFieldFiltro = new javax.swing.JTextField();
        jLabelIconoFiltro = new javax.swing.JLabel();
        jPanelInfo = new javax.swing.JPanel();
        jScrollPaneIncidencia = new javax.swing.JScrollPane();
        jPanelIncidencias = new javax.swing.JPanel();
        jButtonAtras = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(750, 625));
        setMinimumSize(new java.awt.Dimension(750, 625));

        panelFiltro.setBackground(new java.awt.Color(255, 255, 255));
        panelFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFiltro.setMaximumSize(new java.awt.Dimension(730, 35));
        panelFiltro.setMinimumSize(new java.awt.Dimension(730, 35));
        panelFiltro.setPreferredSize(new java.awt.Dimension(730, 35));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIconoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        panelFiltroLayout.setVerticalGroup(
            panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelIconoFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Image logo = new ImageIcon(getClass().getResource("/imagen/buscar.png")).getImage();
        ImageIcon logoIcon = new ImageIcon(logo.getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        jLabelIconoFiltro.setIcon(logoIcon);

        jPanelInfo.setBackground(new java.awt.Color(250, 250, 250));
        jPanelInfo.setMaximumSize(new java.awt.Dimension(750, 568));
        jPanelInfo.setMinimumSize(new java.awt.Dimension(750, 568));
        jPanelInfo.setPreferredSize(new java.awt.Dimension(750, 568));

        jScrollPaneIncidencia.setBackground(new java.awt.Color(250, 250, 250));
        jScrollPaneIncidencia.setBorder(null);
        jScrollPaneIncidencia.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneIncidencia.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneIncidencia.setMaximumSize(new java.awt.Dimension(730, 504));
        jScrollPaneIncidencia.setMinimumSize(new java.awt.Dimension(730, 504));

        jPanelIncidencias.setBackground(new java.awt.Color(250, 250, 250));
        jPanelIncidencias.setMaximumSize(new java.awt.Dimension(730, 504));
        jPanelIncidencias.setMinimumSize(new java.awt.Dimension(730, 504));
        jPanelIncidencias.setLayout(new java.awt.GridBagLayout());
        jScrollPaneIncidencia.setViewportView(jPanelIncidencias);

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

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
            .addComponent(jScrollPaneIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltroKeyReleased
        pagina = PAGINAS;
        busqueda();
        jButtonSiguiente.setEnabled(true);
        if(listaIncidencias.size()<PAGINAS)
            jButtonSiguiente.setEnabled(false);
        jButtonAtras.setEnabled(false);
    }//GEN-LAST:event_jTextFieldFiltroKeyReleased

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
        if(pagina>=PAGINAS){
            pagina+=PAGINAS;
            jButtonAtras.setEnabled(true);
        }
        busqueda();
        if(listaIncidencias.size()<PAGINAS){
            jButtonSiguiente.setEnabled(false);
        }
        busqueda();
    }//GEN-LAST:event_jButtonSiguienteActionPerformed
    
    public void busqueda(){
        try {
            VistaPrincipal vp = panelGeneral.getVp();
            vp.getSalida().writeInt(LISTAR_INCIDENCIAS);
            Busqueda busqueda = new Busqueda(pagina,jTextFieldFiltro.getText());
            vp.getSalida().writeUTF(vp.getGson().toJson(busqueda));
            TypeToken<List<Incidencia>> token = new TypeToken<List<Incidencia>>() {};
            listaIncidencias = vp.getGson().fromJson((String) vp.getEntrada().readUTF(), token.getType());
            if(listaIncidencias.size()<PAGINAS)
                jButtonSiguiente.setEnabled(false);
            generarIncidencias();
        } catch (IOException ex) {
        }
    }
    
    public void generarIncidencias(){
        int y = 1;
        int x = 1;
        jPanelIncidencias.removeAll();
        jPanelIncidencias.repaint();
        jPanelIncidencias.revalidate();
        
        for(int i=0;i<listaIncidencias.size();i++){

            ModeloIncidencia incidencia = new ModeloIncidencia(panelGeneral,listaIncidencias.get(i));
            incidencia.getjLabelTitulo().setText(listaIncidencias.get(i).getTitulo());
            incidencia.getjLabelEstado().setText(listaIncidencias.get(i).getEstado().name());
            incidencia.getjLabelDescripcion().setText("<html>"+listaIncidencias.get(i).getDescripcion()+"</html>");
            incidencia.getjLabelId().setText("ID: "+listaIncidencias.get(i).getId()+"");
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            incidencia.getjLabelFecha().setText(df.format(listaIncidencias.get(i).getFecha()));
            grid.gridx = x;
            grid.gridy = y;
            jPanelIncidencias.add(incidencia,grid);
            y++;
            
        }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabelIconoFiltro;
    private javax.swing.JPanel jPanelIncidencias;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JScrollPane jScrollPaneIncidencia;
    private javax.swing.JTextField jTextFieldFiltro;
    private javax.swing.JPanel panelFiltro;
    // End of variables declaration//GEN-END:variables
}
