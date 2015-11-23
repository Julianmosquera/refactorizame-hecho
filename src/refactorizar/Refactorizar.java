package refactorizar;

/**
 * Lista los numeros primos de dos cifras
 *
 */
public class Refactorizar {

    public static void main(String[] args) {
        boolean esPrimo = false;// p=esPrimo.
        int ndigitos=0 ;
        int numDigitos=0 ;
        numDigitos = 4; //introducir un metodo en estas lineas que nos retorne numdigitos.
        introduceDigitos(numDigitos);
        for (int numComparar = 1; numComparar <= 99999; numComparar++) {    
            ndigitos = contadorDivisionEntera(numComparar);

            if (ndigitos == numDigitos) {
                if (numComparar < 4) {
                    esPrimo = true;
                } else {
                    if (numComparar % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contadorDivisores = 0; //contadorDivisores.
                        int i1 = 1;
                        int limite = (numComparar - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {//otros metodo calculaNumDivisores.
                            if (numComparar % i1 == 0) {
                                contadorDivisores++;
                            }
                            i1 += 2;
                            if (contadorDivisores == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contadorDivisores == 1) {//si solo se divide por el mismo.
                            esPrimo = true;
                        }
                    }
                }

                if (esPrimo == true) {
                    System.out.println(numComparar);
                }
            }
        }
    }

    public static int contadorDivisionEntera(int numComparar) {
        int ndigitos;
        //cambia i por numcomparar.
        int divisionEntera = numComparar;
        int contador = 0;
        while (divisionEntera != 0) {
            divisionEntera = divisionEntera / 10;// nos da los digitos, hacer metodod de contador de numdigitos.
            contador++;
        }
        ndigitos = contador;
        return ndigitos;
    }

    public static void introduceDigitos(int numDigitos) {
        if (numDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
    }

}
