import java.util.Scanner;

class LoanImp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("");
		System.out.println("WELCOME TO A LOAN APPLICATION PROGRAM");
		System.out.println("");
		System.out.println("Select your level of study");
		System.out.println("1.Undergraduate");
		System.out.println("2.Post_Graduate");
		System.out.println("3.Exit");
		System.out.println("");

		int a = input.nextInt();
		if (a==1){

		Scanner detail = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Enter your name");
        String name = detail.nextLine();

		System.out.println("Enter your program of study");
        String programOfStudy = detail.nextLine();

		System.out.println("Enter your year of study");
        double yearOfStudy = detail.nextInt();

		System.out.println("");
		System.out.println("Welcome to the Undergraduate Application Form");
		System.out.println("");
		System.out.println("Enter according to your choice in the form (1,2,3,12,13,23 or 123)");
		System.out.println("1.Tuition");
		System.out.println("2.Subsistence");
		System.out.println("3.Stationary");
		System.out.println("");

		int b = input.nextInt();
		if (b==1){
			double tuition = 350000;
			double interest = 0.1*tuition*(4-yearOfStudy);

			double loanAmount = tuition + interest;

			System.out.println(+loanAmount);
		}
		else if (b==2){
			double subsistence = 100000;
			double interest = 0.1*subsistence*(4-yearOfStudy);

			double loanAmount = subsistence + interest;

			System.out.println(+loanAmount);
		}
		else if (b==3){
			double stationary = 50000;
			double interest = 0.1*stationary*(4-yearOfStudy);

			double loanAmount = stationary + interest;

			System.out.println(+loanAmount);
		}
		else if (b==12){
			double tuition = 350000;
			double subsistence = 100000;
			double interest = (0.1*tuition)*(0.1*subsistence)*(4-yearOfStudy);

			double loanAmount = tuition + subsistence + interest;

			System.out.println(+loanAmount);
		}
		else if (b==13){
			double tuition = 350000;
			double stationary = 100000;
			double interest = (0.1*tuition)*(0.1*stationary)*(4-yearOfStudy);

			double loanAmount = tuition + stationary + interest;

			System.out.println(+loanAmount);
		}
		else if (b==23){
			double subsistence = 100000;
			double stationary = 50000;
			double interest = (0.1*subsistence)*(0.1*stationary)*(4-yearOfStudy);

			double loanAmount = subsistence + stationary + interest;

			System.out.println(+loanAmount);
		}
		else if (b==123){
			double tuition = 350000;
			double subsistence = 100000;
			double stationary = 50000;
			double interest = (0.1*tuition)*(0.1*subsistence)*(0.1*stationary)*(4-yearOfStudy);

			double loanAmount = tuition + subsistence + stationary + interest;

			System.out.println(+loanAmount);
		}

		}

		//for postGraduate
		else if (a==2){

		Scanner detail = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Enter your name");
        String name = detail.nextLine();

		System.out.println("Enter your program of study");
        String programOfStudy = detail.nextLine();

		System.out.println("Enter your year of study");
        int yearOfStudy = detail.nextInt();
        //set_programOfStudy(programOfStudy);

		System.out.println("");
		System.out.println("Welcome to the Post_Graduate Application Form");
		System.out.println("");
		System.out.println("Enter according to your choice in the form (1,2,3,12,13,23 or 123)");
		System.out.println("1.Tuition");
		System.out.println("2.Subsistence");
		System.out.println("3.Research");
		System.out.println("");

		int c = input.nextInt();
		if (c==1){
			double tuition = 500000;
			double interest = 0.1*tuition*(3-yearOfStudy);

			double loanAmount = tuition + interest;

			System.out.println(+loanAmount);
		}
		else if (c==2){
			double subsistence = 200000;
			double interest = 0.1*subsistence*(3-yearOfStudy);

			double loanAmount = subsistence + interest;

			System.out.println(+loanAmount);
		}
		else if (c==3){
			double researchGrant = 50000;
			double interest = 0.1*researchGrant*(3-yearOfStudy);

			double loanAmount = researchGrant + interest;

			System.out.println(+loanAmount);
		}
		else if (c==12){
			double tuition = 500000;
			double subsistence = 200000;
			double interest = (0.1*tuition)*(0.1*subsistence)*(3-yearOfStudy);

			double loanAmount = tuition + subsistence + interest;

			System.out.println(+loanAmount);
		}
		else if (c==13){
			double tuition = 500000;
			double researchGrant = 100000;
			double interest = (0.1*tuition)*(0.1*researchGrant)*(3-yearOfStudy);

			double loanAmount = tuition + researchGrant + interest;

			System.out.println(+loanAmount);
		}
		else if (c==23){
			double subsistence = 200000;
			double researchGrant = 50000;
			double interest = (0.1*subsistence)*(0.1*researchGrant)*(3-yearOfStudy);

			double loanAmount = subsistence + researchGrant + interest;

			System.out.println(+loanAmount);
		}
		else if (c==123){
			double tuition = 500000;
			double subsistence = 200000;
			double researchGrant = 50000;
			double interest = (0.1*tuition)*(0.1*subsistence)*(0.1*researchGrant)*(3-yearOfStudy);

			double loanAmount = tuition + subsistence + researchGrant + interest;

			System.out.println(+loanAmount);
		}
		}

		else if (a==3){
		System.out.println("");
		System.out.println("");
		System.out.println("Byeee...");
		System.out.println("");

		}
		
	}
}