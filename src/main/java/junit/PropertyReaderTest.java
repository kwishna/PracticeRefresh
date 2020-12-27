package junit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * By Adding This In pom.xml Under maven plugin configuration.
 * Properties from this will be added to system.
 * <systemPropertiesFile>src/test/resources/config.properties</systemPropertiesFile>
 */
public class PropertyReaderTest {

	public static void main(String[] args) throws IOException {

//		ResourceBundle bundle = ResourceBundle.getBundle("sample");
//		System.out.println(bundle.getStrin("first"));
//		System.out.println(bundle.getStrin("second"));
//		System.out.println(bundle.getStrin("third"));
//		System.out.println(bundle.getStrin("1"));
//		System.out.println(bundle.getStrin("@xyz"));
//		System.out.println(bundle.getStrin("*abc"));
//		System.out.println(bundle.getStrin("my name is"));
//		System.out.println(bundle.getStrin("\"hhh\""));
//		System.out.println(bundle.getStrin("tab")+"-tab");
//		System.out.println(bundle.getStrin("commas.escaped"));
//		System.out.println(bundle.getStrin("previousValue"));


		Properties bundle = new Properties();
		bundle.load(Files.newInputStream(Paths.get("src/main/resources/sample.properties")));

		System.out.println(bundle.getProperty("first"));
		System.out.println(bundle.getProperty("second"));
		System.out.println(bundle.getProperty("third"));
		System.out.println(bundle.getProperty("1"));
		System.out.println(bundle.getProperty("@xyz"));
		System.out.println(bundle.getProperty("*abc"));
		System.out.println(bundle.getProperty("my name is"));
		System.out.println(bundle.getProperty("\"hhh\""));
		System.out.println(bundle.getProperty("tab")+"-tab");
		System.out.println(bundle.getProperty("commas.escaped"));
		System.out.println(bundle.getProperty("previousValue"));
	}
}
