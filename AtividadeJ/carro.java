package AtividadeJ;

    //criando a classe carro
public class carro {
    //atributos da clsse
    public String placa;
    public String modelo;
    //um carro em teoria sempre tem 4 rodas então o numero de rodas não pressisa ser alterado ficando estatico
    public static int numderodas = 4;
    
    //Construtor que exige que as instancias de carro tenham placas se tiverem são verdadeiras
    public carro (String plac){
        this.placa = plac;
    }
}
