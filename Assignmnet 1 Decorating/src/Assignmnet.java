import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignmnet {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Pastry pastry = new Pie();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome to the dungeon run pick a class. \n 1.Pie:");
		String s = br.readLine();
		if (s.equals("1")) {
			System.out.println("You have chosen Pie, Huzza");
			pastry = new Pie();
		}
		
		// encounter 1, TODO: randomize the encounters.
		pastry = new Apple(pastry);
		System.out.println(pastry.getEncounter());
		s = br. readLine();
		pastry.solveEncounter(s);
		
		System.out.println(pastry.getDescription() + "\nFinal Score: " + pastry.cost());
		
		// encounter 2,
		pastry = new Sugar(pastry);
		System.out.println(pastry.getEncounter());
		s = br.readLine();
		pastry.solveEncounter(s);
		
		System.out.println(pastry.getDescription() + "\nFinal Score: " + pastry.cost());
	}

}
