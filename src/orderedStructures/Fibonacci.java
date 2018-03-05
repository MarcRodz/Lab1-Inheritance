package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
        // add the necessary code here
		double temp=current;
		current+=prev;
		prev=temp;
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}
public double getTerm (int n) throws IndexOutOfBoundsException{
		
		if(n<=0){
			
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value="+ n);
			
		}
		return(1/Math.sqrt(5)) *((Math.pow((1 + Math.sqrt(5))/2, n)) - (Math.pow(( 1- Math.sqrt(5))/2,n)));
	}
public boolean equals(Progression o) {
	if(this.toString().equals(o.toString())) {
		return true;
	}
	return false;
}
}
