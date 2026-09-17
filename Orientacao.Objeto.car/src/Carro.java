import dominio.Classe_carro;
public class Carro {
    public static void main(String[] args){
    Classe_carro classecarro = new Classe_carro();
    classecarro.nome = "Mustang";
    classecarro.modelo = "HB20";
    classecarro.ano = 1788;
    
    Classe_carro classecarro2 = new Classe_carro();
    classecarro2.nome = "Renault";
    classecarro2.modelo = "Sandero";
    classecarro2.ano = 2077;

    System.out.println("Nome: "+classecarro.nome+"Modelo: "+classecarro.modelo+"Ano: "+classecarro.ano);
    System.out.println("\n______________________________________________");
    System.out.println("Nome: "+classecarro2.nome+" Modelo: "+classecarro2.modelo+"Ano: "+classecarro2.ano);
    }
}
