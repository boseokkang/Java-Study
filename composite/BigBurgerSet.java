package composite;

import lombok.Data;

// BigBurger, Coke, FrenchFried
// 자바는 다중 상속(extends)이 안됨
@Data
public class BigBurgerSet {
	private BigBurger bigburger;
	private Coke coke;
	private FrenchFried frenchFried;

	public BigBurgerSet() {
		this(
				new BigBurger(), 
				new Coke(), 
				new FrenchFried()
				);

	}

	public BigBurgerSet(BigBurger bigburger) {
		this(
				bigburger, 
				new Coke(), 
				new FrenchFried()
				);

	}

	public BigBurgerSet(BigBurger bigburger, Coke coke, FrenchFried frenchFried) {
		this.bigburger = bigburger;
		this.coke = coke;
		this.frenchFried = frenchFried;
	}

}
