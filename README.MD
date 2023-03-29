Desenvolvido por Israel Goularte 12021BSI260

---

Problemas resolvidos por essa aplicação: 

    1 -> Escreva um programa Java que lê todos os arquivos .TXT de uma pasta e imprime o somatório total do número de linhas dos arquivos. O programa deve criar uma thread por arquivo e usar essas threads para contar as linhas em todos os arquivos ao mesmo tempo. Use java.io.LineNumberReader para lhe ajudar a contar as linhas. Você provavelmente vai querer definir uma classe LineCounter que herda de Thread ou implementa Runnable.
        Solução:
            Dentro do diretorio solucoes\usandoThread\ possui o arquivo que extend Thread UsandoThread.java
            A main (Main.java) utliza esta classe basta selecionar a opção no menu inicial.

    2 -> Implemente o mesmo programa com Thread Pools (ExecutorServices). Dica: Veja os exemplos de código na pasta de Exemplos da equipe no Teams.
        Solução:
            A main faz uso do executor na opcao 2;

    3 -> Depois, escreva uma variante do seu programa que usa sua classe LineCounter para ler arquivos sequencialmente, sem o uso de threads. Compare a performance dos programas, usando System.currentTimeMills() para determinar o tempo gasto na execução. Compare a performance para 10, 100, 1000 arquivos e escreva suas conclusões (como comentários no código). Liste também as specs da máquina que você usou!
        Solução:
            Dentro do diretorio solucoes\semThread\ possui o arquivo não extend Thread SemUsarThread
            A main (Main.java) vai acionar os dois modelos usando Threads e não utilizando e trazer o tempo de execução de cada um.

    Ao final deste arquivo, notas sobre execução do problema 3 (menu inicial opção 3) e especificações do computador utilizado para teste.

---

Instruções de uso:

    Executar: 
        Basta compilar ou executar arquivo Main.java.

    Pasta com dados:
        O diretorio \dados contendo os arquivos a serem lidos com nome (arq1, arq2 .... arq1000).txt deve estar localizado no mesmo diretorio para que funcione.
        Caso queria adicionar novos arquivos basta usar a classe CriarArquivos.java que estar no diretorio \complementar
            Esta classe possui um metodo static com os paramentros 
                String diretorio (deve ser fornecido o direto onde vai ser criado os arquivos),
                String nome (um nome padrão para os arquivos no caso desta aplicação deve ser "arq"),
                String extencao (formato do arquivo para esta aplicação utilize ".txt"),
                Integer Qtd ( Quantidade de arquivos que deseja criar);
            Caso ja possui arquivos com os mesmo nomes no diretorio eles serão reescritos.
            Tambem sera necessario fazer o importe da classe.
            No arquivo Main.java o import esta comentado linha(8) e a utilização desse metodo esta comentado tambem dentro da Main linha(24)

---

NOTAS DE EXECUÇÃO:
    Tempos de execução:
        Quantidade de arquivos: 10
        Tempo de execução em millis sem usar Threads: 16
        Tempo de execução em millis usando Threads: 47

        Quantidade de arquivos: 100
        Tempo de execução em millis sem usar Threads: 48
        Tempo de execução em millis usando Threads: 374

        Quantidade de arquivos: 1000
        Tempo de execução em millis sem usar Threads: 384
        Tempo de execução em millis usando Threads: 31759

ESPECIFICAÇÕES DO COMPUTADOR DE TESTE
    Computador: i5 10º Geração 8gb Ram 3200 GTX 1650 4gb SSD NVME

