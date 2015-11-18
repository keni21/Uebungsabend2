
public class GrenzwertReihe {

	public static void main(String[] args) {
		
	

    	double genauigkeit = 0.000001;
		System.out.println(schritt1(genauigkeit));
	

	}
	
	private static double schritt1(double genau)
	{
		double aWert=0;
		double vWert=0;
		
		for(int i=1;;i*=2)
		{	
			aWert+=1.0/i;
			if(aWert-vWert<genau)
			{
				break;
			}
			vWert=aWert;		
		}
		return aWert;
	}
}
	