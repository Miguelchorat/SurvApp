package vista;

/**
 *
 * @author chorat
 */
public class PanelGeneral extends javax.swing.JPanel {

    private VistaPrincipal vp;
    
    public PanelGeneral() {
        
    }

    public PanelGeneral(VistaPrincipal vp) {
        this.vp = vp;
        initComponents();
        apagarPaneles();
        this.panelInicio.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPerfil = new vista.PanelPerfil();
        panelOpcion = new vista.PanelOpcion();
        panelInicio = new vista.PanelInicio();
        panelUsuario = new vista.PanelUsuario();
        panelIncidencia = new vista.PanelIncidencia();
        panelIdea = new vista.PanelIdea();
        panelDenuncia = new vista.PanelDenuncia();
        panelAjustes = new vista.PanelAjustes();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 625));
        setMinimumSize(new java.awt.Dimension(1000, 625));
        setOpaque(false);

        panelPerfil = new vista.PanelPerfil(this);
        panelPerfil.setMaximumSize(new java.awt.Dimension(250, 50));
        panelPerfil.setMinimumSize(new java.awt.Dimension(250, 50));
        panelPerfil.setPreferredSize(new java.awt.Dimension(250, 50));

        panelOpcion = new vista.PanelOpcion(this);
        panelOpcion.setMaximumSize(new java.awt.Dimension(250, 575));
        panelOpcion.setMinimumSize(new java.awt.Dimension(250, 575));
        panelOpcion.setPreferredSize(new java.awt.Dimension(250, 575));

        panelUsuario = new vista.PanelUsuario(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(panelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelIdea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelDenuncia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelDenuncia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIdea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public PanelPerfil getPanelPerfil() {
        return panelPerfil;
    }

    public PanelDenuncia getPanelDenuncia() {
        return panelDenuncia;
    }

    public PanelIdea getPanelIdea() {
        return panelIdea;
    }

    public PanelIncidencia getPanelIncidencia() {
        return panelIncidencia;
    }

    public PanelInicio getPanelInicio() {
        return panelInicio;
    }

    public PanelOpcion getPanelOpcion() {
        return panelOpcion;
    }

    public PanelUsuario getPanelUsuario() {
        return panelUsuario;
    }

    public VistaPrincipal getVp() {
        return vp;
    }

    public PanelAjustes getPanelAjustes() {
        return panelAjustes;
    }
    
    public void apagarPaneles(){
        panelInicio.setVisible(false);
        panelUsuario.setVisible(false);
        panelIdea.setVisible(false);
        panelDenuncia.setVisible(false);
        panelIncidencia.setVisible(false);
        panelAjustes.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.PanelAjustes panelAjustes;
    private vista.PanelDenuncia panelDenuncia;
    private vista.PanelIdea panelIdea;
    private vista.PanelIncidencia panelIncidencia;
    private vista.PanelInicio panelInicio;
    private vista.PanelOpcion panelOpcion;
    private vista.PanelPerfil panelPerfil;
    private vista.PanelUsuario panelUsuario;
    // End of variables declaration//GEN-END:variables
}
