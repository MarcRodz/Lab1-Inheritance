package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		if(this.getTerm(1)!= this.firstValue())
			throw new IllegalStateException("First value does not exist");
		current = current * commonFactor; 
		return current;
	}

	public String toString(){
		return "Geom(" + (int) firstValue() + "," +(int) commonFactor + ")"; 
	}
public double getTerm(int n) throws IllegalStateException {
		
		if (n<= 0)
			throw new IllegalStateException("printAllTerms: Invalid argument value = " + n); 
	
			double term = this.firstValue()*Math.pow(commonFactor, n-1 ) ;
			return term;
	}	
}
