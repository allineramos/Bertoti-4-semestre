# ❌ AntiPatterns - Projeto Adega de Vinhos 🍷

Este projeto demonstra exemplos de **AntiPadrões de Projeto (AntiPatterns)** usando o mesmo contexto dos padrões bem aplicados: uma **adega de vinhos**. Aqui mostramos como o mal uso de Composite, Observer e Strategy pode comprometer manutenibilidade e escalabilidade.

---

## 📂 AntiComposite

**Problema:** Lógica duplicada, ausência de uma interface comum, forte acoplamento entre categoria e vinho.

### Diagrama UML

```mermaid
classDiagram
    class Categoria {
        -String nome
        -List~Vinho~ vinhos
        -List~Categoria~ subcategorias
        +adicionarVinho(Vinho)
        +adicionarSubcategoria(Categoria)
        +mostrar()
    }

    class Vinho {
        -String nome
        +getNome()
    }

    Categoria --> Vinho
    Categoria --> Categoria : contém
```

---

## 📂 AntiObserver

**Problema:** O objeto estoque está acoplado diretamente ao estoquista, o que quebra o princípio de baixo acoplamento e impede reutilização.

### Diagrama UML

```mermaid
classDiagram
    class EstoqueVinho {
        -String nome
        -int estoque
        -Estoquista estoquista
        +reduzirEstoque(int)
    }

    class Estoquista {
        +alerta(String, int)
    }

    EstoqueVinho --> Estoquista
```

---

## 📂 AntiStrategy

**Problema:** Lógica de desconto baseada em condicionais `if/else`, dificultando manutenção e adição de novas regras.

### Diagrama UML

```mermaid
classDiagram
    class Vinho {
        -String nome
        -double preco
        +aplicarDesconto(String tipoDesconto)
    }
```

---

## 🧠 Conclusão

Demonstrar que, sem seguir corretamente os padrões de projeto, os sistemas se tornam mais frágeis, acoplados e difíceis de evoluir. Esses exemplos contrastam com a aplicação correta dos padrões `Composite`, `Observer` e `Strategy`.

---