
/*
 * @author Pere Prior
 */

public class Tablero {

    public Tablero() {

        crearTablero();
    }

    public void crearTablero() {

        for (int i = 0; i < tablero.length; i++) {

            tablero[i][0] = letras[i];

            for (int j = 0; j < tablero.length; j++) {

                tablero[0][j] = numeros[j];
                tablero[i][j] = ".";

            }

        }

    }

    public String printTablero() {

        String resultado = "";

        for(int i = 0; i < tablero.length; i++) {

            System.out.println();

            resultado = resultado + tablero[i][i];

        }

        return resultado;

    }

    private int fila;
    private int columna;
    private String tablero[][] = new String[8][8];
    private final String letras[] = {"","A","B","C","D","E","F","G","H"};
    private final String numeros[] = {"","1","2","3","4","5","6","7","8"};

}
