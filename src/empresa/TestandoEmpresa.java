package empresa;

public class TestandoEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MetodoEmpresa m = new MetodoEmpresa();
		m.ola();
		
		//String texto2 = m.ola() + " tudo bem?";
		//String texto2 = System.out.println("ol� " + nome); + " tudo bem?";
		
		m.olaMundo();
		
		String texto = m.olaMundo() + " tudo bem?";
		System.out.println(texto);
		
		
	}

}
