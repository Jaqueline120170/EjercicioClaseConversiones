package edu.conversionClase;

public class Inicio {

	public static void main(String[] args) {
		// metodo por donde entrará la aplicacion
		
		// int -> Integer
		
		deIntAInteger ();
		
		// Integer -> Int
		deIntegerAInt ();

	}
	
	public static void deIntegerAInt () {
		
		int enteroPrimitivo = 9;
		Integer enteroObjeto = 8;
		
		enteroPrimitivo = enteroObjeto; 
	    enteroPrimitivo = (int) enteroObjeto ;
	    enteroPrimitivo = enteroObjeto.intValue();
	    
	    
		
	}
	
	// creamos un nuevo metodo que no nos va a devolver nada, se añade el static porque no espera muccho, entonces espera que se cargue y que este lo mas cerca posible
	public  static void deIntAInteger () {
		
		int enteroPrimitivo = 9;
		Integer enteroObjeto = 8;
		
		System.out.println ("valor enteroPrimitivo" +enteroPrimitivo);
		System.out.println ("valor enteroObjeto" +enteroObjeto);
		
		enteroObjeto = enteroPrimitivo;
		System.out.println("enteroObjeto: " + enteroObjeto);
		enteroPrimitivo = 7; 
		enteroObjeto = (Integer) enteroPrimitivo;
		System.out.println ("enteroObjeto:" + enteroObjeto);
		enteroPrimitivo = 6;
		enteroObjeto = Integer.valueOf(enteroPrimitivo);
		System.out.println ("enteroObeto" + enteroObjeto);
		
		///Son ter metodos distintos que llevan al mismo sitio  llevar de int a integer
	}

}
