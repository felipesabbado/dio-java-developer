```mermaid
---
title: DIO | Desafio POO
---
classDiagram
    namespace interfaces {
        class ReprodutorMusical {
            <<Interface>>
            + tocar() void
            + pausar() void
            + selecionarMusica(String musica) void
        }
        class AparelhoTelefonico {
            <<Interface>>
            + ligar(String numero) void
            + atender() void
            + iniciarCorreioVoz() void
        }
        class NavegadorInternet {
            <<Interface>>
            + exibirPagina(String url) void
            + adicionarNovaAba() void
            + atualizarPagina() void
        }
    }
    
    ReprodutorMusical <|-- iPhone
    AparelhoTelefonico <|-- iPhone
    NavegadorInternet <|-- iPhone