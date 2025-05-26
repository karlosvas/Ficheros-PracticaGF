package com.gregorio.ficheros.vista;

import com.gregorio.ficheros.controller.ControllerFicheros;
import com.gregorio.ficheros.model.CSVData;
import java.awt.Dimension;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.ButtonGroup;
import javax.swing.DefaultButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VistaFicheros extends javax.swing.JFrame {
    private ControllerFicheros controller;
    private DefaultListModel modelList;
    private ButtonGroup grupo;
    private DefaultButtonModel modelButtonGroup;
    public final String csvPath = "src/main/resources/empleados.csv";


    public VistaFicheros() {
        controller = new ControllerFicheros();
        modelList = new DefaultListModel();
        grupo = new ButtonGroup();
        modelButtonGroup = new DefaultButtonModel();
        initComponents();
        setFrame();
    }
    
    public void setFrame(){
        // Centramos y damos un tamaño adecuado
        Dimension size = new Dimension(500, 500);
        this.setPreferredSize(size);
        this.setMinimumSize(size);
        this.setLocationRelativeTo(null);

        
        // Añadimos el título
        this.setTitle("Empleados HR");
        
        // Lista
        this.jlist.setModel(modelList);
        
        // Botones
        grupo.add(this.buttonId);
        grupo.add(this.buttonApellido);
        grupo.add(this.buttonDepartamento);
        this.buttonId.setSelected(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cargarDatos = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        Añadir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        buttonDepartamento = new javax.swing.JRadioButton();
        buttonApellido = new javax.swing.JRadioButton();
        buttonId = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new java.awt.GridLayout(3, 0, 0, 10));

        cargarDatos.setText("Cargar Datos");
        cargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarDatosActionPerformed(evt);
            }
        });
        jPanel3.add(cargarDatos);

        buscar.setText("Busqueda");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel3.add(buscar);

        Añadir.setText("Añadir + Datos");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        jPanel3.add(Añadir);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jlist.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jlist);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonDepartamento.setText("Departamento");

        buttonApellido.setText("Apellido");

        buttonId.setText("ID");

        jLabel1.setText("Ordenar por");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonDepartamento)
                .addGap(138, 138, 138))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonId)
                    .addComponent(buttonApellido)
                    .addComponent(buttonDepartamento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarDatosActionPerformed
        // Obtener los datos del fichero csv
        controller.getFileContentCsv(csvPath);
        ArrayList<CSVData> csvList = controller.getCsvList();
        
        // Selecionar el factor de ordenación
        if (this.buttonId.isSelected()) 
            Collections.sort(csvList, Comparator.comparingInt(obj -> obj.id));
        else if (this.buttonApellido.isSelected()) 
            Collections.sort(csvList, Comparator.comparing(obj -> obj.lastname));
        else if(this.buttonDepartamento.isSelected())
            Collections.sort(csvList, Comparator.comparingInt(obj -> obj.idDepartment));
        
        // Añadir los datos a el modelo de la lista
        modelList.clear();
        for(CSVData value : csvList)
            modelList.addElement(value);
    }//GEN-LAST:event_cargarDatosActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(controller.getCsvList().isEmpty()){
            JOptionPane.showMessageDialog(this, "No hay datos cargados en este momento", "Error", JOptionPane.ERROR_MESSAGE);
        } else{
            // Buscar por id
            String input = JOptionPane.showInputDialog(
                    this,
                    "Introduce el ID de empleado",
                    "Buscador",
                    JOptionPane.INFORMATION_MESSAGE
            );
            
            // Verificamos que sea un valor valido
            try{
                // Convertimos el inpout a int
                int idSearched = Integer.parseInt(input);
                // Hacemos bsuqueda binaria para obtener el id buscado
                CSVData csvDataFound = this.controller.BinarySearchCSVFiles(idSearched);
                
                if(csvDataFound == null)
                    throw new Error("No se ha encontrado empleado con ese id");
                
                // Actualizamos la lista
                modelList.clear();
                modelList.addElement(csvDataFound);
            } catch (NumberFormatException | Error e){
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        // Obtenemos los datos de el neuvo csv
        CSVData csvdata = new CSVData();
        
        // Instanciamos los inputs
        JTextField nombreField = new JTextField();
        JTextField apellidoField = new JTextField();
        JTextField departamentoField = new JTextField();
        
        // Creamos los campos
        Object[] message = {
            "Nombre:", nombreField,
            "Apellido:", apellidoField,
            "Departamento:", departamentoField
        };

        
        try {
            int option = JOptionPane.showConfirmDialog(null, message, "Introduce los datos", JOptionPane.OK_CANCEL_OPTION);
            if (option != JOptionPane.OK_OPTION) 
                throw  new Error("Se ha cancelado la operacion");

            ArrayList<CSVData> csvList = this.controller.getCsvList();
            int id = (csvList.get(csvList.size() -1).getId()) + 1; // Obtenemos la ultima id +1
            int idDepartment = Integer.parseInt(departamentoField.getText());
            String name = nombreField.getText();
            String lastname = apellidoField.getText();

            csvdata.setId(id);
            csvdata.setIdDepartment(idDepartment);
            csvdata.setName(name);
            csvdata.setLastname(lastname);
            
            // Añadimos esos datos al csv
            controller.setFileContentCsv(csvPath, csvdata);
        } catch(Error e){
          JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AñadirActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JButton buscar;
    private javax.swing.JRadioButton buttonApellido;
    private javax.swing.JRadioButton buttonDepartamento;
    private javax.swing.JRadioButton buttonId;
    private javax.swing.JButton cargarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlist;
    // End of variables declaration//GEN-END:variables
}
