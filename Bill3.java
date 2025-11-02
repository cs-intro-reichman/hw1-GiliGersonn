// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
		// אנו צריכים להגדיר 3 משתנים מסוג סטרינג ומשתנה אחד מסוג אינט המתקבלים על ידי קלט. 
	    // עלינו להגדיר משתנה נוסף עבור חישוב החלוקה ב3 הוא יהיה מסוג DOUBLE
		// עלינו להוסיף את הפונקציה Math.ceil על מנת לעגל את החשבון 
		// Replace this comment with the rest of your code   
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2]; 
		int total_price = Integer.parseInt(args[3]);
	    Double pay_amount = Math.ceil(total_price / 3); // לא בטוחה שזה יעבוד הכוונה שישר יעשה את הפונקציה שמעגלת על השבר  אצטרך לבדוק את זה
		System.out.println("Dear " + args[2] + ", " + args[1] + ", and " + args[0] + ": pay " +  pay_amount + " Shekels each.");

	}
}
