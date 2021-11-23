class NomeException extends RuntimeException{
    private String nome;
    private String nomeProf;
    
    public NomeException(String nome){
        this.nome = nome;
        this.nome = nomeProf;
    }
    
    @Override
    public String getMessage(){
        return "Nome [" + nome + "] incompleto!";
    }
}
