package parking.lot.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import parking.lot.process.ProcessParkingLot;

class TestParkingLot {
	private BufferedReader bufferedReader;
	
	@Test
	void test() throws IOException {
		ProcessParkingLot ppl = new ProcessParkingLot();
		File file = new File(System.getProperty("filePath"));

	    bufferedReader = new BufferedReader(new FileReader(file));
		String line = bufferedReader.readLine();
	    while (line != null) {
	        ppl.execute(line);
	        line = new BufferedReader(new FileReader(file)).readLine();
	    }
	}

}
