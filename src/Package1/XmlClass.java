package Package1;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlClass {
    
    
    public void toXML(JTable tabla, String filename) { //Se envia de parametro el filename para poder asignar correctamente lo que contiene la raiz y la fila que nombra al tipo objeto 
        try {// Crear un documento XML
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document documento = db.newDocument(); //Se crea nuevo documento XML
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            Element raiz = documento.createElement(filename);
            documento.appendChild(raiz); //Agrega la raiz al documento XML
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar como");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos XML", "xml"));
            int seleccion = fileChooser.showSaveDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                String nombreArchivo = fileChooser.getSelectedFile().toString(); //Variable con el nombre del archivo creado
                if (!nombreArchivo.toLowerCase().endsWith(".xml")) {
                    nombreArchivo += ".xml";
                }
                for (int i = 0; i < modelo.getRowCount(); i++) { //Se crea un elemento la tabla para el XML
                    Element fila = documento.createElement(filename.substring(0, filename.length() - 1));
                    raiz.appendChild(fila); //Se agrega el elemento al XML
                    for (int j = 0; j < modelo.getColumnCount(); j++) { 
                        String nombreColumna = modelo.getColumnName(j);
                        Object valor = modelo.getValueAt(i, j); //Para el elemnto dento de la fila y la columna
                        Element celda = documento.createElement(nombreColumna);
                        celda.appendChild(documento.createTextNode(String.valueOf(valor)));
                        fila.appendChild(celda); //se agregaron los elementos al XML
                    }
                }
                // Se guarda el doc XML en el archivo que se creo
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(documento);
                StreamResult resultado = new StreamResult(nombreArchivo);
                transformer.transform(source, resultado);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
    
}