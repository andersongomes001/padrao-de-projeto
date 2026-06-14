## Objetivo

Este repositório contém implementações dos padrões de projeto GoF utilizando Java 21 e Maven Multi-Module.

Novos módulos podem ser adicionados continuamente.

O agente deve analisar qualquer módulo encontrado no pom.xml raiz.

---

## Descoberta de módulos

Ler o arquivo pom.xml da raiz.

Para cada entrada:

<modules>
    <module>...</module>
</modules>

considerar o diretório como um módulo independente.

Não assumir uma lista fixa de módulos.

---

## Estrutura esperada

Cada módulo deve possuir:

- pom.xml próprio
- src/main/java
- pacote Java compatível com o nome do módulo
- classe de demonstração (Main ou Example)

---

## Validação

Para cada módulo:

1. Identificar qual Design Pattern está sendo implementado.
2. Verificar se a estrutura segue a implementação clássica do padrão.
3. Reportar desvios arquiteturais.
4. Reportar violações de SOLID.
5. Reportar código morto ou não utilizado.

---

## Regras

- Não alterar a implementação apenas para reduzir quantidade de classes.
- Priorizar clareza didática.
- Manter nomenclatura clássica dos padrões sempre que possível.
- Respeitar a estrutura canônica descrita pelo GoF.

---

## Relatório

Ao finalizar:

- Listar módulos encontrados.
- Listar padrões identificados.
- Informar problemas encontrados.
- Gerar score de aderência de 0 a 100 para cada módulo.
- Gerar score geral do repositório.
