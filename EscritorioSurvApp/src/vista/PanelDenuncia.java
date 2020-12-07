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
import modelo.Denuncia;
import modelo.ModeloDenuncia;
import util.Protocolo;

/**
 *
 * @author chorat
 */
public class PanelDenuncia extends javax.swing.JPanel implements Protocolo{

    private PanelGeneral panelGeneral;
    private int pagina;
    private GridBagConstraints grid;
    private List<Denuncia> listaDenuncias;
    private static final int PAGINAS = 7;
    
    public PanelDenuncia() {
        
    }

    public PanelDenuncia(PanelGeneral panelGeneral){
        this.panelGeneral = panelGeneral;
        initComponents();
        pagina = PAGINAS;
        grid = new GridBagConstraints();
        grid.weightx=35; 
        grid.insets=new Insets(10,10,10,10);
        listaDenuncias = new ArrayList<>();
        jButtonAtras.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFiltro = new javax.swing.JPanel();
        jTextFieldFiltro = new javax.swing.JTextField();
        jLabelIconoFiltro = new javax.swing.JLabel();
        jPanelInfo = new javax.swing.JPanel();
        jScrollPaneDenuncia = new javax.swing.JScrollPane();
        jPanelDenuncias = new javax.swing.JPanel();
        jButtonAtras = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(750, 625));
        setMinimumSize(new java.awt.Dimension(750, 625));

        panelFiltro.setBackground(new java.awt.Color(255, 255, 255));
        panelFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFiltro.setMaximumSize(new java.awt.Dimension(730, 35));
        panelFiltro.setMinimumSize(new java.awt.Dimension(730, 35));

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

        jScrollPaneDenuncia.setBackground(new java.awt.Color(250, 250, 250));
        jScrollPaneDenuncia.setBorder(null);
        jScrollPaneDenuncia.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneDenuncia.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneDenuncia.setMaximumSize(new java.awt.Dimension(730, 504));
        jScrollPaneDenuncia.setMinimumSize(new java.awt.Dimension(730, 504));

        jPanelDenuncias.setBackground(new java.awt.Color(250, 250, 250));
        jPanelDenuncias.setMaximumSize(new java.awt.Dimension(730, 504));
        jPanelDenuncias.setMinimumSize(new java.awt.Dimension(730, 504));
        jPanelDenuncias.setLayout(new java.awt.GridBagLayout());
        jScrollPaneDenuncia.setViewportView(jPanelDenuncias);

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
            .addComponent(jScrollPaneDenuncia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneDenuncia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if(listaDenuncias.size()<PAGINAS)
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
        if(listaDenuncias.size()<PAGINAS){
            jButtonSiguiente.setEnabled(false);
        }
        busqueda();
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    public void busqueda(){
        try {
            VistaPrincipal vp = panelGeneral.getVp();
            vp.getSalida().writeInt(LISTAR_DENUNCIAS);
            Busqueda busqueda = new Busqueda(pagina,jTextFieldFiltro.getText());
            vp.getSalida().writeUTF(vp.getGson().toJson(busqueda));
            TypeToken<List<Denuncia>> token = new TypeToken<List<Denuncia>>() {};
            listaDenuncias = vp.getGson().fromJson((String) vp.getEntrada().readUTF(), token.getType());
            generarDenuncias();
            if(listaDenuncias.size()<PAGINAS)
                jButtonSiguiente.setEnabled(false);
        } catch (IOException ex) {
        }
    }
    
    public void generarDenuncias(){
        int y = 1;
        int x = 1;
        jPanelDenuncias.removeAll();
        jPanelDenuncias.repaint();
        jPanelDenuncias.revalidate();
        
        for(int i=0;i<listaDenuncias.size();i++){

            ModeloDenuncia denuncia = new ModeloDenuncia(panelGeneral,listaDenuncias.get(i));
            denuncia.getjLabelTitulo().setText(listaDenuncias.get(i).getTitulo());
            denuncia.getjLabelEstado().setText(listaDenuncias.get(i).getEstado().name());
            denuncia.getjLabelDescripcion().setText(listaDenuncias.get(i).getDescripcion());
            denuncia.getjLabelId().setText("ID: "+listaDenuncias.get(i).getId()+"");
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            denuncia.getjLabelFecha().setText(df.format(listaDenuncias.get(i).getFecha_creacion()));
            grid.gridx = x;
            grid.gridy = y;
            jPanelDenuncias.add(denuncia,grid);
            y++;  
        }  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabelIconoFiltro;
    private javax.swing.JPanel jPanelDenuncias;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JScrollPane jScrollPaneDenuncia;
    private javax.swing.JTextField jTextFieldFiltro;
    private javax.swing.JPanel panelFiltro;
    // End of variables declaration//GEN-END:variables
}
