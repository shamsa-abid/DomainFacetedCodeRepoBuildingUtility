package cc.mallet.util;

public class Constants {
	//for localhost
	public static String dbConnectionString="jdbc:mysql://localhost:3306/dprs_fact_repository";
	public static String uname="root";
	public static String passwd="";
	
	
	//for online hosted mysql db
	//public static String dbConnectionString = "jdbc:mysql://shamsa.db.11682291.hostedresource.com/shamsa";
	//public static String uname = "shamsa";
	//public static String passwd = "Sham@123";
	
	public static String SEWordSimPath = System.getProperty("user.dir")+"/SEWordSim-r1.db";
	public static String recommendationsOutputPath = "E:\\Recommendations.txt";
	public static final String ConsolidatedCodeFilePath = "Outfile\\Output.txt"; //contains the preprocessed data of all java files of a project
	public static final String topicsFilePath = "Outfile\\out.txt"; //contains the topics detected for a project

}
