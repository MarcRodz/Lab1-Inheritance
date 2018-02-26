package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if(this.getTerm(1)!= this.firstValue())
			throw new IllegalStateException("First value does not exist");
		current = current + commonDifference; 
		return current;
	}
	public String toString(){
		return "Arith(" + (int) firstValue() + ","+(int) commonDifference + ")"; 
	}
	
	
public double getTerm(int n) throws IllegalStateException{
		if (n<= 0)
			throw new IllegalStateException("printAllTerms: Invalid argument value = " + n);
		
		double value = this.firstValue() + (n-1)*commonDifference;
		return value;
}
}