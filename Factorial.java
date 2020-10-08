import java.math.BigInteger;


public class Factorial{
	BigInteger fac;
	public BigInteger calcFactorial(int val){
		fac=new BigInteger("1");	
		for (int i=1;i<=val;i++ ) {
			fac=fac.multiply(BigInteger.valueOf(i));
		}
		return fac;

	}


	
}