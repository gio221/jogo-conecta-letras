package principal;

public class Conectaletras1 {
    static char[][][] fases = new char[100][10][10]; 
    static String[][] palavras = new String[100][10]; 
    static 
    String[][] mapas = new String[100][10]; 
    static String[] letras = new String[100]; 
    static final int LIMITE = 5; 
    static int fase = 0; 
  
    public static void main(String[] args) { 
        java.util.Scanner leia = new java.util.Scanner(System.in); 
        montaFases(); 
        while (true) { 
            limpa(); 
            mostraMatriz(); 
            System.out.println("Digite palavras com essas letras: "); 
            for (int i = 0; i < letras[fase].length(); i++) { 
                char letra = letras[fase].toUpperCase().charAt(i); 
                System.out.printf("%c  ", letra); 
            } 
            System.out.println(""); 
            System.out.print("Digite a palavra: "); 
            String palavra = leia.nextLine(); 
            palavra = palavra.toUpperCase(); 
            String t = teste(palavra); 
            if (t.equalsIgnoreCase("INVALIDO")) { 
                System.out.println("Tente de novo"); 
                continue; 
            } 
            modificaFase(palavra, t); 
            String x = verificaVitoria(); 

            
            
            
            
            if (x.equalsIgnoreCase("PASSOU DE FASE")) { 
                fase++; 
                if (fase == LIMITE) { 
                    System.out.println("O jogo acabou"); 
                    System.exit(0); 
                } 
            } 
        } 
  
    } 
  
    public static void modificaFase(String palavra, String t) { 
        int linha = Integer.parseInt(t.charAt(0) + ""); 
        int coluna = Integer.parseInt(t.charAt(1) + ""); 
        char direcao = t.charAt(2); 
        if (direcao == 'h') { 
            for (int i = coluna, k = 0; k < palavra.length(); i++, k++) { 
                fases[fase][linha][i] = palavra.charAt(k); 
            } 
        } else { 
            for (int i = linha, k = 0; k < palavra.length(); i++, k++) { 
                fases[fase][i][coluna] = palavra.charAt(k); 
            } 
        } 
    } 
  
    public static String verificaVitoria() { 
  
        for (int k = 0; k < 10; k++) { 
            for (int i = 0; i < 10; i++) { 
                if (fases[fase][k][i] == '#') { 
                    String x = ("NAO PASSOU DE FASE"); 
                    return x; 
                } 
            } 
        } 
        String x = ("PASSOU DE FASE"); 
        return x; 
    } 
  
    public static void montaFases() { 
        for (int k = 0; k < 100; k++) { 
            for (int i = 0; i < 10; i++) { 
                for (int j = 0; j < 10; j++) { 
                    fases[k][i][j] = ' '; 
                } 
            } 
        } 
////////////////fase 1 
        fases[0][3][0] = '#'; 
        fases[0][0][1] = '#'; 
        fases[0][1][1] = '#'; 
        fases[0][2][1] = '#'; 
        fases[0][3][1] = '#'; 
        fases[0][1][2] = '#'; 
        fases[0][3][2] = '#'; 
        fases[0][1][3] = '#'; 
        fases[0][2][3] = '#'; 
        fases[0][3][3] = '#'; 
        fases[0][1][4] = '#'; 
        palavras[0][0] = "CARO"; 
        palavras[0][1] = "COR"; 
        palavras[0][2] = "COAR"; 
        palavras[0][3] = "ARCO"; 
        mapas[0][0] = "01v"; 
        mapas[0][1] = "13v"; 
        mapas[0][2] = "30h"; 
        mapas[0][3] = "11h"; 
        letras[0] = "orca"; 
////////////////fase 2 
        fases[1][1][0] = '#'; 
        fases[1][2][0] = '#'; 
        fases[1][3][0] = '#'; 
        fases[1][4][0] = '#'; 
        fases[1][5][0] = '#'; 
        fases[1][1][1] = '#'; 
        fases[1][1][2] = '#'; 
        fases[1][1][3] = '#'; 
        fases[1][1][4] = '#'; 
        fases[1][0][2] = '#'; 
        fases[1][2][2] = '#'; 
        fases[1][3][2] = '#'; 
        fases[1][4][1] = '#'; 
        fases[1][4][3] = '#'; 
        fases[1][4][4] = '#'; 
        fases[1][0][4] = '#'; 
        fases[1][2][4] = '#'; 
        fases[1][3][4] = '#'; 
        fases[1][4][2] = '#'; 
        palavras[1][0] = "PRATO"; 
        palavras[1][1] = "PORTA"; 
        palavras[1][2] = "TRAPO"; 
        palavras[1][3] = "TROPA"; 
        palavras[1][4] = "RAPTO"; 
        mapas[1][0] = "10v"; 
        mapas[1][1] = "10h"; 
        mapas[1][2] = "40h"; 
        mapas[1][3] = "02v"; 
        mapas[1][4] = "04v"; 
        letras[1] = "praot"; 
////////////////fase 3 
        fases[2][0][1] = '#'; 
        fases[2][1][1] = '#'; 
        fases[2][2][1] = '#'; 
        fases[2][3][1] = '#'; 
        fases[2][4][1] = '#'; 
        fases[2][4][0] = '#'; 
        fases[2][4][2] = '#'; 
        fases[2][4][3] = '#'; 
        fases[2][4][4] = '#'; 
        fases[2][2][2] = '#'; 
        fases[2][2][3] = '#'; 
        fases[2][2][4] = '#'; 
        fases[2][3][4] = '#'; 
        fases[2][0][3] = '#'; 
        fases[2][1][3] = '#'; 
        fases[2][0][4] = '#'; 
        fases[2][0][5] = '#'; 
        palavras[2][0] = "IMPOR"; 
        palavras[2][1] = "PRIMO"; 
        palavras[2][2] = "PIOR"; 
        palavras[2][3] = "RIO"; 
        palavras[2][4] = "PRO"; 
        palavras[2][5] = "POR"; 
        mapas[2][0] = "01v"; 
        mapas[2][1] = "40h"; 
        mapas[2][2] = "21h"; 
        mapas[2][3] = "24v"; 
        mapas[2][4] = "03v"; 
        mapas[2][5] = "03h"; 
        letras[2] = "piomr"; 
////////////////fase 4 
        fases[3][1][0] = '#'; 
        fases[3][2][0] = '#'; 
        fases[3][3][0] = '#'; 
        fases[3][4][0] = '#'; 
        fases[3][1][1] = '#'; 
        fases[3][1][2] = '#'; 
        fases[3][1][3] = '#'; 
        fases[3][1][4] = '#'; 
        fases[3][3][1] = '#'; 
        fases[3][0][2] = '#'; 
        fases[3][2][2] = '#'; 
        fases[3][3][2] = '#'; 
        fases[3][4][2] = '#'; 
        fases[3][2][4] = '#'; 
        fases[3][3][4] = '#'; 
        fases[3][4][4] = '#'; 
        fases[3][2][5] = '#'; 
        fases[3][2][6] = '#'; 
        fases[3][4][5] = '#'; 
        fases[3][4][6] = '#'; 
        palavras[3][0] = "ZONAL"; 
        palavras[3][1] = "ZONA"; 
        palavras[3][2] = "ANZOL"; 
        palavras[3][3] = "NAO"; 
        palavras[3][4] = "LONA"; 
        palavras[3][5] = "OLA"; 
        palavras[3][6] = "ANO"; 
        mapas[3][0] = "10h"; 
        mapas[3][1] = "10v"; 
        mapas[3][2] = "02v"; 
        mapas[3][3] = "30h"; 
        mapas[3][4] = "14v"; 
        mapas[3][5] = "24h"; 
        mapas[3][6] = "44h"; 
        letras[3] = "zoain"; 
////////////////fase 5 
        fases[3][1][0] = '#'; 
        fases[4][0][1] = '#'; 
        fases[4][1][1] = '#'; 
        fases[4][2][1] = '#'; 
        fases[4][2][0] = '#'; 
        fases[4][3][0] = '#'; 
        fases[4][4][0] = '#'; 
        fases[4][5][0] = '#'; 
        fases[4][4][1] = '#'; 
        fases[4][4][2] = '#'; 
        fases[4][2][2] = '#'; 
        fases[4][2][3] = '#'; 
        fases[4][2][4] = '#'; 
        fases[4][1][4] = '#'; 
        fases[4][3][4] = '#'; 
        fases[4][4][4] = '#'; 
        fases[4][1][5] = '#'; 
        fases[4][1][6] = '#'; 
        fases[4][1][7] = '#'; 
        fases[4][4][5] = '#'; 
        fases[4][2][6] = '#'; 
        fases[4][3][6] = '#'; 
        fases[4][4][6] = '#'; 
        palavras[4][0] = "MICO"; 
        palavras[4][1] = "IMA"; 
        palavras[4][2] = "MACIO"; 
        palavras[4][3] = "CIO"; 
        palavras[4][4] = "CIMA"; 
        palavras[4][5] = "AMO"; 
        palavras[4][6] = "MAIO"; 
        palavras[4][7] = "COMA"; 
        mapas[4][0] = "20v"; 
        mapas[4][1] = "01v"; 
        mapas[4][2] = "20h"; 
        mapas[4][3] = "40h"; 
        mapas[4][4] = "14h"; 
        mapas[4][5] = "44h"; 
        mapas[4][6] = "16v"; 
        mapas[4][7] = "14v"; 
        letras[4] = "coaim"; 
    } 
  
    public static void mostraMatriz() { 
        for (int i = 0; i < 10; i++) { 
            for (int j = 0; j < 10; j++) { 
                if (fases[fase][i][j] == '#') { 
                    System.out.printf("[%s]", fases[fase][i][j]); 
                } else { 
                    System.out.printf(" %s ", fases[fase][i][j]); 
                } 
            } 
            System.out.println(""); 
        } 
    } 
  
    public static String teste(String palavra) { 
        for (int i = 0; i < 10; i++) { 
            if (palavra.equalsIgnoreCase(palavras[fase][i])) { 
                return mapas[fase][i]; 
            } 
        } 
        return "INVALIDO"; 
    } 
  
    public static void limpa() { 
        for (int i = 1; i <= 100; i++) { 
            System.out.println(); 
        } 
    } 
  
} 

