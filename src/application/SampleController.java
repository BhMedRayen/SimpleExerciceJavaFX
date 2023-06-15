package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	TextField longeur;
	@FXML
	TextField largeur;
	@FXML
	Label surface;
	@FXML 
	Label perim;
	@FXML 
	Button per;
	@FXML 
	Button sur;
	
	public void surface(ActionEvent a)
	{
		try {
			int longe=Integer.parseInt(longeur.getText());
			int lar=Integer.parseInt(largeur.getText());
		    if(a.getSource()==sur)
		      {
				int surf=longe*lar;
		        String result=String.valueOf(surf);
		        surface.setText(result);
		       }
		    else if(a.getSource()==per)
		    {
		    	int per=longe/lar;
		    	String result2=String.valueOf(per);
		    	perim.setText(result2);
		    }
		}
		catch(RuntimeException e)
		{
			Alert al=new Alert(AlertType.ERROR);
			al.setTitle("warning");
			al.setContentText("il faut un nombre \n");
			al.show();
		}
	}

	
}
