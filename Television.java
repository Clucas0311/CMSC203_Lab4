/** 
 * The purpose of this class is to model a television
*Charles Lucas and February 14, 2020 

 * @author Charles
 *
 */
		public class Television
		{
		private final String Manufacturer; //The manufacturer attribute will hold the brand name
		private final int Screen_Size; // The screenSize attribute will hold the size of the television screen
		private boolean powerOn; // The powerOn attribute will hold the value true if the power is on, and false if the power is off.
		private int channel; // The channel attribute will hold the value of the station that the television is showing
		private int volume; //The volume attribute will hold a number value representing the loudness (0 being no sound).

	/*
	 * The purpose of this constructor is to create two parameters that will bring information, assign values to 
	 */
		public Television(String manufactuer_brand, int screen_size) 
		{
		Manufacturer = manufactuer_brand;
		Screen_Size = screen_size; 
		powerOn = false; 
		volume = 20;
		channel = 2; 
		
		}
	/* Define a mutator method called setChannel accepts a value to be stored in the
	channel field.*/
		public void setChannel(int station) {
		channel = station; 
		

		}
	// Define a mutator method called power that changes the state from true to false or from false to true. 

		public void power() {
			powerOn = !powerOn;
		}
		// One mutator to increase the volume 
		public void increaseVolume()
		{
			volume ++; 
		}
		//The other method should be called decreaseVolume and will decrease the volume by 1.

		public void decreaseVolume()
		{
			volume --; 
		}
		//Define accessor methods called getVolume, getChannel, getManufacturer, and getScreenSize that return the value of the corresponding field.

		public  int getChannel()
		{
			return channel; 
		}
		public int getVolume()
		{
			return volume; 
		}
		
		public String getManufacturer()
		{
			return Manufacturer; 
		
		}
		
		public int getScreenSize()
		{
			return Screen_Size; 
		}
		
		
}
