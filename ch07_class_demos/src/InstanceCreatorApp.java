
public class InstanceCreatorApp {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setId(10);
		System.out.println(car1.toString());
		Car car2 = new Car();
		car2.setId(20);
		System.out.println(car2.toString());
		System.out.println("Num wheels ="+car2.Num_wheels);
		
		Product p1 = new Product();
		p1.setCode("java");
		p1.setDescription("Murach's Java");
		p1.setPrice(57.50);
		
		System.out.println(p1.toString());
		increasePrice(p1);
		System.out.println(p1);
		
		Truck t1 = new Truck(0);
		t1.setId(11);
		System.out.println(t1);

		
	}
	
	
	
		private static void increasePrice(Product p) {
			double price = p.getPrice()*1.1;
			p.setPrice(price);
			
		}

}
