package entreprise;

public class App {

	public static void main(String[] args) {
		
		MonServiceImplantationService service = new MonServiceImplantationService();
		MonService monService = service.getMonServiceImplantationPort();
		
		int i = monService.methode();
		
		System.out.println("i=" + i);
	}

}
