package parking.lot.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import parking.lot.constanta.ConstantaParkigLot;
import parking.lot.interfaces.InterfaceParkingLot;

public class ImplParkingLot implements InterfaceParkingLot{

	@Override
	public String createParkingLot(int slot) {
		// TODO Auto-generated method stub
		ConstantaParkigLot.parkingLotSlot = new String[slot];
		return "Created a parking lot with "+slot+" slots";
	}

	@Override
	public String park(String numberPlate, String color) {
		// TODO Auto-generated method stub
		List<String> listNumberPlatColor = Arrays.asList(ConstantaParkigLot.parkingLotSlot);
		int availableSlot =  listNumberPlatColor.indexOf(null);
		if(availableSlot >= 0) {
			ConstantaParkigLot.parkingLotSlot [availableSlot] = numberPlate.concat(",").concat(color);
			return "Allocated slot number: ".concat(String.valueOf(availableSlot+1));
		}
		
		
		
		
		//asdba
		return "Sorry, parking lot is full kontol";
		
	}
		
	}

	@Override
	public String leave(int slotNumber) {
		// TODO Auto-generated method stub
		ConstantaParkigLot.parkingLotSlot [slotNumber-1] = null;
		return "Slot number ".concat(String.valueOf(slotNumber).concat(" is free"));
	}

	@Override
	public String status() {
		// TODO Auto-generated method stub
		String data = "Slot No.\tRegistration No\tColour\n";
		if(ConstantaParkigLot.parkingLotSlot != null) {
			for (int i = 0; i < ConstantaParkigLot.parkingLotSlot.length; i++) {
				if(ConstantaParkigLot.parkingLotSlot [i] != null) {
					String splitData [] = ConstantaParkigLot.parkingLotSlot [i] .split(",");
					data=data.concat(String.valueOf(i+1).concat("\t\t").concat(splitData[0]).concat("\t\t").concat(splitData[1]).concat("\n"));
				}
			}
		}
		return data;
	}

	@Override
	public String registrationNumbersForCarsWithColour(String color) {
		List<String> resultList = Arrays.asList(ConstantaParkigLot.parkingLotSlot)
				.stream().filter(slots -> String.valueOf(slots).contains(color)).collect(Collectors.toList());
		String result = "";
		// TODO Auto-generated method stub
		for (int i = 0; i < resultList.size(); i++) {
			result = result.concat(resultList.get(i).split(",")[0]).concat(", ");
		}
		
		if(result == "") {
			return "Not found";
		}
		
		return result.trim().substring(0, result.length()-2);
	}

	@Override
	public String slotNumbersForCarsWithColour(String color) {
		// TODO Auto-generated method stub
		String result = "";
		for (int i = 0; i < ConstantaParkigLot.parkingLotSlot.length; i++) {
			if(ConstantaParkigLot.parkingLotSlot[i] != null) {
				if(ConstantaParkigLot.parkingLotSlot[i].contains(color)) {
					result = result.concat(String.valueOf(i+1).concat(", "));
				}
			}
			
		}
		if(result == "") {
			return "Not found";
		}
		
		return result.trim().substring(0, result.length()-2);
		 
	}

	@Override
	public String sloNumberForRegistrationNumber(String numberPlate) {
		// TODO Auto-generated method stub
		String result = "";
		for (int i = 0; i < ConstantaParkigLot.parkingLotSlot.length; i++) {
			if(ConstantaParkigLot.parkingLotSlot[i] != null) {
				if(ConstantaParkigLot.parkingLotSlot[i].contains(numberPlate)) {
					result = result.concat(String.valueOf(i+1)).concat(", ");
				}
			}
			
		}
		if(result == "") {
			return "Not found";
		}
		
		return result.trim().substring(0, result.length()-2);
	}

}
