/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
/**
 *
 * @author Salva
 */
public class InterfazGraficas extends javax.swing.JFrame {

    /**
     * Creates new form InterfazGraficas
     */
    public InterfazGraficas() {
        super("Gestion Empleados");
        initComponents();
        cambiarContenedor(Bienvenida);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bienvenida = new javax.swing.JPanel();
        Version = new javax.swing.JLabel();
        Autores = new javax.swing.JLabel();
        MyTitle = new javax.swing.JLabel();
        Gestiontittle = new javax.swing.JLabel();
        VIndividualJPanel = new javax.swing.JPanel();
        TituloIndividual = new javax.swing.JLabel();
        NumeroLabel = new javax.swing.JLabel();
        ApellidoLabel = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        SueldoLabel = new javax.swing.JLabel();
        SueldoMaxLabel = new javax.swing.JLabel();
        SueldoMaxField = new javax.swing.JTextField();
        NumeroField = new javax.swing.JTextField();
        NombreField = new javax.swing.JTextField();
        ApellidoField = new javax.swing.JTextField();
        SueldoField = new javax.swing.JTextField();
        FechaLabel = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        RetrocederButton = new javax.swing.JButton();
        AvanzarButton = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();
        VCompletoPanel = new javax.swing.JPanel();
        TituloIndividual1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jlist = new javax.swing.JList<>();
        Barra = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        VisualizarIndividual = new javax.swing.JMenu();
        VisualizarCompleto = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Bienvenida.setBackground(new java.awt.Color(41, 44, 51));
        Bienvenida.setPreferredSize(new java.awt.Dimension(898, 575));

        Version.setBackground(new java.awt.Color(102, 102, 102));
        Version.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        Version.setForeground(new java.awt.Color(204, 204, 204));
        Version.setText(" V 1.0");

        Autores.setBackground(new java.awt.Color(102, 102, 102));
        Autores.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        Autores.setForeground(new java.awt.Color(204, 204, 204));
        Autores.setText("SALVADOR GARCÍA & BRUNO LÓPEZ");

        MyTitle.setBackground(new java.awt.Color(153, 153, 255));
        MyTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 90)); // NOI18N
        MyTitle.setForeground(new java.awt.Color(237, 187, 88));
        MyTitle.setText("My");

        Gestiontittle.setBackground(new java.awt.Color(153, 153, 255));
        Gestiontittle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 90)); // NOI18N
        Gestiontittle.setForeground(new java.awt.Color(204, 204, 204));
        Gestiontittle.setText("Gestion");

        javax.swing.GroupLayout BienvenidaLayout = new javax.swing.GroupLayout(Bienvenida);
        Bienvenida.setLayout(BienvenidaLayout);
        BienvenidaLayout.setHorizontalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BienvenidaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Version)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BienvenidaLayout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BienvenidaLayout.createSequentialGroup()
                        .addComponent(Autores)
                        .addGap(307, 307, 307))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BienvenidaLayout.createSequentialGroup()
                        .addComponent(MyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Gestiontittle, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
        );
        BienvenidaLayout.setVerticalGroup(
            BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BienvenidaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Version)
                .addGap(140, 140, 140)
                .addGroup(BienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gestiontittle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(Autores)
                .addGap(28, 28, 28))
        );

        VIndividualJPanel.setBackground(new java.awt.Color(41, 44, 51));
        VIndividualJPanel.setForeground(new java.awt.Color(51, 51, 51));
        VIndividualJPanel.setToolTipText("");

        TituloIndividual.setBackground(new java.awt.Color(153, 153, 255));
        TituloIndividual.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        TituloIndividual.setForeground(new java.awt.Color(237, 187, 88));
        TituloIndividual.setText("VISUALIZAR INDIVIDUAL");

        NumeroLabel.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        NumeroLabel.setForeground(new java.awt.Color(204, 204, 204));
        NumeroLabel.setText("Número");

        ApellidoLabel.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        ApellidoLabel.setForeground(new java.awt.Color(204, 204, 204));
        ApellidoLabel.setText("Apellido");

        NombreLabel.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        NombreLabel.setForeground(new java.awt.Color(204, 204, 204));
        NombreLabel.setText("Nombre");

        SueldoLabel.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        SueldoLabel.setForeground(new java.awt.Color(204, 204, 204));
        SueldoLabel.setText("Sueldo");

        SueldoMaxLabel.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        SueldoMaxLabel.setForeground(new java.awt.Color(204, 204, 204));
        SueldoMaxLabel.setText("Sueldo Max");

        SueldoMaxField.setBackground(new java.awt.Color(204, 204, 204));
        SueldoMaxField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SueldoMaxField.setForeground(new java.awt.Color(51, 51, 51));

        NumeroField.setBackground(new java.awt.Color(204, 204, 204));
        NumeroField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NumeroField.setForeground(new java.awt.Color(51, 51, 51));
        NumeroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroFieldActionPerformed(evt);
            }
        });

        NombreField.setBackground(new java.awt.Color(204, 204, 204));
        NombreField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NombreField.setForeground(new java.awt.Color(51, 51, 51));

        ApellidoField.setBackground(new java.awt.Color(204, 204, 204));
        ApellidoField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ApellidoField.setForeground(new java.awt.Color(51, 51, 51));

        SueldoField.setBackground(new java.awt.Color(204, 204, 204));
        SueldoField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SueldoField.setForeground(new java.awt.Color(51, 51, 51));

        FechaLabel.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        FechaLabel.setForeground(new java.awt.Color(204, 204, 204));
        FechaLabel.setText("Fecha");

        jDateChooser1.setBackground(new java.awt.Color(204, 204, 204));
        jDateChooser1.setForeground(new java.awt.Color(51, 51, 51));
        jDateChooser1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        RetrocederButton.setBackground(new java.awt.Color(56, 67, 75));
        RetrocederButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        RetrocederButton.setForeground(new java.awt.Color(255, 255, 255));
        RetrocederButton.setText("Retroceder");
        RetrocederButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrocederButtonActionPerformed(evt);
            }
        });

        AvanzarButton.setBackground(new java.awt.Color(56, 67, 75));
        AvanzarButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        AvanzarButton.setForeground(new java.awt.Color(255, 255, 255));
        AvanzarButton.setText("Avanzar");
        AvanzarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvanzarButtonActionPerformed(evt);
            }
        });

        Imagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        javax.swing.GroupLayout VIndividualJPanelLayout = new javax.swing.GroupLayout(VIndividualJPanel);
        VIndividualJPanel.setLayout(VIndividualJPanelLayout);
        VIndividualJPanelLayout.setHorizontalGroup(
            VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VIndividualJPanelLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(RetrocederButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(AvanzarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VIndividualJPanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VIndividualJPanelLayout.createSequentialGroup()
                            .addComponent(NumeroLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NumeroField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(VIndividualJPanelLayout.createSequentialGroup()
                            .addComponent(NombreLabel)
                            .addGap(30, 30, 30)
                            .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(VIndividualJPanelLayout.createSequentialGroup()
                            .addComponent(ApellidoLabel)
                            .addGap(30, 30, 30)
                            .addComponent(ApellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(VIndividualJPanelLayout.createSequentialGroup()
                            .addComponent(SueldoLabel)
                            .addGap(30, 30, 30)
                            .addComponent(SueldoField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(VIndividualJPanelLayout.createSequentialGroup()
                            .addComponent(FechaLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(VIndividualJPanelLayout.createSequentialGroup()
                            .addComponent(SueldoMaxLabel)
                            .addGap(40, 40, 40)
                            .addComponent(SueldoMaxField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Imagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VIndividualJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloIndividual)
                .addGap(208, 208, 208))
        );
        VIndividualJPanelLayout.setVerticalGroup(
            VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VIndividualJPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(TituloIndividual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VIndividualJPanelLayout.createSequentialGroup()
                        .addGroup(VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumeroLabel)
                            .addComponent(NumeroField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreLabel)
                            .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VIndividualJPanelLayout.createSequentialGroup()
                        .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VIndividualJPanelLayout.createSequentialGroup()
                        .addGroup(VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FechaLabel)
                            .addComponent(ApellidoLabel)
                            .addComponent(ApellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SueldoLabel)
                            .addComponent(SueldoField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SueldoMaxField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SueldoMaxLabel)))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(VIndividualJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetrocederButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AvanzarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        VCompletoPanel.setBackground(new java.awt.Color(41, 44, 51));
        VCompletoPanel.setPreferredSize(new java.awt.Dimension(898, 575));

        TituloIndividual1.setBackground(new java.awt.Color(153, 153, 255));
        TituloIndividual1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        TituloIndividual1.setForeground(new java.awt.Color(237, 187, 88));
        TituloIndividual1.setText("VISUALIZAR COMPLETO");

        Jlist.setBackground(new java.awt.Color(41, 44, 51));
        Jlist.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        Jlist.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Jlist.setForeground(new java.awt.Color(204, 204, 204));
        Jlist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Empleado1", "Empleado2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Jlist);

        javax.swing.GroupLayout VCompletoPanelLayout = new javax.swing.GroupLayout(VCompletoPanel);
        VCompletoPanel.setLayout(VCompletoPanelLayout);
        VCompletoPanelLayout.setHorizontalGroup(
            VCompletoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VCompletoPanelLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(VCompletoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VCompletoPanelLayout.createSequentialGroup()
                        .addComponent(TituloIndividual1)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VCompletoPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        VCompletoPanelLayout.setVerticalGroup(
            VCompletoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VCompletoPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(TituloIndividual1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Barra.setBackground(new java.awt.Color(61, 63, 65));
        Barra.setForeground(new java.awt.Color(61, 63, 65));
        Barra.setToolTipText("");

        Inicio.setText("   INICIO   ");
        Inicio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Inicio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Inicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
        });
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        Barra.add(Inicio);

        VisualizarIndividual.setText("   VISUALIZAR INDIVIDUAL  ");
        VisualizarIndividual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        VisualizarIndividual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisualizarIndividualMouseClicked(evt);
            }
        });
        VisualizarIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarIndividualActionPerformed(evt);
            }
        });
        Barra.add(VisualizarIndividual);

        VisualizarCompleto.setText("   VISUALIZAR COMPLETO");
        VisualizarCompleto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        VisualizarCompleto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        VisualizarCompleto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        VisualizarCompleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisualizarCompletoMouseClicked(evt);
            }
        });
        VisualizarCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarCompletoActionPerformed(evt);
            }
        });
        Barra.add(VisualizarCompleto);

        setJMenuBar(Barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(VIndividualJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(392, 392, 392)
                    .addComponent(VCompletoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(393, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(VIndividualJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(250, 250, 250)
                    .addComponent(VCompletoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(250, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // TODO add your handling code here:
        
        cambiarContenedor(Bienvenida);
    }//GEN-LAST:event_InicioActionPerformed

    private void VisualizarCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VisualizarCompletoActionPerformed

    private void VisualizarIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarIndividualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VisualizarIndividualActionPerformed

    private void VisualizarIndividualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizarIndividualMouseClicked
        // TODO add your handling code here:
        cambiarContenedor(VIndividualJPanel);
    }//GEN-LAST:event_VisualizarIndividualMouseClicked

    private void VisualizarCompletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizarCompletoMouseClicked
        // TODO add your handling code here:
        cambiarContenedor(VCompletoPanel);
    }//GEN-LAST:event_VisualizarCompletoMouseClicked

    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
        // TODO add your handling code here:
        cambiarContenedor(Bienvenida);

    }//GEN-LAST:event_InicioMouseClicked

    private void NumeroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroFieldActionPerformed

    private void RetrocederButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrocederButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RetrocederButtonActionPerformed

    private void AvanzarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvanzarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvanzarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InterfazGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGraficas().setVisible(true);
            }
        });
        
        
    }
    
    private void cambiarContenedor(javax.swing.JPanel aux){
      this.setContentPane(aux);
      pack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoField;
    private javax.swing.JLabel ApellidoLabel;
    private javax.swing.JLabel Autores;
    private javax.swing.JButton AvanzarButton;
    private javax.swing.JMenuBar Barra;
    private javax.swing.JPanel Bienvenida;
    private javax.swing.JLabel FechaLabel;
    private javax.swing.JLabel Gestiontittle;
    private javax.swing.JLabel Imagen;
    private javax.swing.JMenu Inicio;
    private javax.swing.JList<String> Jlist;
    private javax.swing.JLabel MyTitle;
    private javax.swing.JTextField NombreField;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NumeroField;
    private javax.swing.JLabel NumeroLabel;
    private javax.swing.JButton RetrocederButton;
    private javax.swing.JTextField SueldoField;
    private javax.swing.JLabel SueldoLabel;
    private javax.swing.JTextField SueldoMaxField;
    private javax.swing.JLabel SueldoMaxLabel;
    private javax.swing.JLabel TituloIndividual;
    private javax.swing.JLabel TituloIndividual1;
    private javax.swing.JPanel VCompletoPanel;
    private javax.swing.JPanel VIndividualJPanel;
    private javax.swing.JLabel Version;
    private javax.swing.JMenu VisualizarCompleto;
    private javax.swing.JMenu VisualizarIndividual;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
