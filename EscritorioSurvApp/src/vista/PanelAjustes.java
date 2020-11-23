package vista;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Usuario;
import util.Protocolo;

/**
 *
 * @author chorat
 */
public class PanelAjustes extends javax.swing.JPanel implements Protocolo{

    private PanelGeneral panelGeneral;
    private int avatar;
    
    public PanelAjustes() {
    }
    
    public PanelAjustes(PanelGeneral panelGeneral) {
        this.panelGeneral = panelGeneral;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelContraseña1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jPanelSeparador = new javax.swing.JPanel();
        PanelAvatar = new javax.swing.JPanel();
        jLabelAvatar = new javax.swing.JLabel();
        jButtonAvatar = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(750, 625));
        setMinimumSize(new java.awt.Dimension(750, 625));

        jLabelTitulo.setFont(new java.awt.Font("Rubik", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("AJUSTES PERFIL");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(730, 125));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(730, 125));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(730, 125));

        jLabelCorreo.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCorreo.setText("CORREO ELECTRÓNICO");
        jLabelCorreo.setMaximumSize(new java.awt.Dimension(465, 15));
        jLabelCorreo.setMinimumSize(new java.awt.Dimension(465, 15));
        jLabelCorreo.setPreferredSize(new java.awt.Dimension(465, 15));

        jTextFieldCorreo.setMaximumSize(new java.awt.Dimension(465, 35));
        jTextFieldCorreo.setMinimumSize(new java.awt.Dimension(465, 35));
        jTextFieldCorreo.setPreferredSize(new java.awt.Dimension(465, 35));

        jLabelNombreUsuario.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelNombreUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombreUsuario.setText("NOMBRE DE USUARIO");
        jLabelNombreUsuario.setMaximumSize(new java.awt.Dimension(465, 15));
        jLabelNombreUsuario.setMinimumSize(new java.awt.Dimension(465, 15));
        jLabelNombreUsuario.setPreferredSize(new java.awt.Dimension(465, 15));

        jTextFieldNombreUsuario.setMaximumSize(new java.awt.Dimension(465, 35));
        jTextFieldNombreUsuario.setMinimumSize(new java.awt.Dimension(465, 35));
        jTextFieldNombreUsuario.setPreferredSize(new java.awt.Dimension(465, 35));

        jLabelContraseña.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jLabelContraseña.setText("CONTRASEÑA");
        jLabelContraseña.setMaximumSize(new java.awt.Dimension(465, 15));
        jLabelContraseña.setMinimumSize(new java.awt.Dimension(465, 15));
        jLabelContraseña.setPreferredSize(new java.awt.Dimension(465, 15));

        jPasswordField.setMaximumSize(new java.awt.Dimension(465, 35));
        jPasswordField.setMinimumSize(new java.awt.Dimension(465, 35));
        jPasswordField.setPreferredSize(new java.awt.Dimension(465, 35));

        jLabelContraseña1.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelContraseña1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelContraseña1.setText("REPETIR CONTRASEÑA");
        jLabelContraseña1.setMaximumSize(new java.awt.Dimension(465, 15));
        jLabelContraseña1.setMinimumSize(new java.awt.Dimension(465, 15));
        jLabelContraseña1.setPreferredSize(new java.awt.Dimension(465, 15));

        jPasswordField1.setMaximumSize(new java.awt.Dimension(465, 35));
        jPasswordField1.setMinimumSize(new java.awt.Dimension(465, 35));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(465, 35));

        jButtonAceptar.setBackground(new java.awt.Color(50, 150, 250));
        jButtonAceptar.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jButtonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setMaximumSize(new java.awt.Dimension(150, 35));
        jButtonAceptar.setMinimumSize(new java.awt.Dimension(150, 35));
        jButtonAceptar.setPreferredSize(new java.awt.Dimension(150, 35));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCerrarSesion.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCerrarSesion.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jButtonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrarSesion.setText("Cerrar Sesion");
        jButtonCerrarSesion.setMaximumSize(new java.awt.Dimension(150, 35));
        jButtonCerrarSesion.setMinimumSize(new java.awt.Dimension(150, 35));
        jButtonCerrarSesion.setPreferredSize(new java.awt.Dimension(150, 35));
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jPanelSeparador.setBackground(new java.awt.Color(0, 0, 0));
        jPanelSeparador.setMaximumSize(new java.awt.Dimension(687, 1));
        jPanelSeparador.setMinimumSize(new java.awt.Dimension(687, 1));

        javax.swing.GroupLayout jPanelSeparadorLayout = new javax.swing.GroupLayout(jPanelSeparador);
        jPanelSeparador.setLayout(jPanelSeparadorLayout);
        jPanelSeparadorLayout.setHorizontalGroup(
            jPanelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanelSeparadorLayout.setVerticalGroup(
            jPanelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        PanelAvatar.setBackground(new java.awt.Color(250, 250, 250));
        PanelAvatar.setMaximumSize(new java.awt.Dimension(75, 75));
        PanelAvatar.setMinimumSize(new java.awt.Dimension(75, 75));
        PanelAvatar.setPreferredSize(new java.awt.Dimension(75, 75));

        jLabelAvatar.setMaximumSize(new java.awt.Dimension(75, 75));
        jLabelAvatar.setMinimumSize(new java.awt.Dimension(75, 75));
        jLabelAvatar.setPreferredSize(new java.awt.Dimension(75, 75));

        javax.swing.GroupLayout PanelAvatarLayout = new javax.swing.GroupLayout(PanelAvatar);
        PanelAvatar.setLayout(PanelAvatarLayout);
        PanelAvatarLayout.setHorizontalGroup(
            PanelAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAvatarLayout.setVerticalGroup(
            PanelAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButtonAvatar.setBackground(new java.awt.Color(50, 150, 250));
        jButtonAvatar.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jButtonAvatar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAvatar.setText("Cambiar Avatar");
        jButtonAvatar.setMaximumSize(new java.awt.Dimension(150, 35));
        jButtonAvatar.setMinimumSize(new java.awt.Dimension(150, 35));
        jButtonAvatar.setPreferredSize(new java.awt.Dimension(150, 35));
        jButtonAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvatarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelSeparador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(jPanelSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(487, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        limpiarTitulos();
        try {
            if(comprobarCampos()){
                panelGeneral.getVp().iniciarSocket();
                panelGeneral.getVp().getSalida().writeInt(MODIFICAR_USUARIO);
                panelGeneral.getVp().getUsuario().setNombre(jTextFieldNombreUsuario.getText());
                panelGeneral.getVp().getUsuario().setCorreo(jTextFieldCorreo.getText());
                String pass = panelGeneral.getVp().encriptarMensaje(String.copyValueOf(jPasswordField.getPassword()));
                panelGeneral.getVp().getUsuario().setPass(pass);
                panelGeneral.getVp().getUsuario().setAvatar(avatar);
                panelGeneral.getVp().getSalida().writeUTF(panelGeneral.getVp().getGson().toJson(panelGeneral.getVp().getUsuario()));
                panelGeneral.getVp().getEntrada().readInt();
                this.setVisible(false);
                panelGeneral.getPanelOpcion().estadoInicial();
                panelGeneral.getPanelPerfil().cargarDatos();
            }  
        } catch (IOException ex) {
        } catch (NullPointerException npe){
            npe.printStackTrace();
            JOptionPane.showMessageDialog(this,"Hubo un problema al intentar conectarse al servidor.");
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        DialogEliminar eliminar = new DialogEliminar(panelGeneral.getVp(),true,"¿Deseas cerrar sesión?","CERRAR SESIÓN");
        eliminar.setVisible(true);
        int result = eliminar.getResultado();
        if(result==1){
            try {            
                panelGeneral.setVisible(false);
                panelGeneral.getVp().getPanelInicial().panelesSeparador(true);
                panelGeneral.getVp().getPanelInicial().getPanelCentral().setVisible(true);
                panelGeneral.getVp().getPanelInicial().getPanelLogin().setVisible(true);
                panelGeneral.getVp().getPanelInicial().getPanelLogin().limpiarCampos();                       
                panelGeneral.getVp().iniciarSocket();
                panelGeneral.getVp().getSalida().writeInt(CERRAR_SESION);
                panelGeneral.getVp().getSalida().writeUTF(panelGeneral.getVp().getGson().toJson(panelGeneral.getVp().getUsuario()));
                this.setVisible(false);
            } catch (IOException ex) { 
            } catch (NullPointerException npe){
                JOptionPane.showMessageDialog(this,"Hubo un problema al intentar conectarse al servidor.");
            }
        }
        
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvatarActionPerformed
        DialogElegirAvatar dialogElegirAvatar = new DialogElegirAvatar(panelGeneral.getVp(), true);
        dialogElegirAvatar.setVisible(true);
    }//GEN-LAST:event_jButtonAvatarActionPerformed
    
    public void cargarDatos(){
        jTextFieldCorreo.setText(panelGeneral.getVp().getUsuario().getCorreo());
        jTextFieldNombreUsuario.setText(panelGeneral.getVp().getUsuario().getNombre());
        avatar = panelGeneral.getVp().getUsuario().getAvatar();
        jPasswordField.setText("");
        jPasswordField1.setText("");
        Image img = new ImageIcon(getClass().getResource("/imagen/"+avatar+".png")).getImage();
        ImageIcon avatarIcon = new ImageIcon(img.getScaledInstance(75, 75, Image.SCALE_SMOOTH));
        jLabelAvatar.setIcon(avatarIcon);
        limpiarTitulos();
    }
    
    public void limpiarTitulos(){
        jLabelNombreUsuario.setText("NOMBRE DE USUARIO");
        jLabelNombreUsuario.setForeground(new Color(102,102,102));
        jLabelContraseña.setText("CONTRASEÑA");
        jLabelContraseña.setForeground(new Color(102,102,102));
        jLabelCorreo.setText("CORREO ELECTRÓNICO");
        jLabelCorreo.setForeground(new Color(102,102,102));
    }

    public boolean comprobarCampos(){
        boolean comprobacion = true;
        if(jTextFieldNombreUsuario.getText().isEmpty()){
            jLabelNombreUsuario.setText("NOMBRE DE USUARIO - No válido");
            jLabelNombreUsuario.setForeground(Color.red);
            comprobacion = false;
        }
        if(jTextFieldNombreUsuario.getText().length()<3){
            jLabelNombreUsuario.setText("NOMBRE DE USUARIO - Demasiado corto");
            jLabelNombreUsuario.setForeground(Color.red);
            comprobacion = false;
        }
        if(jTextFieldNombreUsuario.getText().length()>16){
            jLabelNombreUsuario.setText("NOMBRE DE USUARIO - Demasiado largo");
            jLabelNombreUsuario.setForeground(Color.red);
            comprobacion = false;
        }
        if(!panelGeneral.getVp().getUsuario().getNombre().equalsIgnoreCase(jTextFieldNombreUsuario.getText())){
            try {
                panelGeneral.getVp().iniciarSocket();
                panelGeneral.getVp().getSalida().writeInt(COMPROBAR_NOMBRE_CUENTA);
                String nombre= jTextFieldNombreUsuario.getText();
                panelGeneral.getVp().getSalida().writeUTF(panelGeneral.getVp().getGson().toJson(nombre));
                int estado = panelGeneral.getVp().getEntrada().readInt();
                if(estado==NOMBRE_CUENTA_ERROR){
                    jLabelNombreUsuario.setText("NOMBRE DE CUENTA - Ya registrado");
                    jLabelNombreUsuario.setForeground(Color.red);
                    comprobacion = false;
                }
            } catch (IOException ex) {
            }
        }
        if(jTextFieldCorreo.getText().length()>32){
            jLabelCorreo.setText("CORREO ELECTRÓNICO - Demasiado largo");
            jLabelCorreo.setForeground(Color.red);
            comprobacion = false;
        }
        if(jTextFieldCorreo.getText().equals("")){
            jLabelCorreo.setText("CORREO ELECTRÓNICO - Está Vacio");
            jLabelCorreo.setForeground(Color.RED);
            comprobacion = false;
        }
        if(!panelGeneral.getVp().getPanelInicial().comprobarCorreo(jTextFieldCorreo.getText())){
            jLabelCorreo.setText("CORREO ELECTRÓNICO - No válido");
            jLabelCorreo.setForeground(Color.red);
            comprobacion = false;
        }
        
        if(!panelGeneral.getVp().getUsuario().getCorreo().equalsIgnoreCase(jTextFieldCorreo.getText())){
            try {
                panelGeneral.getVp().iniciarSocket();
                panelGeneral.getVp().getSalida().writeInt(COMPROBAR_CORREO);
                String correo = jTextFieldCorreo.getText();
                panelGeneral.getVp().getSalida().writeUTF(panelGeneral.getVp().getGson().toJson(correo));
                int estado = panelGeneral.getVp().getEntrada().readInt();
                if(estado==CORREO_ERROR){
                    jLabelCorreo.setText("CORREO ELECTRÓNICO - Ya registrado");
                    jLabelCorreo.setForeground(Color.red);
                    comprobacion = false;
                }
            } catch (IOException ex) {
            }
        }
        if(!String.copyValueOf(jPasswordField.getPassword()).equals(
                String.copyValueOf(jPasswordField1.getPassword()))){
            jLabelContraseña.setText("CONTRASEÑA - NO COINCIDEN");
            jLabelContraseña.setForeground(Color.red);
            comprobacion = false;
        }
        if(jPasswordField.getPassword().length<6){
            jLabelContraseña.setText("CONTRASEÑA - Demasiado corta");
            jLabelContraseña.setForeground(Color.red);
            comprobacion = false;
        }
        if(jPasswordField.getPassword().length>16){
            jLabelContraseña.setText("CONTRASEÑA - Demasiada larga");
            jLabelContraseña.setForeground(Color.red);
            comprobacion = false;
        }
        if(jPasswordField.getPassword().length==0){
            jLabelContraseña.setText("CONTRASEÑA - Está Vacio");
            jLabelContraseña.setForeground(Color.red);
            comprobacion = false;
        }
        return comprobacion;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
        Image img = new ImageIcon(getClass().getResource("/imagen/"+avatar+".png")).getImage();
        ImageIcon avatarIcon = new ImageIcon(img.getScaledInstance(75, 75, Image.SCALE_SMOOTH));
        jLabelAvatar.setIcon(avatarIcon);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAvatar;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAvatar;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JLabel jLabelAvatar;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelContraseña1;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelSeparador;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
