package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vehicle 
{
         private String number;
         private String name;
         private int model;
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getModel() {
			return model;
		}
		public void setModel(int model) {
			this.model = model;
		}
		@Override
		public String toString() {
			return "Vehicle [number=" + number + ", name=" + name + ", model=" + model + "]";
		}
		public Vehicle(String number, String name, int model) {
			super();
			this.number = number;
			this.name = name;
			this.model = model;
		}
		public Vehicle() {
			super();
			// TODO Auto-generated constructor stub
		}
         @PostConstruct
		public void start()
		{
			System.out.println("this is start method using annotations");
		}
         @PreDestroy
        public void end()
        {
        	System.out.println("this is end method using annotations");
        }
}
