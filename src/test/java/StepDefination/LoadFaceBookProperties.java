package StepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadFaceBookProperties {

	public static File f;
	public static  Properties P;
	public static FileInputStream FIS;
	public static void loadproperties() throws IOException
	{
		f= new File("C:\\Users\\PRASHANT\\eclipse-workspace\\MavenCucumberProject\\src\\test\\java\\Facebook.properties");
		FIS  = new FileInputStream(f);
		P = new Properties();
		P.load(FIS);
	}
}
