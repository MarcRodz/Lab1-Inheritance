package orderedStructures;

import interfaces.Combinable;

public class Arithmetic extends Progression implements Combinable {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		current = current + commonDifference; 
		return current;
	}
	
	@Override
	public String toString(){
		return "Arith(" + (int)super.firstValue() + ", " + (int)this.commonDifference + ")";
	}
	
	@Override
	public double getTerm(int n){
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n);
		
		double value = this.firstValue(); 
		for (int i=1; i<n; i++) 
			value = this.nextValue(); 
		return value; 
	}
	
	public boolean equals(Progression o) {
		if(this.toString().equals(o.toString())) {
			return true;
		}
		return false;
	}

	@Override
	public Progression add(Arithmetic aP) {
		Progression newPr = new Arithmetic(this.firstValue()+aP.firstValue(), this.commonDifference+aP.commonDifference);
		
		return newPr;
	}

	@Override
	public Progression substract(Arithmetic aP) {
		Progression newPr = new Arithmetic(this.firstValue()-aP.firstValue(), this.commonDifference-aP.commonDifference);
		return newPr;
	}

}