package Aplicacao;

import java.util.Date;

import Entidades.EntTes;
import Entidades_enums.EnumTes;

public class AppTes {
	public static void main(String[] args) {
	
		EntTes pedido = new EntTes(1080, new Date(), EnumTes.ENTREGUE);
		
		System.out.println(pedido);
	}	
}
