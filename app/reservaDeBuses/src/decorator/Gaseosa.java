package decorator;
import component.Combo;



public class Gaseosa extends AdicionalesDecorator{

	Combo combo;
	
	public Gaseosa(Combo combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" ,Adicional : Una botella de gaseosa x 100ml";
	}

	@Override
	public int valor() {
		return 2500+combo.valor();
	}
}
