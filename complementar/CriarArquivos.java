package complementar;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CriarArquivos {
    public static void criar(String diretorio,String nome, String extencao,Integer Qtd) {
        for (int i = 0; i<Qtd;i++) {
            File file = new File(diretorio, nome+i+extencao);
            gerarLinhas(file);
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void gerarLinhas(File file){
        try {
            PrintWriter out = new PrintWriter (file);
            try{
                for (int i = 0; i < (Math.random()*500) ; i++) {
                    
                    out.println("\n");
                }
            }
            catch(NullPointerException e)
            {
                System.out.println("Não possui nenhum registro");
            }
            out.close ();
        } 
        catch ( IOException erro )
        {
            System .out. println (" Erro na escrita dos dados: ");
        }
    }
}
