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
			
			System.out.println(myConn);
			
		//myStat.executeUpdate("INSERT INTO tblfacility(`Facility_ID`, `Facility_Phone`, `Facility_Address`, `Facility_Rating`)"
		//			+ "VALUES (2, 10101010,'Pomona' , 3)");
		//myStat.executeUpdate("INSERT INTO tblpatient(`Patient_ID`, `Patient_Phone`, `Patient_F_Name`, `Patient_M_Name`, `Patient_L_Name`, `Service_Date`, `Service_Time`, `Facility_ID`)" 
			//		+ "VALUES (1, 12345678, 'Tannaz', '', 'Rezaei', '0000-00-00', '00:00:00', 1)");	
		ResultSet myRs = myStat.executeQuery("select * from tblfacility");
			
			
			 //Try to print the result 
			while (myRs.next()){
				System.out.println(myRs.getString("Facility_Address"));
			}
		}
		catch (Exception exc){
					exc.printStackTrace();
		}
	}

}
