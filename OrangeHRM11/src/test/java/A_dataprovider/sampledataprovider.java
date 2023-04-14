package A_dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sampledataprovider {
	
@DataProvider(name="Orangehrm")
 public Object[][] data()
 {
	 Object[][] data1= {{"orangehrmurl","Admin","admin123"},
			 {"orangehrmurl","Admin","admin123"}
	 };
	 return data1;
 }
 
  @Test(dataProvider="Orangehrm")
  public void f() {
  }
}
