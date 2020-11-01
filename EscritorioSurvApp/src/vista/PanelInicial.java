package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

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
        this.panelGeneral.setVisible(false);
        this.PanelCentral.setVisible(true);
        this.panelRegistrarse.setVisible(false);
        this.panelRecuperarCuenta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new vista.PanelGeneral();
        panelHerramientaVentana = new vista.PanelHerramientaVentana();
        PanelSeparador1 = new javax.swing.JPanel();
        PanelSeparador3 = new javax.swing.JPanel();
        PanelSeparador4 = new javax.swing.JPanel();
        PanelCentral = new javax.swing.JPanel();
        panelLogin = new vista.PanelLogin();
        panelRecuperarCuenta = new vista.PanelRecuperarCuenta();
        panelRegistrarse = new vista.PanelRegistrarse();
        PanelSeparador2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));

        panelGeneral = new vista.PanelGeneral(vp);

        panelHerramientaVentana = new vista.PanelHerramientaVentana(vp);
        panelHerramientaVentana.setMaximumSize(new java.awt.Dimension(1000, 25));
        panelHerramientaVentana.setMinimumSize(new java.awt.Dimension(1000, 25));
        panelHerramientaVentana.setPreferredSize(new java.awt.Dimension(1000, 25));

        PanelSeparador1.setMaximumSize(new java.awt.Dimension(259, 625));
        PanelSeparador1.setMinimumSize(new java.awt.Dimension(259, 625));
        PanelSeparador1.setOpaque(false);
        PanelSeparador1.setPreferredSize(new java.awt.Dimension(259, 625));

        javax.swing.GroupLayout PanelSeparador1Layout = new javax.swing.GroupLayout(PanelSeparador1);
        PanelSeparador1.setLayout(PanelSeparador1Layout);
        PanelSeparador1Layout.setHorizontalGroup(
            PanelSeparador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );
        PanelSeparador1Layout.setVerticalGroup(
            PanelSeparador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        PanelSeparador3.setMaximumSize(new java.awt.Dimension(483, 125));
        PanelSeparador3.setMinimumSize(new java.awt.Dimension(483, 125));
        PanelSeparador3.setOpaque(false);
        PanelSeparador3.setPreferredSize(new java.awt.Dimension(483, 125));

        javax.swing.GroupLayout PanelSeparador3Layout = new javax.swing.GroupLayout(PanelSeparador3);
        PanelSeparador3.setLayout(PanelSeparador3Layout);
        PanelSeparador3Layout.setHorizontalGroup(
            PanelSeparador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        PanelSeparador3Layout.setVerticalGroup(
            PanelSeparador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        PanelSeparador4.setMaximumSize(new java.awt.Dimension(483, 155));
        PanelSeparador4.setMinimumSize(new java.awt.Dimension(483, 155));
        PanelSeparador4.setOpaque(false);
        PanelSeparador4.setPreferredSize(new java.awt.Dimension(483, 155));

        javax.swing.GroupLayout PanelSeparador4Layout = new javax.swing.GroupLayout(PanelSeparador4);
        PanelSeparador4.setLayout(PanelSeparador4Layout);
        PanelSeparador4Layout.setHorizontalGroup(
            PanelSeparador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        PanelSeparador4Layout.setVerticalGroup(
            PanelSeparador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        PanelCentral.setBackground(new java.awt.Color(255, 255, 255));
        PanelCentral.setMaximumSize(new java.awt.Dimension(485, 345));
        PanelCentral.setMinimumSize(new java.awt.Dimension(485, 345));
        PanelCentral.setName(""); // NOI18N
        PanelCentral.setPreferredSize(new java.awt.Dimension(485, 345));

        panelLogin = new vista.PanelLogin(this);

        
        panelRecuperarCuenta = new vista.PanelRecuperarCuenta(this);

        
        panelRegistrarse = new vista.PanelRegistrarse(this);

                javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRecuperarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRecuperarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelSeparador2.setMaximumSize(new java.awt.Dimension(259, 625));
        PanelSeparador2.setMinimumSize(new java.awt.Dimension(259, 625));
        PanelSeparador2.setOpaque(false);
        PanelSeparador2.setPreferredSize(new java.awt.Dimension(259, 625));

        javax.swing.GroupLayout PanelSeparador2Layout = new javax.swing.GroupLayout(PanelSeparador2);
        PanelSeparador2.setLayout(PanelSeparador2Layout);
        PanelSeparador2Layout.setHorizontalGroup(
            PanelSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );
        PanelSeparador2Layout.setVerticalGroup(
            PanelSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHerramientaVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelSeparador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelSeparador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelSeparador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 741, Short.MAX_VALUE)
                    .addComponent(PanelSeparador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelHerramientaVentana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelSeparador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelSeparador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(PanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(PanelSeparador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 25, Short.MAX_VALUE)
                    .addComponent(PanelSeparador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    public JPanel getPanelCentral() {
        return PanelCentral;
    }

    public PanelGeneral getPanelGeneral() {
        return panelGeneral;
    }
    
    public boolean comprobarCorreo(String correo){
        boolean comprobacion = false;
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        if (mather.find() == true) {
            comprobacion = true;
        }
        return comprobacion;
    }
    
    public void panelesSeparador(boolean visible){
        
        this.PanelSeparador2.setVisible(visible);
        this.PanelSeparador3.setVisible(visible);
        this.PanelSeparador4.setVisible(visible);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelSeparador1;
    private javax.swing.JPanel PanelSeparador2;
    private javax.swing.JPanel PanelSeparador3;
    private javax.swing.JPanel PanelSeparador4;
    private vista.PanelGeneral panelGeneral;
    private vista.PanelHerramientaVentana panelHerramientaVentana;
    private vista.PanelLogin panelLogin;
    private vista.PanelRecuperarCuenta panelRecuperarCuenta;
    private vista.PanelRegistrarse panelRegistrarse;
    // End of variables declaration//GEN-END:variables
}
