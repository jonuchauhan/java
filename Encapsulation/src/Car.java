
public class Car {
	private String make;
	private String model;
	private int year;
	
	Car(String make, String model, int year){
		this.setmake(make);
		this.setmodel(model);
		this.setyear(year);
		
		
	}
	
	
	public String  getmake() {
		return this.make;
	}
	
	public String  getmodel() {
		return this.model;
	}
	
	
	public int  getyear() {
		return this.year;
	}
	
	
	public void setmake(String make) {
		this.make=make;
	}
	
	public void setmodel(String model) {
		this.model=model;
	}
	
	
	public void setyear(int year) {
		this.year=year;
	}
	
	
	
	
                                     
}
