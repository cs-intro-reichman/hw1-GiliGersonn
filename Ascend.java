// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code // עליי להשתמש בשלוש פונקציות בהתחלה אנו לוקחים מספר רדנומליומרגילים שלושה מספרים מ0 עד מהספר ואז צריך לסדר את זה בסדר עולה 
		int lim = Integer.parseInt(args[0]); //ממירה את המחרוזת שקיבלנו מהשתמש למספר שלם!

		double num1 = Math.random()*lim;
		double num2 = Math.random()*lim;
		double num3 = Math.random()*lim;
		double smallest_num_check1 = Math.min(num1,num2); // מציאת מיניימום ומקסימום על ידי השוואה של שני משתנים ושמירתם כמשתנה חדש!
		double smallest_num = Math.min(smallest_num_check1,num3);
		double biggest_num_check1 = Math.max(num1,num2);
		double biggest_num = Math.max(biggest_num_check1,num3); 
		double middle_num = ((num1 + num2 + num3) - (smallest_num + biggest_num)); //עיקרון חשוב מצאתי את ההכי קטן והכי גדול ואז אפשר פשוט לחבר את כל המשתנים ולחסר את השניים שמצאתי
		System.out.println((int)(smallest_num) + " " + (int)(middle_num) + " " + (int)(biggest_num));






	}
}
