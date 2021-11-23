

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        
    Pessoa[] listPessoas = new Pessoa[100];
    int indice = 0;
    int alternativa = 1;
    String opcao;
    int op = 0;
    
    while(alternativa != 3){                        
            try{                                                                      
                opcao = JOptionPane.showInputDialog("[1] Cadastrar aluno\n" + "[2] Consultar situação da sala \n" + "[3] Sair.");
                alternativa = Integer.parseInt(opcao);
                if(alternativa == 1){
                    
                    if(indice < 100){
                        String nome = JOptionPane.showInputDialog("Nome do aluno: ");
                        Aluno aluno = new Aluno(indice);
                        aluno.setNome(nome);
                        listPessoas[indice] = aluno;
                        
                        
                        
                        String opc2 = JOptionPane.showInputDialog("Informe a nota da AV1: ");
                        int nota1 = Integer.parseInt(opc2);
                        aluno.setNotaAV1(nota1);
                        
                        String opc3 = JOptionPane.showInputDialog("Informe a nota da AV2: ");
                        int nota2 = Integer.parseInt(opc3);
                        aluno.setNotaAV2(nota2);
                        
                        String nome2 = JOptionPane.showInputDialog("Nome do professor: ");
                        Professor professor = new Professor(indice);
                        professor.setNome(nome2);
                        aluno.setNomeProf(nome2);
                        listPessoas[indice] = aluno;
                        
                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!\n" + "Seu número de registro é: " + indice);
                        indice++;
                    }else{
                        JOptionPane.showMessageDialog(null, "Não é possível inserir novos dados.\n" + "Número de cadastros máximo alcançado!");
                    }    
                }else if (alternativa == 2){
                    String opc = JOptionPane.showInputDialog("Número de registro: ");
                    int nRegistro = Integer.parseInt(opc);
                    JOptionPane.showMessageDialog(null, listPessoas[nRegistro].Situacao());
                }
            }catch(NumberFormatException excp){
                JOptionPane.showMessageDialog(null, "Informe o indicado!");
            }catch(NomeException excp){
                JOptionPane.showMessageDialog(null, excp.getMessage());
            }finally{
                continue;
         }
    }
    }
}


                            
        
    
 
