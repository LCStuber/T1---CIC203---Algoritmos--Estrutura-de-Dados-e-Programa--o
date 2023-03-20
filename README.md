# T1 - CIC203 - Algoritmos, Estrutura de Dados e Programação
### Integrantes:
* Isaac D Andrea
* Leonardo C Stuber
* Carlos H L Barros
* Mateus C Martins
* Othavio Losovoi
* Raul M Souza

---

## Análise dos resultados observados:
 Neste trabalho de Algoritmos e estrutura de dados, desenvolvemos um programa que recolhe os tempos de processamento de métodos de ordenamento, neste caso foram utilizados o bubble sort, o insertion sort e o selection sort. Fizemos testes de 40.000 até 2.560.000 dobrando o valor de dados até o máximo do intervalo. Analisando o tempo de todos os computadores, percebemos que há uma grande relação entre os processadores nos aspectos de frequência de trabalho e memória cache, quanto maior os dois valores, menor o gargalo de Von Neumann. Quando observamos a relação entre tempo e quantidade de dados, notamos um crescimento exponencial onde quando dobramos o a quantidade de dados, o tempo quadriplica, pois para cada número adicionado em um vetor é mais uma operação para todos os elementos do vetor, isso se aplica em todos os tipos de sorteamento, o que muda é a eficiência de cada código na hora da performance e deslocamento dos números. Em porcentagem, o melhor método para ordenamento é o insertion sendo 80% mais rápido que o selection, já com o bubble, o insertion é 860% mais rápido, e a entre o bubble e selection, o selection é 420% mais rápido.
 
 O motivo dessa grande diferença se deve pelo BubbleSort passar por toda a extensão do vetor várias vezes até que o mesmo se encontre alinhado (ou seja quando o bubblesort analisa e não realiza nenhuma alteração). Diferentemente do Selection e Insertion, os quais analisam o vetor apenas “n” vezes, sendo “n” a quantidade de elementos do vetor. Entretanto, a diferença entre ambos (insertion/selection), é no tamanho do sub-vetor que eles analisam ao longo de sua execução, sendo que o selection a cada vez que analisa ele diminui o tamanho do sub-vetor em 1, até chegar ao fim da ordenação. Já o insertion, quanto mais próximo do fim da análise do vetor, maior o sub-vetor que ele deve percorrer para mudar os números de posição. 