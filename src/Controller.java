

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	private Model ObjM;
	private View ObjV;
	
	public Controller(Model ObjM  ,View ObjV) {
		// TODO Auto-generated constructor stub
		this.ObjM=ObjM;
		this.ObjV=ObjV;
		
        this.ObjV.addListner((ActionListener)new Add_Listener() );
        this.ObjV.subListner((ActionListener)new sub_Listener() );
        this.ObjV.multListner((ActionListener)new Mult_Listener() );
        this.ObjV.divListner((ActionListener)new Div_Listener() );
        this.ObjV.sqrListner((ActionListener)new Sqr_Listener() );

	}
	
    class Add_Listener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
        Double firstnum, secondnum = 0.0;
        try{
        	firstnum=ObjV.getFirstNumber();
        	secondnum=ObjV.getSecondNumber();
        	ObjM.summation_Result(firstnum, secondnum);
        	ObjV.setResult(ObjM.getResult());
        	
        }
        catch  (Exception ex){
        	ObjV.errorMessage("Enter the two numbers Correctly");
        }
	
		
	      }
    
    }
    
    class sub_Listener implements ActionListener{
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		// TODO Auto-generated method stub
    		
            Double firstnum, secondnum = 0.0;
            try{
            	firstnum=ObjV.getFirstNumber();
            	secondnum=ObjV.getSecondNumber();
            	ObjM.subtract_Result(firstnum, secondnum);
            	ObjV.setResult(ObjM.getResult());
            	
            }
            catch  (Exception ex){
            	ObjV.errorMessage("Enter the two numbers Correctly");
            }
    	
    		
    	      }
        
        }
    class Mult_Listener implements ActionListener{
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		// TODO Auto-generated method stub
    		
            Double firstnum, secondnum = 0.0;
            try{
            	firstnum=ObjV.getFirstNumber();
            	secondnum=ObjV.getSecondNumber();
            	ObjM.multiply_Result(firstnum, secondnum);
            	ObjV.setResult(ObjM.getResult());
            	
            }
            catch  (Exception ex){
            	ObjV.errorMessage("Enter the two numbers Correctly");
            }
    	
    		
    	      }
        
        }
    class Div_Listener implements ActionListener{
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		// TODO Auto-generated method stub
    		
            Double firstnum, secondnum = 0.0;
            try{
            	firstnum=ObjV.getFirstNumber();
            	secondnum=ObjV.getSecondNumber();
            	ObjM.division_Result(firstnum, secondnum);
            	ObjV.setResult(ObjM.getResult());
            	
            }
            catch  (Exception ex){
            	ObjV.errorMessage("cant devide by zero");
            }
    	
    		
    	      }
        
        } 
    
    class Sqr_Listener implements ActionListener{
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		// TODO Auto-generated method stub
    		
            Double firstnum = 0.0;
            try{
            	firstnum=ObjV.getFirstNumber();
            	
            	ObjM.sqrt_Result(firstnum);
            	ObjV.setResult(ObjM.getResult());
            	
            }
            catch  (Exception ex){
            	ObjV.errorMessage("number must be positive");
            }
    	
    		
    	      }
        
        } 
    
}
