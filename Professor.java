
public class Professor extends Pessoa{

    public Professor(int cadastro) {
        super(cadastro);
    }
    
 
    @Override
    public String Situacao(){
        StringBuilder nomeCompleto = new StringBuilder(50);
        nomeCompleto.append(nome + " " + nomeMeio + " " + ultimoNome);
        return "Nome completo: " + nomeCompleto + "\n" +
                "Número de cadastro: " + cadastro + "\n" ;
              
    }    
}
