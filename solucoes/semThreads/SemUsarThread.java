package solucoes.semThreads;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SemUsarThread {
    private String diretorio;
    private String formato_do_Arquivo;
    private String arquivo;
    private Integer qtdArquivo;

    public SemUsarThread(String diretorio, String formato_do_Arquivo, String arquivo, Integer qtdArquivo) {
        this.diretorio = diretorio;
        this.formato_do_Arquivo = formato_do_Arquivo;
        this.arquivo = arquivo;
        this.qtdArquivo = qtdArquivo;
    }

    public String getDiretorio() {
        return this.diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }

    public String getFormato_do_Arquivo() {
        return this.formato_do_Arquivo;
    }

    public void setFormato_do_Arquivo(String formato_do_Arquivo) {
        this.formato_do_Arquivo = formato_do_Arquivo;
    }

    public String getArquivo() {
        return this.arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public Integer getQtdArquivo() {
        return this.qtdArquivo;
    }

    public void setQtdArquivo(Integer qtdArquivo) {
        this.qtdArquivo = qtdArquivo;
    }

    public Long contarLinhas() {
        Long inicio = System.currentTimeMillis();
        for (int i = 0; i < this.qtdArquivo; i++)
            try {
                int qtdLinhas=0;
                FileReader ent = new FileReader(this.diretorio + this.arquivo+(i+1) + this.formato_do_Arquivo);
                BufferedReader br = new BufferedReader(ent);
                while ((br.readLine()) != null)
                    qtdLinhas++;
                br.close();
                System.out.println("Quantidade de linhas do arquivo: " + this.arquivo + " e: " + qtdLinhas);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        return System.currentTimeMillis() - inicio;
    }

}
