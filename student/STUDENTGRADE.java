package student;
import java.util.Scanner;

public class STUDENTGRADE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("<<< STUDENT GRADE CALCULATOR >>>");
		
		System.out.println("Enter the markes out of 100 in Each SUBJECT ");
		System.out.println("_______________________________________________");
		System.out.println("ENTER THE MARK FOR MATHS :");
		int math=sc.nextInt();
		System.out.println("ENTER THE MARK FOR CHEMISTRY :");
		int chemistry=sc.nextInt();
		System.out.println("ENTER THE MARK FOR PHYSICS   :");
		int physics=sc.nextInt();
		System.out.println("ENTER THE MARK FOR BIOLOGY   :");
		int biology=sc.nextInt();
		System.out.println("ENTER THE MARK FOR ENGLISH   :");
		int english=sc.nextInt();
		System.out.println("ENTER THE MARK FOR MARATHI   :");
		int marathi=sc.nextInt();
		
		
		
		System.out.println("___________________________________________________");
		System.out.println("<<<< You ENTER MARKS ARE >>>>");
		System.out.println("____________________________");
		System.out.println("|MATHS     :"+math     +"  |");
		System.out.println("|CHEMISTRY :"+chemistry+"   |");
		System.out.println("|PHYSICS   :"+physics  +"  |");
		System.out.println("|BIOLOGY   :"+biology  +"  |");
		System.out.println("|ENGLISH   :"+english  +"  |");
		System.out.println("|MARATHI   :"+marathi  +"  |");
		int sum=math+chemistry+physics+biology+english+marathi;
		
		System.out.println("___________________________");
		System.out.println("<<<< TOTAL MARKS ARE >>>>");
		System.out.println("TOTAL SUM  :"+sum      +"  |");
		
		System.out.println("<<<<THE AVERAGE PERSENTAGE >>>>");
		double avg=sum/6;
		
		System.out.println("AVERAGE PERSENTAGE :"+avg+"%");
		System.out.println("<<<<<< THE GRADE IS >>>>>> ");
		
		
		if(avg>=35 && avg<40)
		{
			System.out.println("GRADE : E");
		}
		else if(avg>=40 && avg<50)
		{
			System.out.println("GRADE : D");
		}
		else if(avg>=50 && avg<60)
		{
			System.out.println("GRADE : C");
		}
		else if(avg>=60 && avg<70)
		{
			System.out.println("GRADE : B");
		}
		else if(avg>=70 && avg<80)
		{
			System.out.println("GRADE : A");
		}
		else if(avg>=80 && avg<100)
		{
			System.out.println("GRADE : A+");
		}
		else 
			System.out.println("YOU ARE FAIL:");
		
		
		
		
		
		
		

	}

}
