package vista;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Idea;
import modelo.Respuesta;
import modelo.Tema;
import util.Protocolo;
import util.TemaIdea;

/**
 *
 * @author chorat
 */
public class DialogIdea extends javax.swing.JDialog implements Protocolo{

    private int id;
    private PanelGeneral panelGeneral;
    private Idea idea;
    
    public DialogIdea(){}
    
    public DialogIdea(java.awt.Frame parent, boolean modal,PanelGeneral panelGeneral,int id) {
        super(parent, modal);
        initComponents();
        this.id = id;
        this.setLocationRelativeTo(null);
        jTextFieldRespuesta3.setVisible(false);
        jTextFieldRespuesta4.setVisible(false);
        this.panelGeneral = panelGeneral;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jScrollPaneTitulo = new javax.swing.JScrollPane();
        jTextAreaTitulo = new javax.swing.JTextArea();
        jLabelTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelHerramientaVentanaDialog = new vista.PanelHerramientaVentanaDialog();
        jLabelDescripcion2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollDescripcion = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelTema = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jComboBoxTema = new javax.swing.JComboBox<>();
        jLabeRespuesta = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabelCirculo1 = new javax.swing.JLabel();
        jTextFieldRespuesta1 = new javax.swing.JTextField();
        jLabelCirculo2 = new javax.swing.JLabel();
        jTextFieldRespuesta2 = new javax.swing.JTextField();
        jLabelCirculo3 = new javax.swing.JLabel();
        jTextFieldRespuesta3 = new javax.swing.JTextField();
        jLabelCirculo4 = new javax.swing.JLabel();
        jTextFieldRespuesta4 = new javax.swing.JTextField();
        jLabelInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Idea");
        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(730, 450));
        setMinimumSize(new java.awt.Dimension(730, 450));
        setUndecorated(true);
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 150, 250)));
        PanelPrincipal.setMaximumSize(new java.awt.Dimension(730, 450));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(730, 450));
        PanelPrincipal.setName("Editar idea"); // NOI18N
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(730, 450));

        jScrollPaneTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jScrollPaneTitulo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneTitulo.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPaneTitulo.setMaximumSize(new java.awt.Dimension(325, 50));
        jScrollPaneTitulo.setMinimumSize(new java.awt.Dimension(325, 50));
        jScrollPaneTitulo.setPreferredSize(new java.awt.Dimension(325, 50));

        jTextAreaTitulo.setBackground(new java.awt.Color(245, 245, 245));
        jTextAreaTitulo.setColumns(20);
        jTextAreaTitulo.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jTextAreaTitulo.setLineWrap(true);
        jTextAreaTitulo.setRows(3);
        jTextAreaTitulo.setTabSize(3);
        jTextAreaTitulo.setText("¿Esto es una pregunta de preeeeeeeueba? eeeeeeeeeeeeeeee");
        jTextAreaTitulo.setWrapStyleWord(true);
        jTextAreaTitulo.setBorder(null);
        jTextAreaTitulo.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jTextAreaTitulo.setMaximumSize(new java.awt.Dimension(325, 50));
        jTextAreaTitulo.setMinimumSize(new java.awt.Dimension(325, 50));
        jScrollPaneTitulo.setViewportView(jTextAreaTitulo);

        jLabelTitulo.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitulo.setText("TÍTULO");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(325, 50));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(325, 50));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(325, 50));

        jSeparator1.setMaximumSize(new java.awt.Dimension(325, 10));
        jSeparator1.setMinimumSize(new java.awt.Dimension(325, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(325, 10));

        panelHerramientaVentanaDialog = new vista.PanelHerramientaVentanaDialog(this,"MODIFICAR IDEA");

        
        jLabelDescripcion2.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelDescripcion2.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDescripcion2.setText("DESCRIPCIÓN");
        jLabelDescripcion2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelDescripcion2.setMaximumSize(new java.awt.Dimension(325, 50));
        jLabelDescripcion2.setMinimumSize(new java.awt.Dimension(325, 50));
        jLabelDescripcion2.setPreferredSize(new java.awt.Dimension(325, 50));

        jSeparator2.setMaximumSize(new java.awt.Dimension(325, 10));
        jSeparator2.setMinimumSize(new java.awt.Dimension(325, 10));
        jSeparator2.setPreferredSize(new java.awt.Dimension(325, 10));

        jScrollDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jScrollDescripcion.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollDescripcion.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollDescripcion.setMaximumSize(new java.awt.Dimension(325, 50));
        jScrollDescripcion.setMinimumSize(new java.awt.Dimension(325, 50));
        jScrollDescripcion.setPreferredSize(new java.awt.Dimension(325, 50));

        jTextAreaDescripcion.setBackground(new java.awt.Color(245, 245, 245));
        jTextAreaDescripcion.setColumns(15);
        jTextAreaDescripcion.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setRows(3);
        jTextAreaDescripcion.setTabSize(3);
        jTextAreaDescripcion.setWrapStyleWord(true);
        jTextAreaDescripcion.setBorder(null);
        jTextAreaDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextAreaDescripcion.setMaximumSize(new java.awt.Dimension(325, 50));
        jTextAreaDescripcion.setMinimumSize(new java.awt.Dimension(325, 50));
        jTextAreaDescripcion.setPreferredSize(new java.awt.Dimension(325, 50));
        jScrollDescripcion.setViewportView(jTextAreaDescripcion);

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

        jButtonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(50, 150, 250));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(150, 35));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(150, 35));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(150, 35));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelTema.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelTema.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTema.setText("TEMA");
        jLabelTema.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelTema.setMaximumSize(new java.awt.Dimension(325, 50));
        jLabelTema.setMinimumSize(new java.awt.Dimension(325, 50));
        jLabelTema.setPreferredSize(new java.awt.Dimension(325, 50));

        jSeparator3.setMaximumSize(new java.awt.Dimension(325, 10));
        jSeparator3.setMinimumSize(new java.awt.Dimension(325, 10));
        jSeparator3.setPreferredSize(new java.awt.Dimension(325, 10));

        jComboBoxTema.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jComboBoxTema.setBorder(null);
        jComboBoxTema.setMaximumSize(new java.awt.Dimension(325, 25));
        jComboBoxTema.setMinimumSize(new java.awt.Dimension(325, 25));
        jComboBoxTema.setPreferredSize(new java.awt.Dimension(325, 25));

        jLabeRespuesta.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabeRespuesta.setForeground(new java.awt.Color(102, 102, 102));
        jLabeRespuesta.setText("RESPUESTAS");
        jLabeRespuesta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabeRespuesta.setMaximumSize(new java.awt.Dimension(325, 50));
        jLabeRespuesta.setMinimumSize(new java.awt.Dimension(325, 50));
        jLabeRespuesta.setPreferredSize(new java.awt.Dimension(325, 50));

        jSeparator7.setMaximumSize(new java.awt.Dimension(325, 10));
        jSeparator7.setMinimumSize(new java.awt.Dimension(325, 10));
        jSeparator7.setPreferredSize(new java.awt.Dimension(325, 10));

        jLabelCirculo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCirculo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCirculo1.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelCirculo1.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelCirculo1.setPreferredSize(new java.awt.Dimension(25, 25));

        jTextFieldRespuesta1.setBackground(new java.awt.Color(245, 245, 245));
        jTextFieldRespuesta1.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jTextFieldRespuesta1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRespuesta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jTextFieldRespuesta1.setDisabledTextColor(new java.awt.Color(245, 245, 245));
        jTextFieldRespuesta1.setEnabled(false);
        jTextFieldRespuesta1.setMaximumSize(new java.awt.Dimension(300, 25));
        jTextFieldRespuesta1.setMinimumSize(new java.awt.Dimension(300, 25));
        jTextFieldRespuesta1.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabelCirculo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCirculo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCirculo2.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelCirculo2.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelCirculo2.setPreferredSize(new java.awt.Dimension(25, 25));

        jTextFieldRespuesta2.setBackground(new java.awt.Color(245, 245, 245));
        jTextFieldRespuesta2.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jTextFieldRespuesta2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRespuesta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jTextFieldRespuesta2.setDisabledTextColor(new java.awt.Color(245, 245, 245));
        jTextFieldRespuesta2.setEnabled(false);
        jTextFieldRespuesta2.setMaximumSize(new java.awt.Dimension(300, 25));
        jTextFieldRespuesta2.setMinimumSize(new java.awt.Dimension(300, 25));
        jTextFieldRespuesta2.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabelCirculo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCirculo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCirculo3.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelCirculo3.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelCirculo3.setPreferredSize(new java.awt.Dimension(25, 25));

        jTextFieldRespuesta3.setBackground(new java.awt.Color(245, 245, 245));
        jTextFieldRespuesta3.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jTextFieldRespuesta3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRespuesta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jTextFieldRespuesta3.setDisabledTextColor(new java.awt.Color(245, 245, 245));
        jTextFieldRespuesta3.setEnabled(false);
        jTextFieldRespuesta3.setMaximumSize(new java.awt.Dimension(300, 25));
        jTextFieldRespuesta3.setMinimumSize(new java.awt.Dimension(300, 25));
        jTextFieldRespuesta3.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabelCirculo4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCirculo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCirculo4.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabelCirculo4.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabelCirculo4.setPreferredSize(new java.awt.Dimension(25, 25));

        jTextFieldRespuesta4.setBackground(new java.awt.Color(245, 245, 245));
        jTextFieldRespuesta4.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jTextFieldRespuesta4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRespuesta4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jTextFieldRespuesta4.setDisabledTextColor(new java.awt.Color(245, 245, 245));
        jTextFieldRespuesta4.setEnabled(false);
        jTextFieldRespuesta4.setMaximumSize(new java.awt.Dimension(300, 25));
        jTextFieldRespuesta4.setMinimumSize(new java.awt.Dimension(300, 25));
        jTextFieldRespuesta4.setPreferredSize(new java.awt.Dimension(300, 25));

        jLabelInfo.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabelInfo.setForeground(new java.awt.Color(200, 0, 50));
        jLabelInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHerramientaVentanaDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelDescripcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                    .addComponent(jLabelCirculo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jTextFieldRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                    .addComponent(jLabelCirculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jTextFieldRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabeRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabelCirculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jTextFieldRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabelCirculo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTextFieldRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxTema, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(panelHerramientaVentanaDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelDescripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jScrollDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCirculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCirculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCirculo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldRespuesta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCirculo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        try {
            if(comprobarCampos()){
                panelGeneral.getVp().getSalida().writeInt(MODIFICAR_IDEA);
                Tema tema = new Tema(jComboBoxTema.getSelectedIndex()+1,jComboBoxTema.getSelectedItem().toString());
                int id = idea.getId();
                List<Respuesta> respuestas = idea.getRespuestas();
                idea = new Idea(id,jTextAreaTitulo.getText(),jTextAreaDescripcion.getText(),tema);                
                
                for(int i=0;i<respuestas.size();i++){
                    if(i==0){
                        respuestas.get(i).setDescripcion(jTextFieldRespuesta1.getText());
                    }
                    if(i==1){
                        respuestas.get(i).setDescripcion(jTextFieldRespuesta2.getText());
                    }
                    if(i==2){
                        respuestas.get(i).setDescripcion(jTextFieldRespuesta3.getText());
                    }
                    if(i==3){
                        respuestas.get(i).setDescripcion(jTextFieldRespuesta4.getText());
                    }
                }
                idea.setRespuestas(respuestas);
                panelGeneral.getVp().getSalida().writeUTF(panelGeneral.getVp().getGson().toJson(idea));
                panelGeneral.getVp().getEntrada().readInt();
                panelGeneral.getPanelIdea().busqueda();
                panelGeneral.getVp().revalidate();
                panelGeneral.getVp().repaint();
                this.setVisible(false);
            }   
        } catch (IOException ioe) {
            //System.out.println("Problema en la E/S del modificar idea");
            ioe.printStackTrace();
        } catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this,"Hubo un problema al intentar conectarse al servidor.");
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    
    public boolean comprobarCampos(){
        boolean comprobacion = true;
        
        if(jTextAreaTitulo.getText().length()<8){
            jLabelInfo.setText("TITULO - Demasiada corto");
            comprobacion = false;
        }
        if(jTextAreaTitulo.getText().length()>32){
            jLabelInfo.setText("TITULO - Demasiada largo");
            comprobacion = false;
        }
        if(jTextAreaTitulo.getText().length()==0){
            jLabelInfo.setText("TITULO - Está vacío");
            comprobacion = false;
        }
        if(jTextAreaDescripcion.getText().length()<8){
            jLabelInfo.setText("DESCRIPCIÓN - Demasiada corto");
            comprobacion = false;
        }
        if(jTextAreaDescripcion.getText().length()>128){
            jLabelInfo.setText("DESCRIPCIÓN - Demasiada largo");
            comprobacion = false;
        }
        if(jTextAreaDescripcion.getText().length()==0){
            jLabelInfo.setText("DESCRIPCIÓN - Está vacío");
            comprobacion = false;
        }
        if(jTextFieldRespuesta1.getText().length()<8){
            jLabelInfo.setText("RESPUESTA 1 - Demasiada corto");
            comprobacion = false;
        }
        if(jTextFieldRespuesta1.getText().length()>32){
            jLabelInfo.setText("RESPUESTA 1 - Demasiada largo");
            comprobacion = false;
        }
        if(jTextFieldRespuesta1.getText().length()==0){
            jLabelInfo.setText("RESPUESTA 1 - Está vacío");
            comprobacion = false;
        }
        if(jTextFieldRespuesta2.getText().length()<8){
            jLabelInfo.setText("RESPUESTA 2 - Demasiada corto");
            comprobacion = false;
        }
        if(jTextFieldRespuesta2.getText().length()>32){
            jLabelInfo.setText("RESPUESTA 2 - Demasiada largo");
            comprobacion = false;
        }
        if(jTextFieldRespuesta2.getText().length()==0){
            jLabelInfo.setText("RESPUESTA 2 - Está vacío");
            comprobacion = false;
        }
        if(jTextFieldRespuesta3.isVisible()==true){
            if(jTextFieldRespuesta3.getText().length()<8){
                jLabelInfo.setText("RESPUESTA 3 - Demasiada corto");
                comprobacion = false;
            }
            if(jTextFieldRespuesta3.getText().length()>32){
                jLabelInfo.setText("RESPUESTA 3 - Demasiada largo");
                comprobacion = false;
            }
            if(jTextFieldRespuesta3.getText().length()==0){
                jLabelInfo.setText("RESPUESTA 3 - Está vacío");
                comprobacion = false;
            }
        }
        if(jTextFieldRespuesta4.isVisible()==true){
            if(jTextFieldRespuesta4.getText().length()<8){
                jLabelInfo.setText("RESPUESTA 4 - Demasiada corto");
                comprobacion = false;
            }
            if(jTextFieldRespuesta4.getText().length()>32){
                jLabelInfo.setText("RESPUESTA 4 - Demasiada largo");
                comprobacion = false;
            }
            if(jTextFieldRespuesta4.getText().length()==0){
                jLabelInfo.setText("RESPUESTA 4 - Está vacío");
                comprobacion = false;
            }
        }
        return comprobacion;
    }
    
    public void buscarInformacion(){
        try {
            panelGeneral.getVp().getSalida().writeInt(BUSCAR_INFORMACION_IDEA);
            panelGeneral.getVp().getSalida().writeInt(id);
            idea = panelGeneral.getVp().getGson().fromJson((String)panelGeneral.getVp().getEntrada().readUTF(), Idea.class);                            
        } catch (IOException ioe) {
            System.out.println("Problema en la E/S del login");
        } catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this,"Hubo un problema al intentar conectarse al servidor.");
        }
    }
    
    
    public void cargarDatos(){
        buscarInformacion();
        jTextAreaTitulo.setText(idea.getTitulo());
        jTextAreaDescripcion.setText(idea.getDescripcion());
        
        for(TemaIdea tema: TemaIdea.values()){
            jComboBoxTema.addItem(tema.name());
        }
        jComboBoxTema.setSelectedIndex(idea.getTema().getId()-1);
        
        for(int i=0;i<idea.getRespuestas().size();i++){
            if(i==0){
                jTextFieldRespuesta1.setText(idea.getRespuestas().get(i).getDescripcion());
                jTextFieldRespuesta1.setEnabled(true);
                jLabelCirculo1.setText("•");
            }
            if(i==1){
                jTextFieldRespuesta2.setText(idea.getRespuestas().get(i).getDescripcion());
                jTextFieldRespuesta2.setEnabled(true);
                jLabelCirculo2.setText("•");
            }
            if(i==2){
                jTextFieldRespuesta3.setText(idea.getRespuestas().get(i).getDescripcion());
                jTextFieldRespuesta3.setEnabled(true);
                jTextFieldRespuesta3.setVisible(true);
                jLabelCirculo3.setText("•");
            }
            if(i==3){
                jTextFieldRespuesta4.setText(idea.getRespuestas().get(i).getDescripcion());
                jTextFieldRespuesta4.setEnabled(true);
                jTextFieldRespuesta4.setVisible(true);
                jLabelCirculo4.setText("•");
            }                            
        }
        
    }

    public JLabel getjLabelInfo() {
        return jLabelInfo;
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
            java.util.logging.Logger.getLogger(DialogIdea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogIdea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogIdea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogIdea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogIdea dialog = new DialogIdea(new javax.swing.JFrame(), true, null, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxTema;
    private javax.swing.JLabel jLabeRespuesta;
    private javax.swing.JLabel jLabelCirculo1;
    private javax.swing.JLabel jLabelCirculo2;
    private javax.swing.JLabel jLabelCirculo3;
    private javax.swing.JLabel jLabelCirculo4;
    private javax.swing.JLabel jLabelDescripcion2;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelTema;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollDescripcion;
    private javax.swing.JScrollPane jScrollPaneTitulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextArea jTextAreaTitulo;
    private javax.swing.JTextField jTextFieldRespuesta1;
    private javax.swing.JTextField jTextFieldRespuesta2;
    private javax.swing.JTextField jTextFieldRespuesta3;
    private javax.swing.JTextField jTextFieldRespuesta4;
    private vista.PanelHerramientaVentanaDialog panelHerramientaVentanaDialog;
    // End of variables declaration//GEN-END:variables
}
