package grocerystore;

class VaraRabatt extends Vara {

	private double discount;

	VaraRabatt(String name, int cost, int stock, double discount) {
		super(name, cost, stock);
		this.discount = discount;
	}

	double getDiscount() {
		return getCost() - (getCost() * discount);

	}

}
