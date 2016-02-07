import java.io.*;

public class SwitchExample{
	public static void main(String[] args) throws Exception{
		int x, y;
		BufferedReader object = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter two numbers for operation:");
		try{
			x = Integer.parseInt(object.readLine());
			y = Integer.parseInt(object.readLine());
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("enter your choice:");
			int a= Integer.parseInt(object.readLine());
			switch (a){  
			case 1:
				System.out.println("Enter the number one=" + (x+y));
				break;
			case 2:
				System.out.println("Enter the number two=" + (x-y));
				break;
			case 3:
				System.out.println("Enetr the number three="+ (x*y));
				break;
			case 4:
				System.out.println("Enter the number four="+ (x/y));
				break;
			default:
				System.out.println("Invalid Entry!");
			}
		}
		catch(NumberFormatException ne){
			System.out.println(ne.getMessage() + " is not a numeric value.");
			System.exit(0);
		}

	}
}