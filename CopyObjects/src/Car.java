
public class Car {
	private String model;
	private String make;
	private int year;
	
	
	Car(String model, String make, int year )
	{  
		this.setModel(model);
	    this.setMake(make);
	    this.setyear(year);
		
		
	}
	
	Car(Car x){
		
	 this.copy(x);
	}
	
	public String getModel() {
		return this.model;
		
	}
	
	public String getMake() {
		return this.make;
		
	}

	public int getYear() {
		return this.year;
		
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public void setMake(String make) {
		this.make=make;
	}
	
	public void setyear(int year) {
		this.year=year;
	}
	
	public void copy(Car x) {
		x.setMake(make);
		x.setModel(model);
		x.setyear(year);
		
	}


}
