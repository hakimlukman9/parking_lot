package parking.lot.interfaces;

public interface InterfaceParkingLot {
	public String createParkingLot(int slot);
	public String park(String numberPlate, String color);
	public String leave(int slotNumber);
	public String status();
	public String registrationNumbersForCarsWithColour (String color);
	public String slotNumbersForCarsWithColour (String color);
	public String sloNumberForRegistrationNumber(String numberPlate);
}
