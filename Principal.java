public class Principal {
    public static void main(String args[]){

    Novo novo=new Novo();

    Velho velho=new Velho();

    novo.setEndereco("Rua José Bonifácio 1185");
    novo.setPreco(350000);
    novo.setAdicionalPreco(0.2*novo.getPreco());
    System.out.println("Preço do Imóvel novo: "+(novo.getPreco()+novo.getAdicionalPreco()));


    velho.setEndereco("Rua Nascimen Mussi 502");
    velho.setPreco(500000);
    velho.setDescontoPreco(0.1*velho.getPreco());
    System.out.println("Preço do Imóvel velho "+(velho.getPreco()-velho.getDescontoPreco()));

   

   

    }



   

}