/* Verificando se um numero é binario ou não, caso seja e feita a conversão para a base decimal.*/
import java.util.Scanner; 
public class DesafioDio {
   public static void main(String [] args) {
      int valorBinario, bit1, bit2, bit3, bit4, valorDecimal;
      Scanner scan = new Scanner (System.in);
      System.out.print("Digete um numero inteiro de até 4 digitos. ");
      valorBinario = scan.nextInt();
      if (valorBinario > 9999 || valorBinario < 0 ) {
         System.out.println("Numero com mais de 4 digitos ou negativo.");
      }
      else {
      //desmenbrando o numero
         bit1 = valorBinario%10; 
         valorBinario = valorBinario/10;
         bit2 = valorBinario%10; 
         valorBinario = valorBinario/10;
         bit3 = valorBinario%10; 
         valorBinario = valorBinario/10;
         bit4 = valorBinario%10; 
         valorBinario = valorBinario/10;
         if ((bit1 != 1 && bit1 != 0) || (bit2 != 1 && bit2 != 0) || (bit3 != 1 && bit3 != 0) || (bit4 != 1 && bit4 != 0)) {
         System.out.println("Esse numero não pertece a um valor binário.");
         }
         else {
         System.out.println("Esse numero é um valor binário.");
          //transformando para decimal
         valorDecimal = (int) (bit1*Math.pow(2,0) + bit2*Math.pow(2,1) +  bit3*Math.pow(2,2) + bit4*Math.pow(2,3));
         System.out.println("Esse valor binário transformado em decimal é: " + valorDecimal);
         }
         
      }
   }
} 