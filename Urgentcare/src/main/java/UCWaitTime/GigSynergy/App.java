package UCWaitTime.GigSynergy;
import java.sql.*;
public class App{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			// 1. Get a Connection to DB
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/urgentcare","user","password");
			// 2. Create a Statement
			Statement myStat = myConn.createStatement();
			// 3. Create a ResultSet
			
			myStat.executeUpdate("INSERT INTO tblpatient(`Patient_ID`, `Patient_Phone`, `Patient_F_Name`, `Patient_M_Name`, `Patient_L_Name`, `Service_Date`, `Service_Time`, `Facility_ID`) "
					+ "VALUES (10000, 12345678, 'Shubhangi', 'V', 'Shimpi', 2017-02-02, 12:15:20, 1)");
			
			ResultSet myRs = myStat.executeQuery("select * from tblpatient");
			
			
			// Try to print the result 
			while (myRs.next()){
				System.out.println(myRs.getString("Patient_F_Name"));
			}
		}
		catch (Exception exc){
					exc.printStackTrace();
		}
	}

}
