```mermaid
classDiagram
    class ReprodutorMusical {
        + tocar()
        + pausar()
        + selecionarMusica(musica: String)
    }
    
    class AparelhoTelefonico {
        + ligar(numero: String)
        + atender()
        + iniciarCorreioVoz()
    }
    
    class NavegadorInternet {
        + exibirPagina(url: String)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    class iPhone {
        - ReprodutorMusical reprodutorMusical
        - AparelhoTelefonico aparelhoTelefonico
        - NavegadorInternet navegadorInternet

        + usarReprodutorMusical()
        + usarAparelhoTelefonico()
        + usarNavegadorInternet()
    }

    ReprodutorMusical -- iPhone
    AparelhoTelefonico -- iPhone
    NavegadorInternet -- iPhone
