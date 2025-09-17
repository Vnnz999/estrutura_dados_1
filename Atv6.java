public class Atv6 {
    public static void main (String[] args) {

        int[][] matriz = new int[5][5];

        matriz[0][0] = 120; matriz[1][0] = 232; matriz[2][0] = 200;
        matriz[0][1] = 125; matriz[1][1] = 240; matriz[2][1] = 210;
        matriz[0][2] = 130; matriz[1][2] = 250; matriz[2][2] = 220;
        matriz[0][3] = 140; matriz[1][3] = 260; matriz[2][3] = 230;
        matriz[0][4] = 150; matriz[1][4] = 270; matriz[2][4] = 240;
        
        
        matriz[3][0] = 160; matriz[4][0] = 280;
        matriz[3][1] = 170; matriz[4][1] = 290;
        matriz[3][2] = 180; matriz[4][2] = 300;
        matriz[3][3] = 190; matriz[4][3] = 310;
        matriz[3][4] = 200; matriz[4][4] = 320;
        
        
            for (int linha = 0; linha < matriz.length; linha++) {
            
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

            System.out.println("Elemento na posição [" + linha + "][" + coluna + "]: " + matriz[linha][coluna]);
            }
        }
    }
}