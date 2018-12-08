package Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// creo una instancia de la fabrica de figuras
		ShapeFactory Shapefact = new ShapeFactory();
		
		Shape fig2 = Shapefact.getShape(tipoShape.RECTANGLE);
		fig2.draw();
		
		Shape fig1 = Shapefact.getShape(tipoShape.CIRCLE);
		fig1.draw();
		
		Shape fig3 = Shapefact.getShape(tipoShape.SQUARE);
		fig3.draw();
		
	}

}
