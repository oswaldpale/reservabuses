package decorator;
import component.Combo;


public class Chocolatina extends AdicionalesDecorator{

	Combo combo;
	
	public Chocolatina(Combo combo)
	{
		this.combo=combo;	
	}
	
	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Adicional : Una Chocolatina jef CooKies x50g";
	}

	@Override
	public int valor() {
		return 1500+combo.valor();
	}

}