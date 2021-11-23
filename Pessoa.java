
public class Pessoa  {
    protected String nome;
    protected String nomeMeio;
    protected String ultimoNome;
    protected int cadastro;
    
    public Pessoa(int cadastro){
        this.cadastro = cadastro;
    }
    
    public String Situacao(){
        return "Nome: " + nome + "\n" +
               "Número de cadastro: " + cadastro;
    }

    public void setNome(String nome) {
        if(nome == null || nome.length() < 2){
            throw new NomeException(nome);
        }
        this.nome = nome.substring(0, nome.indexOf(" "));
        this.nomeMeio = nome.substring(nome.indexOf(" ")+1, nome.lastIndexOf(" "));        
        this.ultimoNome = nome.substring(nome.lastIndexOf(" "), nome.length());
    }
   
    
}
