/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author chora
 */
public class PanelInicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelInicio
     */
    public PanelInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSeparador = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setMaximumSize(new java.awt.Dimension(750, 625));
        setMinimumSize(new java.awt.Dimension(750, 625));

        jPanelSeparador.setBackground(new java.awt.Color(0, 0, 0));
        jPanelSeparador.setMaximumSize(new java.awt.Dimension(687, 1));
        jPanelSeparador.setMinimumSize(new java.awt.Dimension(687, 1));

        javax.swing.GroupLayout jPanelSeparadorLayout = new javax.swing.GroupLayout(jPanelSeparador);
        jPanelSeparador.setLayout(jPanelSeparadorLayout);
        jPanelSeparadorLayout.setHorizontalGroup(
            jPanelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelSeparadorLayout.setVerticalGroup(
            jPanelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jLabelTitulo.setFont(new java.awt.Font("Rubik", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("BIENVENIDO A SURVAPP");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(730, 100));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(730, 100));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(730, 100));

        jLabelInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInfo.setText("<html>\nCon los permisos adecuados podrás hacer modificaciones en la base de datos del servidor.\n \n<br> <br> &nbsp; &#8226; Modificación básica a los usuarios registrado en el sistema.\n<br> <br> &nbsp; &#8226; Validación y modificación de las incidencias mandadas por los usuarios.\n<br> <br> &nbsp; &#8226; Ver estado de las ideas registradas en el sistemas.\n<br> <br> &nbsp; &#8226; Validación y modificación de las denuncias dadas por los usuarios de las ideas.\n\n</html>");
        jLabelInfo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelInfo.setMaximumSize(new java.awt.Dimension(682, 380));
        jLabelInfo.setMinimumSize(new java.awt.Dimension(682, 380));
        jLabelInfo.setPreferredSize(new java.awt.Dimension(682, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSeparador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelSeparador;
    // End of variables declaration//GEN-END:variables
}
