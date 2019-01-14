import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class DireccionIP {
    public static void main(String[] args) {
        Icon miIcono = new ImageIcon("ip-address.png");
        Object elecciones[] = {"Cadena Normal.", "En cuatro partes.", "Salir."};
        int noTeSalgas=1;
        while(noTeSalgas==1){
            int eleccionPrincipalDelMetodo = JOptionPane.showOptionDialog(
                null,
                "Elige una manera de introducir las IP",
                "Elige como introducir la IP",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                miIcono,
                elecciones,
                elecciones[2]);
            if (eleccionPrincipalDelMetodo==0){
                String salida = JOptionPane.showInputDialog(null, "Introduzca la IP separada por puntos");
                EstructuraIP ip = new EstructuraIP(salida);
                mostrarInformacionSobreLaIP(ip);

        }  else if(eleccionPrincipalDelMetodo == 1){
                int contadorBytes=1;
                int[] bytes = new int[4];
                String salida = "";
                for (int i= 0; i<bytes.length; i++){
                    salida = JOptionPane.showInputDialog(null, "Introduce el byte:"+contadorBytes);
                    bytes[i] = Integer.parseInt(salida);
                    contadorBytes++;
                }
                EstructuraIP ip = new EstructuraIP(bytes);
                mostrarInformacionSobreLaIP(ip);

            }else {
                noTeSalgas=JOptionPane.showConfirmDialog(null,"¿De verdad quieres salir?","Salir",JOptionPane.YES_NO_CANCEL_OPTION);
            }
        }
    }

    public static void mostrarInformacionSobreLaIP(EstructuraIP cadena) {
        Icon miIcono = new ImageIcon("ip-address.png");
            String salida = "";
            salida += EstructuraIP.getDireccionIp() + "\n";
            salida += EstructuraIP.getIdRed() + "\n";
            salida += EstructuraIP.getMascaraRed() + "\n";
            salida += EstructuraIP.getEsPrivada() + "\n";
            salida += EstructuraIP.getClase() + "\n";
            salida += EstructuraIP.getEsIdRed();

            JOptionPane.showMessageDialog(null, salida, "INFORMACIÓN DE LA IP", 0, miIcono);
        }
    }
