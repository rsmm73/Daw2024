
/**
 * calculadora 4 4444
 * raull
 */
public class Calculadora {
	
	private double resultado;
        private double a, b;
	
	public Calculadora() {
		resultado = 0;
	}
        
        public Calculadora(double a, double b, double exp) {
		this.a = a;
		this.b = b;
		this.resultado = exp;
        }  
	
	public double suma(double a, double b) {
		resultado = a + b;
		return resultado;
	}

	public double resta(double a, double b) {
		resultado = a - b;
		return resultado;
	}

	
	
	public double suma(double v) {
		resultado += v;
		return resultado;
	}

	public double resta(double v) {
		resultado -= v;
		return resultado;
	}

	public double resultado() {
		return resultado;
	}
	
	public void clear() {
		resultado = 0;
	}

	public void operacionOptima() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Bloque catch generado automáticamente
		}
	}
/*
 * Este es otro ejemplo de la utilidad de timeout: 
	
	public void operacionOptima() {
		for(;;);
	} 
 */

        
        public static void main(String[] args) {
		double a = 3.0, b = 2.0;
                Calculadora cal=new Calculadora();
		double res = cal.suma(a,b);
		System.out.println(a + " + " + b + " = " + res);
	}

	
}
