package vista;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;
import modelo.ModeloAvatar;
import util.TipoAvatar;

/**
 *
 * @author chorat
 */
public class PanelEleccionAvatar extends javax.swing.JPanel {

    private GridBagConstraints grid;
    private PanelGeneral pg;
    private DialogElegirAvatar dialog;
    
    public PanelEleccionAvatar(){}
    
    public PanelEleccionAvatar(PanelGeneral pg,DialogElegirAvatar dialog) {
        this.dialog = dialog;
        this.pg = pg;
        initComponents();
        grid = new GridBagConstraints();
        grid.weightx=15; 
        grid.insets=new Insets(0,50,10,50);
        generarAvatares();
        
    }
    
    public void generarAvatares(){
        List<TipoAvatar> avatares = new ArrayList<>();
        
        for(TipoAvatar a: TipoAvatar.values()){
            avatares.add(a);
        }
        int y = 0;
        int x = 0;
        for(int i=0;i<avatares.size();i++){
            
            ModeloAvatar imgAvatar = new ModeloAvatar(avatares.get(i),pg,dialog);
            imgAvatar.rellenar(70,70);
            grid.gridx = x;
            grid.gridy = y;
            jPanelAvatar.add(imgAvatar,grid);
            x++;
            if(x==2){
                y++;
                x=0;
            }
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneAvatar = new javax.swing.JScrollPane();
        jPanelAvatar = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(378, 195));
        setMinimumSize(new java.awt.Dimension(378, 195));
        setPreferredSize(new java.awt.Dimension(378, 195));
        setLayout(new java.awt.GridBagLayout());

        jScrollPaneAvatar.setBorder(null);
        jScrollPaneAvatar.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneAvatar.setMaximumSize(new java.awt.Dimension(378, 195));
        jScrollPaneAvatar.setMinimumSize(new java.awt.Dimension(378, 195));
        jScrollPaneAvatar.setPreferredSize(new java.awt.Dimension(378, 195));

        jPanelAvatar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAvatar.setMaximumSize(new java.awt.Dimension(378, 195));
        jPanelAvatar.setMinimumSize(new java.awt.Dimension(378, 195));
        jPanelAvatar.setPreferredSize(new java.awt.Dimension(378, 195));
        jPanelAvatar.setLayout(new java.awt.GridBagLayout());
        jScrollPaneAvatar.setViewportView(jPanelAvatar);

        add(jScrollPaneAvatar, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelAvatar;
    private javax.swing.JScrollPane jScrollPaneAvatar;
    // End of variables declaration//GEN-END:variables
}
