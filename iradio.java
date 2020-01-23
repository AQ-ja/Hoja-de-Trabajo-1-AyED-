/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfredo Quezada
 * @author Fernando Ramos
 */


public interface iradio {

    public void onOff();  //MÃ©todo para prender/apagar la radio

    public float cambiarfrecuencia(); //MÃ©todo para cambiar AM/FM

    public float avanzar(float a);  //MÃ©todo para cambiar a la siguiente estaciÃ³n

    public float anterior(float a);  //MÃ©todo para cambiar a la estaciÃ³n anterior

    public void guardar(float e,int b);  //MÃ©todo para guardar una estaciÃ³n en favoritos

    public float seleccionarEmisora(int b);  //MÃ©todo para devolver una de las estaciÃ³n que estÃ©n en favoritos

}
