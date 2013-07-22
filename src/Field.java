public class Field {
	private final static char DEF_VALUE = ' ';
	
	private char field[][] = new char[3][3];
	
	
	
	public void setCell(int x, int y, char value){
		field[x][y] = value;
	}
	
	public void eraseField(){
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				setCell(i, j, DEF_VALUE);			
			}
		}
	}
	
	public void showField(){
		for(int i = 0; i < 3; ++i){
			System.out.println("" + field[i][0] + " | " + field[i][1] + " | " + field[i][2] );
			if(i != 2){
				System.out.println("----------");
			}
		}
	}
	
}