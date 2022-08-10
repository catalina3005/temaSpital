package com.example.temaspital.Exceptions;

public class NoSpecialtyException extends Exception{
    public NoSpecialtyException(){
        super("Specialty doesn't exist");
    }
}