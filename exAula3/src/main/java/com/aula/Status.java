/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

package com.aula;

/**
 *
 * @author lab53
 */
public enum Status {

    ON(true), OFF(false);

    private boolean statusCorrespondente;

    Status(boolean statusCorrespondente){
        this.statusCorrespondente = statusCorrespondente;
    }

    public boolean getStatus(){
        return statusCorrespondente;
    }


}
