/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_presentacion;

import capa_datos.ConectarBD;
import DAO.DAO;
import capa_logica.Documento;
import capa_logica.Estudiante;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Estudiantes
 */
public class Registrar_Documentos extends javax.swing.JFrame {

    ConectarBD Pg = new ConectarBD("localhost", "5432", "ApoyoAlimentario", "postgres", "bmx92103057509");

    public Registrar_Documentos() {
        initComponents();
    }

    private String GenerarCodigo() {
        SimpleDateFormat sdf = new SimpleDateFormat("hhmmss");
        return sdf.format(new Date());
    }

    private String CodigoEstudiante() {
        Estudiante t = new Estudiante();
        t.getId_estudiante();
        System.out.println(t);
        return t.getId_estudiante();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Carta = new javax.swing.JButton();
        Formulario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Certificado = new javax.swing.JButton();
        FotoFactura = new javax.swing.JButton();
        FotoRecibo = new javax.swing.JButton();
        CertificadoIng = new javax.swing.JButton();
        ExamenMedico = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        rutacarta = new javax.swing.JLabel();
        rutaformsol = new javax.swing.JLabel();
        rutacertestra = new javax.swing.JLabel();
        rutapublico = new javax.swing.JLabel();
        rutamatricula = new javax.swing.JLabel();
        rutaingresos = new javax.swing.JLabel();
        rutamedico = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("DOCUMENTOS");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setText("*Seleccione el archivo indicado en el campo correspondiente, el archivo debe estar en formato JPEG");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel9.setText("Carta Dirigida al Ingeniero Jorge Ramirez ");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("Formulario de Solicitud");

        Carta.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Carta.setText("Seleccionar Archivo");
        Carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaActionPerformed(evt);
            }
        });

        Formulario.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Formulario.setText("Seleccionar Archivo");
        Formulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Certificado de Estratificacion");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Fotocopia Factura recibo Publico");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Fotocopia Recibo matricula");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Certficado de Ingresos");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Examen Medico");

        Certificado.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Certificado.setText("Seleccionar Archivo");
        Certificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CertificadoActionPerformed(evt);
            }
        });

        FotoFactura.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        FotoFactura.setText("Seleccionar Archivo");
        FotoFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FotoFacturaActionPerformed(evt);
            }
        });

        FotoRecibo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        FotoRecibo.setText("Seleccionar Archivo");
        FotoRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FotoReciboActionPerformed(evt);
            }
        });

        CertificadoIng.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        CertificadoIng.setText("Seleccionar Archivo");
        CertificadoIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CertificadoIngActionPerformed(evt);
            }
        });

        ExamenMedico.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        ExamenMedico.setText("Seleccionar Archivo");
        ExamenMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamenMedicoActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton8.setText("REGISTRAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        rutacarta.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        rutaformsol.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        rutacertestra.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        rutapublico.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        rutamatricula.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        rutaingresos.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        rutamedico.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Aplicativo_Almuerzo\\src\\capa_presentacion\\recursos\\header_home_page3.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Certificado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FotoFactura))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rutamedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rutaingresos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rutamatricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rutaformsol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rutacertestra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rutapublico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FotoRecibo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CertificadoIng, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton8)
                                .addComponent(ExamenMedico))
                            .addComponent(Formulario, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(218, 218, 218)
                                        .addComponent(jLabel1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rutacarta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Carta)))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rutacarta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(Carta))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rutaformsol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(Formulario)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rutacertestra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(Certificado)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rutapublico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(FotoFactura)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(FotoRecibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rutamatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CertificadoIng)
                    .addComponent(rutaingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ExamenMedico)
                    .addComponent(rutamedico, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton8)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaActionPerformed

        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Archivo de Imagen", "jpg", "png"));
        fc.setCurrentDirectory(new java.io.File("e:/imagenes_tmp/"));
        int result = fc.showOpenDialog(null);
        //File abre = fc.getSelectedFile();
        if (result == JFileChooser.APPROVE_OPTION) {

            String rut = fc.getSelectedFile().getAbsolutePath();
            String name = fc.getSelectedFile().getName();
            rutacarta.setText(rut);
            if (Pg.guardarImagen(null, GenerarCodigo(), name, rut)) {
            } else {
                JOptionPane.showMessageDialog(this, "Imagen [" + name + "] almacenada en la base de datos");
                // Actualizar_lista();
            }
        }
    }//GEN-LAST:event_CartaActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ConectarBD CBD = new ConectarBD("localhost", "5432", "ApoyoAlimentario", "postgres", "bmx92103057509");
        ResultSet tabla = null;
        Documento o = new Documento();
        DAO SQ = new DAO();
        o.setRuta(this.rutacarta.getText());
        o.setRuta(this.rutaformsol.getText());
        o.setRuta(this.rutacertestra.getText());
        o.setRuta(this.rutapublico.getText());
        o.setRuta(this.rutamatricula.getText());
        o.setRuta(this.rutaingresos.getText());
        o.setRuta(this.rutamedico.getText());
        CBD.SetCadena(SQ.registrarDocumento());
        JOptionPane.showMessageDialog(null, "Se han Insertado " + CBD.EjecutarSql() + " registro(s)", "Se ha Guardado", JOptionPane.INFORMATION_MESSAGE);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_jButton8ActionPerformed

    private void FormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Archivo de Imagen", "jpg", "png"));
        fc.setCurrentDirectory(new java.io.File("e:/imagenes_tmp/"));
        int result = fc.showOpenDialog(null);
        //File abre = fc.getSelectedFile();
        if (result == JFileChooser.APPROVE_OPTION) {

            String rut = fc.getSelectedFile().getAbsolutePath();
            String name = fc.getSelectedFile().getName();
            rutaformsol.setText(rut);
            if (Pg.guardarImagen(null, GenerarCodigo(), name, rut)) {
            } else {
                JOptionPane.showMessageDialog(this, "Imagen [" + name + "] almacenada en la base de datos");
                // Actualizar_lista();
            }
        }
    }//GEN-LAST:event_FormularioActionPerformed

    private void CertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CertificadoActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Archivo de Imagen", "jpg", "png"));
        fc.setCurrentDirectory(new java.io.File("e:/imagenes_tmp/"));
        int result = fc.showOpenDialog(null);
        //File abre = fc.getSelectedFile();
        if (result == JFileChooser.APPROVE_OPTION) {

            String rut = fc.getSelectedFile().getAbsolutePath();
            String name = fc.getSelectedFile().getName();
            rutacertestra.setText(rut);
            if (Pg.guardarImagen(null, GenerarCodigo(), name, rut)) {
            } else {
                JOptionPane.showMessageDialog(this, "Imagen [" + name + "] almacenada en la base de datos");
                // Actualizar_lista();
            }
        }
    }//GEN-LAST:event_CertificadoActionPerformed

    private void FotoFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FotoFacturaActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Archivo de Imagen", "jpg", "png"));
        fc.setCurrentDirectory(new java.io.File("e:/imagenes_tmp/"));
        int result = fc.showOpenDialog(null);
        //File abre = fc.getSelectedFile();
        if (result == JFileChooser.APPROVE_OPTION) {

            String rut = fc.getSelectedFile().getAbsolutePath();
            String name = fc.getSelectedFile().getName();
            rutapublico.setText(rut);
            if (Pg.guardarImagen(null, GenerarCodigo(), name, rut)) {
            } else {
                JOptionPane.showMessageDialog(this, "Imagen [" + name + "] almacenada en la base de datos");
                // Actualizar_lista();
            }
        }
    }//GEN-LAST:event_FotoFacturaActionPerformed

    private void FotoReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FotoReciboActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Archivo de Imagen", "jpg", "png"));
        fc.setCurrentDirectory(new java.io.File("e:/imagenes_tmp/"));
        int result = fc.showOpenDialog(null);
        //File abre = fc.getSelectedFile();
        if (result == JFileChooser.APPROVE_OPTION) {

            String rut = fc.getSelectedFile().getAbsolutePath();
            String name = fc.getSelectedFile().getName();
            rutamatricula.setText(rut);
            if (Pg.guardarImagen(null, GenerarCodigo(), name, rut)) {
            } else {
                JOptionPane.showMessageDialog(this, "Imagen [" + name + "] almacenada en la base de datos");
                // Actualizar_lista();
            }
        }
    }//GEN-LAST:event_FotoReciboActionPerformed

    private void CertificadoIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CertificadoIngActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Archivo de Imagen", "jpg", "png"));
        fc.setCurrentDirectory(new java.io.File("e:/imagenes_tmp/"));
        int result = fc.showOpenDialog(null);
        //File abre = fc.getSelectedFile();
        if (result == JFileChooser.APPROVE_OPTION) {

            String rut = fc.getSelectedFile().getAbsolutePath();
            String name = fc.getSelectedFile().getName();
            rutaingresos.setText(rut);
            if (Pg.guardarImagen(null, GenerarCodigo(), name, rut)) {
            } else {
                JOptionPane.showMessageDialog(this, "Imagen [" + name + "] almacenada en la base de datos");
                // Actualizar_lista();
            }
        }
    }//GEN-LAST:event_CertificadoIngActionPerformed

    private void ExamenMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamenMedicoActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Archivo de Imagen", "jpg", "png"));
        fc.setCurrentDirectory(new java.io.File("e:/imagenes_tmp/"));
        int result = fc.showOpenDialog(null);
        //File abre = fc.getSelectedFile();
        if (result == JFileChooser.APPROVE_OPTION) {

            String rut = fc.getSelectedFile().getAbsolutePath();
            String name = fc.getSelectedFile().getName();
            rutamedico.setText(rut);
            if (Pg.guardarImagen(null, GenerarCodigo(), name, rut)) {
            } else {
                JOptionPane.showMessageDialog(this, "Imagen [" + name + "] almacenada en la base de datos");
                // Actualizar_lista();
            }
        }
    }//GEN-LAST:event_ExamenMedicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registrar_Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Registrar_Documentos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Carta;
    private javax.swing.JButton Certificado;
    private javax.swing.JButton CertificadoIng;
    private javax.swing.JButton ExamenMedico;
    private javax.swing.JButton Formulario;
    private javax.swing.JButton FotoFactura;
    private javax.swing.JButton FotoRecibo;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel rutacarta;
    private javax.swing.JLabel rutacertestra;
    private javax.swing.JLabel rutaformsol;
    private javax.swing.JLabel rutaingresos;
    private javax.swing.JLabel rutamatricula;
    private javax.swing.JLabel rutamedico;
    private javax.swing.JLabel rutapublico;
    // End of variables declaration//GEN-END:variables
}
