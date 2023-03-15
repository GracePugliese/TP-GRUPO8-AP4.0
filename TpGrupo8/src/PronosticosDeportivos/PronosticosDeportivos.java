package PronosticosDeportivos;
 class PronosticosDeportivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resultados ="C:\\archivos\\resultados.txt";
		String pronosticos="C:\\archivos\\pronosticos.txt";
		
		int cantidadLineasResultados =generales.contarLineaEnArchivo(resultados);			
		partido[] arrayPartido = new partido[cantidadLineasResultados];
		System.out.println("Lineas :" + cantidadLineasResultados );
		generales.LeerArchivo(resultados);
		
		int cantidadLineasPronostico =generales.contarLineaEnArchivo(pronosticos);			
		pronostico[] arrayPronostico = new pronostico[cantidadLineasPronostico];
		System.out.println("Lineas :" + cantidadLineasPronostico );
		generales.LeerArchivo(pronosticos);
	
	}
	
}
