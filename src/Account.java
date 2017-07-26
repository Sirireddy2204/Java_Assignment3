
public class Account {

	
		void customer(String name, int age){
			System.out.println("customer details="+ 
		name+"  " + age );
		}
		
		void customer(String name, int age, char gender){
			System.out.println("customer details="+ name +" "+ age+" "+ gender );
		}
		public static void main(String[] args) {
			Account act = new Account();
			act.customer("ram", 23);
			act.customer("raj", 23, 'f');
	}

}
