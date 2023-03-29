package solucoes.usandoThreads;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsandoThread extends Thread{
    private String diretorio;
    private String formato_do_Arquivo;
    private Integer qtdLinhas; //armazena a contagem a Main
    private String arquivo; //Nome do arquivo
    private Long tempoDeExecucao; //armazena o tempo de execução



    public UsandoThread(String diretorio, String formato_do_Arquivo,String arquivo) {
        this.diretorio = diretorio;
        this.formato_do_Arquivo = formato_do_Arquivo;
        this.qtdLinhas = 0;
        this.arquivo = arquivo;
    }

    public Long getTempoDeExecucao()
    {
        return tempoDeExecucao;
    }

    public void run(){ // inicializa a threads
        Contar_as_Linhas();
    }

    public int getQtdLinhas(){
        return this.qtdLinhas;
    }

    public void Contar_as_Linhas(){//metodo para contar as linhas
        Long inicio =  System.currentTimeMillis();
        try{
            FileReader ent = new FileReader (this.diretorio+this.arquivo+this.formato_do_Arquivo);
        BufferedReader br = new BufferedReader (ent);
        while ((br.readLine()) != null )
            this.qtdLinhas++;
        br.close();
        System.out.println("Quantidade de linhas do arquivo: "+ this.arquivo+ " e: "+this.qtdLinhas);
        }catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        tempoDeExecucao = System.currentTimeMillis()-inicio;
    } 

    
}
