package parking.lot.process;

import parking.lot.constanta.ConstantaParkigLot;
import parking.lot.impl.ImplParkingLot;

public class ProcessParkingLot {
	public void execute(String instruction) {
		String instructionAndParameter[] = instruction.split(" ");

		switch (instructionAndParameter[0]) {
		case ConstantaParkigLot.create_parking_lot:
			System.out.println(new ImplParkingLot().createParkingLot(Integer.parseInt(instructionAndParameter[1])));
			break;
		case ConstantaParkigLot.leave:
			System.out.println(new ImplParkingLot().leave(Integer.parseInt(instructionAndParameter[1])));
			break;
		case ConstantaParkigLot.park:
			System.out.println(new ImplParkingLot().park(instructionAndParameter[1], instructionAndParameter[2]));
			break;
		case ConstantaParkigLot.registration_numbers_for_cars_with_colour:
			System.out.println(new ImplParkingLot().registrationNumbersForCarsWithColour(instructionAndParameter[1]));
			break;
		case ConstantaParkigLot.slot_number_for_registration_number:
			System.out.println(new ImplParkingLot().sloNumberForRegistrationNumber(instructionAndParameter[1]));
			break;
		case ConstantaParkigLot.slot_numbers_for_cars_with_colour:
			System.out.println(new ImplParkingLot().slotNumbersForCarsWithColour(instructionAndParameter[1]));
			break;
		case ConstantaParkigLot.status:
			System.out.println(new ImplParkingLot().status());
			break;

		default:
			break;
		}
	}
}
