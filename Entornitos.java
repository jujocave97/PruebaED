public class Entornitos{
	public static void main(String [] args) {
		System.out.println("Aqui me hayo haciendo esto");
		
		for (int i=20;i<0 ;i-- ) {
			System.out.println(i);
			System.out.println("Juan");
		}

		int juan=0;
		do{
			System.out.println("paco pepe");
			juan++;
		}while (juan<300) ;
			
		List<Integer> vector=new Vector<>();
        Random rand=new Random();
        int numGanador= rand.nextInt(20)+1;
        int aciertos=0, suma=0;

        for(int i=0; i<100; i++){
            vector.add(rand.nextInt(20)+1);
        }

        Iterator i=vector.iterator();

        for(int j=1; i.hasNext(); j++){
            int nActual=(int) i.next();
            if(nActual==numGanador) {
                System.out.printf("    \u001B[35m%3d", nActual);
                aciertos++;
            }
            else
                System.out.printf("    \u001B[37m%3d",nActual);
            if(j%10==0)
                System.out.println();
            suma+=nActual;
        }
        System.out.println("La suma total es de: "+suma);
        System.out.println("El total de aciertos es: "+aciertos);
	}
}