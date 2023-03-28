package com.ultimaschool.java;

import com.ultimaschool.java.clientes.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("123.456.789-00", "exemplo@email.com", "Fulano de Tal", 'M');

        System.out.println(cliente.toString());
    }
}