/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Estudo de classes abstratas");
        Cachorro obj = new Cachorro("theo");
        
        System.out.println("Olá " + obj.getNome());
        obj.emitirSom();
        
        (new Gato("Pandora")).emitirSom();
        (new Pinguim("Oliver")).emitirSom();
    }
}
