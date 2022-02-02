## Exercícios Resolvidos do Teste Prático da GFT START #3 2022


<h6>- Minha experiência</h6>

***Estava bem confiante para o desafio do que no START #2!*** </br>
A sensação da tranquilidade perto do outro teste foi maior. </br>
Refatorei apenas o último exercício inserindo o regex (não me lembrava de cabeça como fazia) e adicionando uma lógica para String vazia.
Como sempre digo, fica o aprendizado e vamos em frente.

### Seguem os enunciados dos exercícios resolvidos.

### 1. Calculo de área

- Crie um projeto contendo as classes: Quadrado, Retângulo e Círculo.
- Em seguida crie também uma interface chamada AreaCalculavel que será implementada pelas classes acima.
- A interface terá um método que calcula a área retornando um double:
- Área do quadrado = lado * lado.
- Área do retângulo = largura * altura.
- Área do círculo = π * raio²
- Crie classe principal Teste instanciando todos os objetos, passando valores via construtor e exiba no console o cálculo da área.

### 2. Salários e bonificações
- Considerando os conceitos de Orientação a Objetos, crie uma classe Pai de nome Funcionário com os seguintes atributos (nome, idade e salário) e mais três classes Filhas (Gerente, Supervisor e Vendedor). Na classe Funcionário deve existir um método de nome bonificação que retorna o salário, nas classes filhas deve existir o mesmo método bonificação porem com as seguintes regras:
  - Para Gerente, o método bonificação deve retornar o salário + 10000.00.
  - Para Supervisor, o método bonificação deve retornar o salário + 5000.00.
  - Para Vendedor, o método bonificação deve retornar o salário + 3000.00.
- Por fim, criar uma classe principal que instancie objetos de Gerente, Supervisor e Vendedor e adicione no mínimo um valor para cada atributo e imprima cada funcionário (Gerente, Supervisor e Vendedor) com suas devidas bonificações.

### 3. Hospedagem VIP
- Faça um programa onde tenha uma classe chamada Hospedagem, que possui um valor em reais e um método printValor(). 
- Crie uma classe HospedagemVIP, que herda de Hospedagem e possui um valor adicional. 
- Crie um método que retorne o valor do HospedagemVIP (com o adicional incluído). 
- Crie um programa para criar as instâncias de Hospedagem e HospedagemVIP, mostrando a diferença de preços.

### 4. Frase invertida
- Fazer um programa que diga se a frase/palavra quando invertida a sequência de letras continua exatamente igual. 
- Imprimindo um boolean no console com a resposta, usar os testes abaixo:

  - "Ana" -> true"
  - hannah" -> true
  - "" -> false
  - "O lobo ama o bolo" -> true
  - "A Daniela ama a lei? Nada!" -> true"
  - Ande logo, ela vale o gol, Edna!" -> true
  - "o bolo é gostoso" -> false
