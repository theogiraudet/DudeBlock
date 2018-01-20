package fr.to_om.dudeblock;

public class Definitions{	
	static int maxH = 10 ;
	static int maxY = 10;
	static int[][] map = new int [maxH][maxY];
	private static boolean estAuSol(int x, int y) {
		 boolean b;
		 if (x==maxH-1) { b =true; } else {b = false; } 
		 return b ;
	 }
	 public static int [][] environnement() {
		 
		 for (int i=0 ; i< maxH; i++) {
			 for (int j=0; j< maxY;j++){
				 if (estAuSol(i,j)) {
					 map [i][j] = 1; //1 est un bloc non déplaçable
				 } else {
				 map[i][j] = 0;		//0 est le vide
				 }
			 }
		 }
		 return map;
	 }
	 
	 public static boolean estSurBloc(int x ,int y) {
		 boolean b ;
		 if (map [x+1][y] == 1 || map [x+1][y] == 2) { //2 est un bloc déplaçable
			 b =true;
		 } else { b =false; }
		 return b;
	 }
	 public static void placementDude() {
		 boolean b = false;
		 int i=0;
		 while( i< maxH-1 && !b) {
			 int j =0;
			 while( j<maxY && !b) {
				 if (estSurBloc(i,j)) {
					 map[i][j]= 5; // 5 est la partie basse de Dude
					 map[i-1][j]=4;// 4 est la partie haute de Dude
					b = true;
				 }
				 j++;
			 }
			 i++;
		 }
	 }
	 
	 //TODO 
	 public static void placementPorte() {
		 
	 }
	 

	 
	 public static void Switch(String s1 , String s2) {
	 	String tmp = s1;
	 	s1= s2;
	 	s2 = tmp;
	 }
	 //TODO
	 public static void deplacements(String s) {
		 
	 }
	 //TODO
	 public static void prendBloc() {
		 
	 }
	 //TODO
	 public static void pauseBloc() {
		 
	 }
	 // POur un visu pdt l'ecriture
	 
	public static void main(String[] args) {
		int [][] map = environnement();
		map[maxH-2][0]=1;
		
		placementDude();
		
		 for (int i=0 ; i< maxH; i++) {
			 System.out.println();
			 for (int j=0; j< maxY;j++){
				 System.out.print(map[i][j]);
			 }
		 }
	}
	}
