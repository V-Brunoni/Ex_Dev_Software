# Ex_Dev_Software

1) Crie a classe Calculadora com os métodos:
.somar(double n1, double n2)
.subtrair(double n1, double n2)
.multiplicar(double n1, double n2)
.dividir(double n1, double n2)
Todos estes métodos recebem como parâmetros dois valores do tipo double e exibem na tela o resultado da operação correspondente.
Na classe principal crie uma instância da classe Calculadora e chame cada um dos métodos passando os números digitados pelo usuário como parâmetro.



2) Crie a classe Aluno, com os atributos nome, idade e media. Crie o método construtor completo e os métodos:
.calcularMedia(double n1, double n2, double n3)
Este método deverá receber três valores como parâmetro, representando as notas do alunos e deverá realizar o cálculo da média armazenando o valor no atributo
correspondente. Ao final deverá exibir o valor da média na tela.
.verificarAprovacao()
Baseado no valor do atributo media, deverá verificar e exibir na tela a mensagem “Reprovado”, caso a média seja menor que 5, “Em exame” se a média for maior ou
igual a 5 e menor que 7, e “Aprovado” se a média for maior ou igual a 7.
Na classe principal crie uma instância de Aluno, solicite ao usuário as três notas do
mesmo e depois execute os métodos para calcular a média e depois verificar aprovação.



3) Crie a classe Conta com os atributos numeroConta, tipoConta, titularConta e saldo. Crie um método construtor métodos:
.depositar(double valor)
Este método deverá adicionar o valor do depósito ao saldo da conta.
.sacar(double valor)
Este método deverá retirar o valor do saque do saldo da conta. Realizar uma verificação para
que impeça a realização de saques maiores do que o saldo remanescente na conta.
.verificarSaldo()
Este método deve exibir na tela os dados da conta, como número, tipo da conta, titular da conta e o saldo atual.
Na classe principal crie dois objetos do tipo Conta. Realize depósitos e saques distintos nas duas contas. Por fim verifique o saldo de ambas.



4) Crie uma classe chamada Veiculo, com os atributos ano, modelo, cor e
quilometragem. Crie um método construtor completo que requisite estes atributos. Crie
também os métodos:
.verificarManutencao() – Este método irá verificar a quilometragem do veículo. Se o
veículo possuir menos de 25 mil km, deve-se exibir a mensagem “Tudo ok!”, caso possua
entre 25 mil e 75 mil km, deve-se exibir a mensagem “Realizar revisão parcial!”. Caso possua
mais de 75 km deve-se exibir a mensagem “Realizar revisão completa!”.
.mudarCor(String cor) – Este método deverá receber por parâmetro uma cor e esta
deverá sobrescrever a cor anterior presente no atributo do objeto.
.exibirCor() – Este método deverá exibir na tela o valor presente no atributo cor do objeto.
Na classe principal crie um objeto do tipo Veiculo, e execute os métodos deste objeto na seguinte
ordem:
.verificarManutencao()
.exibirCor()
.mudarCor()
.exibirCor()



5) Crie a classe CadernoAnotacoes com o atributo listaAnotacoes do tipo ArrayList. Crie os
métodos:
.adicionarAnotacao(String anotacao)
Este método deve receber um valor do tipo String por parâmetro e deve adicioná-lo à ArrayList listaAnotacoes.
.visualizarAnotacoes()
Este método deve por completo a ArrayList listaAnotacoes. Caso a ArrayList esteja vazia então deve exibir na tela a mensagem:“LISTAVAZIA”.
.apagarAnotacoes()
Este método deve remover todos os itens da ArrayList listaAnotacoes.
Na classe principal crie um menu que solicite ao usuário qual ação ele deseja realizar:
1 – Adicionar Anotação
2 –Visualizar Caderno deAnotações
3 – Apagar Anotações.
4 – Sair
Para cada opção (exceto a 4) você deverá executar os métodos correspondentes da classe
CadernoAnotacoes.



6) Crie a classe Produto, com os atributo nome, peso e preco. Crie o método:
.aumentarPreco(Produto p)
Este método deverá receber por parâmetro um objeto do tipo produto e verificar seu preço.
Exibir na tela o preço atual. Caso esteja abaixo de R$ 50, o aumento deverá ser de 20%, caso
o produto custe mais de R$ 50 o aumento deverá ser de 10%. Após deve ser exibido o valor
do reajuste e o novo preço do produto.
Na classe principal crie 5 objetos de Produtos, e execute o método aumentarPreco() para cada
um deles.


