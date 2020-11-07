package vista;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import modelo.Usuario;
import org.apache.commons.codec.binary.Hex;
import util.ConfiguracionServidor;

/**
 * 
 * @author chorat
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private DataOutputStream salida;
    private DataInputStream entrada;
    private Socket servidor;
    private Gson gson;
    private MessageDigest encript;
    private Usuario usuario;
    
    public VistaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        servidor=null;
        salida=null;
        entrada=null;
        usuario= new Usuario();
        this.gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicial = new vista.PanelInicial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SurvApp");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 650));

        panelInicial = new vista.PanelInicial(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void iniciarSocket() {
        try {
            ConfiguracionServidor confServer = new ConfiguracionServidor();
            servidor = new Socket(confServer.getIp(), confServer.getPuerto());
            salida = new DataOutputStream(servidor.getOutputStream());
            entrada = new DataInputStream(servidor.getInputStream());
        } catch (IOException ioe) {
            throw new NullPointerException("");
        }
    }
    
    public String encriptarMensaje(String mensaje) {
        String mensajeEncriptado = "";
        try {
            this.encript = MessageDigest.getInstance("SHA-512");
            this.encript.update(mensaje.getBytes());
            byte[] mb = encript.digest();
            mensajeEncriptado = String.copyValueOf(Hex.encodeHex(mb));
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Problema al encriptar el mensaje");
        }
        return mensajeEncriptado;
    }

    public DataOutputStream getSalida() {
        return salida;
    }

    public DataInputStream getEntrada() {
        return entrada;
    }

    public Gson getGson() {
        return gson;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    public PanelInicial getPanelInicial() {
        return panelInicial;
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.PanelInicial panelInicial;
    // End of variables declaration//GEN-END:variables
}
