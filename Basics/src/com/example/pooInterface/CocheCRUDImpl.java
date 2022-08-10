package com.example.pooInterface;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save(){
        System.out.println("Save method");
    }

    @Override
    public void findAll(){
        System.out.println("FindAll method");
    }

    @Override
    public void delete(){
        System.out.println("Delete method");
    }
}
