package decoradores;
import componentes.Combo;


public class Galletas extends AdicionalesDecorator{

	Combo combo;
	
	public Galletas(Combo combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Adicional : Una Galleta";
	}

	@Override
	public int valor() {
		return 1000+combo.valor();
	}

}