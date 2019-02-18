import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.edu.mx.practica.uno.Alumno;
import com.edu.mx.practica.uno.Convertidor;
import javax.swing.JOptionPane;


public class Pantalla {

    private JTextArea JtextArea2;
    private JButton convertirButton;
    private JComboBox comboBox1;
    private JPanel panel;
    private JTextArea JTextArea1;

    public Pantalla() {
        convertirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {

                String textoE = JTextArea1.getText();
                JTextArea1.setText("");
                Alumno alumno;
                String[] texto;
                Convertidor convertidor;

                if (textoE.trim().length() == 0) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Texto de entrada vacio.",
                            "ERROR",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    if (comboBox1.getSelectedItem().toString() == "XML") {

                        convertidor = new Convertidor();
                        String textoConvertido = convertidor.convertirXmlToJson(textoE);
                        JtextArea2.setText("");
                        JtextArea2.setText(textoConvertido);
                    } else {
                        convertidor = new Convertidor();
                        texto = textoE.split("-");
                        if (texto.length <= 3) {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "INGRESAR DATOS CORRECTAMENTE \n Ejemplo: Nombre-ApellidoP-Edad-Carrera",
                                    "ERROR",
                                    JOptionPane.WARNING_MESSAGE);
                        } else {
                            alumno = new Alumno(texto[0],texto[1],texto[2],texto[3]);
                            String textoConvertido = convertidor.convertirClaseToJson(alumno);
                            JtextArea2.setText("");
                            JtextArea2.setText(textoConvertido);
                        }
                    }
                }
            }

        });
    }
                public static void main (String[]args){

                    JFrame jframe = new JFrame("Pantalla");
                    jframe.setContentPane(new Pantalla().panel);
                    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jframe.pack();
                    jframe.setVisible(true);
                }
            }