
public class HellTriangle {
 public static void main(String[]args) {
	
	 int[][] triangle = {{5},{1,3},{2,4,12},{13,20,5,6}};
 
     int soma ;
     int somax = 0 ;
     int somay = 0 ;
     
     int soma1 = 0;
     int soma2 = 0;
     
     int total = 0;
     
     int maior1= 0;
     int maior2 = 0;
     int maior3 = 0;
                 
     
     //COMPARA��O DA ULTIMA LINHA PARA PEGAR O MAIOR VALOR, JA QUE NO CASO O VALOR DA POSI��O [2][0] S� PODER� SOMAR COM [3][0] OU [3][1]
     // O VALOR DA POSI��O[2][1] SOMAR� COM O [3][1] OU [3][2] E O [2][2] SOMAR� COM O [3][2] OU [3][3]
     if(triangle[3][0]>triangle[3][1]) {
    	 maior1 = triangle[3][0];
     }else {maior1=triangle[3][1];};
     
     if(triangle[3][1]>triangle[3][2]) {
    	 maior2 = triangle[3][1];
     }else {maior2=triangle[3][2];};
     
     if(triangle[3][3]>triangle[3][2]) {
    	 maior3 = triangle[3][3];
     }else {maior3=triangle[3][2];};
     
     
    
      //Soma o primeiro numero do tri�ngulo  
     if (triangle[0][0] > 0) {
    	 soma = triangle[0][0];
     
    // Como s�o apenas dois n�meros na segunda linha, compara e soma o maior ao total	 
     if (triangle[1][0] > triangle[1][1]) {
    	 soma = soma + triangle[1][0];
    	 somax = soma + triangle[2][0];
    	 somay = soma + triangle[2][1];
    	 
    	
    	 //Soma o valor total das tr�s primeiras linhas com o maior valor da �ltima linha, o resultado ser� o total m�ximo.
    	 if(somax + maior1 > somay + maior2) 
    	 {
    		 total = somax + maior1;
    		 System.out.println("O Valor M�ximo Total �: "+total);
    	 }
    	 else
    		 {
    			 total = somay + maior2;
    			 System.out.println("O Valor M�ximo Total �: "+total);
    		 }
    
     }
          
     if (triangle[1][1] > triangle[1][0]){ 
    	 soma = soma + triangle[1][1]; 
    	 soma1 = soma + triangle[2][1];
    	 soma2 = soma + triangle[2][2];
 
    	 
    	
    	 if(soma1 + maior2 > soma2 + maior3) 
    	 {
    		 total = soma1 + maior2;
    		 System.out.println("O Valor M�ximo Total �: "+total);
    	 }
    	 else
    		 {
    			 total = soma2 + maior3;
    			 System.out.println("O Valor M�ximo Total �: "+total);
    		 }
    	 
    	 			}
         
 		  
      // IMPRIME O TRI�NGULO
     
     }
     System.out.println("\nHELL TRIANGLE - CHALLENGE:\n"); 
     System.out.println("      "+triangle[0][0]);
     System.out.print("   "+triangle[1][0]+"     ");  System.out.println(triangle[1][1]); 
     System.out.print(triangle[2][0]+"      "); System.out.print(triangle[2][1]+"     ");
     System.out.println(triangle[2][2]);
     System.out.print(triangle[3][0]+"  "); System.out.print(triangle[3][1]+"    "); 
     System.out.print(triangle[3][2]+"     "); System.out.println(triangle[3][3]);
     
       	  }
  
}
