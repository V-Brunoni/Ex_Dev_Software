# Ex_Dev_Software


1) Crie uma classe Pessoa, que contenha os atributos nome, idade e altura.
Lembre-se de aplicar os princípios do encapsulamento, criando todos os atributos privados e os métodos
getters e setters públicos para realizar o acesso aos dados.
 Crie uma classe Agenda, sem atributos, a qual pode armazenar 10 pessoas e que seja capaz
de realizar as seguintes operações:
 void armazenaPessoa(String nome, int idade, float altura);
 void removePessoa(String nome);
 int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
 void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
 void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
 agenda.



2) Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de
um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio
(desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe
deve também disponibilizar os seguintes métodos:
 inicializa : que deve receber como parâmetros a capacidade do elevador e o total de
 andares no prédio (os elevadores sempre começam no térreo e vazio);
 entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
 espaço);
 sai : para remover uma pessoa do elevador (só deve remover se houver alguém
 dentro dele);
 sobe : para subir um andar (não deve subir se já estiver no último andar);
 desce : para descer um andar (não deve descer se já estiver no térreo);
 Encapsular todos os atributos da classe (criar os métodos set e get).
