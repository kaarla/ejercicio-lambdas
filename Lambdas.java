public class Lambdas {
	interface OperacionInt{
		int operacion(int a);
	}

	private static int[] mapeaOperacion(int[] arreglo, OperacionInt op) {
		int[] nuevoArreglo = new int[arreglo.length];
		for(int i = 0; i < arreglo.length; i++) {
			nuevoArreglo[i] = op.operacion(arreglo[i]);
		}
		return nuevoArreglo;
	}

	private static void imprimeArreglo(int[] arreglo) {
		System.out.print("[");
		int i = 0;
		while(i < arreglo.length - 1) {
			System.out.print(arreglo[i] + ", ");
			i++;
		}
		System.out.println(arreglo[i] + "]");
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
	}
}
