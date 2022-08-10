package com.example.temaspital.Exceptions;

public class NoDoctorException extends Exception{
    public NoDoctorException(){
        super("Doctor doesn't exist");
    }

}