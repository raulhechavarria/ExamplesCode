package java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.print.DocFlavor.STRING;

public class test1 {

	

	public Double met1(List<Double> array) {
		for (int i = 0; i < array.size(); i++) {
			array.get(i);
		}

		for (Iterator<Double> iterator = array.iterator(); iterator.hasNext();) {
			Double double1 = (Double) iterator.next();

		}
		return null;
	}

	public Double met(Double[] doubles) {
		
		
		
		Double sum = 0D;
		try {
			for (int i = 0; i < doubles.length; i++) {
				sum += doubles[i];
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return sum;
	}
	

}
