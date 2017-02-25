package UCWaitTime.GigSynergy;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class App{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    // 20150928_161823
		try{
			// 1. Get a Connection to DB
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/urgentcare","user","password");
			// 2. Create a Statement
			Statement myStat = myConn.createStatement();
			// 3. Create a ResultSet
			
			System.out.println(myConn);
			//myStat.executeUpdate("INSERT INTO tblfacility VALUES (1,`Woodbridge`,123456, `Irvine`,92612 , 10 , 4 )");
		//myStat.executeUpdate("INSERT INTO tblfacility(`Facility_ID`,`Facility_Name`,`Facility_Phone`,`Facility_Address`,`Facility_ZipCode`, `Facility_QN`, `Facility_Rating`)"
			//	+ "VALUES (3, 'Woodbridge',123456,'Irvine',92612, 10,4 )");
			
		/*	String CurrTime =( new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()) );
			String CurrDate = (new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime()));
			System.out.println(CurrTime);
			System.out.println(CurrDate);
			*/
			
			java.sql.Date Date = new java.sql.Date(new java.util.Date().getTime());
			System.out.println(Date);
			java.sql.Time Time = new java.sql.Time(new java.util.Date().getTime());
			System.out.println(Time);
			
			
		myStat.executeUpdate("INSERT INTO tblpatient(`Patient_ID`, `Patient_Phone`, `Patient_F_Name`, "
			+ "`Patient_M_Name`, `Patient_L_Name`, `Service_Date`, `Service_Time`, `Facility_ID`)" 
				+ "VALUES (1, 12345678, 'Tannaz', '', 'Rezaei','"+Date+"'  , '"+Time+"' , 1)");	
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
