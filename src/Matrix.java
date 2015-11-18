
public class Matrix {

	public static void main(String[] args) 
	{
		double [][] idMat4= generateIdentityMatrix(4);
		
		printMatrix(idMat4);
		
		double [][] idMat12= generateIdentityMatrix(12);
		
		printMatrix(idMat12);

	}
	// MAtrix wird mit lauter 0 gebaut
	public static void printMatrix(double[][]marix)
	{
		for (int i=0;i<marix.length;i++)
		{
			for(int n=0;n<marix.length;n++)
			{
				System.out.print(marix[i][n]+"\t");
			}
			System.out.println();
		}
	}
	// Matrix wird bei wert z und s == um 1 erhöht
	public static double[][]generateIdentityMatrix(int size){
		double[][] idMat=new double[size][size];
		/*
		for(int z=0;z<size;z++){
			for(int s=0;s<size;s++)
			{
				if(z==s)
				{
					idMat[z][s]=1;
				}
			}*/
		for (int z=0;z<size;z++)
		{
			idMat[z][z]=1.0;
		}
		return idMat;
		
	}
}
