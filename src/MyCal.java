
public class MyCal {

	public static void main(String args[]){
		View myview= new View();
		Model mymodel = new Model();
		Controller mycon = new Controller(mymodel , myview);
		myview.setVisible(true);
		myview.setSize(500,500);
		
	}
}
