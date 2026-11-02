<div align="center">

<img src="https://capsule-render.vercel.app/api?type=rounded&color=0:fbcfe8,100:f9a8d4&height=170&section=header&text=EcoTech&fontSize=52&fontColor=831843&fontAlignY=42&desc=TCC%20%C2%B7%20T%C3%A9cnico%20em%20Inform%C3%A1tica%20FIEB&descSize=16&descAlignY=68" width="100%" />

<img src="https://readme-typing-svg.demolab.com?font=Quicksand&weight=600&size=19&pause=1400&color=DB2777&center=true&vCenter=true&width=620&lines=Descarte+consciente+de+eletr%C3%B4nicos;EcoPontos+da+regi%C3%A3o+oeste+de+SP;App+Android+em+Java" />

<br>

<img src="docs/logo.png" width="140" />

</div>

<br>

### Sobre o projeto

O **EcoTech** é um aplicativo Android que ajuda moradores e empresas a encontrar o **EcoPonto mais próximo para descartar resíduos eletrônicos** de forma correta. Ele atende sete cidades da Sub-Região Oeste da Grande São Paulo: Barueri, Carapicuíba, Itapevi, Jandira, Osasco, Pirapora do Bom Jesus e Santana de Parnaíba.

Foi o nosso **Trabalho de Conclusão de Curso** do Técnico em Informática da **FIEB**, desenvolvido entre 2023 e 2024.

<br>

### O problema

Eletrônicos descartados no lixo comum liberam substâncias tóxicas no solo e na água, e materiais que poderiam ser reaproveitados se perdem. Muita gente não descarta corretamente porque não sabe onde fica o ponto de coleta mais próximo nem quais itens cada ponto aceita.

<br>

### Como funciona

1. **Boas-vindas:** apresenta o propósito do app e as cidades atendidas.
2. **Por que reciclar:** explica a importância de reciclar resíduos eletrônicos.
3. **Grupos de resíduos:** mostra a diferença entre itens de pequeno porte (celulares, pilhas, carregadores), médio porte (computadores, impressoras, videogames) e grande porte (geladeiras, máquinas de lavar, ar-condicionado).
4. **Lista de EcoPontos:** o usuário escolhe a cidade e o app busca no banco de dados os pontos de coleta ativos, com bairro, endereço, CEP, telefone, horário de funcionamento e foto.
5. **Avaliação:** o usuário informa nome e e-mail, dá uma nota de 1 a 5 estrelas e a avaliação é salva no banco.

<br>

### Arquitetura

```
App Android (Java)  ──  driver jTDS (JDBC)  ──►  SQL Server na nuvem
                                                  tabelas EcoPonto e UsuarioApp
```

| Arquivo | Função |
|:---|:---|
| `ConexaoBD.java` | Abre a conexão com o SQL Server |
| `placeholder/EcoPontoConexao.java` | Consulta os EcoPontos por cidade e grupo de resíduo |
| `ListaEcoPontos.java` | Lista os pontos de coleta encontrados |
| `Avaliacao.java` | Valida o formulário e grava a avaliação |

<br>

### Tecnologias

<div align="center">
  <img src="https://skillicons.dev/icons?i=java,androidstudio,gradle&theme=light" />
  <br>
  <sub>Java · Android SDK · Android Studio · Gradle · SQL Server · jTDS</sub>
</div>

<br>

### Como executar

1. Abra o projeto no Android Studio.
2. Em `app/src/main/java/br/com/local/ecotech/ConexaoBD.java`, troque `SEU_SERVIDOR`, `SEU_BANCO`, `SEU_USUARIO` e `SUA_SENHA` pelos dados do seu SQL Server.
3. Rode em um emulador ou celular com Android 9 ou superior.

<br>

### Equipe

<div align="center">

Lucas Fantinati &nbsp;·&nbsp; Marco Proença &nbsp;·&nbsp; Maria Carvalho &nbsp;·&nbsp; Mateus Cavalcante &nbsp;·&nbsp; Rayssa Bezerra &nbsp;·&nbsp; Sofia Rodrigues

<sub>Liderança da equipe: Sofia Rodrigues</sub>

</div>

<img src="https://capsule-render.vercel.app/api?type=rounded&color=0:fbcfe8,100:f9a8d4&height=60&section=footer" width="100%" />
