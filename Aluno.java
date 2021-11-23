public class Aluno extends Pessoa{
    private double notaAV1;
    private double notaAV2;

    public String nomeProf;
    public String nomeMeioProf;
    public String ultimoNomeProf;
    
    public Aluno(int cadastro) {
        super(cadastro);
    }
    
    
    public double consultarMedia(){
        double media = (notaAV1 + notaAV2) / 2;
        return media;
    }

    @Override
    public void setNome(String nome) {
        if(nome == null || nome.length() < 3){
            throw new NomeException(nome);
        }       
        
        String todosNomes[] = nome.split(" ");
        this.nome = todosNomes[0];      
        int ultimo = todosNomes.length;
        String meio = "";
        if(ultimo > 3){
          for(int i = 1; i < ultimo-1; i++){
              meio += todosNomes[i] + " ";
          }
          this.nomeMeio = meio;
          this.ultimoNome = todosNomes[ultimo-1];
        }else{
        this.nomeMeio = todosNomes[1];
        this.ultimoNome = todosNomes[ultimo-1];
        }
    }
    
    
   
    @Override
    public String Situacao(){
        StringBuilder nomeCompleto = new StringBuilder(50);
        nomeCompleto.append(nome + " " + nomeMeio + " " + ultimoNome);
        
        StringBuilder nomeCompleto2 = new StringBuilder(50);
        nomeCompleto2.append(nomeProf + " " + nomeMeioProf + " " + ultimoNomeProf);
        
        return "Nome completo: " + nomeCompleto + "\n" +
               "Número de cadastro: " + cadastro + "\n" +
               "Nota AV1: " + notaAV1 + "\n" +
               "Nota AV2: " + notaAV2 + "\n" +
               "Média: " + consultarMedia()+ "\n" +
               "Professor:" + nomeCompleto2;
    }
    
    public double getNotaAV1() {
        return notaAV1;
    }

    public double getNotaAV2() {
        return notaAV2;
    }

    public void setNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public void setNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }
    public void setNomeProf(String nome) {
        if(nome == null || nome.length() < 3){
            throw new NomeException(nome);
        }
        this.nomeProf = nome.substring(0, nome.indexOf(" "));
        this.nomeMeioProf = nome.substring(nome.indexOf(" ")+1, nome.lastIndexOf(" "));        
        this.ultimoNomeProf = nome.substring(nome.lastIndexOf(" "), nome.length());
        
    }
    
}
