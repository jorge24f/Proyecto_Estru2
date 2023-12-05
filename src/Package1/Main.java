
package Package1;

// @author jflg2

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Scanner;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

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
        
        jl_archivo_actual_open.setText("Archivo actual: ");
        
        jtable_campos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtable_campos.getTableHeader().setOpaque(false);
        jtable_campos.getTableHeader().setBackground(new Color(62,120,202));
        jtable_campos.getTableHeader().setForeground(new Color(255,255,255));
        
        
        jtable_insertar_registro.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtable_insertar_registro.getTableHeader().setOpaque(false);
        jtable_insertar_registro.getTableHeader().setBackground(new Color(62,120,202));
        jtable_insertar_registro.getTableHeader().setForeground(new Color(255,255,255));
        //jtable_insertar_registro.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
        jtable_insertar_registro.setColumnSelectionAllowed(true);
        
        jtable_listar_registros.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtable_listar_registros.getTableHeader().setOpaque(false);
        jtable_listar_registros.getTableHeader().setBackground(new Color(62,120,202));
        jtable_listar_registros.getTableHeader().setForeground(new Color(255,255,255));
        //jtable_campos.getTableHeader().setBackground(Color.WHITE);
        //jtable_insertar_registro.getTableHeader().setBorder(BorderFactory.createLineBorder(Color.BLACK));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_tipo_de_dato_crear_campo = new javax.swing.ButtonGroup();
        bg_esLlavePrimaria_crear_campo = new javax.swing.ButtonGroup();
        bg_nuevo_tipo_de_dato_crear_campo = new javax.swing.ButtonGroup();
        bg_nueva_esLlave = new javax.swing.ButtonGroup();
        jPopup_campos = new javax.swing.JPopupMenu();
        jmi_modificar_campo = new javax.swing.JMenuItem();
        jmi_borrar_campo = new javax.swing.JMenuItem();
        jd_modificar_campo = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jl_modificar_campo = new javax.swing.JLabel();
        jp_header_modificar_campo = new javax.swing.JPanel();
        jp_exit_modificar_campo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jtf_nuevo_nombre_modificar_campo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtf_nueva_longitud_modificar_campo = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jrb_tipo_string_modificar_campo = new javax.swing.JRadioButton();
        jrb_tipo_int_modificar_campo = new javax.swing.JRadioButton();
        jrb_tipo_double_modificar_campo = new javax.swing.JRadioButton();
        jrb_tipo_char_modificar_campo = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jrb_nueva_EsLlave_modificar_campo = new javax.swing.JRadioButton();
        jrb_nueva_NoEsLlave_modificar_campo = new javax.swing.JRadioButton();
        jp_boton_modificar_campo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        bg_modificar_tipo_de_dato_campo = new javax.swing.ButtonGroup();
        bg_modificar_esLlave = new javax.swing.ButtonGroup();
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
        jp_abrir_archivo = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jl_archivo_actual_open = new javax.swing.JLabel();
        jp_save_file = new javax.swing.JPanel();
        jp_close_file = new javax.swing.JPanel();
        jp_exit = new javax.swing.JPanel();
        jtp_campos = new javax.swing.JTabbedPane();
        jp_crear_campos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtf_nombre_crear_campo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jrb_tipo_string_crear_campo = new javax.swing.JRadioButton();
        jrb_tipo_int_crear_campo = new javax.swing.JRadioButton();
        jrb_tipo_double_crear_campo = new javax.swing.JRadioButton();
        jrb_tipo_char_crear_campo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jrb_EsLlave_primaria_crear_campo = new javax.swing.JRadioButton();
        jrb_NoEsLlave_primaria_crear_campo = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jp_agregar_campo = new javax.swing.JPanel();
        jLabel142 = new javax.swing.JLabel();
        jl_entidad_actual_crear_campo = new javax.swing.JLabel();
        jtf_longitud_crear_campo = new javax.swing.JFormattedTextField();
        jp_listar_campos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jl_listar_campos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_campos = new javax.swing.JTable();
        jtp_registros = new javax.swing.JTabbedPane();
        jp_introducir_registros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_insertar_registro = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jl_agregar_registro = new javax.swing.JLabel();
        jb_introducir_registro = new javax.swing.JButton();
        jp_listar_registros = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtable_listar_registros = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jl_listar_registros = new javax.swing.JLabel();
        jp_buscar_registros = new javax.swing.JPanel();
        jtp_indices = new javax.swing.JTabbedPane();
        jp_crear_indices = new javax.swing.JPanel();
        jp_re_indexar_archivos = new javax.swing.JPanel();
        jtp_estandarizacion = new javax.swing.JTabbedPane();
        jp_exportar_excel = new javax.swing.JPanel();
        jp_exportar_xml_con_schema = new javax.swing.JPanel();

        jmi_modificar_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Modify16px.png"))); // NOI18N
        jmi_modificar_campo.setText("Modificar Campo");
        jmi_modificar_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificar_campoActionPerformed(evt);
            }
        });
        jPopup_campos.add(jmi_modificar_campo);

        jmi_borrar_campo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar16px.png"))); // NOI18N
        jmi_borrar_campo.setText("Borrar Campo");
        jmi_borrar_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_borrar_campoActionPerformed(evt);
            }
        });
        jPopup_campos.add(jmi_borrar_campo);

        jd_modificar_campo.setBackground(new java.awt.Color(204, 102, 255));
        jd_modificar_campo.setModal(true);
        jd_modificar_campo.setUndecorated(true);
        jd_modificar_campo.setResizable(false);
        jd_modificar_campo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(62, 120, 202));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_modificar_campo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_modificar_campo.setForeground(new java.awt.Color(255, 255, 255));
        jl_modificar_campo.setText("Modificar campo ");
        jPanel3.add(jl_modificar_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 49, -1, -1));

        jp_header_modificar_campo.setBackground(new java.awt.Color(62, 120, 202));
        jp_header_modificar_campo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jp_header_modificar_campoMouseDragged(evt);
            }
        });
        jp_header_modificar_campo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jp_header_modificar_campoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jp_header_modificar_campoLayout = new javax.swing.GroupLayout(jp_header_modificar_campo);
        jp_header_modificar_campo.setLayout(jp_header_modificar_campoLayout);
        jp_header_modificar_campoLayout.setHorizontalGroup(
            jp_header_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );
        jp_header_modificar_campoLayout.setVerticalGroup(
            jp_header_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jp_header_modificar_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jp_exit_modificar_campo.setBackground(new java.awt.Color(62, 120, 202));
        jp_exit_modificar_campo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_exit_modificar_campoMouseMoved(evt);
            }
        });
        jp_exit_modificar_campo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_exit_modificar_campoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_exit_modificar_campoMouseExited(evt);
            }
        });
        jp_exit_modificar_campo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("    X");
        jp_exit_modificar_campo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel3.add(jp_exit_modificar_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 0, -1, -1));

        jd_modificar_campo.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 130));

        jPanel5.setBackground(new java.awt.Color(235, 235, 235));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setText("Nombre del Campo:");

        jtf_nuevo_nombre_modificar_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Longitud:");

        try {
            jtf_nueva_longitud_modificar_campo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtf_nueva_longitud_modificar_campo.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        jtf_nueva_longitud_modificar_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("Tipo de Dato:");

        jrb_tipo_string_modificar_campo.setBackground(new java.awt.Color(255, 255, 255));
        bg_modificar_tipo_de_dato_campo.add(jrb_tipo_string_modificar_campo);
        jrb_tipo_string_modificar_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jrb_tipo_string_modificar_campo.setText("String");

        jrb_tipo_int_modificar_campo.setBackground(new java.awt.Color(255, 255, 255));
        bg_modificar_tipo_de_dato_campo.add(jrb_tipo_int_modificar_campo);
        jrb_tipo_int_modificar_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jrb_tipo_int_modificar_campo.setText("Int");

        jrb_tipo_double_modificar_campo.setBackground(new java.awt.Color(255, 255, 255));
        bg_modificar_tipo_de_dato_campo.add(jrb_tipo_double_modificar_campo);
        jrb_tipo_double_modificar_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jrb_tipo_double_modificar_campo.setText("Double");

        jrb_tipo_char_modificar_campo.setBackground(new java.awt.Color(255, 255, 255));
        bg_modificar_tipo_de_dato_campo.add(jrb_tipo_char_modificar_campo);
        jrb_tipo_char_modificar_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jrb_tipo_char_modificar_campo.setText("Char");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("Es Llave Primaria:");

        jrb_nueva_EsLlave_modificar_campo.setBackground(new java.awt.Color(255, 255, 255));
        bg_modificar_esLlave.add(jrb_nueva_EsLlave_modificar_campo);
        jrb_nueva_EsLlave_modificar_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jrb_nueva_EsLlave_modificar_campo.setText("Si");

        jrb_nueva_NoEsLlave_modificar_campo.setBackground(new java.awt.Color(255, 255, 255));
        bg_modificar_esLlave.add(jrb_nueva_NoEsLlave_modificar_campo);
        jrb_nueva_NoEsLlave_modificar_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jrb_nueva_NoEsLlave_modificar_campo.setText("No");

        jp_boton_modificar_campo.setBackground(new java.awt.Color(62, 120, 202));
        jp_boton_modificar_campo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_boton_modificar_campoMouseMoved(evt);
            }
        });
        jp_boton_modificar_campo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_boton_modificar_campoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_boton_modificar_campoMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Modificar");

        javax.swing.GroupLayout jp_boton_modificar_campoLayout = new javax.swing.GroupLayout(jp_boton_modificar_campo);
        jp_boton_modificar_campo.setLayout(jp_boton_modificar_campoLayout);
        jp_boton_modificar_campoLayout.setHorizontalGroup(
            jp_boton_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        jp_boton_modificar_campoLayout.setVerticalGroup(
            jp_boton_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jtf_nuevo_nombre_modificar_campo)
                        .addComponent(jtf_nueva_longitud_modificar_campo, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jp_boton_modificar_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jrb_tipo_string_modificar_campo)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrb_tipo_int_modificar_campo)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrb_tipo_double_modificar_campo)))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jrb_nueva_EsLlave_modificar_campo)
                                .addGap(18, 18, 18)
                                .addComponent(jrb_nueva_NoEsLlave_modificar_campo)))
                        .addGap(18, 18, 18)
                        .addComponent(jrb_tipo_char_modificar_campo)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_nuevo_nombre_modificar_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_nueva_longitud_modificar_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_tipo_string_modificar_campo)
                    .addComponent(jrb_tipo_int_modificar_campo)
                    .addComponent(jrb_tipo_char_modificar_campo)
                    .addComponent(jrb_tipo_double_modificar_campo))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_nueva_EsLlave_modificar_campo)
                    .addComponent(jrb_nueva_NoEsLlave_modificar_campo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jp_boton_modificar_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jd_modificar_campo.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 127, 400, 380));

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
        jtp_archivo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtp_archivoStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_crear_nuevo_archivoMouseClicked(evt);
            }
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

        jp_abrir_archivo.setBackground(new java.awt.Color(0, 120, 212));
        jp_abrir_archivo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_abrir_archivoMouseMoved(evt);
            }
        });
        jp_abrir_archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_abrir_archivoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_abrir_archivoMouseExited(evt);
            }
        });

        jLabel141.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(255, 255, 255));
        jLabel141.setText("Abrir");

        javax.swing.GroupLayout jp_abrir_archivoLayout = new javax.swing.GroupLayout(jp_abrir_archivo);
        jp_abrir_archivo.setLayout(jp_abrir_archivoLayout);
        jp_abrir_archivoLayout.setHorizontalGroup(
            jp_abrir_archivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_abrir_archivoLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel141)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jp_abrir_archivoLayout.setVerticalGroup(
            jp_abrir_archivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel141, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jl_archivo_actual_open.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_archivo_actual_open.setText("Archivo actual: ");

        javax.swing.GroupLayout jp_open_fileLayout = new javax.swing.GroupLayout(jp_open_file);
        jp_open_file.setLayout(jp_open_fileLayout);
        jp_open_fileLayout.setHorizontalGroup(
            jp_open_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_open_fileLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jp_open_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_abrir_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_archivo_actual_open, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(507, Short.MAX_VALUE))
        );
        jp_open_fileLayout.setVerticalGroup(
            jp_open_fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_open_fileLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jp_abrir_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jl_archivo_actual_open)
                .addContainerGap(421, Short.MAX_VALUE))
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

        jtp_campos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtp_camposStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nombre del Campo:");

        jtf_nombre_crear_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtf_nombre_crear_campo.setForeground(new java.awt.Color(204, 204, 204));
        jtf_nombre_crear_campo.setText("Ingrese el nombre");
        jtf_nombre_crear_campo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtf_nombre_crear_campoMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tipo de Dato:");

        bg_tipo_de_dato_crear_campo.add(jrb_tipo_string_crear_campo);
        jrb_tipo_string_crear_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jrb_tipo_string_crear_campo.setText("String");

        bg_tipo_de_dato_crear_campo.add(jrb_tipo_int_crear_campo);
        jrb_tipo_int_crear_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jrb_tipo_int_crear_campo.setText("Int");

        bg_tipo_de_dato_crear_campo.add(jrb_tipo_double_crear_campo);
        jrb_tipo_double_crear_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jrb_tipo_double_crear_campo.setText("Double");

        bg_tipo_de_dato_crear_campo.add(jrb_tipo_char_crear_campo);
        jrb_tipo_char_crear_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jrb_tipo_char_crear_campo.setText("Char");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Es Llave Primaria:");

        bg_esLlavePrimaria_crear_campo.add(jrb_EsLlave_primaria_crear_campo);
        jrb_EsLlave_primaria_crear_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jrb_EsLlave_primaria_crear_campo.setText("Si");

        bg_esLlavePrimaria_crear_campo.add(jrb_NoEsLlave_primaria_crear_campo);
        jrb_NoEsLlave_primaria_crear_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jrb_NoEsLlave_primaria_crear_campo.setText("No");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Longitud:");

        jp_agregar_campo.setBackground(new java.awt.Color(0, 120, 212));
        jp_agregar_campo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_agregar_campoMouseMoved(evt);
            }
        });
        jp_agregar_campo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_agregar_campoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_agregar_campoMouseExited(evt);
            }
        });

        jLabel142.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setText("Crear Campo");

        javax.swing.GroupLayout jp_agregar_campoLayout = new javax.swing.GroupLayout(jp_agregar_campo);
        jp_agregar_campo.setLayout(jp_agregar_campoLayout);
        jp_agregar_campoLayout.setHorizontalGroup(
            jp_agregar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_agregar_campoLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel142)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jp_agregar_campoLayout.setVerticalGroup(
            jp_agregar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jl_entidad_actual_crear_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_entidad_actual_crear_campo.setText("Entidad Actual: ");

        try {
            jtf_longitud_crear_campo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtf_longitud_crear_campo.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        jtf_longitud_crear_campo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout jp_crear_camposLayout = new javax.swing.GroupLayout(jp_crear_campos);
        jp_crear_campos.setLayout(jp_crear_camposLayout);
        jp_crear_camposLayout.setHorizontalGroup(
            jp_crear_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_crear_camposLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jp_crear_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_entidad_actual_crear_campo)
                    .addComponent(jp_agregar_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrb_NoEsLlave_primaria_crear_campo)
                    .addComponent(jLabel6)
                    .addGroup(jp_crear_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jrb_tipo_string_crear_campo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jrb_EsLlave_primaria_crear_campo)
                    .addGroup(jp_crear_camposLayout.createSequentialGroup()
                        .addGroup(jp_crear_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_nombre_crear_campo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154)
                        .addGroup(jp_crear_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jtf_longitud_crear_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jrb_tipo_char_crear_campo)
                    .addGroup(jp_crear_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jrb_tipo_int_crear_campo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrb_tipo_double_crear_campo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jp_crear_camposLayout.setVerticalGroup(
            jp_crear_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_crear_camposLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jp_crear_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_crear_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_nombre_crear_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_longitud_crear_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_tipo_string_crear_campo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_tipo_int_crear_campo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_tipo_double_crear_campo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_tipo_char_crear_campo)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_EsLlave_primaria_crear_campo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_NoEsLlave_primaria_crear_campo)
                .addGap(33, 33, 33)
                .addComponent(jl_entidad_actual_crear_campo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_agregar_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jtp_campos.addTab("Crear", jp_crear_campos);

        jPanel2.setBackground(new java.awt.Color(62, 120, 202));

        jl_listar_campos.setBackground(new java.awt.Color(62, 120, 202));
        jl_listar_campos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_listar_campos.setForeground(new java.awt.Color(255, 255, 255));
        jl_listar_campos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_listar_campos.setText("Campos de ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_listar_campos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jl_listar_campos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jtable_campos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtable_campos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del campo", "Tipo de dato", "Longitud", "Es llave"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_campos.setFocusable(false);
        jtable_campos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtable_campos.setRowHeight(25);
        jtable_campos.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jtable_campos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtable_campos.getTableHeader().setReorderingAllowed(false);
        jtable_campos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_camposMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtable_campos);
        if (jtable_campos.getColumnModel().getColumnCount() > 0) {
            jtable_campos.getColumnModel().getColumn(0).setResizable(false);
            jtable_campos.getColumnModel().getColumn(1).setResizable(false);
            jtable_campos.getColumnModel().getColumn(2).setResizable(false);
            jtable_campos.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jp_listar_camposLayout = new javax.swing.GroupLayout(jp_listar_campos);
        jp_listar_campos.setLayout(jp_listar_camposLayout);
        jp_listar_camposLayout.setHorizontalGroup(
            jp_listar_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_listar_camposLayout.createSequentialGroup()
                .addGroup(jp_listar_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_listar_camposLayout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_listar_camposLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jp_listar_camposLayout.setVerticalGroup(
            jp_listar_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_listar_camposLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jtp_campos.addTab("Listar - Modificar - Borrar", jp_listar_campos);

        jp_home.add(jtp_campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 850, 570));

        jtp_registros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtp_registrosStateChanged(evt);
            }
        });

        jtable_insertar_registro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtable_insertar_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campo"
            }
        ));
        jtable_insertar_registro.setGridColor(new java.awt.Color(0, 0, 0));
        jtable_insertar_registro.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtable_insertar_registro.setRowHeight(25);
        jtable_insertar_registro.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jtable_insertar_registro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtable_insertar_registro.setShowGrid(true);
        jtable_insertar_registro.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtable_insertar_registro);
        if (jtable_insertar_registro.getColumnModel().getColumnCount() > 0) {
            jtable_insertar_registro.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel6.setBackground(new java.awt.Color(62, 120, 202));

        jl_agregar_registro.setBackground(new java.awt.Color(62, 120, 202));
        jl_agregar_registro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_agregar_registro.setForeground(new java.awt.Color(255, 255, 255));
        jl_agregar_registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_agregar_registro.setText("Campos de ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_agregar_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jl_agregar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jb_introducir_registro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jb_introducir_registro.setText("Introducir Registro");
        jb_introducir_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_introducir_registroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_introducir_registrosLayout = new javax.swing.GroupLayout(jp_introducir_registros);
        jp_introducir_registros.setLayout(jp_introducir_registrosLayout);
        jp_introducir_registrosLayout.setHorizontalGroup(
            jp_introducir_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_introducir_registrosLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_introducir_registrosLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jp_introducir_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_introducir_registrosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_introducir_registrosLayout.createSequentialGroup()
                        .addComponent(jb_introducir_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345))))
        );
        jp_introducir_registrosLayout.setVerticalGroup(
            jp_introducir_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_introducir_registrosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_introducir_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        jtp_registros.addTab("Introducir", jp_introducir_registros);

        jtable_listar_registros.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtable_listar_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_listar_registros.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtable_listar_registros.setRowHeight(25);
        jtable_listar_registros.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jtable_listar_registros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtable_listar_registros.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtable_listar_registros);
        if (jtable_listar_registros.getColumnModel().getColumnCount() > 0) {
            jtable_listar_registros.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel7.setBackground(new java.awt.Color(62, 120, 202));

        jl_listar_registros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_listar_registros.setForeground(new java.awt.Color(255, 255, 255));
        jl_listar_registros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_listar_registros.setText("Registros de");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_listar_registros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_listar_registros, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_listar_registrosLayout = new javax.swing.GroupLayout(jp_listar_registros);
        jp_listar_registros.setLayout(jp_listar_registrosLayout);
        jp_listar_registrosLayout.setHorizontalGroup(
            jp_listar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_listar_registrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
            .addGroup(jp_listar_registrosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jp_listar_registrosLayout.setVerticalGroup(
            jp_listar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_listar_registrosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jtp_registros.addTab("Listar - Modificar - Borrar", jp_listar_registros);

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
       clean_panel_crear_campo();
       
       update_jtable_campos();
       
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
       
       if(opened_file == null){
           JOptionPane.showMessageDialog(jp_crear_campos, "No hay ningun archivo abierto.");
           //Muestra la venta de archivo
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
       }
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
       
       if(opened_file == null){ // Validar que se haya abierto algun archivo
           JOptionPane.showMessageDialog(jp_introducir_registros, "No hay ningun archivo abierto.");
           //Muestra la venta de archivo
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
           
           clean_jtable_insertar_registro();
       } else{
           cargar_campos();
           if(campos_Archivo_Actual.isEmpty()){
               JOptionPane.showMessageDialog(jp_introducir_registros, "No hay campos creados para esta entidad.");
            //Muestra la venta de archivo
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

            clean_jtable_insertar_registro();
           } else {
               set_jtable_insertar_registro();
           }
       }
       
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

    private void jp_crear_nuevo_archivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_crear_nuevo_archivoMouseClicked
        if(!(jtf_nombre_nuevo_archivo.getText().equals("Ingrese el nombre") || jtf_nombre_nuevo_archivo.getText().equals(""))){
            String filename = jtf_nombre_nuevo_archivo.getText()+".txt";
            JFileChooser file_chooser = new JFileChooser("./Archivos");
            file_chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int seleccion = file_chooser.showOpenDialog(this);
            if(seleccion == JFileChooser.APPROVE_OPTION){
                File archivo = new File(file_chooser.getSelectedFile()+"\\"+filename);
                try {
                    if(archivo.createNewFile()){
                        JOptionPane.showMessageDialog(jp_new_file, "Archivo creado exitosamente!");
                       
                        abrev_entidad_actual(filename);
                        // Se abre el archivo
                        jl_archivo_actual_open.setText("Archivo actual: "+filename);
                        jl_entidad_actual_crear_campo.setText("Entidad actual: " + entidad_actual);
                        jl_listar_campos.setText("Campos de " + entidad_actual);
                        jl_agregar_registro.setText("Campos de " + entidad_actual);
                        jl_listar_registros.setText("Registros de " + entidad_actual);
                        opened_file = archivo;
                    } else {
                        JOptionPane.showMessageDialog(jp_new_file, "Ya existe un archivo con el mismo nombre en esta ubicación.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(jp_new_file, "Nombre invalido!");
        }

        // Resetear el texfiel de crear archivo
        jtf_nombre_nuevo_archivo.setText("Ingrese el nombre");
        jtf_nombre_nuevo_archivo.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_jp_crear_nuevo_archivoMouseClicked

    private void jp_abrir_archivoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_abrir_archivoMouseMoved
       jp_abrir_archivo.setBackground(new Color(0,100,212));
    }//GEN-LAST:event_jp_abrir_archivoMouseMoved

    private void jp_abrir_archivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_abrir_archivoMouseExited
        jp_abrir_archivo.setBackground(new Color(0,120,212));
    }//GEN-LAST:event_jp_abrir_archivoMouseExited

    private void jp_abrir_archivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_abrir_archivoMouseClicked
        try {
            JFileChooser file_chooser = new JFileChooser("./Archivos");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
            file_chooser.setFileFilter(filtro);
            file_chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int seleccion = file_chooser.showOpenDialog(this);
            if(seleccion == JFileChooser.APPROVE_OPTION){
                abrev_entidad_actual(file_chooser.getSelectedFile().getName());
                jl_archivo_actual_open.setText("Archivo actual: " + file_chooser.getSelectedFile().getName());
                jl_entidad_actual_crear_campo.setText("Entidad actual: " + entidad_actual);
                jl_listar_campos.setText("Campos de " + entidad_actual);
                jl_agregar_registro.setText("Campos de " + entidad_actual);
                jl_listar_registros.setText("Registros de " + entidad_actual);
                opened_file = file_chooser.getSelectedFile();
                JOptionPane.showMessageDialog(this, "Se ha abierto: " + file_chooser.getSelectedFile().getName());
            } else {
                opened_file = null;
                jl_archivo_actual_open.setText("Archivo actual: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jp_abrir_archivoMouseClicked

    private void jtf_nombre_crear_campoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtf_nombre_crear_campoMousePressed
        if(jtf_nombre_crear_campo.getText().equals("Ingrese el nombre")){
            jtf_nombre_crear_campo.setText("");
            jtf_nombre_crear_campo.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jtf_nombre_crear_campoMousePressed

    private void jp_agregar_campoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_agregar_campoMouseMoved
        jp_agregar_campo.setBackground(new Color(0,100,212));
    }//GEN-LAST:event_jp_agregar_campoMouseMoved

    private void jp_agregar_campoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_agregar_campoMouseExited
        jp_agregar_campo.setBackground(new Color(0,120,212));
    }//GEN-LAST:event_jp_agregar_campoMouseExited

    private void jp_agregar_campoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_agregar_campoMouseClicked
        // Metodo para crearle un campo a una entidad 
        
        cargar_campos();
        
        if(campos_Archivo_Actual.size() < cantidad_max_de_campos){
            // Verificar que todos los campos se hayan llenado
            if(validar_nombre_ingresado_campo(jtf_nombre_crear_campo.getText()) && bg_tipo_de_dato_crear_campo.getSelection() != null && bg_esLlavePrimaria_crear_campo.getSelection() != null && jtf_longitud_crear_campo.isEditValid()){
                // Obtener datos del campo

                // Obtener nombre del campo
                String nombreCampo = jtf_nombre_crear_campo.getText();

                // Obtener el tipo de dato del campo
                String tipo;
                if(jrb_tipo_string_crear_campo.isSelected()){
                    tipo = "String";
                } else if(jrb_tipo_int_crear_campo.isSelected()){
                    tipo = "int";
                } else if(jrb_tipo_double_crear_campo.isSelected()){
                    tipo = "double";
                } else {
                    tipo = "char";
                }

                // Verificar si es campo llave o no es 
                boolean esLlave = jrb_EsLlave_primaria_crear_campo.isSelected();

                // Obtener longitud del campo
                String cad_longitud = jtf_longitud_crear_campo.getText();

                // Validar si la longitud contiene espacio debido a la mascara del jformattedTextfield
                if(cad_longitud.contains(" ")){
                    cad_longitud = cortar_string(cad_longitud);
                }
                int longitud = Integer.parseInt(cad_longitud);

                //  Condicion para validar que el nombre del campo no este repetido 
                //  Validar la longitud del campo
                //  Validar que por lo menos a un radio button de cada button group haya sido seleccionado
                if(validar_nombre_campo(nombreCampo) && validar_longitud_campo(longitud, longitud_max_campo)  && validar_unico_campo_llave(jrb_EsLlave_primaria_crear_campo.isSelected())){
                    agregar_campo_a_entidad(nombreCampo, tipo, esLlave, longitud); // Se agrega el campo
                }  else if(!validar_nombre_campo(jtf_nombre_crear_campo.getText())){ // Validar que no se repita el nombre del campo
                    JOptionPane.showMessageDialog(jp_crear_campos, "Ya existe un campo con este nombre en esta entidad!");
                } else if(!validar_longitud_campo(longitud, longitud_max_campo)){
                    JOptionPane.showMessageDialog(jp_crear_campos, "La longitud del campo debe ser mayor a 0 y menor a " + longitud_max_campo + " !");
                } else if(!validar_unico_campo_llave(jrb_EsLlave_primaria_crear_campo.isSelected())){
                    seleccionar_campo_como_llave();
                    esLlave = jrb_EsLlave_primaria_crear_campo.isSelected();
                    agregar_campo_a_entidad(nombreCampo, tipo, esLlave, longitud);
                } 
            } else if(!validar_nombre_ingresado_campo(jtf_nombre_crear_campo.getText())){ // Validar que el nombre se valido
                JOptionPane.showMessageDialog(jp_crear_campos, "Nombre invalido!");
            } else if(bg_tipo_de_dato_crear_campo.getSelection() == null){ // Validar que el tipo de dato del campo haya sido seleccionado
                JOptionPane.showMessageDialog(jp_crear_campos, "Debe seleccionar el tipo de dato!");
            } else if(bg_esLlavePrimaria_crear_campo.getSelection() == null){ // Validar que se haya seleccionado si es llave o no
                JOptionPane.showMessageDialog(jp_crear_campos, "Debe seleccionar si el campo es llave o no!");
            } else if(jtf_longitud_crear_campo.getValue() == null){
                JOptionPane.showMessageDialog(jp_crear_campos, "Debe ingresar la longitud del campo!");
            }
        } else{
            JOptionPane.showMessageDialog(jp_crear_campos, "Ha alcanzado la cantidad máxima de campos!");
        }
    }//GEN-LAST:event_jp_agregar_campoMouseClicked

    private void jtable_camposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_camposMouseClicked
        if(jtable_campos.getSelectedRow() >= 0){
            if(evt.isMetaDown()){
                jPopup_campos.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jtable_camposMouseClicked

    private void jmi_borrar_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_borrar_campoActionPerformed
        // Metodo de borrar campo al dar click en la opcion del jpopUp Menu
        cargar_campos();
        int posicion_a_borrar = jtable_campos.getSelectedRow();
        String nombre_del_campo_a_borrar = campos_Archivo_Actual.get(posicion_a_borrar).getNombre();
        int seleccion = JOptionPane.showConfirmDialog(jp_listar_campos, "Desea borrar el campo " + nombre_del_campo_a_borrar + " ?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (seleccion == JOptionPane.OK_OPTION){
            campos_Archivo_Actual.remove(posicion_a_borrar);
            JOptionPane.showMessageDialog(jp_listar_campos, "Se ha borrado el campo " + nombre_del_campo_a_borrar + "!");
            try {
                escribir_campos();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        update_jtable_campos();
    }//GEN-LAST:event_jmi_borrar_campoActionPerformed

    private void jmi_modificar_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificar_campoActionPerformed
        // Metodo de modificar campo al dar click en la opcion del jpopUp Menu
        cargar_campos();
        int posicion_a_modificar = jtable_campos.getSelectedRow();
        selected_row_for_modify = posicion_a_modificar;
        // Obtener el campo seleccionado en la jtable
        Campo c = campos_Archivo_Actual.get(posicion_a_modificar);
        
        String nombre_campo_a_modificar = c.getNombre();
        jl_modificar_campo.setText("Modificar campo " + nombre_campo_a_modificar);
        
        // Setear los datos del campo al panel de modificar
        
        // Colocar el nombre del campo
        jtf_nuevo_nombre_modificar_campo.setText(nombre_campo_a_modificar);
        
        // Colocar el tipo de dato
        if(c.getTipo().equals("String")){
            jrb_tipo_string_modificar_campo.setSelected(true);
        } else if(c.getTipo().equals("int")){
            jrb_tipo_int_modificar_campo.setSelected(true);
        } else if(c.getTipo().equals("double")){
            jrb_tipo_double_modificar_campo.setSelected(true);
        } else if(c.getTipo().equals("char")){
            jrb_tipo_char_modificar_campo.setSelected(true);
        }
        
        // Colocar si es llave primaria
        if(c.isEsLlave()){
            jrb_nueva_EsLlave_modificar_campo.setSelected(true);
        } else {
            jrb_nueva_NoEsLlave_modificar_campo.setSelected(true);
        }
        
        // Colocar la longitud del campo
        String len = "";
        len += c.getLongitud();
        jtf_nueva_longitud_modificar_campo.setText(len);
        
        
        // Mostrar el jdialog
        jd_modificar_campo.pack();
        jd_modificar_campo.setLocationRelativeTo(jp_listar_campos);
        jd_modificar_campo.setVisible(true);
    }//GEN-LAST:event_jmi_modificar_campoActionPerformed

    private void jp_header_modificar_campoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_header_modificar_campoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jp_header_modificar_campoMousePressed

    private void jp_header_modificar_campoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_header_modificar_campoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        jd_modificar_campo.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jp_header_modificar_campoMouseDragged

    private void jp_exit_modificar_campoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_modificar_campoMouseClicked
        jd_modificar_campo.setVisible(false);
        update_jtable_campos();
    }//GEN-LAST:event_jp_exit_modificar_campoMouseClicked

    private void jp_exit_modificar_campoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_modificar_campoMouseMoved
        jp_exit_modificar_campo.setBackground(Color.RED);
    }//GEN-LAST:event_jp_exit_modificar_campoMouseMoved

    private void jp_exit_modificar_campoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_modificar_campoMouseExited
        jp_exit_modificar_campo.setBackground(new Color(62,120,202));
    }//GEN-LAST:event_jp_exit_modificar_campoMouseExited

    private void jp_boton_modificar_campoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_boton_modificar_campoMouseMoved
        jp_boton_modificar_campo.setBackground(new Color(0,100,212));
        
    }//GEN-LAST:event_jp_boton_modificar_campoMouseMoved

    private void jp_boton_modificar_campoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_boton_modificar_campoMouseExited
        jp_boton_modificar_campo.setBackground(new Color(0,120,212));
    }//GEN-LAST:event_jp_boton_modificar_campoMouseExited

    private void jp_boton_modificar_campoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_boton_modificar_campoMouseClicked
        // Metodo de modificar campo
        
        String nuevo_nombre_campo = jtf_nuevo_nombre_modificar_campo.getText();
        
        // Verificar que todos los campos se hayan llenado
        if(validar_nombre_ingresado_campo(nuevo_nombre_campo) && bg_modificar_tipo_de_dato_campo.getSelection() != null && bg_modificar_esLlave.getSelection() != null && jtf_nueva_longitud_modificar_campo.isEditValid()){
            
            String tipo;
            if(jrb_tipo_string_modificar_campo.isSelected()){
                tipo = "String";
            } else if(jrb_tipo_int_modificar_campo.isSelected()){
                tipo = "int";
            } else if(jrb_tipo_double_modificar_campo.isSelected()){
                tipo = "double";
            } else{
                tipo = "char";
            }
            
            boolean esLlave = jrb_nueva_EsLlave_modificar_campo.isSelected();
            boolean val = true;
            if(esLlave){
                val = validar_campo_llave_y_nuevo_campo_llave();
            }
            
            
            String cad_longitud = jtf_nueva_longitud_modificar_campo.getText();
            if(cad_longitud.contains(" ")){
                cad_longitud = cortar_string(cad_longitud);
            }
            int longitud = Integer.parseInt(cad_longitud);
            
            if(validar_nombre_de_campo_y_nombre_de_campo_a_modificar(nuevo_nombre_campo) && validar_longitud_campo(longitud, longitud_max_campo) && val){
                campos_Archivo_Actual.get(selected_row_for_modify).setNombre(nuevo_nombre_campo);
                campos_Archivo_Actual.get(selected_row_for_modify).setTipo(tipo);
                campos_Archivo_Actual.get(selected_row_for_modify).setLongitud(longitud);
                campos_Archivo_Actual.get(selected_row_for_modify).setEsLlave(esLlave);
                try {
                    escribir_campos();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                JOptionPane.showMessageDialog(jd_modificar_campo, "Campo modificado exitosamente!");
                jd_modificar_campo.setVisible(false);
                update_jtable_campos();
            } else if(!validar_nombre_de_campo_y_nombre_de_campo_a_modificar(nuevo_nombre_campo)){
                JOptionPane.showMessageDialog(jd_modificar_campo, "Ya existe un campo con este nombre en esta entidad!");
            } else if(!validar_longitud_campo(longitud, longitud_max_campo)){
                JOptionPane.showMessageDialog(jd_modificar_campo, "La longitud del campo debe ser mayor a 0 y menor a " + longitud_max_campo + " !");
            } else if(!validar_campo_llave_y_nuevo_campo_llave()){
                seleccionar_campo_como_llave_modificar();
                esLlave = jrb_nueva_EsLlave_modificar_campo.isSelected();
                campos_Archivo_Actual.get(selected_row_for_modify).setNombre(nuevo_nombre_campo);
                campos_Archivo_Actual.get(selected_row_for_modify).setTipo(tipo);
                campos_Archivo_Actual.get(selected_row_for_modify).setLongitud(longitud);
                campos_Archivo_Actual.get(selected_row_for_modify).setEsLlave(esLlave);
                try {
                    escribir_campos();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                JOptionPane.showMessageDialog(jd_modificar_campo, "Campo modificado exitosamente!");
                jd_modificar_campo.setVisible(false);
                update_jtable_campos();
            }
            
        } else if(!validar_nombre_ingresado_campo(nuevo_nombre_campo)){
            JOptionPane.showMessageDialog(jd_modificar_campo, "Nombre invalido!");
        } else if(jtf_nueva_longitud_modificar_campo.getValue() == null){
            JOptionPane.showMessageDialog(jd_modificar_campo, "Debe ingresar la longitud del campo!");
        }
    }//GEN-LAST:event_jp_boton_modificar_campoMouseClicked

    private void jtp_archivoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtp_archivoStateChanged
        
        int selectedIndex = jtp_archivo.getSelectedIndex(); 
        
        if(selectedIndex == 0){ // Crear archivo, resetear el textfield
            jtf_nombre_nuevo_archivo.setText("Ingrese el nombre");
            jtf_nombre_nuevo_archivo.setForeground(new Color(204,204,204));
        }  else if(selectedIndex == 2){ // Salvar archivo
            if(opened_file == null){
                JOptionPane.showMessageDialog(jp_close_file, "No hay ningun archivo abierto.");
            } else {
                cargar_campos();
                try {
                    escribir_campos();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                JOptionPane.showMessageDialog(jp_save_file, "Se ha guardado el archivo.");
            }
             jtp_archivo.setSelectedIndex(0);
        } else if(selectedIndex == 3){ // Cerrar archivo
            if(opened_file == null){
                JOptionPane.showMessageDialog(jp_close_file, "No hay ningun archivo abierto.");
            } else {
                int seleccion = JOptionPane.showConfirmDialog(jp_close_file, "Desea cerrar " + opened_file.getName(), "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (seleccion == JOptionPane.OK_OPTION){
                    JOptionPane.showMessageDialog(jp_close_file, "Archivo cerrado exitosamente!");
                    opened_file = null;
                    jl_archivo_actual_open.setText("Archivo actual: ");
                    jl_entidad_actual_crear_campo.setText("Entidad actual: ");
                    jl_listar_campos.setText("Campos de");
                    jl_agregar_registro.setText("Campos de");
                    jl_listar_registros.setText("Registros de");
                    clean_jtable_insertar_registro();
                }
            }
            jtp_archivo.setSelectedIndex(1);
        } else if(selectedIndex == 4){ // Salir de programa
            System.exit(0);
        }
    }//GEN-LAST:event_jtp_archivoStateChanged

    private void jtp_camposStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtp_camposStateChanged
        int selectedIndex = jtp_campos.getSelectedIndex();
        if(selectedIndex == 0){ // Crear campo
            clean_panel_crear_campo();
        } else if(selectedIndex == 1){ // Listar, modificar, borrar campos
            update_jtable_campos();
        }
    }//GEN-LAST:event_jtp_camposStateChanged

    private void jtp_registrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtp_registrosStateChanged
        int selectedIndex = jtp_registros.getSelectedIndex();
        if(selectedIndex == 0){ // Panel de introducir registro
            set_jtable_insertar_registro(); // Limpiar datos de la tabla
        } else if(selectedIndex == 1){ // Listar, modificar y borrar
//            BTree arbol = new BTree();
//            try {
//                RandomAccessFile raf = new RandomAccessFile(opened_file, "rw");
//                int cantidad_de_campos = campos_Archivo_Actual.size();
//                raf.seek((47*cantidad_de_campos)+2+2+4+2);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            //JOptionPane.showMessageDialog(this, arbol.getRoot().hasSpace());
        }
    }//GEN-LAST:event_jtp_registrosStateChanged

    private void jb_introducir_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_introducir_registroMouseClicked
        // Metodo para introducir registro
        cargar_campos();
        jtable_insertar_registro.clearSelection();
        boolean validacionInt = true;
        boolean validacionDouble = true;
        boolean validacionChar = true;
        if(validar_campos_llenos_introducir_registro()){ // validamos que todos los campos esten llenos
            
            int total_de_campos = campos_Archivo_Actual.size(); // cantidad de campos en un registro
            Registro r = new Registro(); // Registro a llenar
            r.setCampos(campos_Archivo_Actual); // Seteamos los campos que contiene un registro
            
            for (int i = 0; i < total_de_campos; i++) { // Aqui validamos que cada campo sea del tipo de dato especificado
                if(campos_Archivo_Actual.get(i).getTipo().equals("int")){
                    try {
                        String str = jtable_insertar_registro.getValueAt(0, i).toString();
                        int num = Integer.parseInt(str);
                     }catch (NumberFormatException ex) {
                         validacionInt = false;
                         JOptionPane.showMessageDialog(jp_introducir_registros, campos_Archivo_Actual.get(i).getNombre() + " debe ser un numero entero!");
                         i = total_de_campos;
                     }
                } else if(campos_Archivo_Actual.get(i).getTipo().equals("double")){
                    try {
                        String str = jtable_insertar_registro.getValueAt(0, i).toString();
                        double num = Double.parseDouble(str);
                     }catch (NumberFormatException ex) {
                         validacionDouble = false;
                         JOptionPane.showMessageDialog(jp_introducir_registros, campos_Archivo_Actual.get(i).getNombre() + " debe ser un numero decimal ó entero!");
                         i = total_de_campos;
                     }
                } else if(campos_Archivo_Actual.get(i).getTipo().equals("char")){
                    String str = jtable_insertar_registro.getValueAt(0, i).toString();
                    if(str.length() != 1){
                        validacionChar = false;
                        JOptionPane.showMessageDialog(jp_introducir_registros, campos_Archivo_Actual.get(i).getNombre() + " debe ser un solo caracter!");
                        i = total_de_campos;
                    }
                }
            }
            
            // Aqui validamos la longitud de cada campo
            boolean validacion_longitud = true;
            for (int i = 0; i < total_de_campos; i++) {
                String str = jtable_insertar_registro.getValueAt(0, i).toString();
                if(campos_Archivo_Actual.get(i).getLongitud() < str.length()){
                    validacion_longitud = false;
                    JOptionPane.showMessageDialog(jp_introducir_registros, campos_Archivo_Actual.get(i).getNombre() + " debe tener longitud maxima de " 
                            + campos_Archivo_Actual.get(i).getLongitud() +"!");
                    i = total_de_campos;
                }
            }
            
            
            if(validacionInt && validacionChar && validacionDouble && validacion_longitud){ // Entramos solo si los tipos de datos concuerdan con lo ingresado por el usuario
                for (int i = 0; i < total_de_campos; i++) {
                    r.getCampos().get(i).setContenido(jtable_insertar_registro.getValueAt(0, i)); // Llenamos el contenido de cada campo del registro
                }
                if(availList.isEmpty()){ // No hay espacios disponibles, se agrega al final
                    escribir_registro_availist_empty(r);
                    JOptionPane.showMessageDialog(jp_introducir_registros, "Registro agregado exitosamente!");
                    set_jtable_insertar_registro();
                } else{ // El availList contine espacios disponibles
                    
                }
            }
            
        } else {
            JOptionPane.showMessageDialog(jp_introducir_registros, "Debe llenar todos los campos!");
        }
    }//GEN-LAST:event_jb_introducir_registroMouseClicked

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
    
    void clean_jtable_listar_registros(){
        jtable_listar_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_listar_registros.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtable_listar_registros.setRowHeight(25);
        jtable_listar_registros.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jtable_listar_registros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtable_listar_registros.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtable_listar_registros);
        if (jtable_listar_registros.getColumnModel().getColumnCount() > 0) {
            jtable_listar_registros.getColumnModel().getColumn(0).setResizable(false);
        }
    }
    
    void set_jtable_listar_registros(){
        if(opened_file != null){
            cargar_campos();
            int size = campos_Archivo_Actual.size();
            
            // Encabezados
            Object[] columnNames  = new Object[size];
            for (int i = 0; i <size; i++) {
                columnNames[i] = campos_Archivo_Actual.get(i).getNombre();
            }
        }
    }
    
    void escribir_registro_availist_empty(Registro r){
        try {
            RandomAccessFile raf = new RandomAccessFile(opened_file, "rw");
            // Escribimos el registro
            raf.seek(raf.length());
            raf.writeChar('\n');
            for (Campo c : r.getCampos()) {
                raf.writeChar('|');
                StringBuffer sb = new StringBuffer(c.getContenido().toString());
                sb.setLength(c.getLongitud());
                raf.writeChars(sb.toString());
//                if(c.getTipo().equals("String")){
//                    String contenido = c.getContenido().toString();
//                    StringBuffer sb = new StringBuffer(contenido);
//                    sb.setLength(longitud_max_campo);
//                    raf.writeChars(sb.toString());
//                } else if(c.getTipo().equals("int")){
//                    int contenido = Integer.parseInt(c.getContenido().toString());
//                    raf.writeInt(contenido);
//                } else if(c.getTipo().equals("double")){
//                    System.out.println(c.getContenido());
//                    double contenido = Double.parseDouble(c.getContenido().toString());
//                    raf.writeDouble(contenido);
//                } else if(c.getTipo().equals("char")){
//                    char contenido = c.getContenido().toString().charAt(0);
//                    raf.writeChar(contenido);
//                }
            }
            raf.writeChar('|');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void reconstruir_availist(){
        
    }
    
    boolean onlyDigits(String str){
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
    
    boolean validar_campos_llenos_introducir_registro(){
        int cantidad_campos = campos_Archivo_Actual.size();
        for (int i = 0; i < cantidad_campos; i++) {
            if(jtable_insertar_registro.getValueAt(0, i) == null || jtable_insertar_registro.getValueAt(0, i).equals("")){
                return false;
            }
        }
        return true;
    }
    
    boolean validar_nombre_de_campo_y_nombre_de_campo_a_modificar(String nuevo_nombre){
         cargar_campos();
         for (Campo c : campos_Archivo_Actual) {
            if(campos_Archivo_Actual.indexOf(c) != selected_row_for_modify){
                if(c.getNombre().equals(nuevo_nombre)){
                    return false;
                }
            }
        }
         return true;
    }
    
    boolean validar_campo_llave_y_nuevo_campo_llave(){
        cargar_campos();
         for (Campo c : campos_Archivo_Actual) {
            if(campos_Archivo_Actual.indexOf(c) != selected_row_for_modify){
                if(c.isEsLlave()){
                    return false;
                }
            }
        }
         return true;
    }
    
    void clean_jtable_insertar_registro(){ // Vista cuando no hay archivo abierto
        jtable_insertar_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campo"
            }
        ));
        jtable_insertar_registro.setGridColor(new java.awt.Color(0, 0, 0));
        jtable_insertar_registro.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtable_insertar_registro.setRowHeight(25);
        jtable_insertar_registro.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jtable_insertar_registro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtable_insertar_registro.setShowGrid(true);
        jtable_insertar_registro.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtable_insertar_registro);
        if (jtable_insertar_registro.getColumnModel().getColumnCount() > 0) {
            jtable_insertar_registro.getColumnModel().getColumn(0).setResizable(false);
        }
    }
    
    void set_jtable_insertar_registro(){ // Metodo para setear la cantidad de campos para un registro en el jtable
        if(opened_file != null){ // Verificar que se haya abierto un archivo
            // Actulizamos los campos
            cargar_campos();
        
            // Obtenemos la cantidad de campos que contiene la entidad
            int size = campos_Archivo_Actual.size();

            // Creamos un array tipo Object para los encabezados
            Object[] columnNames  = new Object[size];
            for (int i = 0; i <size; i++) {
                columnNames[i] = campos_Archivo_Actual.get(i).getNombre();
            }

            // Creamos una matriz de una sola fila la cual sera donde se ingresen los datos de los campos
            Object[][] data = new Object[1][size];
            for (int i = 0; i < size; i++) {
                data[0][i] = null; // null para que aparezca vacio
            }

            // Seteamos el modelo y las propiedades
            jtable_insertar_registro.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
            jtable_insertar_registro.setGridColor(new java.awt.Color(0, 0, 0));
            jtable_insertar_registro.setIntercellSpacing(new java.awt.Dimension(0, 0));
            jtable_insertar_registro.setRowHeight(25);
            jtable_insertar_registro.setSelectionBackground(new java.awt.Color(232, 57, 95));
            //jtable_insertar_registro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jtable_insertar_registro.setShowGrid(true);
            jtable_insertar_registro.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE); //******** Importante para que las ediciones en la jtable sean validas
            jtable_insertar_registro.getTableHeader().setReorderingAllowed(false);
            jScrollPane1.setViewportView(jtable_insertar_registro);
            int columnCount = jtable_insertar_registro.getColumnModel().getColumnCount();
            if (columnCount > 0) {
                for (int i = 0; i <columnCount ; i++) {
                    jtable_insertar_registro.getColumnModel().getColumn(i).setResizable(false);
                }
            }
        }
    }
    
    void limpiar_jtable_campos(){
        jtable_campos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del campo", "Tipo de dato", "Longitud", "Es llave"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_campos.setFocusable(false);
        jtable_campos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtable_campos.setRowHeight(25);
        jtable_campos.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jtable_campos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtable_campos);
        if (jtable_campos.getColumnModel().getColumnCount() > 0) {
            jtable_campos.getColumnModel().getColumn(0).setResizable(false);
            jtable_campos.getColumnModel().getColumn(1).setResizable(false);
            jtable_campos.getColumnModel().getColumn(2).setResizable(false);
            jtable_campos.getColumnModel().getColumn(3).setResizable(false);
        }
    }
    
    void update_jtable_campos(){
        if(opened_file != null){
            // Cargamos los campos a la RAM (Arraylist)
            cargar_campos();

            // Limpiamos el jtable para no sobreescribir
            limpiar_jtable_campos();

            // Obtenemos el modelo del jtable
            DefaultTableModel modelo = (DefaultTableModel) jtable_campos.getModel();
            for(Campo c : campos_Archivo_Actual){
                Object [] newrow = {c.getNombre(), c.getTipo(), c.getLongitud(), c.isEsLlave()}; // Creamos las filas para la jtable
                modelo.addRow(newrow); // Agregamos las filas al modelo
            }
            jtable_campos.setModel(modelo); // Seteamos el modelo
        }
    }
    
    void abrev_entidad_actual(String filename){
        entidad_actual = filename.substring(0, filename.length()-4);
    }
    
    void seleccionar_campo_como_llave(){
        int seleccion = JOptionPane.showConfirmDialog(jp_crear_campos, "Ya existe un campo llave en esta entidad! \nDesea establecer este campo como llave?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (seleccion == JOptionPane.OK_OPTION){
            cargar_campos();
            for(Campo c : campos_Archivo_Actual){
                if(c.isEsLlave()){
                    c.setEsLlave(false);
                }
            }
        } else {
            jrb_NoEsLlave_primaria_crear_campo.setSelected(true);
        }
    }
    
    void seleccionar_campo_como_llave_modificar(){
        int seleccion = JOptionPane.showConfirmDialog(jd_modificar_campo, "Ya existe un campo llave en esta entidad! \nDesea establecer este campo como llave?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (seleccion == JOptionPane.OK_OPTION){
            cargar_campos();
            for(Campo c : campos_Archivo_Actual){
                if(c.isEsLlave()){
                    c.setEsLlave(false);
                }
            }
        } else {
            jrb_nueva_NoEsLlave_modificar_campo.setSelected(true);
        }
    }
    
    void agregar_campo_a_entidad(String nombreCampo, String tipo, boolean esLlave, int longitud){
        // Creamos el objeto tipo campo
            Campo campo = new Campo(nombreCampo, tipo, longitud, esLlave);

            // Añadimos el campo a la RAM mediante el arrayList de campos
            campos_Archivo_Actual.add(campo);
            try {
                // Guardamos los campos en la ROM
                escribir_campos();
                //JOptionPane.showMessageDialog(jp_crear_campos, campo.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(jp_crear_campos, "Campo agregado exitosamente a: " + entidad_actual);

            // Limpianos el todos los texfields y radiobuttons del apartado crear campo
            clean_panel_crear_campo();
    }
    
    boolean validar_nombre_ingresado_campo(String text){
        if(text.equals("Ingrese el nombre") || text.equals("")){
            return false;
        } else{
            return true;
        }
    }
    
    String cortar_string(String cad){
        String number = "";
        number += cad.charAt(0);
        return number;
    }
    
    boolean validar_unico_campo_llave(boolean miLlave){
        cargar_campos();
        for(Campo c : campos_Archivo_Actual){
            if(c.isEsLlave() && miLlave){
                return false;
            }
        }
        return true;
    }
    
    boolean validar_nombre_campo(String name){
        cargar_campos();
        for(Campo c : campos_Archivo_Actual){
            if(c.getNombre().equals(name)){
                return false;
            }
        }
        return true;
    }
    
    boolean validar_longitud_campo(int longitud_campo, int valor_max){
        if(longitud_campo > 0 && longitud_campo <= valor_max){
            return true;
        } else{
            return false;
        }
    }
    
    void clean_panel_crear_campo(){
        jtf_nombre_crear_campo.setText("Ingrese el nombre");
        jtf_nombre_crear_campo.setForeground(new Color(204,204,204));

        bg_tipo_de_dato_crear_campo.clearSelection();

        bg_esLlavePrimaria_crear_campo.clearSelection();
        
        // Limpiar (Resetear) el jFormattedTextField
        jtf_longitud_crear_campo.setValue(null);
    }
    
    void escribir_campos() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(opened_file, false);
            bw = new BufferedWriter(fw);
            for (Campo c : campos_Archivo_Actual) {
                bw.write(c.getNombre() + ";");
                bw.write(c.getTipo() + ";");
                bw.write(c.isEsLlave() + ";");
                bw.write(c.getLongitud() + ";");
                if(campos_Archivo_Actual.indexOf(c) == campos_Archivo_Actual.size()-1){
                    bw.write("v;"); // Indica el final de los campos
                } else {
                    bw.write("f;");
                }
                bw.newLine();
            }
            
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    
    void cargar_campos(){
        Scanner sc = null;
        campos_Archivo_Actual = new ArrayList();
        if(opened_file.exists()){
            try {
                sc = new Scanner(opened_file);
                sc.useDelimiter(";");
                String fin = "";
                while(sc.hasNext() && !(fin.equals("v"))){
                    String nombreCampo = sc.next();
                    String tipo = sc.next();
                    boolean esLlave = sc.nextBoolean();
                    int longitud = sc.nextInt();
                    fin = sc.next();
                    campos_Archivo_Actual.add(new Campo(nombreCampo, tipo, longitud, esLlave));
                    sc.nextLine();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            sc.close();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_esLlavePrimaria_crear_campo;
    private javax.swing.ButtonGroup bg_modificar_esLlave;
    private javax.swing.ButtonGroup bg_modificar_tipo_de_dato_campo;
    private javax.swing.ButtonGroup bg_nueva_esLlave;
    private javax.swing.ButtonGroup bg_nuevo_tipo_de_dato_crear_campo;
    private javax.swing.ButtonGroup bg_tipo_de_dato_crear_campo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopup_campos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_introducir_registro;
    private javax.swing.JDialog jd_modificar_campo;
    private javax.swing.JLabel jl_FechaActual_home;
    private javax.swing.JLabel jl_abrevNombre_home;
    private javax.swing.JLabel jl_agregar_registro;
    private javax.swing.JLabel jl_archivo_actual_open;
    private javax.swing.JLabel jl_entidad_actual_crear_campo;
    private javax.swing.JLabel jl_listar_campos;
    private javax.swing.JLabel jl_listar_registros;
    private javax.swing.JLabel jl_modificar_campo;
    private javax.swing.JLabel jl_text_archivo;
    private javax.swing.JLabel jl_text_campos;
    private javax.swing.JLabel jl_text_estandarizacion;
    private javax.swing.JLabel jl_text_indices;
    private javax.swing.JLabel jl_text_registros;
    private javax.swing.JLabel jl_username;
    private javax.swing.JMenuItem jmi_borrar_campo;
    private javax.swing.JMenuItem jmi_modificar_campo;
    private javax.swing.JPanel jp_abrir_archivo;
    private javax.swing.JPanel jp_agregar_campo;
    private javax.swing.JPanel jp_boton_modificar_campo;
    private javax.swing.JPanel jp_buscar_registros;
    private javax.swing.JPanel jp_close_file;
    private javax.swing.JPanel jp_crear_campos;
    private javax.swing.JPanel jp_crear_indices;
    private javax.swing.JPanel jp_crear_nuevo_archivo;
    private javax.swing.JPanel jp_exit;
    private javax.swing.JPanel jp_exit_home;
    private javax.swing.JPanel jp_exit_modificar_campo;
    private javax.swing.JPanel jp_exportar_excel;
    private javax.swing.JPanel jp_exportar_xml_con_schema;
    private javax.swing.JPanel jp_header_home;
    private javax.swing.JPanel jp_header_modificar_campo;
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
    private javax.swing.JRadioButton jrb_EsLlave_primaria_crear_campo;
    private javax.swing.JRadioButton jrb_NoEsLlave_primaria_crear_campo;
    private javax.swing.JRadioButton jrb_nueva_EsLlave_modificar_campo;
    private javax.swing.JRadioButton jrb_nueva_NoEsLlave_modificar_campo;
    private javax.swing.JRadioButton jrb_tipo_char_crear_campo;
    private javax.swing.JRadioButton jrb_tipo_char_modificar_campo;
    private javax.swing.JRadioButton jrb_tipo_double_crear_campo;
    private javax.swing.JRadioButton jrb_tipo_double_modificar_campo;
    private javax.swing.JRadioButton jrb_tipo_int_crear_campo;
    private javax.swing.JRadioButton jrb_tipo_int_modificar_campo;
    private javax.swing.JRadioButton jrb_tipo_string_crear_campo;
    private javax.swing.JRadioButton jrb_tipo_string_modificar_campo;
    private javax.swing.JTable jtable_campos;
    private javax.swing.JTable jtable_insertar_registro;
    private javax.swing.JTable jtable_listar_registros;
    private javax.swing.JFormattedTextField jtf_longitud_crear_campo;
    private javax.swing.JTextField jtf_nombre_crear_campo;
    private javax.swing.JTextField jtf_nombre_nuevo_archivo;
    private javax.swing.JFormattedTextField jtf_nueva_longitud_modificar_campo;
    private javax.swing.JTextField jtf_nuevo_nombre_modificar_campo;
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
    private ArrayList<Campo> campos_Archivo_Actual = new ArrayList(); 
    private File opened_file = null;
    private int longitud_max_campo = 30; // Longitud de campo
    private String entidad_actual;
    private int selected_row_for_modify;
    private int cantidad_max_de_campos = 10;
    private LinkedList<Integer> availList = new LinkedList();
    private int longitud_max_nombre_campo = 10;
    private int longitud_max_tipo_campo = 10;
    //private Registro registro;
}
