package cafe;

public class CarShop {

	Car SUV;
	Car Sedan;

	public CarShop(Car SUV, Car Sedan) {
		this.SUV = SUV;
		this.Sedan = Sedan;
	}

	public int orderCar(int option, int quantity) {
		if (option == 1) {
			System.out.println(this.SUV.modelType);
			return this.SUV.price * quantity;
		}
		System.out.println(this.Sedan.modelType);
		return this.Sedan.price * quantity;
	}

	public static void main(String[] args) {
		Car santafe = new Car("MX5", 4000);
		Car sonata = new Car("DN8", 2500);

		CarShop carshop = new CarShop(santafe, sonata);

		int totalPrice = carshop.orderCar(1, 3);
		System.out.println("최종금액: " + totalPrice);
	}
}
