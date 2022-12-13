package lesson8;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.cert.CertPathBuilderSpi;

public class Shembull 
{ public static void main(String []args)
	{
	   Path path = Paths.get("C:\\home\\Anxhela");
	   System.out.printf("toString: %s%n", path.toString());
	   System.out.printf("getFileName: %s%n", path.getFileName());
	   System.out.printf("getName(0): %s%n", path.getName(0));
	   System.out.printf("getNameCount: %d%n", path.getNameCount());
       System.out.printf("subpath(0,2): %s%n",path.subpath(0,2));
       System.out.printf("getParent: %s%n",path.getParent());
       System.out.printf("getRoot: %s%n",path.getRoot());




	   
	}

}
