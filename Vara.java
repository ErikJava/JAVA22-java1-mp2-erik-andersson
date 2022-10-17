package grocerystore;

class Vara {

	private String name;
	private int cost;
	private int stock;

	Vara(String name, int cost, int stock) {
		this.name = name;
		this.cost = cost;
		this.stock = stock;

	}

	String getName() {
		return name;
	}

	int getCost() {
		return cost;
	}

	int getStock() {
		return stock;
	}

	void setProductStock() {
		stock--;
		if (stock == -1) {
			stock = 0;

		}
	}

}
