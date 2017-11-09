package com.kirkk.client;

import com.kirkk.service.Service;

public class Client {
   public static void main(String[] args) {
     System.out.println("Hi from " + Service.msg());
   }
}
