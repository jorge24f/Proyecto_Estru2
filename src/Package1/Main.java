
package Package1;

// @author jflg2

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        
        Date fa=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String fecha_home=sdf.format(fa);
        jl_FechaActual_home.setText(fecha_home);
        
        jtp_archivo.setVisible(true);
        jtp_campos.setVisible(false);
        jtp_registros.setVisible(false);
        jtp_indices.setVisible(false);
        jtp_estandarizacion.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jp_header_home = new javax.swing.JPanel();
        jp_exit_home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jp_menus = new javax.swing.JPanel();
        jp_sideBar_Archivo = new javax.swing.JPanel();
        jp_mini_detalle_Archivo = new javax.swing.JPanel();
        jl_text_archivo = new javax.swing.JLabel();
        jp_sideBar_Campos = new javax.swing.JPanel();
        jp_mini_detalle_Campos = new javax.swing.JPanel();
        jl_text_campos = new javax.swing.JLabel();
        jp_sideBar_Registros = new javax.swing.JPanel();
        jp_mini_detalle_Registros = new javax.swing.JPanel();
        jl_text_registros = new javax.swing.JLabel();
        jp_sideBar_Indices = new javax.swing.JPanel();
        jp_mini_detalle_Indices = new javax.swing.JPanel();
        jl_text_indices = new javax.swing.JLabel();
        jp_sideBar_Estandarizacion = new javax.swing.JPanel();
        jp_mini_detalle_Estandarizacion = new javax.swing.JPanel();
        jl_text_estandarizacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jp_home = new javax.swing.JPanel();
        jp_name_and_date = new javax.swing.JPanel();
        rp_userHolder = new test.PanelRound();
        jl_abrevNombre_home = new javax.swing.JLabel();
        jl_username = new javax.swing.JLabel();
        jl_FechaActual_home = new javax.swing.JLabel();
        jtp_archivo = new javax.swing.JTabbedPane();
        jp_new_file = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtf_nombre_nuevo_archivo = new javax.swing.JTextField();
        jp_crear_nuevo_archivo = new javax.swing.JPanel();
        jLabel136 = new javax.swing.JLabel();
        jp_open_file = new javax.swing.JPanel();
        jp_save_file = new javax.swing.JPanel();
        jp_close_file = new javax.swing.JPanel();
        jp_exit = new javax.swing.JPanel();
        jtp_campos = new javax.swing.JTabbedPane();
        jp_crear_campos = new javax.swing.JPanel();
        jp_listar_campos = new javax.swing.JPanel();
        jp_modificar_campos = new javax.swing.JPanel();
        jp_borrar_campos = new javax.swing.JPanel();
        jtp_registros = new javax.swing.JTabbedPane();
        jp_introducir_registros = new javax.swing.JPanel();
        jp_modificar_registros = new javax.swing.JPanel();
        jp_buscar_registros = new javax.swing.JPanel();
        jp_borrar_registros = new javax.swing.JPanel();
        jp_listar_registros = new javax.swing.JPanel();
        jtp_indices = new javax.swing.JTabbedPane();
        jp_crear_indices = new javax.swing.JPanel();
        jp_re_indexar_archivos = new javax.swing.JPanel();
        jtp_estandarizacion = new javax.swing.JTabbedPane();
        jp_exportar_excel = new javax.swing.JPanel();
        jp_exportar_xml_con_schema = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_header_home.setBackground(new java.awt.Color(62, 120, 202));
        jp_header_home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jp_header_homeMouseDragged(evt);
            }
        });
        jp_header_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jp_header_homeMousePressed(evt);
            }
        });

        jp_exit_home.setBackground(new java.awt.Color(62, 120, 202));
        jp_exit_home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_exit_homeMouseMoved(evt);
            }
        });
        jp_exit_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_exit_homeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_exit_homeMouseExited(evt);
            }
        });
        jp_exit_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(62, 120, 202));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("   X");
        jp_exit_home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel1.setBackground(new java.awt.Color(23, 35, 54));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_header_homeLayout = new javax.swing.GroupLayout(jp_header_home);
        jp_header_home.setLayout(jp_header_homeLayout);
        jp_header_homeLayout.setHorizontalGroup(
            jp_header_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_header_homeLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 815, Short.MAX_VALUE)
                .addComponent(jp_exit_home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp_header_homeLayout.setVerticalGroup(
            jp_header_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_exit_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_header_homeLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jp_header_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        jp_menus.setBackground(new java.awt.Color(23, 35, 54));
        jp_menus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_sideBar_Archivo.setBackground(new java.awt.Color(41, 57, 80));
        jp_sideBar_Archivo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sideBar_ArchivoMouseMoved(evt);
            }
        });
        jp_sideBar_Archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sideBar_ArchivoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sideBar_ArchivoMouseExited(evt);
            }
        });
        jp_sideBar_Archivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jp_mini_detalle_ArchivoLayout = new javax.swing.GroupLayout(jp_mini_detalle_Archivo);
        jp_mini_detalle_Archivo.setLayout(jp_mini_detalle_ArchivoLayout);
        jp_mini_detalle_ArchivoLayout.setHorizontalGroup(
            jp_mini_detalle_ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_ArchivoLayout.setVerticalGroup(
            jp_mini_detalle_ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sideBar_Archivo.add(jp_mini_detalle_Archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_text_archivo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_text_archivo.setForeground(new java.awt.Color(240, 240, 240));
        jl_text_archivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_text_archivo.setText("Archivo");
        jp_sideBar_Archivo.add(jl_text_archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jp_menus.add(jp_sideBar_Archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 35));

        jp_sideBar_Campos.setBackground(new java.awt.Color(23, 35, 54));
        jp_sideBar_Campos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sideBar_CamposMouseMoved(evt);
            }
        });
        jp_sideBar_Campos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sideBar_CamposMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sideBar_CamposMouseExited(evt);
            }
        });
        jp_sideBar_Campos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_mini_detalle_Campos.setBackground(new java.awt.Color(23, 35, 54));

        javax.swing.GroupLayout jp_mini_detalle_CamposLayout = new javax.swing.GroupLayout(jp_mini_detalle_Campos);
        jp_mini_detalle_Campos.setLayout(jp_mini_detalle_CamposLayout);
        jp_mini_detalle_CamposLayout.setHorizontalGroup(
            jp_mini_detalle_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_CamposLayout.setVerticalGroup(
            jp_mini_detalle_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sideBar_Campos.add(jp_mini_detalle_Campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_text_campos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_text_campos.setForeground(new java.awt.Color(204, 204, 204));
        jl_text_campos.setText("Campos");
        jp_sideBar_Campos.add(jl_text_campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jp_menus.add(jp_sideBar_Campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 35));

        jp_sideBar_Registros.setBackground(new java.awt.Color(23, 35, 54));
        jp_sideBar_Registros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sideBar_RegistrosMouseMoved(evt);
            }
        });
        jp_sideBar_Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sideBar_RegistrosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sideBar_RegistrosMouseExited(evt);
            }
        });
        jp_sideBar_Registros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_mini_detalle_Registros.setBackground(new java.awt.Color(23, 35, 54));

        javax.swing.GroupLayout jp_mini_detalle_RegistrosLayout = new javax.swing.GroupLayout(jp_mini_detalle_Registros);
        jp_mini_detalle_Registros.setLayout(jp_mini_detalle_RegistrosLayout);
        jp_mini_detalle_RegistrosLayout.setHorizontalGroup(
            jp_mini_detalle_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_RegistrosLayout.setVerticalGroup(
            jp_mini_detalle_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sideBar_Registros.add(jp_mini_detalle_Registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_text_registros.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_text_registros.setForeground(new java.awt.Color(204, 204, 204));
        jl_text_registros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_text_registros.setText("Registros");
        jp_sideBar_Registros.add(jl_text_registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jp_menus.add(jp_sideBar_Registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 35));

        jp_sideBar_Indices.setBackground(new java.awt.Color(23, 35, 54));
        jp_sideBar_Indices.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sideBar_IndicesMouseMoved(evt);
            }
        });
        jp_sideBar_Indices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sideBar_IndicesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sideBar_IndicesMouseExited(evt);
            }
        });
        jp_sideBar_Indices.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_mini_detalle_Indices.setBackground(new java.awt.Color(23, 35, 54));

        javax.swing.GroupLayout jp_mini_detalle_IndicesLayout = new javax.swing.GroupLayout(jp_mini_detalle_Indices);
        jp_mini_detalle_Indices.setLayout(jp_mini_detalle_IndicesLayout);
        jp_mini_detalle_IndicesLayout.setHorizontalGroup(
            jp_mini_detalle_IndicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_IndicesLayout.setVerticalGroup(
            jp_mini_detalle_IndicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sideBar_Indices.add(jp_mini_detalle_Indices, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_text_indices.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_text_indices.setForeground(new java.awt.Color(204, 204, 204));
        jl_text_indices.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_text_indices.setText("  Índices");
        jp_sideBar_Indices.add(jl_text_indices, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jp_menus.add(jp_sideBar_Indices, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 150, 35));

        jp_sideBar_Estandarizacion.setBackground(new java.awt.Color(23, 35, 54));
        jp_sideBar_Estandarizacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sideBar_EstandarizacionMouseMoved(evt);
            }
        });
        jp_sideBar_Estandarizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sideBar_EstandarizacionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sideBar_EstandarizacionMouseExited(evt);
            }
        });
        jp_sideBar_Estandarizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_mini_detalle_Estandarizacion.setBackground(new java.awt.Color(23, 35, 54));

        javax.swing.GroupLayout jp_mini_detalle_EstandarizacionLayout = new javax.swing.GroupLayout(jp_mini_detalle_Estandarizacion);
        jp_mini_detalle_Estandarizacion.setLayout(jp_mini_detalle_EstandarizacionLayout);
        jp_mini_detalle_EstandarizacionLayout.setHorizontalGroup(
            jp_mini_detalle_EstandarizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_EstandarizacionLayout.setVerticalGroup(
            jp_mini_detalle_EstandarizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sideBar_Estandarizacion.add(jp_mini_detalle_Estandarizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_text_estandarizacion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_text_estandarizacion.setForeground(new java.awt.Color(204, 204, 204));
        jl_text_estandarizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_text_estandarizacion.setText("Estandarización");
        jp_sideBar_Estandarizacion.add(jl_text_estandarizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, -1));

        jp_menus.add(jp_sideBar_Estandarizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 150, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Standard File Manager");
        jp_menus.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 40));

        getContentPane().add(jp_menus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 150, 670));

        jp_home.setBackground(new java.awt.Color(255, 255, 255));
        jp_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_name_and_date.setBackground(new java.awt.Color(62, 120, 202));
        jp_name_and_date.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rp_userHolder.setBackground(new java.awt.Color(255, 255, 255));
        rp_userHolder.setForeground(new java.awt.Color(255, 102, 0));
        rp_userHolder.setRoundBottomLeft(120);
        rp_userHolder.setRoundBottomRight(120);
        rp_userHolder.setRoundTopLeft(120);
        rp_userHolder.setRoundTopRight(120);
        rp_userHolder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_abrevNombre_home.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_abrevNombre_home.setText("    AD");
        rp_userHolder.add(jl_abrevNombre_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 25, 50, -1));

        jp_name_and_date.add(rp_userHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 75, 75));

        jl_username.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_username.setText("Admin");
        jp_name_and_date.add(jl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jl_FechaActual_home.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_FechaActual_home.setText("New Date");
        jp_name_and_date.add(jl_FechaActual_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 0, -1, 70));

        jp_home.add(jp_name_and_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 100));

        jtp_archivo.setBackground(new java.awt.Color(255, 255, 255));
        jtp_archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtp_archivoMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Nombre del Archivo: ");

        jtf_nombre_nuevo_archivo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtf_nombre_nuevo_archivo.setForeground(new java.awt.Color(204, 204, 204));
        jtf_nombre_nuevo_archivo.setText("Ingrese el nombre");
        jtf_nombre_nuevo_archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtf_nombre_nuevo_archivoMousePressed(evt);
            }
        });

        jp_crear_nuevo_archivo.setBackground(new java.awt.Color(0, 120, 212));
        jp_crear_nuevo_archivo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_crear_nuevo_archivoMouseMoved(evt);
            }
        });
        jp_crear_nuevo_archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_crear_nuevo_archivoMouseExited(evt);
            }
        });

        jLabel136.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setText("Crear");

        javax.swing.GroupLayout jp_crear_nuevo_archivoLayout = new javax.swing.GroupLayout(jp_crear_nuevo_archivo);
        jp_crear_nuevo_archivo.setLayout(jp_crear_nuevo_archivoLayout);
        jp_crear_nuevo_archivoLayout.setHorizontalGroup(
            jp_crear_nuevo_archivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_crear_nuevo_archivoLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel136)
                .addGap(25, 25, 25))
        );
        jp_crear_nuevo_archivoLayout.setVerticalGroup(
            jp_crear_nuevo_archivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_new_fileLayout = new javax.swing.GroupLayout(jp_new_file);
        jp_new_file.setLayout(jp_new_fileLayout);
        jp_new_fileLayout.setHorizontalGroup(
            jp_new_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_new_fileLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jp_new_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtf_nombre_nuevo_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_crear_nuevo_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(607, Short.MAX_VALUE))
        );
        jp_new_fileLayout.setVerticalGroup(
            jp_new_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_new_fileLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_nombre_nuevo_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jp_crear_nuevo_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );

        jtp_archivo.addTab("Nuevo", jp_new_file);

        javax.swing.GroupLayout jp_open_fileLayout = new javax.swing.GroupLayout(jp_open_file);
        jp_open_file.setLayout(jp_open_fileLayout);
        jp_open_fileLayout.setHorizontalGroup(
            jp_open_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_open_fileLayout.setVerticalGroup(
            jp_open_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_archivo.addTab("Abrir", jp_open_file);

        javax.swing.GroupLayout jp_save_fileLayout = new javax.swing.GroupLayout(jp_save_file);
        jp_save_file.setLayout(jp_save_fileLayout);
        jp_save_fileLayout.setHorizontalGroup(
            jp_save_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_save_fileLayout.setVerticalGroup(
            jp_save_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_archivo.addTab("Salvar", jp_save_file);

        javax.swing.GroupLayout jp_close_fileLayout = new javax.swing.GroupLayout(jp_close_file);
        jp_close_file.setLayout(jp_close_fileLayout);
        jp_close_fileLayout.setHorizontalGroup(
            jp_close_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_close_fileLayout.setVerticalGroup(
            jp_close_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_archivo.addTab("Cerrar", jp_close_file);

        javax.swing.GroupLayout jp_exitLayout = new javax.swing.GroupLayout(jp_exit);
        jp_exit.setLayout(jp_exitLayout);
        jp_exitLayout.setHorizontalGroup(
            jp_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_exitLayout.setVerticalGroup(
            jp_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_archivo.addTab("Salir", jp_exit);

        jp_home.add(jtp_archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 850, 570));

        javax.swing.GroupLayout jp_crear_camposLayout = new javax.swing.GroupLayout(jp_crear_campos);
        jp_crear_campos.setLayout(jp_crear_camposLayout);
        jp_crear_camposLayout.setHorizontalGroup(
            jp_crear_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_crear_camposLayout.setVerticalGroup(
            jp_crear_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_campos.addTab("Crear", jp_crear_campos);

        javax.swing.GroupLayout jp_listar_camposLayout = new javax.swing.GroupLayout(jp_listar_campos);
        jp_listar_campos.setLayout(jp_listar_camposLayout);
        jp_listar_camposLayout.setHorizontalGroup(
            jp_listar_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_listar_camposLayout.setVerticalGroup(
            jp_listar_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_campos.addTab("Listar", jp_listar_campos);

        javax.swing.GroupLayout jp_modificar_camposLayout = new javax.swing.GroupLayout(jp_modificar_campos);
        jp_modificar_campos.setLayout(jp_modificar_camposLayout);
        jp_modificar_camposLayout.setHorizontalGroup(
            jp_modificar_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_modificar_camposLayout.setVerticalGroup(
            jp_modificar_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_campos.addTab("Modificar", jp_modificar_campos);

        javax.swing.GroupLayout jp_borrar_camposLayout = new javax.swing.GroupLayout(jp_borrar_campos);
        jp_borrar_campos.setLayout(jp_borrar_camposLayout);
        jp_borrar_camposLayout.setHorizontalGroup(
            jp_borrar_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_borrar_camposLayout.setVerticalGroup(
            jp_borrar_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_campos.addTab("Borrar", jp_borrar_campos);

        jp_home.add(jtp_campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 850, 570));

        javax.swing.GroupLayout jp_introducir_registrosLayout = new javax.swing.GroupLayout(jp_introducir_registros);
        jp_introducir_registros.setLayout(jp_introducir_registrosLayout);
        jp_introducir_registrosLayout.setHorizontalGroup(
            jp_introducir_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_introducir_registrosLayout.setVerticalGroup(
            jp_introducir_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_registros.addTab("Introducir", jp_introducir_registros);

        javax.swing.GroupLayout jp_modificar_registrosLayout = new javax.swing.GroupLayout(jp_modificar_registros);
        jp_modificar_registros.setLayout(jp_modificar_registrosLayout);
        jp_modificar_registrosLayout.setHorizontalGroup(
            jp_modificar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_modificar_registrosLayout.setVerticalGroup(
            jp_modificar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_registros.addTab("Modificar", jp_modificar_registros);

        javax.swing.GroupLayout jp_buscar_registrosLayout = new javax.swing.GroupLayout(jp_buscar_registros);
        jp_buscar_registros.setLayout(jp_buscar_registrosLayout);
        jp_buscar_registrosLayout.setHorizontalGroup(
            jp_buscar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_buscar_registrosLayout.setVerticalGroup(
            jp_buscar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_registros.addTab("Buscar", jp_buscar_registros);

        javax.swing.GroupLayout jp_borrar_registrosLayout = new javax.swing.GroupLayout(jp_borrar_registros);
        jp_borrar_registros.setLayout(jp_borrar_registrosLayout);
        jp_borrar_registrosLayout.setHorizontalGroup(
            jp_borrar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_borrar_registrosLayout.setVerticalGroup(
            jp_borrar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_registros.addTab("Borrar", jp_borrar_registros);

        javax.swing.GroupLayout jp_listar_registrosLayout = new javax.swing.GroupLayout(jp_listar_registros);
        jp_listar_registros.setLayout(jp_listar_registrosLayout);
        jp_listar_registrosLayout.setHorizontalGroup(
            jp_listar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_listar_registrosLayout.setVerticalGroup(
            jp_listar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_registros.addTab("Listar", jp_listar_registros);

        jp_home.add(jtp_registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 850, 570));

        javax.swing.GroupLayout jp_crear_indicesLayout = new javax.swing.GroupLayout(jp_crear_indices);
        jp_crear_indices.setLayout(jp_crear_indicesLayout);
        jp_crear_indicesLayout.setHorizontalGroup(
            jp_crear_indicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_crear_indicesLayout.setVerticalGroup(
            jp_crear_indicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_indices.addTab("Crear", jp_crear_indices);

        javax.swing.GroupLayout jp_re_indexar_archivosLayout = new javax.swing.GroupLayout(jp_re_indexar_archivos);
        jp_re_indexar_archivos.setLayout(jp_re_indexar_archivosLayout);
        jp_re_indexar_archivosLayout.setHorizontalGroup(
            jp_re_indexar_archivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_re_indexar_archivosLayout.setVerticalGroup(
            jp_re_indexar_archivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_indices.addTab("Re Indexar", jp_re_indexar_archivos);

        jp_home.add(jtp_indices, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 850, 570));

        javax.swing.GroupLayout jp_exportar_excelLayout = new javax.swing.GroupLayout(jp_exportar_excel);
        jp_exportar_excel.setLayout(jp_exportar_excelLayout);
        jp_exportar_excelLayout.setHorizontalGroup(
            jp_exportar_excelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_exportar_excelLayout.setVerticalGroup(
            jp_exportar_excelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_estandarizacion.addTab("Exportar Excel", jp_exportar_excel);

        javax.swing.GroupLayout jp_exportar_xml_con_schemaLayout = new javax.swing.GroupLayout(jp_exportar_xml_con_schema);
        jp_exportar_xml_con_schema.setLayout(jp_exportar_xml_con_schemaLayout);
        jp_exportar_xml_con_schemaLayout.setHorizontalGroup(
            jp_exportar_xml_con_schemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jp_exportar_xml_con_schemaLayout.setVerticalGroup(
            jp_exportar_xml_con_schemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jtp_estandarizacion.addTab("Exportar XML con Schema", jp_exportar_xml_con_schema);

        jp_home.add(jtp_estandarizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 850, 570));

        getContentPane().add(jp_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 850, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jp_header_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_header_homeMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jp_header_homeMousePressed

    private void jp_header_homeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_header_homeMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jp_header_homeMouseDragged

    private void jp_exit_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_homeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jp_exit_homeMouseClicked

    private void jp_exit_homeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_homeMouseMoved
        jp_exit_home.setBackground(new Color(204,51,0));
    }//GEN-LAST:event_jp_exit_homeMouseMoved

    private void jp_exit_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_homeMouseExited
        jp_exit_home.setBackground(new Color(62,120,202));
    }//GEN-LAST:event_jp_exit_homeMouseExited

    private void jp_sideBar_ArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_ArchivoMouseClicked
       
       jtp_archivo.setVisible(true);
       jtp_campos.setVisible(false);
       jtp_registros.setVisible(false);
       jtp_indices.setVisible(false);
       jtp_estandarizacion.setVisible(false);
       jtp_archivo.setSelectedIndex(0);
       
       jtf_nombre_nuevo_archivo.setText("Ingrese el nombre");
       jtf_nombre_nuevo_archivo.setForeground(new Color(204,204,204));
       
       flag_text_archivo = true;
       flag_text_campos = false;
       flag_text_registros = false;
       flag_text_indices = false;
       flag_text_estandarizacion = false;
       
       jl_text_archivo.setForeground(Color.WHITE);
       jp_sideBar_Archivo.setBackground(new Color(41,57,80));
       jp_mini_detalle_Archivo.setBackground(new Color(240,240,240));
       
       jl_text_campos.setForeground(new Color(204,204,204));
       jp_sideBar_Campos.setBackground(new Color(23,35,54));
       jp_mini_detalle_Campos.setBackground(new Color(23,35,54));
       
       jl_text_registros.setForeground(new Color(204,204,204));
       jp_sideBar_Registros.setBackground(new Color(23,35,54));
       jp_mini_detalle_Registros.setBackground(new Color(23,35,54));
       
       jl_text_indices.setForeground(new Color(204,204,204));
       jp_sideBar_Indices.setBackground(new Color(23,35,54));
       jp_mini_detalle_Indices.setBackground(new Color(23,35,54));
       
       jl_text_estandarizacion.setForeground(new Color(204,204,204));
       jp_sideBar_Estandarizacion.setBackground(new Color(23,35,54));
       jp_mini_detalle_Estandarizacion.setBackground(new Color(23,35,54));
    }//GEN-LAST:event_jp_sideBar_ArchivoMouseClicked

    private void jp_sideBar_CamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_CamposMouseClicked
       jtp_archivo.setVisible(false);
       jtp_campos.setVisible(true);
       jtp_registros.setVisible(false);
       jtp_indices.setVisible(false);
       jtp_estandarizacion.setVisible(false);
       jtp_campos.setSelectedIndex(0);
        
       flag_text_archivo = false;
       flag_text_campos = true;
       flag_text_registros = false;
       flag_text_indices = false;
       flag_text_estandarizacion = false;
        
       jl_text_campos.setForeground(Color.WHITE);
       jp_sideBar_Campos.setBackground(new Color(41,57,80));
       jp_mini_detalle_Campos.setBackground(new Color(240,240,240));
       
       jl_text_archivo.setForeground(new Color(204,204,204));
       jp_sideBar_Archivo.setBackground(new Color(23,35,54));
       jp_mini_detalle_Archivo.setBackground(new Color(23,35,54));
       
       jl_text_registros.setForeground(new Color(204,204,204));
       jp_sideBar_Registros.setBackground(new Color(23,35,54));
       jp_mini_detalle_Registros.setBackground(new Color(23,35,54));
       
       jl_text_indices.setForeground(new Color(204,204,204));
       jp_sideBar_Indices.setBackground(new Color(23,35,54));
       jp_mini_detalle_Indices.setBackground(new Color(23,35,54));
       
       jl_text_estandarizacion.setForeground(new Color(204,204,204));
       jp_sideBar_Estandarizacion.setBackground(new Color(23,35,54));
       jp_mini_detalle_Estandarizacion.setBackground(new Color(23,35,54));
    }//GEN-LAST:event_jp_sideBar_CamposMouseClicked

    private void jp_sideBar_RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_RegistrosMouseClicked
       jtp_archivo.setVisible(false);
        jtp_campos.setVisible(false);
        jtp_registros.setVisible(true);
        jtp_indices.setVisible(false);
        jtp_estandarizacion.setVisible(false);
        jtp_registros.setSelectedIndex(0);
        
       flag_text_archivo = false;
       flag_text_campos = false;
       flag_text_registros = true;
       flag_text_indices = false;
       flag_text_estandarizacion = false;
        
       jl_text_registros.setForeground(Color.WHITE);
       jp_sideBar_Registros.setBackground(new Color(41,57,80));
       jp_mini_detalle_Registros.setBackground(new Color(240,240,240));
       
       jl_text_archivo.setForeground(new Color(204,204,204));
       jp_sideBar_Archivo.setBackground(new Color(23,35,54));
       jp_mini_detalle_Archivo.setBackground(new Color(23,35,54));
       
       jl_text_campos.setForeground(new Color(204,204,204));
       jp_sideBar_Campos.setBackground(new Color(23,35,54));
       jp_mini_detalle_Campos.setBackground(new Color(23,35,54));
       
       jl_text_indices.setForeground(new Color(204,204,204));
       jp_sideBar_Indices.setBackground(new Color(23,35,54));
       jp_mini_detalle_Indices.setBackground(new Color(23,35,54));
       
       jl_text_estandarizacion.setForeground(new Color(204,204,204));
       jp_sideBar_Estandarizacion.setBackground(new Color(23,35,54));
       jp_mini_detalle_Estandarizacion.setBackground(new Color(23,35,54));
    }//GEN-LAST:event_jp_sideBar_RegistrosMouseClicked

    private void jp_sideBar_IndicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_IndicesMouseClicked
       jtp_archivo.setVisible(false);
       jtp_campos.setVisible(false);
       jtp_registros.setVisible(false);
       jtp_indices.setVisible(true);
       jtp_estandarizacion.setVisible(false);
       jtp_indices.setSelectedIndex(0);
        
       flag_text_archivo = false;
       flag_text_campos = false;
       flag_text_registros = false;
       flag_text_indices = true;
       flag_text_estandarizacion = false;
        
       jl_text_indices.setForeground(Color.WHITE);
       jp_sideBar_Indices.setBackground(new Color(41,57,80));
       jp_mini_detalle_Indices.setBackground(new Color(240,240,240));
       
       jl_text_archivo.setForeground(new Color(204,204,204));
       jp_sideBar_Archivo.setBackground(new Color(23,35,54));
       jp_mini_detalle_Archivo.setBackground(new Color(23,35,54));
       
       jl_text_registros.setForeground(new Color(204,204,204));
       jp_sideBar_Registros.setBackground(new Color(23,35,54));
       jp_mini_detalle_Registros.setBackground(new Color(23,35,54));
       
       jl_text_campos.setForeground(new Color(204,204,204));
       jp_sideBar_Campos.setBackground(new Color(23,35,54));
       jp_mini_detalle_Campos.setBackground(new Color(23,35,54));
       
       jl_text_estandarizacion.setForeground(new Color(204,204,204));
       jp_sideBar_Estandarizacion.setBackground(new Color(23,35,54));
       jp_mini_detalle_Estandarizacion.setBackground(new Color(23,35,54));
    }//GEN-LAST:event_jp_sideBar_IndicesMouseClicked

    private void jp_sideBar_EstandarizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_EstandarizacionMouseClicked
       jtp_archivo.setVisible(false);
       jtp_campos.setVisible(false);
       jtp_registros.setVisible(false);
       jtp_indices.setVisible(false);
       jtp_estandarizacion.setVisible(true);
       jtp_estandarizacion.setSelectedIndex(0);
        
       flag_text_archivo = false;
       flag_text_campos = false;
       flag_text_registros = false;
       flag_text_indices = false;
       flag_text_estandarizacion = true;
        
        jl_text_estandarizacion.setForeground(Color.WHITE);
       jp_sideBar_Estandarizacion.setBackground(new Color(41,57,80));
       jp_mini_detalle_Estandarizacion.setBackground(new Color(240,240,240));
       
       jl_text_archivo.setForeground(new Color(204,204,204));
       jp_sideBar_Archivo.setBackground(new Color(23,35,54));
       jp_mini_detalle_Archivo.setBackground(new Color(23,35,54));
       
       jl_text_registros.setForeground(new Color(204,204,204));
       jp_sideBar_Registros.setBackground(new Color(23,35,54));
       jp_mini_detalle_Registros.setBackground(new Color(23,35,54));
       
       jl_text_campos.setForeground(new Color(204,204,204));
       jp_sideBar_Campos.setBackground(new Color(23,35,54));
       jp_mini_detalle_Campos.setBackground(new Color(23,35,54));
       
       jl_text_indices.setForeground(new Color(204,204,204));
       jp_sideBar_Indices.setBackground(new Color(23,35,54));
       jp_mini_detalle_Indices.setBackground(new Color(23,35,54));
    }//GEN-LAST:event_jp_sideBar_EstandarizacionMouseClicked

    private void jp_sideBar_ArchivoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_ArchivoMouseMoved
     if(!flag_text_archivo){
            jp_sideBar_Archivo.setBackground(new Color(41,57,80));
        }
    }//GEN-LAST:event_jp_sideBar_ArchivoMouseMoved

    private void jp_sideBar_ArchivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_ArchivoMouseExited
        if(!flag_text_archivo){
            jp_sideBar_Archivo.setBackground(new Color(23,35,54));
        }
    }//GEN-LAST:event_jp_sideBar_ArchivoMouseExited

    private void jp_sideBar_CamposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_CamposMouseMoved
        if(!flag_text_campos){
            jp_sideBar_Campos.setBackground(new Color(41,57,80));
        }
    }//GEN-LAST:event_jp_sideBar_CamposMouseMoved

    private void jp_sideBar_CamposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_CamposMouseExited
        if(!flag_text_campos){
            jp_sideBar_Campos.setBackground(new Color(23,35,54));
        }
    }//GEN-LAST:event_jp_sideBar_CamposMouseExited

    private void jp_sideBar_RegistrosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_RegistrosMouseMoved
        if(!flag_text_registros){
            jp_sideBar_Registros.setBackground(new Color(41,57,80));
        }
    }//GEN-LAST:event_jp_sideBar_RegistrosMouseMoved

    private void jp_sideBar_RegistrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_RegistrosMouseExited
        if(!flag_text_registros){
            jp_sideBar_Registros.setBackground(new Color(23,35,54));
        }
    }//GEN-LAST:event_jp_sideBar_RegistrosMouseExited

    private void jp_sideBar_IndicesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_IndicesMouseMoved
        if(!flag_text_indices){
            jp_sideBar_Indices.setBackground(new Color(41,57,80));
        }
    }//GEN-LAST:event_jp_sideBar_IndicesMouseMoved

    private void jp_sideBar_IndicesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_IndicesMouseExited
        if(!flag_text_indices){
            jp_sideBar_Indices.setBackground(new Color(23,35,54));
        }
    }//GEN-LAST:event_jp_sideBar_IndicesMouseExited

    private void jp_sideBar_EstandarizacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_EstandarizacionMouseMoved
        if(!flag_text_estandarizacion){
            jp_sideBar_Estandarizacion.setBackground(new Color(41,57,80));
        }
    }//GEN-LAST:event_jp_sideBar_EstandarizacionMouseMoved

    private void jp_sideBar_EstandarizacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sideBar_EstandarizacionMouseExited
        if(!flag_text_estandarizacion){
            jp_sideBar_Estandarizacion.setBackground(new Color(23,35,54));
        }
    }//GEN-LAST:event_jp_sideBar_EstandarizacionMouseExited

    private void jtp_archivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtp_archivoMouseClicked
        if(jtp_archivo.getSelectedIndex() == 4){
            System.exit(0);
        }
    }//GEN-LAST:event_jtp_archivoMouseClicked

    private void jtf_nombre_nuevo_archivoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_nombre_nuevo_archivoMousePressed
        if(jtf_nombre_nuevo_archivo.getText().equals("Ingrese el nombre")){
            jtf_nombre_nuevo_archivo.setText("");
            jtf_nombre_nuevo_archivo.setForeground(Color.BLACK);
        }    
    }//GEN-LAST:event_jtf_nombre_nuevo_archivoMousePressed

    private void jp_crear_nuevo_archivoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_crear_nuevo_archivoMouseMoved
        jp_crear_nuevo_archivo.setBackground(new Color(0,100,212));
    }//GEN-LAST:event_jp_crear_nuevo_archivoMouseMoved

    private void jp_crear_nuevo_archivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_crear_nuevo_archivoMouseExited
        jp_crear_nuevo_archivo.setBackground(new Color(0,120,212));
    }//GEN-LAST:event_jp_crear_nuevo_archivoMouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jl_FechaActual_home;
    private javax.swing.JLabel jl_abrevNombre_home;
    private javax.swing.JLabel jl_text_archivo;
    private javax.swing.JLabel jl_text_campos;
    private javax.swing.JLabel jl_text_estandarizacion;
    private javax.swing.JLabel jl_text_indices;
    private javax.swing.JLabel jl_text_registros;
    private javax.swing.JLabel jl_username;
    private javax.swing.JPanel jp_borrar_campos;
    private javax.swing.JPanel jp_borrar_registros;
    private javax.swing.JPanel jp_buscar_registros;
    private javax.swing.JPanel jp_close_file;
    private javax.swing.JPanel jp_crear_campos;
    private javax.swing.JPanel jp_crear_indices;
    private javax.swing.JPanel jp_crear_nuevo_archivo;
    private javax.swing.JPanel jp_exit;
    private javax.swing.JPanel jp_exit_home;
    private javax.swing.JPanel jp_exportar_excel;
    private javax.swing.JPanel jp_exportar_xml_con_schema;
    private javax.swing.JPanel jp_header_home;
    private javax.swing.JPanel jp_home;
    private javax.swing.JPanel jp_introducir_registros;
    private javax.swing.JPanel jp_listar_campos;
    private javax.swing.JPanel jp_listar_registros;
    private javax.swing.JPanel jp_menus;
    private javax.swing.JPanel jp_mini_detalle_Archivo;
    private javax.swing.JPanel jp_mini_detalle_Campos;
    private javax.swing.JPanel jp_mini_detalle_Estandarizacion;
    private javax.swing.JPanel jp_mini_detalle_Indices;
    private javax.swing.JPanel jp_mini_detalle_Registros;
    private javax.swing.JPanel jp_modificar_campos;
    private javax.swing.JPanel jp_modificar_registros;
    private javax.swing.JPanel jp_name_and_date;
    private javax.swing.JPanel jp_new_file;
    private javax.swing.JPanel jp_open_file;
    private javax.swing.JPanel jp_re_indexar_archivos;
    private javax.swing.JPanel jp_save_file;
    private javax.swing.JPanel jp_sideBar_Archivo;
    private javax.swing.JPanel jp_sideBar_Campos;
    private javax.swing.JPanel jp_sideBar_Estandarizacion;
    private javax.swing.JPanel jp_sideBar_Indices;
    private javax.swing.JPanel jp_sideBar_Registros;
    private javax.swing.JTextField jtf_nombre_nuevo_archivo;
    private javax.swing.JTabbedPane jtp_archivo;
    private javax.swing.JTabbedPane jtp_campos;
    private javax.swing.JTabbedPane jtp_estandarizacion;
    private javax.swing.JTabbedPane jtp_indices;
    private javax.swing.JTabbedPane jtp_registros;
    private test.PanelRound rp_userHolder;
    // End of variables declaration//GEN-END:variables

    private int xMouse, yMouse;
    private boolean flag_text_archivo = true;
    private boolean flag_text_campos;
    private boolean flag_text_registros;
    private boolean flag_text_indices;
    private boolean flag_text_estandarizacion;
}
