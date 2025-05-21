# ✅ Padrões de Projeto - Projeto Adega de Vinhos 🍷

Este projeto demonstra exemplos **corretamente aplicados** de quatro padrões de projeto clássicos:

- `Observer`
- `Singleton`
- `Strategy`
- `Singleton`

---

## 📌 Observer

Permite que objetos observadores sejam notificados quando o estado de um objeto observado muda.

### 🔍 Contexto
A classe `VinhoObservable` notifica os `Estoquistas` quando o estoque do vinho está baixo.

### 📁 Pacote: `observer`

- `Observer`: Interface que define o método `atualizar`.
- `Estoquista`: Implementa o `Observer`, imprimindo alertas.
- `VinhoObservable`: Contém os métodos de controle de estoque e notificação dos observadores.

### 🔧 Funcionamento
```java
VinhoObservable vinho = new VinhoObservable("Cabernet", 5);
vinho.adicionarObserver(new Estoquista("João"));
vinho.reduzirEstoque(4); // Estoque atinge 1 → notifica o estoquista


## 📌 Singleton
Garante que uma classe tenha apenas uma instância, fornecendo um ponto global de acesso a ela.

### 📁 Pacote: singleton
ControleAdega: Garante acesso único ao controle da adega.

### 🔧 Funcionamento
```java
ControleAdega controle = ControleAdega.getInstancia();
controle.exibirMensagem(); // Mensagem de controle único

## 📌 Strategy
Permite alterar o comportamento de um objeto em tempo de execução através da composição com diferentes estratégias.

### 🔍 Contexto
Aplicação de desconto em vinhos usando diferentes estratégias.

### 📁 Pacote: strategy
DescontoStrategy: Interface para aplicar desconto.

DescontoAniversario: Estratégia concreta com 10% de desconto.

VinhoComDesconto: Usa uma estratégia para aplicar desconto no preço.

### 🔧 Funcionamento
```java
DescontoStrategy estrategia = new DescontoAniversario();
VinhoComDesconto vinho = new VinhoComDesconto("Merlot", 100.0, estrategia);
vinho.aplicarDesconto(); // Aplica 10% de desconto


### 🧠 Conclusão
Esses padrões permitem um sistema desacoplado, extensível e de fácil manutenção. Usando os padrões corretamente, o projeto da adega se torna muito mais sustentável a longo prazo.
