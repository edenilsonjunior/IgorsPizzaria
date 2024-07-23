# IgorsPizzaria

A “Igor’s Pizzaria” necessita de um sistema para gerenciar pedidos das pizzas. Utilizando o design pattern Builder
para criar diferentes tipos de pizza, permite-se a customização dos atributos de cada pizza.

De acordo como o diagrama de classes abaixo, implemente um sistema que permita criação de pizzas com várias
configurações.

![image](https://github.com/user-attachments/assets/4ae2b914-63d2-429a-96c8-377d87fbc46a)

Após a implementação, explique porque o objeto builder, destacado no exemplo acima, precisou seu instanciado duas vezes. Contemple na explicação como é o comportamento em memória dos objetos Pizza.Builder e Pizza.

R: Foi necessário instanciar duas vezes o objeto builder pois, apesar de 'crust' e 'cheese' terem sido trocados, o 'size' da pizza se manteve o mesmo, além de que, um dos atributos da Pizza é um List de toppings, isso faz com que, ao adicionar os toppings 'tomate', 'rucula', 'cogumelos', a segunda pizza irá conter os toppings de ambas as pizzas, pois os valores padroes de uma pizza são definidos apenas na hora da instancia de um Builder.
