package Shape;

/*itilizamos este enum para que el metodo de creacion solo acepte estos parametros que colocaremos aqui
 * en caso de crear otra implementacion de otra figura solo debera agregar en el enum
 * el nombre de la figura por la cual quiera sea llamada para construirla
*/
enum tipoShape{CIRCLE, SQUARE,RECTANGLE};
public class ShapeFactory {
	public Shape getShape(tipoShape figura){
		if (figura == null)		
		return null;
		
		if(tipoShape.CIRCLE.equals(figura)) {
			return new CircleImpl();
		}else if(tipoShape.RECTANGLE.equals(figura)) {
			return new RectangleImpl();
		}else if(tipoShape.SQUARE.equals(figura)) {
			return new SquareImpl();
		}		
		return null;
	}
	

}
