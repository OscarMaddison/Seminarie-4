/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seminarie3.exceptions;

/**
 *
 * @author Oscar
 */
public class InvalidItemException extends Exception{
    String errorMessage;
    
    public InvalidItemException(String errorMessage){
        this.errorMessage = errorMessage;
    }
}
