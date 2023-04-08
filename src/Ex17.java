import java.util.Scanner;
import java.lang.Math;

public class Ex17 {
    public static void main(String[] args) throws Exception {
       int area;
       double litros,latas,preco_lata,galao,preco_galao;
       double litros_mix,mix_latas,mix_galao,valor_mix; 
    Scanner reader = new Scanner(System.in);   
       System.out.print("Digite em metros quadrados o tamanho da área a ser pintada: ");
            area = reader.nextInt();
            reader.close();
            
            litros = (area / 6);
            latas = Math.ceil(litros / 18);
            preco_lata = latas * 80.00;
            galao = Math.ceil(litros / 3.6);
            preco_galao = galao * 25;

            litros_mix = (area / 6) * 1.1;
            mix_latas = Math.ceil(litros_mix / 18);
            mix_galao = Math.ceil((litros_mix - mix_latas * 18) / 3.6);

            if ((litros_mix - (mix_latas * 18) % 3.6 != 0)) {
                mix_galao += 1;
            }
            valor_mix = (mix_latas * 80) + (mix_galao * 25);



      /*A*/ System.out.println("A.  Você terá que comprar " + latas + " latas de tinta!");
            System.out.println("    E o valor ficará R$ " + preco_lata);

      /*B*/ System.out.println("B.  Você terá que comprar " + galao + " galões de 3,6 litros!");
            System.out.println("    E o valor ficará R$ " + preco_galao);

      /*C*/ System.out.println("C.  Você terá que misturar " + mix_latas + " latas e " + mix_galao + " galões");
            System.out.println("    E o valor ficará R$ " + valor_mix);     
    
     
    }
}
