package test;

import entreprise.MonService;
import entreprise.MonServiceWebImplService;

public class Main {

	public static void main(String[] args) {
		MonServiceWebImplService monServiceImpl = new MonServiceWebImplService();
		MonService monService = monServiceImpl.getMonServiceWebImplPort();
		int i = monService.maMethode(1, 'c');
		System.out.println("client i = " + i);
	}

}
