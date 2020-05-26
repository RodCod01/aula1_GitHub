package Aplicacao;

import java.util.Date;

import Entidades.Ent112Enum;
import Entidades_enums.Enum112Enum;

//Programa principal

public class P112Enum {
	public static void main(String[] args) {
		
		Ent112Enum order = new Ent112Enum(1080, new Date(), Enum112Enum.PENDING_PAYMENT);
		
		System.out.println(order);
		
		Enum112Enum os1 = Enum112Enum.DELIVERED;
		Enum112Enum os2 = Enum112Enum.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		
		
		
	}
	

}
