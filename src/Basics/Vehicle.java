package Basics;

public class Vehicle {		
		//required parameters
		private String model;
		private String color;
		
		//optional parameters
		private boolean isAutoLockEnabled;
		private boolean isWifiEnabled;
		

		public String getModel() {
			return model;
		}

		public String getColor() {
			return color;
		}

		public boolean isAutoLockEnabled() {
			return isAutoLockEnabled;
		}

		public boolean isWifiEnabled() {
			return isWifiEnabled;
		}
		
		private Vehicle(VehicleBuilder builder) {
			this.model=builder.model;
			this.color=builder.color;
			this.isAutoLockEnabled=builder.isAutoLockEnabled;
			this.isWifiEnabled=builder.isWifiEnabled;
		}
		
		//Builder Class
		public static class VehicleBuilder{

			// required parameters
			private String model;
			private String color;

			// optional parameters
			private boolean isAutoLockEnabled;
			private boolean isWifiEnabled;
			
			public VehicleBuilder(String model, String color){
				this.model=model;
				this.color=color;
			}

			public VehicleBuilder setAutoLockEnabled(boolean isAutoLockEnabled) {
				this.isAutoLockEnabled = isAutoLockEnabled;
				return this;
			}

			public VehicleBuilder setWifiEnabled(boolean isWifiEnabled) {
				this.isWifiEnabled = isWifiEnabled;
				return this;
			}
			
			public Vehicle build(){
				return new Vehicle(this);
			}

		}

	}
