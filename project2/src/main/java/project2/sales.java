package project2;

public class sales {
	public static boolean checkProduct(int number) {
		if (number >= 10001 && number <= 99999) {
		return true;
		} else {
		return false;
		}

		}
		public String getAmount(String size) {
		if(size.equals("S")) {
		return "30$";
		}



		else if(size.equals("M")) {



		return "50$";



		}



		else {



		return "80$";



		}

		}
		}


