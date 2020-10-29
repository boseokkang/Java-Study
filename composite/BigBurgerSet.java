package composite;

import lombok.Data;

// BigBurger, Coke, FrenchFried
// �ڹٴ� ���� ���(extends)�� �ȵ�
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
