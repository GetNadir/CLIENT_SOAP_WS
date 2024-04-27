package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;
//git nadir
public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversionEuroToDh(00));
        Compte cp = stub.getCompte();
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());

    }
}