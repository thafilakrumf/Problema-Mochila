class Main {
  public static void main(String[] args) throws InterruptedException {
	  // for vai testar do 1 at� o 32.
	  // No 32 ele para de funcionar
	  // e mostra o n�mero do tamanho m�ximo da mochila
	  for(int i=1; i<= 32 ; i++){
		  Knapsack knapsack = new Knapsack(i);
		  BruteForceAlgorithm brute = new BruteForceAlgorithm();
		  brute.execute(knapsack);
		  System.out.println("Numero do tamanho maximo da mochila: "+ i);
		  Thread.currentThread().sleep(500);
	  }

  }
}