package vista;

import com.google.gson.reflect.TypeToken;
import java.awt.Dimension;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Idea;
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
    
    public DialogIdea(java.awt.Frame parent, boolean modal,PanelGeneral panelGeneral,int id) {
        super(parent, modal);
        initComponents();
        this.id = id;
        this.setLocationRelativeTo(null);
        jTextFieldRespuesta3.setVisible(false);
        jTextFieldRespuesta4.setVisible(false);
        this.panelGeneral = panelGeneral;
        this.idea = idea;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelComentario = new javax.swing.JPanel();
        jLabelTituloComentario = new javax.swing.JLabel();
        PanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        PanelDescripcion = new javax.swing.JPanel();
        jLabelTituloDescripcion = new javax.swing.JLabel();
        jScrollDescripcion = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        PanelRespuesta = new javax.swing.JPanel();
        jLabelTituloRespuesta = new javax.swing.JLabel();
        jTextFieldRespuesta1 = new javax.swing.JTextField();
        jLabelCirculo1 = new javax.swing.JLabel();
        jLabelCirculo2 = new javax.swing.JLabel();
        jTextFieldRespuesta2 = new javax.swing.JTextField();
        jLabelCirculo3 = new javax.swing.JLabel();
        jTextFieldRespuesta3 = new javax.swing.JTextField();
        jLabelCirculo4 = new javax.swing.JLabel();
        jTextFieldRespuesta4 = new javax.swing.JTextField();
        PanelGrafica = new javax.swing.JPanel();
        jLabelTituloGrafica = new javax.swing.JLabel();
        jPanelBarra1 = new javax.swing.JPanel();
        jPanelBarra2 = new javax.swing.JPanel();
        jPanelBarra3 = new javax.swing.JPanel();
        jPanelBarra4 = new javax.swing.JPanel();
        jLabelRespuestaBarra1 = new javax.swing.JLabel();
        jLabelRespuestaBarra2 = new javax.swing.JLabel();
        jLabelRespuestaBarra3 = new javax.swing.JLabel();
        jLabelRespuestaBarra4 = new javax.swing.JLabel();
        PanelBoton = new javax.swing.JPanel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        PanelTema = new javax.swing.JPanel();
        jLabelTituloTema = new javax.swing.JLabel();
        jComboBoxTema = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));

        PanelPrincipal.setBackground(new java.awt.Color(250, 250, 250));
        PanelPrincipal.setMaximumSize(new java.awt.Dimension(1000, 650));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(1000, 650));
        PanelPrincipal.setName("Editar idea"); // NOI18N

        PanelComentario.setBackground(new java.awt.Color(204, 204, 255));
        PanelComentario.setMaximumSize(new java.awt.Dimension(400, 550));
        PanelComentario.setMinimumSize(new java.awt.Dimension(400, 550));
        PanelComentario.setPreferredSize(new java.awt.Dimension(400, 550));

        jLabelTituloComentario.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabelTituloComentario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloComentario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloComentario.setText("COMENTARIOS");

        javax.swing.GroupLayout PanelComentarioLayout = new javax.swing.GroupLayout(PanelComentario);
        PanelComentario.setLayout(PanelComentarioLayout);
        PanelComentarioLayout.setHorizontalGroup(
            PanelComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTituloComentario, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        PanelComentarioLayout.setVerticalGroup(
            PanelComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelComentarioLayout.createSequentialGroup()
                .addComponent(jLabelTituloComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        PanelTitulo.setMaximumSize(new java.awt.Dimension(600, 150));
        PanelTitulo.setMinimumSize(new java.awt.Dimension(600, 150));
        PanelTitulo.setPreferredSize(new java.awt.Dimension(600, 150));

        jLabelTitulo.setFont(new java.awt.Font("Rubik", 1, 28)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("<html>¿Esto es una pregunta de prueba? eeeeeeeeeeeeeeee</html>");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        PanelDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        PanelDescripcion.setMaximumSize(new java.awt.Dimension(300, 250));
        PanelDescripcion.setMinimumSize(new java.awt.Dimension(300, 250));

        jLabelTituloDescripcion.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabelTituloDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloDescripcion.setText("DESCRIPCIÓN");

        jScrollDescripcion.setBorder(null);
        jScrollDescripcion.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollDescripcion.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        jTextAreaDescripcion.setRows(3);
        jTextAreaDescripcion.setTabSize(5);
        jTextAreaDescripcion.setMaximumSize(new java.awt.Dimension(280, 163));
        jTextAreaDescripcion.setMinimumSize(new java.awt.Dimension(280, 163));
        jTextAreaDescripcion.setPreferredSize(new java.awt.Dimension(280, 163));
        jScrollDescripcion.setViewportView(jTextAreaDescripcion);

        javax.swing.GroupLayout PanelDescripcionLayout = new javax.swing.GroupLayout(PanelDescripcion);
        PanelDescripcion.setLayout(PanelDescripcionLayout);
        PanelDescripcionLayout.setHorizontalGroup(
            PanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTituloDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelDescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelDescripcionLayout.setVerticalGroup(
            PanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDescripcionLayout.createSequentialGroup()
                .addComponent(jLabelTituloDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollDescripcion)
                .addContainerGap())
        );

        PanelRespuesta.setBackground(new java.awt.Color(255, 255, 255));
        PanelRespuesta.setMaximumSize(new java.awt.Dimension(300, 250));
        PanelRespuesta.setMinimumSize(new java.awt.Dimension(300, 250));
        PanelRespuesta.setPreferredSize(new java.awt.Dimension(300, 250));

        jLabelTituloRespuesta.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabelTituloRespuesta.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloRespuesta.setText("RESPUESTAS");

        jTextFieldRespuesta1.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jTextFieldRespuesta1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRespuesta1.setBorder(null);
        jTextFieldRespuesta1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextFieldRespuesta1.setEnabled(false);
        jTextFieldRespuesta1.setMaximumSize(new java.awt.Dimension(265, 34));
        jTextFieldRespuesta1.setMinimumSize(new java.awt.Dimension(265, 34));
        jTextFieldRespuesta1.setPreferredSize(new java.awt.Dimension(265, 34));
        jTextFieldRespuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuesta1ActionPerformed(evt);
            }
        });

        jLabelCirculo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCirculo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCirculo1.setMaximumSize(new java.awt.Dimension(20, 34));
        jLabelCirculo1.setMinimumSize(new java.awt.Dimension(20, 34));
        jLabelCirculo1.setPreferredSize(new java.awt.Dimension(20, 34));

        jLabelCirculo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCirculo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCirculo2.setMaximumSize(new java.awt.Dimension(20, 34));
        jLabelCirculo2.setMinimumSize(new java.awt.Dimension(20, 34));
        jLabelCirculo2.setPreferredSize(new java.awt.Dimension(20, 34));

        jTextFieldRespuesta2.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jTextFieldRespuesta2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRespuesta2.setBorder(null);
        jTextFieldRespuesta2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextFieldRespuesta2.setEnabled(false);
        jTextFieldRespuesta2.setMaximumSize(new java.awt.Dimension(265, 34));
        jTextFieldRespuesta2.setMinimumSize(new java.awt.Dimension(265, 34));
        jTextFieldRespuesta2.setPreferredSize(new java.awt.Dimension(265, 34));
        jTextFieldRespuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuesta2ActionPerformed(evt);
            }
        });

        jLabelCirculo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCirculo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCirculo3.setMaximumSize(new java.awt.Dimension(20, 34));
        jLabelCirculo3.setMinimumSize(new java.awt.Dimension(20, 34));
        jLabelCirculo3.setPreferredSize(new java.awt.Dimension(20, 34));

        jTextFieldRespuesta3.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jTextFieldRespuesta3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRespuesta3.setBorder(null);
        jTextFieldRespuesta3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextFieldRespuesta3.setEnabled(false);
        jTextFieldRespuesta3.setMaximumSize(new java.awt.Dimension(265, 34));
        jTextFieldRespuesta3.setMinimumSize(new java.awt.Dimension(265, 34));
        jTextFieldRespuesta3.setPreferredSize(new java.awt.Dimension(265, 34));
        jTextFieldRespuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuesta3ActionPerformed(evt);
            }
        });

        jLabelCirculo4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCirculo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCirculo4.setMaximumSize(new java.awt.Dimension(20, 34));
        jLabelCirculo4.setMinimumSize(new java.awt.Dimension(20, 34));
        jLabelCirculo4.setPreferredSize(new java.awt.Dimension(20, 34));

        jTextFieldRespuesta4.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jTextFieldRespuesta4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRespuesta4.setBorder(null);
        jTextFieldRespuesta4.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextFieldRespuesta4.setEnabled(false);
        jTextFieldRespuesta4.setMaximumSize(new java.awt.Dimension(265, 34));
        jTextFieldRespuesta4.setMinimumSize(new java.awt.Dimension(265, 34));
        jTextFieldRespuesta4.setOpaque(false);
        jTextFieldRespuesta4.setPreferredSize(new java.awt.Dimension(265, 34));
        jTextFieldRespuesta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuesta4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRespuestaLayout = new javax.swing.GroupLayout(PanelRespuesta);
        PanelRespuesta.setLayout(PanelRespuestaLayout);
        PanelRespuestaLayout.setHorizontalGroup(
            PanelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTituloRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelRespuestaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRespuestaLayout.createSequentialGroup()
                        .addComponent(jLabelCirculo4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelRespuestaLayout.createSequentialGroup()
                        .addComponent(jLabelCirculo3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelRespuestaLayout.createSequentialGroup()
                        .addComponent(jLabelCirculo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelRespuestaLayout.createSequentialGroup()
                        .addComponent(jLabelCirculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelRespuestaLayout.setVerticalGroup(
            PanelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRespuestaLayout.createSequentialGroup()
                .addComponent(jLabelTituloRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCirculo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCirculo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCirculo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCirculo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PanelGrafica.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTituloGrafica.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabelTituloGrafica.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloGrafica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloGrafica.setText("GRÁFICA");

        jPanelBarra1.setBackground(new java.awt.Color(50, 150, 250));
        jPanelBarra1.setMaximumSize(new java.awt.Dimension(120, 999));
        jPanelBarra1.setMinimumSize(new java.awt.Dimension(120, 0));
        jPanelBarra1.setPreferredSize(new java.awt.Dimension(120, 0));

        javax.swing.GroupLayout jPanelBarra1Layout = new javax.swing.GroupLayout(jPanelBarra1);
        jPanelBarra1.setLayout(jPanelBarra1Layout);
        jPanelBarra1Layout.setHorizontalGroup(
            jPanelBarra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelBarra1Layout.setVerticalGroup(
            jPanelBarra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelBarra2.setBackground(new java.awt.Color(255, 0, 51));
        jPanelBarra2.setMaximumSize(new java.awt.Dimension(120, 999));
        jPanelBarra2.setMinimumSize(new java.awt.Dimension(120, 0));
        jPanelBarra2.setPreferredSize(new java.awt.Dimension(120, 0));

        javax.swing.GroupLayout jPanelBarra2Layout = new javax.swing.GroupLayout(jPanelBarra2);
        jPanelBarra2.setLayout(jPanelBarra2Layout);
        jPanelBarra2Layout.setHorizontalGroup(
            jPanelBarra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelBarra2Layout.setVerticalGroup(
            jPanelBarra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanelBarra3.setBackground(new java.awt.Color(0, 255, 0));
        jPanelBarra3.setMaximumSize(new java.awt.Dimension(120, 999));
        jPanelBarra3.setMinimumSize(new java.awt.Dimension(120, 0));

        javax.swing.GroupLayout jPanelBarra3Layout = new javax.swing.GroupLayout(jPanelBarra3);
        jPanelBarra3.setLayout(jPanelBarra3Layout);
        jPanelBarra3Layout.setHorizontalGroup(
            jPanelBarra3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelBarra3Layout.setVerticalGroup(
            jPanelBarra3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelBarra4.setBackground(new java.awt.Color(204, 0, 204));
        jPanelBarra4.setMaximumSize(new java.awt.Dimension(120, 999));
        jPanelBarra4.setMinimumSize(new java.awt.Dimension(120, 0));

        javax.swing.GroupLayout jPanelBarra4Layout = new javax.swing.GroupLayout(jPanelBarra4);
        jPanelBarra4.setLayout(jPanelBarra4Layout);
        jPanelBarra4Layout.setHorizontalGroup(
            jPanelBarra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanelBarra4Layout.setVerticalGroup(
            jPanelBarra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelRespuestaBarra1.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelRespuestaBarra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRespuestaBarra1.setText("Respuesta 1");

        jLabelRespuestaBarra2.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelRespuestaBarra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRespuestaBarra2.setText("Respuesta 2");

        jLabelRespuestaBarra3.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelRespuestaBarra3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRespuestaBarra3.setText("Respuesta 3");

        jLabelRespuestaBarra4.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelRespuestaBarra4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRespuestaBarra4.setText("Respuesta 4");

        javax.swing.GroupLayout PanelGraficaLayout = new javax.swing.GroupLayout(PanelGrafica);
        PanelGrafica.setLayout(PanelGraficaLayout);
        PanelGraficaLayout.setHorizontalGroup(
            PanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTituloGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelGraficaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelRespuestaBarra1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jPanelBarra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBarra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelRespuestaBarra2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBarra3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelRespuestaBarra3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBarra4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelRespuestaBarra4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        PanelGraficaLayout.setVerticalGroup(
            PanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGraficaLayout.createSequentialGroup()
                .addComponent(jLabelTituloGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(PanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelBarra2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jPanelBarra3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jPanelBarra4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBarra1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRespuestaBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRespuestaBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRespuestaBarra3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRespuestaBarra4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PanelBoton.setBackground(new java.awt.Color(255, 255, 204));
        PanelBoton.setMaximumSize(new java.awt.Dimension(400, 100));
        PanelBoton.setMinimumSize(new java.awt.Dimension(400, 100));
        PanelBoton.setPreferredSize(new java.awt.Dimension(400, 100));

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

        javax.swing.GroupLayout PanelBotonLayout = new javax.swing.GroupLayout(PanelBoton);
        PanelBoton.setLayout(PanelBotonLayout);
        PanelBotonLayout.setHorizontalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotonLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        PanelBotonLayout.setVerticalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotonLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PanelTema.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTituloTema.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabelTituloTema.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloTema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloTema.setText("Tema");

        jComboBoxTema.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N

        javax.swing.GroupLayout PanelTemaLayout = new javax.swing.GroupLayout(PanelTema);
        PanelTema.setLayout(PanelTemaLayout);
        PanelTemaLayout.setHorizontalGroup(
            PanelTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTituloTema, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(PanelTemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxTema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelTemaLayout.setVerticalGroup(
            PanelTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTemaLayout.createSequentialGroup()
                .addComponent(jLabelTituloTema, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(PanelRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelGrafica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(PanelBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldRespuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuesta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuesta1ActionPerformed

    private void jTextFieldRespuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuesta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuesta2ActionPerformed

    private void jTextFieldRespuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuesta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuesta3ActionPerformed

    private void jTextFieldRespuesta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuesta4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuesta4ActionPerformed
    
    public void buscarInformacion(){
        try {
            panelGeneral.getVp().iniciarSocket();
            panelGeneral.getVp().getSalida().writeInt(BUSCAR_INFORMACION_IDEA);
            panelGeneral.getVp().getSalida().writeInt(id);
            idea = panelGeneral.getVp().getGson().fromJson((String)panelGeneral.getVp().getEntrada().readUTF(), Idea.class);                            
        } catch (IOException ioe) {
            System.out.println("Problema en la E/S del login");
        } catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this,"Hubo un problema al intentar conectarse al servidor.");
        }
    }
    
    public void llenarGrafico(){
        try {
            panelGeneral.getVp().iniciarSocket();
            panelGeneral.getVp().getSalida().writeInt(CONTAR_RESPUESTAS);
            panelGeneral.getVp().getSalida().writeUTF(panelGeneral.getVp().getGson().toJson(idea.getRespuestas()));
            TypeToken<List<Integer>> token = new TypeToken<List<Integer>>() {};
            List<Integer> cuenta = panelGeneral.getVp().getGson().fromJson((String)panelGeneral.getVp().getEntrada().readUTF(), token.getType());
            
            
            
            
        } catch (IOException ioe) {
            System.out.println("Problema en la E/S del login");
        } catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this,"Hubo un problema al intentar conectarse al servidor.");
        }
    }
    
    public void cargarDatos(){
        buscarInformacion();
        jLabelTitulo.setText(idea.getTitulo());
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
        
        llenarGrafico();
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
    private javax.swing.JPanel PanelBoton;
    private javax.swing.JPanel PanelComentario;
    private javax.swing.JPanel PanelDescripcion;
    private javax.swing.JPanel PanelGrafica;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelRespuesta;
    private javax.swing.JPanel PanelTema;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxTema;
    private javax.swing.JLabel jLabelCirculo1;
    private javax.swing.JLabel jLabelCirculo2;
    private javax.swing.JLabel jLabelCirculo3;
    private javax.swing.JLabel jLabelCirculo4;
    private javax.swing.JLabel jLabelRespuestaBarra1;
    private javax.swing.JLabel jLabelRespuestaBarra2;
    private javax.swing.JLabel jLabelRespuestaBarra3;
    private javax.swing.JLabel jLabelRespuestaBarra4;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloComentario;
    private javax.swing.JLabel jLabelTituloDescripcion;
    private javax.swing.JLabel jLabelTituloGrafica;
    private javax.swing.JLabel jLabelTituloRespuesta;
    private javax.swing.JLabel jLabelTituloTema;
    private javax.swing.JPanel jPanelBarra1;
    private javax.swing.JPanel jPanelBarra2;
    private javax.swing.JPanel jPanelBarra3;
    private javax.swing.JPanel jPanelBarra4;
    private javax.swing.JScrollPane jScrollDescripcion;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldRespuesta1;
    private javax.swing.JTextField jTextFieldRespuesta2;
    private javax.swing.JTextField jTextFieldRespuesta3;
    private javax.swing.JTextField jTextFieldRespuesta4;
    // End of variables declaration//GEN-END:variables
}
