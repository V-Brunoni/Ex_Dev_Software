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




