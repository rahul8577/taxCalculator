import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

	public static void calculateTax(String name, long income){

		long tax=0;
		if(income>=300000){
			tax=(income*80)/100;
		} else if (income>=100000 && income<=300000) {
			tax=(income*90)/100;
		} else if (income<100000) {
			tax=0;
		}
		System.out.println(name +" : \u20B9 "+tax);
	}

	public static void main(String[] args) {

		System.out.println("Tax Calculator App");
		System.out.println("----Welcome----");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Person Count");

		int nameCount = sc.nextInt();
		String[] names=new String[nameCount];
		long[] incomes=new long[nameCount];

		for(int i=0; i<nameCount; i++){
			System.out.println("Enter Name "+(i+1));
			names[i]=sc.next();
			System.out.println("Enter "+names[i]+ " Annual Income");
			incomes[i]=sc.nextLong();
		}

		System.out.println("Names with liable taxes");
		System.out.println("-----------------------");

		for (int j=0; j<nameCount; j++){
			calculateTax(names[j],incomes[j]);
		}

		sc.close();

	}
}