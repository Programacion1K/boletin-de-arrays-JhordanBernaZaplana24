public class EstructuraIP {
    private static int[] bytes;

    public EstructuraIP(String cadena) {
        bytes = new int[4];
        String[] partes = cadena.split("\\.");
        for (int i=0; i<partes.length; i++){
            bytes[i] = Integer.parseInt(partes[i]);
        }
    }
    public EstructuraIP (int[] bytes){
        this.bytes = bytes;
    }


    public static String getMascaraRed() {
        String mascaraDeRed = "Máscara de red: ";
        if (bytes[0] >= 0 && bytes[0] <= 127){
            mascaraDeRed += "255.0.0.0";
        }
            if (bytes[0] >= 128 && bytes[0] <= 191){
                mascaraDeRed += "255.255.0.0";
            }
            if (bytes[0] >= 192 && bytes[0] <= 223){
                mascaraDeRed += "255.255.255.0";
            }

        return mascaraDeRed;
    }

    public static String getDireccionIp() {
        return "Dirección IP: " + bytes[0] + "." + bytes[1] + "." + bytes[2] +
                "." + bytes[3];
    }

    public static String getSaberSiEsIDRed() {
        String red = "¿ID de red? ";
        if (bytes[3] == 0){
            red += "Es ID de red";
        } else {
            red += "No es ID de red";
        }
        return red;
    }


    public static String getEsPrivada() {
        String privada = "¿Red privada?: ";
        if(bytes[0] == 10 || bytes[0] == 172 || bytes[0] == 192){
            privada += "Es privada";
        } else {
            privada+= "No es privada";
        }
        return privada;
    }

    public static String getIdRed() {
        return "ID de red: " + bytes[0] + "." + bytes[1] + "." + bytes[2] + ".0";
    }
    public static String getClase() {
        String clase = "Clase: ";
        if(bytes[0] >= 0 && bytes[0] <= 127){
            clase += "A";
        }
        if (bytes[0] > 127 && bytes[0] <= 191){
            clase += "B";
        }
        if (bytes[0] > 191 && bytes[0] <= 223){
            clase += "C";
        }
        return clase;
    }
}
