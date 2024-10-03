package com.example;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;



public class Main {
    public static void main(String[] args) throws UnknownError, IOException
    {
        
        Socket s = new Socket("localhost",3000);
        System.out.println("Client Partito");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        
        String stringa = "ciao a tutti";
        
        out.writeBytes(stringa + '\n');
        String stringa1 = in.readLine();

        System.out.println(stringa1);

         
    }
}