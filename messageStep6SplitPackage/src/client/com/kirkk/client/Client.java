package com.kirkk.client;

import com.kirkk.service.Service;
import com.kirkk.impl.ClientImpl;

public class Client {
   public static void main(String[] args) {
     System.out.println("Hi from " +new ClientImpl().msg() + Service.msg());
   }
}
