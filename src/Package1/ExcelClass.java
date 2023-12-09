package Package1;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelClass {
    
    //Metodo para exportar Jtable a un archivo excel
    public void toExcel(JTable tabla) throws IOException {
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de excel", "xls");
        filechooser.setFileFilter(filtro);
        filechooser.setDialogTitle("Guardar");
        filechooser.setAcceptAllFileFilterUsed(false);
        if (filechooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String rutaArchivo = filechooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(rutaArchivo);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile(); //crea nuevo archivo Excel .xls
                Workbook libroExcel = new HSSFWorkbook(); //crea nuevo libro de trabajo excel
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hojaExcel = libroExcel.createSheet("Hoja"); //crea hoja en el libro
                hojaExcel.setDisplayGridlines(true); //muestra los lineas separadoras de las celdas
                for (int f = 0; f < tabla.getRowCount(); f++) { //los siguientes ciclos de repeticion asignan los valores en las celdas de la hoja (encabezados/nombres campos)
                    Row fila = hojaExcel.createRow(f);
                    for (int c = 0; c < tabla.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(tabla.getColumnName(c));
                        }
                    }
                }
                int filaInicio = 1;
                for (int f = 0; f < tabla.getRowCount(); f++) { //los siguientes ciclos asignan los valores en el resto de las celdas de la hoja
                    Row fila = hojaExcel.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < tabla.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (tabla.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(tabla.getValueAt(f, c).toString()));
                        } else if (tabla.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) tabla.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(tabla.getValueAt(f, c)));
                        }
                    }
                }
                libroExcel.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException exc) {
                throw exc;
            }
        }
    }


}