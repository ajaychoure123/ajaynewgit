package testng;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exceldataprovider {
  @Test(dataProvider = "Exceldataprovider")
  public void login(Object username, Object password) {
	  System.out.println("username: "+username +"password: "+password);
  }

  @DataProvider(name="Exceldataprovider")
  public Object [][] getData() throws IOException {
	  String filePath = "C:\\Users\\lenovo\\Desktop\\excelpath.xlsx";
    return Exceldataprovider.getexceldata(filePath, "Sheet1");
      
  }

private static Object[][] getexceldata(String filePath, String string) {
	// TODO Auto-generated method stub
	return null;
}
}
