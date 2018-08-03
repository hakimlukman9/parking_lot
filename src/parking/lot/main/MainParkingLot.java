package parking.lot.main;

import java.util.Scanner;

import parking.lot.process.ProcessParkingLot;

public class MainParkingLot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ProcessParkingLot ppl = new ProcessParkingLot();
		String instruction =  scanner.nextLine();
		
		ppl.execute(instruction);
		while(true) {
			instruction =  scanner.nextLine();
			if(instruction.equals("exit")) {
				scanner.close();
				break;
			}else {
				ppl.execute(instruction);
			}
		}
		/*List<String>listInstruction = new ArrayList<String>();
		Collections.addAll(listInstruction
				,"create_parking_lot 6"
				, "park KA-01-HH-1234 White"
				, "park KA-01-HH-9999 White"
				, "park KA-01-BB-0001 Black"
				, "park KA-01-HH-7777 Red"
				, "park KA-01-HH-2701 Blue"
				, "park KA-01-HH-3141 Black"
				, "leave 4"
				, "status"
				, "park KA-01-P-333 White"
				, "park DL-12-AA-9999 White"
				, "registration_numbers_for_cars_with_colour White"
				, "slot_numbers_for_cars_with_colour White"
				, "slot_number_for_registration_number KA-01-HH-3141"
				, "slot_number_for_registration_number MH-04-AY-1111)");	
		for (String instruction : listInstruction) {
			execute(instruction);
		}*/
	}
}	
