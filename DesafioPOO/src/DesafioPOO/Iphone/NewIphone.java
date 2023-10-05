package DesafioPOO.Iphone;


import DesafioPOO.ControllerVolume.ControleDeVolumeImpl;
import DesafioPOO.ControllerVolume.IControleDeVolume;
import DesafioPOO.Services.ChamadaTelefonica.IChamadaTelefonica;
import DesafioPOO.Services.NavegacaoInternet.INavegacaoInternet;
import DesafioPOO.Services.ReprodutorMidia.IReprodutorMidia;;

public class NewIphone implements IChamadaTelefonica, IControleDeVolume, INavegacaoInternet, IReprodutorMidia {
    private IControleDeVolume controleDeVolume; // Usar a interface IControleDeVolume

    public NewIphone() {
        this.controleDeVolume = new ControleDeVolumeImpl(); // Inicializar o controle de volume
    }

    // Métodos para controlar o volume, delegando para a instância de
    // IControleDeVolume
    public void aumentarVolume() {
        controleDeVolume.aumentarVolume();
    }

    public void diminuirVolume() {
        controleDeVolume.diminuirVolume();
    }

    public int getVolume() {
        return controleDeVolume.getVolume();
    }
    
    @Override
    public void setVolume(int novoVolume) {
        controleDeVolume.setVolume(novoVolume);
    }


    // Métodos para utilizar a Interface IChamadaTelefonica
    @Override
    public void efetuarLigacao() {

    }

    @Override
    public void atenderLigacao() {

    }

    @Override
    public void iniciarCorreioDeVoz() {

    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void selecionarMidia() {
        
    }

    @Override
    public void reproduzirMidia() {

    }

    @Override
    public void pausarMidia() {

    }
}