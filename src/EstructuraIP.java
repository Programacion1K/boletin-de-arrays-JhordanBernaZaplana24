public class EstructuraIP {

    public EstructuraIP (int[] bytes){
        this.bytes = bytes;
    }

    public static String getDireccionIp() {
    }

    public static String getIdRed() {
    }

    public static String getMascaraRed() {
    }

    public static String getEsPrivada() {
    }

    public static String getClase() {
    }

    public static String getEsIdRed() {

    }
    private int[] bytes;
    public EstructuraIP(String cadena) {
        bytes = new int[4];
        String[] partes = cadena.split("\\.");
        for (int i=0; i<partes.length; i++){
            bytes[i] = Integer.parseInt(partes[i]);
        }
    }
}
