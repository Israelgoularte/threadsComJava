Desenvolvido por Israel Goularte

---

Sumario:

    Problemas resolvidos por essa aplicação
    Intruções de uso
    Notas de execução
    Expecificações do Computador de Teste
    Oque e Thread
    Vantagens
    Desvantagens
    Quando usar
    Threads em java.


---

Problemas resolvidos por essa aplicação: 

    1 -> Escreva um programa Java que lê todos os arquivos .TXT de uma pasta
    e imprime o somatório total do número de linhas dos arquivos. O programa
    deve criar uma thread por arquivo e usar essas threads para contar as linhas
    em todos os arquivos ao mesmo tempo. Use java.io.LineNumberReader para 
    lhe ajudar a contar as linhas. Você provavelmente vai querer definir uma 
    classe LineCounter que herda de Thread ou implementa Runnable.
        Solução:
            Dentro do diretorio solucoes\usandoThread\ possui o arquivo que extend
            Thread UsandoThread.java
            A main (Main.java) utliza esta classe basta selecionar a opção no
            menu inicial.

    2 -> Implemente o mesmo programa com Thread Pools (ExecutorServices). 
    Dica: Veja os exemplos de código na pasta de Exemplos da equipe no Teams.
        Solução:
            A main faz uso do executor na opcao 2;

    3 -> Depois, escreva uma variante do seu programa que usa sua classe LineCounter
    para ler arquivos sequencialmente, sem o uso de threads. Compare a performance
    dos programas, usando System.currentTimeMills() para determinar o tempo gasto na
    execução. Compare a performance para 10, 100, 1000 arquivos e escreva suas
    conclusões (como comentários no código). Liste também as specs da máquina que você usou!
        Solução:
            Dentro do diretorio solucoes\semThread\ possui o arquivo não extend Thread
            SemUsarThread
            A main (Main.java) vai acionar os dois modelos usando Threads e não utilizando
            e trazer o tempo de execução de cada um.

    Abaixo neste arquivo, notas sobre execução do problema 3 (menu inicial opção 3)
    e especificações do computador utilizado para teste.

---

Instruções de uso:

    Executar: 
        Basta compilar ou executar arquivo Main.java.

    Pasta com dados:
        O diretorio \dados contendo os arquivos a serem lidos com nome 
        (arq1, arq2 .... arq1000).txt deve estar localizado no mesmo diretorio para
        que funcione.
        Caso queria adicionar novos arquivos basta usar a classe CriarArquivos.java que
        esta no diretorio \complementar
            Esta classe possui um metodo static com os paramentros 
                String diretorio (deve ser fornecido o direto onde vai ser criado 
                os arquivos),
                String nome (um nome padrão para os arquivos no caso desta aplicação 
                deve ser "arq"),
                String extencao (formato do arquivo para esta aplicação utilize ".txt"),
                Integer Qtd ( Quantidade de arquivos que deseja criar);
            Caso ja possui arquivos com os mesmo nomes no diretorio eles serão reescritos.
            Tambem sera necessario fazer o importe da classe.
            No arquivo Main.java o import esta comentado linha(8) e a utilização desse 
            metodo esta comentado tambem dentro da Main linha(24)

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

---

ESPECIFICAÇÕES DO COMPUTADOR DE TESTE:

    Computador: i5 10º Geração 8gb Ram 3200 GTX 1650 4gb SSD NVME

---

Oque e uma Thread:

    Basicamente, Threads são unidades básicas de execução de um programa que podem ser executadas 
    de forma concorrente e independente, definidas por um conjunto de recursos. A execução de 
    várias threads em paralelo pode melhorar a performance do programa e permitir a implementação 
    de programas interativos. No entanto, o uso de threads também pode trazer desvantagens em 
    termos de complexidade, sincronização, overhead e consumo de recursos.

---

Vantagens:

    Paralelismo: permite a execução simultânea de várias tarefas em diferentes
    núcleos do processador ou em diferentes processadores, aumentando a eficiência e reduzindo
    o tempo total de processamento.

    Aproveitamento de recursos: é possível aproveitar melhor os recursos do sistema,
    como memória, processamento e entradas/saídas, permitindo que o programa execute mais
    tarefas em menos tempo.

    Responsividade: pode melhorar a responsividade do programa, permitindo que
    o usuário interaja com a interface do programa enquanto outras tarefas são executadas em 
    segundo plano.

    Modularidade: é possível dividir o programa em módulos menores e independentes, 
    facilitando a manutenção e o desenvolvimento do software.

    Concorrência: permitem que vários processos concorram por recursos do sistema, como 
    memória, processamento e entradas/saídas, tornando a execução do programa mais dinâmica e 
    eficiente.

    Escalabilidade: permite que o programa seja escalado para trabalhar com 
    grandes volumes de dados ou usuários, aumentando a capacidade de processamento e mantendo a 
    performance do sistema.

Em resumo, o uso de threads pode trazer benefícios significativos em termos de paralelismo, 
aproveitamento de recursos, responsividade, modularidade, concorrência e escalabilidade, 
tornando o programa mais eficiente e dinâmico.

---

Desvantagens:

    Complexidade: pode tornar o programa mais complexo e difícil de ser desenvolvido, testado 
    e mantido, especialmente em sistemas grandes e complexos.

    Sincronização: pode levar a problemas de sincronização e concorrência, que podem causar 
    condições de corrida, deadlocks, inanição e outros problemas difíceis de serem detectados 
    e corrigidos.

    Overhead: o uso de threads pode aumentar o overhead do sistema, ou seja, o tempo e recursos 
    necessários para gerenciar as threads, o que pode afetar a performance geral do programa.

    Consumo de recursos: pode consumir mais recursos do sistema, como memória, 
    processamento e entradas/saídas, o que pode afetar a performance de outros processos e 
    aplicativos que estão sendo executados no mesmo sistema.

    Impossibilidade de paralelismo: algumas tarefas podem não ser paralelizáveis e, portanto, 
    o uso de threads pode não trazer benefícios significativos em termos de performance.

Em resumo, o uso de threads pode trazer desvantagens em termos de complexidade, sincronização, 
overhead, consumo de recursos e impossibilidade de paralelismo. Portanto, o uso de threads deve 
ser avaliado cuidadosamente em cada situação, levando em consideração as vantagens e desvantagens 
e considerando outras alternativas de otimização de performance.

---

Quando usar Threads?

    Deve ser avaliado cuidadosamente em cada situação, levando em consideração fatores como a 
    complexidade das operações, a quantidade de recursos disponíveis, a capacidade de 
    processamento do hardware e a possibilidade de problemas de sincronização e concorrência. 
    O uso de threads pode ser vantajoso em situações de processamento paralelo, como no 
    processamento de imagens em lotes, leitura e escrita de arquivos, execução de tarefas 
    de rede ou operações matemáticas intensivas, mas pode não ser apropriado em operações 
    sequenciais, programas com baixo processamento ou sistemas com recursos limitados.

---

Em Java, há várias bibliotecas disponíveis para uso de threads. Algumas das principais são:

    java.lang.Thread: é a biblioteca padrão do Java para gerenciamento de threads. Ela 
    permite criar, iniciar, interromper, aguardar e sincronizar threads.

    java.util.concurrent: é uma biblioteca avançada do Java para programação concorrente. 
    Ela fornece várias classes e interfaces para o gerenciamento de threads, como Executor, 
    ExecutorService, Future e BlockingQueue.

    java.util.concurrent.atomic: é uma sub-biblioteca da java.util.concurrent que fornece 
    classes para operações atômicas em variáveis compartilhadas, como AtomicInteger, 
    AtomicBoolean e AtomicReference.

    java.util.concurrent.locks: é outra sub-biblioteca da java.util.concurrent que fornece 
    classes para sincronização avançada de threads, como ReentrantLock, Condition e Semaphore.

    java.util.concurrent.atomic: é uma biblioteca para programação funcional e reativa em 
    Java, que inclui suporte a programação assíncrona e baseada em eventos.

    Essas bibliotecas são amplamente utilizadas em projetos Java de diferentes tamanhos e 
    complexidades, permitindo um melhor gerenciamento e uso de threads.