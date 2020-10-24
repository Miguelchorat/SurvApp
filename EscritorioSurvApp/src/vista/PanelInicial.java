package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author chorat
 */
public class PanelInicial extends javax.swing.JPanel {

    private VistaPrincipal vp;   
    
    public PanelInicial() {
    }
    
    public PanelInicial(VistaPrincipal vp){
        this.vp = vp;
        initComponents();
        this.panelRegistrarse.setVisible(false);
        this.panelRecuperarCuenta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCentral = new javax.swing.JPanel();
        panelLogin = new vista.PanelLogin();
        panelRegistrarse = new vista.PanelRegistrarse();
        panelRecuperarCuenta = new vista.PanelRecuperarCuenta();
        panelHerramientaVentana = new vista.PanelHerramientaVentana();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));

        PanelCentral.setBackground(new java.awt.Color(255, 255, 255));
        PanelCentral.setMaximumSize(new java.awt.Dimension(485, 345));
        PanelCentral.setMinimumSize(new java.awt.Dimension(485, 345));
        PanelCentral.setName(""); // NOI18N
        PanelCentral.setPreferredSize(new java.awt.Dimension(485, 345));

        panelLogin = new vista.PanelLogin(this);

        panelRegistrarse = new vista.PanelRegistrarse(this);

        panelRecuperarCuenta = new vista.PanelRecuperarCuenta(this);

        javax.swing.GroupLayout panelRecuperarCuentaLayout = new javax.swing.GroupLayout(panelRecuperarCuenta);
        panelRecuperarCuenta.setLayout(panelRecuperarCuentaLayout);
        panelRecuperarCuentaLayout.setHorizontalGroup(
            panelRecuperarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );
        panelRecuperarCuentaLayout.setVerticalGroup(
            panelRecuperarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRecuperarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRecuperarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelHerramientaVentana = new vista.PanelHerramientaVentana(vp);
        panelHerramientaVentana.setMaximumSize(new java.awt.Dimension(1000, 25));
        panelHerramientaVentana.setMinimumSize(new java.awt.Dimension(1000, 25));
        panelHerramientaVentana.setPreferredSize(new java.awt.Dimension(1000, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(PanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
            .addComponent(panelHerramientaVentana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelHerramientaVentana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(PanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics g) {
        Image img = new ImageIcon(getClass().getResource("/imagen/fondo.png")).getImage();
        g.drawImage(img, 0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g); 
    }

    public PanelLogin getPanelLogin() {
        return panelLogin;
    }

    public PanelRegistrarse getPanelRegistrarse() {
        return panelRegistrarse;
    }    

    public PanelRecuperarCuenta getPanelRecuperarCuenta() {
        return panelRecuperarCuenta;
    }

    public VistaPrincipal getVp() {
        return vp;
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCentral;
    private vista.PanelHerramientaVentana panelHerramientaVentana;
    private vista.PanelLogin panelLogin;
    private vista.PanelRecuperarCuenta panelRecuperarCuenta;
    private vista.PanelRegistrarse panelRegistrarse;
    // End of variables declaration//GEN-END:variables
}
