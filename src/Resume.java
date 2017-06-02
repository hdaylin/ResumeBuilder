import java.util.Scanner;
public class Resume {

	public static void main(String[] args) {

		String name; 
		String email;
		String [] achievement = new String[9];  
		String [] skills = new String[19];   
		String [] experience = new String [19]; 
		String [] rating = new String[19];
		String add_new = "yes";
		String add_another = "yes"; 
		String loop="yes";

		int i = 0;
		int a = 0; 
		int c = 0;

		Scanner keyboard = new Scanner(System.in); 

		System.out.println("What is your name?"); 
		name = keyboard.nextLine();

		System.out.println("What is your email?"); 
		email = keyboard.nextLine();  
		

		while(add_new.equals("yes")){
			System.out.println("Enter up to 10 educational achievements"); 
			achievement[i] = keyboard.nextLine(); 
			
			System.out.println("Add add another? (yes/no)"); 
			add_new = keyboard.nextLine(); 
			
			if(add_new.equals("yes")){
				i++;
			}
		
		}   
		
		System.out.println("Would you like to add experience to your resume? (yes/no)"); 
		loop = keyboard.next(); 

		while(loop.equals("yes")){
			System.out.println("Enter up to 10 experiences"); 
			experience[c] = keyboard.next();  

			System.out.println("Add add another experience? (yes/no)"); 
			loop = keyboard.next();  			
				c++;
		}  
		
		

		System.out.println("Would you like to add skills to your resume? (yes/no)"); 
		add_another = keyboard.next(); 

		while(add_another.equals("yes")){
			System.out.println("Enter up to 20 skills"); 
			skills[a] = keyboard.next();  
			
			System.out.println("What is your proficency? (skilled, proficient, or familiar)");
			rating[a] = keyboard.next();

			System.out.println("Add add another skill? (yes/no)"); 
			add_another = keyboard.next();  			
				a++;
		}  
		
		
		
		System.out.println("=============================================================");
		System.out.println("\t\t\t     " + name + " Resume"); 
		System.out.println(email);
		System.out.println(" ");

		System.out.println("----Education----");  

		for(int index= 0; index<9; index++){
			if(achievement[index] !=null){
			System.out.println(achievement[index]);
			} 
		} 
		System.out.println(" "); 
		
		System.out.println("----Experience----");
		
		for(int go= 0; go<9; go++){
			if(experience[go] !=null){
			System.out.println(experience[go]);
			} 
		}
		System.out.println(" "); 
		
		// Only print the array if they added skills
		//if(skills[0] != null){
			
		System.out.println("------Skills------");
			for (int counter =0; counter<19; counter++){
				if(skills[counter] != null){ 
				System.out.println(skills[counter] +", "+rating[counter]); 
				}
			}

		//}

	}
}