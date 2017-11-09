package com.kirkk.service;

import com.kirkk.impl.Impl;

public class Service {
   public static String msg() {
     return "Service module, " + new Impl().msg();
   }
}