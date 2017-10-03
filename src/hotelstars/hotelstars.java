package hotelstars;

import javax.swing.JOptionPane;

public class hotelstars {
	public static void main (String [] args) {
		int hiltonGardenInn= 235;
		int marriotResidenceInn = 200;
		int thePlaza = 1300; 
		String stars1= " ";
		String stars2= " ";
		String stars3= " ";
		
		// hilton Garden Inn // 
		for (int i= 0; i < hiltonGardenInn/ 50; i++) {
				stars1= stars1+ "*";
		}
		//marriot residence inn // 
		for (int i= 0; i < marriotResidenceInn/ 50; i++) {
		stars2 = stars2 + "*";
		}
		// thePlaza // 
		for (int i= 0; i < thePlaza / 50; i++) {
			stars3 = stars3 + "*";
		}
		JOptionPane.showMessageDialog (null, "Hilton Garden Inn:" + stars1 + "\n" + "Marriot Residence Inn:" + stars2 + "\n" + "The Plaza:" + stars3 );
		
	}
}
