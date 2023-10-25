package Retroalimentación;


public	class	Celular	extends	DispositivoMovil	{
	 private	String	numero;
	 public	Celular(String	numero)	{
		super(0);
		this.numero	= numero;
		}
				
		public	void	llamar(String	numero)	{
		System.out.println("Llamando…	"	+	numero);
			}
				
}

