import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import solucoes.semThreads.SemUsarThread;
import solucoes.usandoThreads.UsandoThread;

public class Main{
    public static void main(String[] args){
        //dados
        Scanner scan = new Scanner(System.in);

        String path = new java.io.File("").getAbsolutePath();
        String diretorio = path+"\\dados\\";

        Integer qtdThreads = 1000;//Quantidade de threads que vou criar.
        
        String nomeArquivo = "arq";//por padrão nome dos arquivos TXT

        //CriarArquivos.criar(diretorio, nomeArquivo, ".txt", 1000); //Metodo para criar arquivos.
        
        LinkedList<UsandoThread> minhasthread; 

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(6);
        Boolean acesso = true;

        while(acesso){//inicializando menu

            System.out.println("Escolha uma opção:\n (1) Exercicio 1 | (2) Exercicio 2 \n (3) Exercicio 3 | (Outros) Maquina de Desenvolvimento \n (0) Sair");
            int temp =0;
            try{
                int opcao = scan.nextInt();
                minhasthread = new LinkedList<>();
                switch(opcao){
                    case 1:
                        for(int i =0 ; i<qtdThreads;i++)//iniciando as threads
                        {
                            UsandoThread novaThread = new UsandoThread(diretorio, ".txt", nomeArquivo+(i+1));
                            novaThread.start();
                            minhasthread.add(novaThread);
                        }
                        temp=0;
                        for (UsandoThread ex1 : minhasthread) {//aguarda as threads terminarem
                                ex1.join();
                                temp+=ex1.getQtdLinhas();
                        }
                        System.out.println("Todos os arquivos juntos tem: "+ temp + " linhas!");
                        break;
                    case 2:
                        for(int i =0;i<qtdThreads;i++){ //iniciando o executor
                            UsandoThread novaThread = new UsandoThread(diretorio, ".txt", nomeArquivo+(i+1));
                            executor.execute(novaThread);
                        }
                        executor.awaitTermination(1, TimeUnit.SECONDS);//aguardando 1 segundo para terminar e não sair o menu dentro do executor.
                        break;
                    case 3:
                        System.out.print("Qual a quantidade de Arquivos para serem lidos: ");
                        Integer qtdArquivosEx3 = scan.nextInt();
                        SemUsarThread ex3 = new SemUsarThread(diretorio, ".txt", nomeArquivo, qtdArquivosEx3);//Sem uso de Threads

                        for(int i =0 ; i<qtdArquivosEx3;i++)//iniciando as threads
                        {
                            UsandoThread novaThread = new UsandoThread(diretorio, ".txt", nomeArquivo+(i+1));
                            novaThread.start();
                            minhasthread.add(novaThread);
                        }

                        for (UsandoThread ex1 : minhasthread) {//aguarda as threads terminarem
                            ex1.join();
                        }

                        Long tempoDeExecucaoComThread=0l;


                        for(int i = 0; i< minhasthread.size();i++){//soma o tempo de execução de todas as threads
                            tempoDeExecucaoComThread+=minhasthread.get(i).getTempoDeExecucao();
                        }

                        System.out.println("Tempo de execução em millis sem usar Threads: "+ ex3.contarLinhas());
                        System.out.println("Tempo de execução em millis usando Threads: "+ tempoDeExecucaoComThread);

                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default: 
                        System.out.println("'i5 10º Geração 8gb Ram 3200 GTX 1650 4gb SSD NVME'");
                        break;
                        
                }
            }catch(NumberFormatException e)
            {
                System.out.println("i5 10º Geração 8gb Ram 3200 GTX 1650 4gb SSD NVME");
            }catch(InputMismatchException e)
            {
                System.out.println("i5 10º Geração 8gb Ram 3200 GTX 1650 4gb SSD NVME");
                scan.nextLine();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
        scan.close();
    }
}