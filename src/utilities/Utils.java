package utilities;


public class Utils {
	
		
	public int getIntegerFromString(Object object){
		
		return Integer.parseInt((String) object);
	}
	
	public double getDoubleFromString(Object object){
		
		return Double.parseDouble((String) object);
	}
	
  public float getFloat(Object object){
		
		return Float.parseFloat((String) object);
	}
	
	//This method compares the strings
	public boolean compareStrings(String s1, String s2){
		
		return s1.equals(s2);
		
	}
	
}
