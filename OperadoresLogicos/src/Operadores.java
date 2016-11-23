/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Junior
 */
public class Operadores {
    private float first,second;
    
    public void setFirst(float firstP){first = firstP;}
    public void setSecond(float secondP){this.second = secondP;}
    public float getFirst() {return first;}
    public float getSecond() {return second;}
    
    public float sum(){return first +second;}
    
    public float subtration(){return first -second;}
    
    public float multiplication(){return first *second;}
    
    public float division(){return first /second;}
    
    public float rest(){return first %second;}
    
    
}
