package vista;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Sesion;
import util.Protocolo;

/**
 *
 * @author chorat
 */
public class PanelRecuperarCuenta extends javax.swing.JPanel implements Protocolo {

    private PanelInicial panelInicial;
    
    public PanelRecuperarCuenta() {
    }

    public PanelRecuperarCuenta(PanelInicial panelInicial) {
        this.panelInicial = panelInicial;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSeparador1 = new javax.swing.JPanel();
        jLabelCrearCuenta = new javax.swing.JLabel();
        jPanelSeparador2 = new javax.swing.JPanel();
        jLabelTituloCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jButtonRecuperar = new javax.swing.JButton();
        jLabelLogin = new javax.swing.JLabel();
        jPanelInfo = new javax.swing.JPanel();
        jLabelDato = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(485, 345));
        setMinimumSize(new java.awt.Dimension(485, 345));
        setPreferredSize(new java.awt.Dimension(485, 345));

        jPanelSeparador1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSeparador1.setMaximumSize(new java.awt.Dimension(60, 345));
        jPanelSeparador1.setMinimumSize(new java.awt.Dimension(60, 345));

        javax.swing.GroupLayout jPanelSeparador1Layout = new javax.swing.GroupLayout(jPanelSeparador1);
        jPanelSeparador1.setLayout(jPanelSeparador1Layout);
        jPanelSeparador1Layout.setHorizontalGroup(
            jPanelSeparador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanelSeparador1Layout.setVerticalGroup(
            jPanelSeparador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelCrearCuenta.setFont(new java.awt.Font("Rubik", 1, 28)); // NOI18N
        jLabelCrearCuenta.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCrearCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCrearCuenta.setText("Recuperar Cuenta");
        jLabelCrearCuenta.setMaximumSize(new java.awt.Dimension(465, 35));
        jLabelCrearCuenta.setMinimumSize(new java.awt.Dimension(465, 35));
        jLabelCrearCuenta.setPreferredSize(new java.awt.Dimension(465, 35));

        jPanelSeparador2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSeparador2.setMaximumSize(new java.awt.Dimension(60, 345));
        jPanelSeparador2.setMinimumSize(new java.awt.Dimension(60, 345));

        javax.swing.GroupLayout jPanelSeparador2Layout = new javax.swing.GroupLayout(jPanelSeparador2);
        jPanelSeparador2.setLayout(jPanelSeparador2Layout);
        jPanelSeparador2Layout.setHorizontalGroup(
            jPanelSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanelSeparador2Layout.setVerticalGroup(
            jPanelSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jLabelTituloCorreo.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelTituloCorreo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloCorreo.setText("CORREO ELECTRÓNICO");
        jLabelTituloCorreo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelTituloCorreo.setMaximumSize(new java.awt.Dimension(465, 15));
        jLabelTituloCorreo.setMinimumSize(new java.awt.Dimension(465, 15));
        jLabelTituloCorreo.setPreferredSize(new java.awt.Dimension(465, 15));

        jTextFieldCorreo.setMaximumSize(new java.awt.Dimension(465, 35));
        jTextFieldCorreo.setMinimumSize(new java.awt.Dimension(465, 35));
        jTextFieldCorreo.setPreferredSize(new java.awt.Dimension(465, 35));

        jTextFieldNombreUsuario.setMaximumSize(new java.awt.Dimension(465, 35));
        jTextFieldNombreUsuario.setMinimumSize(new java.awt.Dimension(465, 35));
        jTextFieldNombreUsuario.setPreferredSize(new java.awt.Dimension(465, 35));

        jLabelNombreUsuario.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelNombreUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombreUsuario.setText("NOMBRE DE USUARIO");
        jLabelNombreUsuario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelNombreUsuario.setMaximumSize(new java.awt.Dimension(465, 15));
        jLabelNombreUsuario.setMinimumSize(new java.awt.Dimension(465, 15));
        jLabelNombreUsuario.setPreferredSize(new java.awt.Dimension(465, 15));

        jButtonRecuperar.setBackground(new java.awt.Color(50, 150, 250));
        jButtonRecuperar.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jButtonRecuperar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRecuperar.setText("Recuperar Cuenta");
        jButtonRecuperar.setMaximumSize(new java.awt.Dimension(465, 50));
        jButtonRecuperar.setMinimumSize(new java.awt.Dimension(465, 50));
        jButtonRecuperar.setPreferredSize(new java.awt.Dimension(465, 50));
        jButtonRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecuperarActionPerformed(evt);
            }
        });

        jLabelLogin.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(50, 150, 250));
        jLabelLogin.setText("¿Ya tienes una cuenta?");
        jLabelLogin.setMaximumSize(new java.awt.Dimension(135, 14));
        jLabelLogin.setMinimumSize(new java.awt.Dimension(135, 14));
        jLabelLogin.setPreferredSize(new java.awt.Dimension(135, 14));
        jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseExited(evt);
            }
        });

        jPanelInfo.setBackground(new java.awt.Color(251, 245, 213));
        jPanelInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 216, 162)));
        jPanelInfo.setForeground(new java.awt.Color(239, 216, 162));

        jLabelDato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDato.setText("<html><center>Se enviara una contraseña temporal a su correo electronico, cambie la contraseña por seguridad.</center></html>");
        jLabelDato.setAutoscrolls(true);

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDato, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelDato, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelSeparador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelTituloCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSeparador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelSeparador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSeparador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTituloCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecuperarActionPerformed

        limpiarTitulos();
        try {
            if(comprobarCampos()){
                panelInicial.getVp().iniciarSocket();
                panelInicial.getVp().getSalida().writeInt(RECUPERAR_CUENTA);
                Sesion sesion = new Sesion(jTextFieldCorreo.getText(),jTextFieldNombreUsuario.getText());
                panelInicial.getVp().getSalida().writeUTF(panelInicial.getVp().getGson().toJson(sesion));  
                int estado = panelInicial.getVp().getEntrada().readInt();
                System.out.println(estado);
                if(estado==RECUPERAR_CUENTA_EXITOSO){
                    JOptionPane.showMessageDialog(this,"Correo ya enviado.");
                    this.setVisible(false);
                    panelInicial.getPanelLogin().setVisible(true);
                    panelInicial.getPanelLogin().limpiarCampos();
                }
                else if(estado==RECUPERAR_CUENTA_FALLIDO)
                    JOptionPane.showMessageDialog(this,"Correo o contraseña no coinciden.");
            }
        } catch (IOException ex) {
        } catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this,"Hubo un problema al intentar conectarse al servidor.");
        }
    }//GEN-LAST:event_jButtonRecuperarActionPerformed

    private void jLabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseClicked
        this.setVisible(false);
        panelInicial.getPanelLogin().setVisible(true);
        panelInicial.getPanelLogin().limpiarCampos();
    }//GEN-LAST:event_jLabelLoginMouseClicked

    private void jLabelLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseEntered
        jLabelLogin.setText("<html><u>¿Ya tienes una cuenta?</u></html>");
    }//GEN-LAST:event_jLabelLoginMouseEntered

    private void jLabelLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseExited
        jLabelLogin.setText("¿Ya tienes una cuenta?");
    }//GEN-LAST:event_jLabelLoginMouseExited
    
    public void limpiarCampos(){
        jTextFieldCorreo.setText("");
        jTextFieldNombreUsuario.setText("");     
        limpiarTitulos();
    }
    
    public void limpiarTitulos(){
        jLabelNombreUsuario.setText("NOMBRE DE USUARIO");
        jLabelNombreUsuario.setForeground(new Color(102,102,102));
        jLabelTituloCorreo.setText("CORREO ELECTRÓNICO");
        jLabelTituloCorreo.setForeground(new Color(102,102,102));
    }
    
    public boolean comprobarCampos(){
        boolean comprobacion = true;
        
        if(jTextFieldCorreo.getText().isEmpty()){
            jLabelTituloCorreo.setText("CORREO ELECTRÓNICO - Está Vacio");
            jLabelTituloCorreo.setForeground(Color.red);
            comprobacion = false;
        }
        if(!panelInicial.comprobarCorreo(jTextFieldCorreo.getText())){
            jLabelTituloCorreo.setText("CORREO ELECTRÓNICO - No válido");
            jLabelTituloCorreo.setForeground(Color.RED);
            comprobacion = false;
        }
        if(jTextFieldCorreo.getText().length()>32){
            jLabelTituloCorreo.setText("CORREO ELECTRÓNICO - Demasiado largo");
            jLabelTituloCorreo.setForeground(Color.red);
            comprobacion = false;
        }
        if(jTextFieldNombreUsuario.getText().length()<3){
            jLabelNombreUsuario.setText("NOMBRE DE USUARIO - Demasiado corto");
            jLabelNombreUsuario.setForeground(Color.red);
            comprobacion = false;
        }
        if(jTextFieldNombreUsuario.getText().isEmpty()){
            jLabelNombreUsuario.setText("NOMBRE DE USUARIO - No válido");
            jLabelNombreUsuario.setForeground(Color.red);
            comprobacion = false;
        }
        if(jTextFieldNombreUsuario.getText().length()>16){
            jLabelNombreUsuario.setText("NOMBRE DE USUARIO - Demasiado largo");
            jLabelNombreUsuario.setForeground(Color.red);
            comprobacion = false;
        }
        return comprobacion;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRecuperar;
    private javax.swing.JLabel jLabelCrearCuenta;
    private javax.swing.JLabel jLabelDato;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelTituloCorreo;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jPanelSeparador1;
    private javax.swing.JPanel jPanelSeparador2;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
