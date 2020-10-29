package composite;

import lombok.Data;

@Data
public class ShrimpBurgerSet {

	private ShrimpBurger shrimpburger;
	private Coke coke;
	private FrenchFried frenchFried;

	public ShrimpBurgerSet() {
		this(
				new ShrimpBurger(), 
				new Coke(), 
				new FrenchFried()
				);
	}
	
	public ShrimpBurgerSet(ShrimpBurger shrimpburger) {
		this(
				shrimpburger, 
				new Coke(), 
				new FrenchFried()
				);
	}

	public ShrimpBurgerSet(ShrimpBurger shrimpburger, Coke coke, FrenchFried frenchFried) {
		this.shrimpburger = shrimpburger;
		this.coke = coke;
		this.frenchFried = frenchFried;
	}


}
