# Ex_Dev_Software Lista 6


1) Implemente a classe Funcionario com:
 nome
 salario
 e métodos:
 addAumento(double valor) – recebe um valor por parâmetro que será adicionado ao salário
 ganhoAnual() – calcula o ganho anual baseado no valor total do salário multiplicado pelo total de
meses no ano.
 exibeDados() - imprime os valores do funcionário.
 a. crie a classe Assistente, que também é um funcionário com:
 matrícula
 e sobrescreva o método
 exibeDados() – acrescenta a exibição da matrícula, além dos dados já existentes do funcionário.
 b. Derivando de Assitente, temos as classes AssistenteTecnico com:
 bonusSalarial – este valor será um aumento ao salário do funcionário
 e AssistenteAdministrativo com:
 adicionalNoturo – este valor será um aumento ao salário do funcionário
 Na classe principal crie um assistente administrativo e um técnico. Imprima o número de
matrícula e o nome de cada um deles.



2) Crie a classe Imovel, que possui um endereço e um preço.
 a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie métodos de acesso e
impressão deste valor adicional.
 b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de acesso
e impressão para este desconto.
 c. Na classe principal, crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho.
Conforme a definição do usuário, imprima o valor final do imóvel.
