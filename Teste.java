public class Teste
{
    public static void main(String[] args){
         CarrinhoCompras c1 = new CarrinhoCompras();
         CarrinhoCompras c2 = new CarrinhoCompras();
         
         c1.nomeProduto = "cadeira";
         c1.quantidade = 1;
         c1.valorProduto = 100.5;
         
         c2.nomeProduto = "computador";
         c2.quantidade = 10;
         c2.valorProduto = 100.5;
         
         
         System.out.println(c2.nomeProduto + " - " + c1.valorProduto);
         
    }
}
