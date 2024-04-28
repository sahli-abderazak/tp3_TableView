package application;



import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class AddBookControlor {
	
	@FXML
    private TableView<Person> table;

    @FXML
    private TableColumn<Person,String> temail;

    @FXML
    private TextField tfemail;

    @FXML
    private TextField tfnom;

    @FXML
    private TextField tfprenom;

    @FXML
    private TableColumn<Person,String> tnom;

    @FXML
    private TableColumn<Person,String> tprenom;
    
    
    private DataClass data=new DataClass();
    @FXML
    protected void add(ActionEvent event)
    {
    	String nom1=tfnom.getText();
    	String prenom1=tfprenom.getText();
    	String adresse1=tfemail.getText();
    	table.getItems().add(new Person(nom1,prenom1,adresse1));
    }

	
	public void initialize() {
		tnom.setCellValueFactory(new PropertyValueFactory<Person,String>("nom"));
		tprenom.setCellValueFactory(new PropertyValueFactory<Person,String>("prenom"));
		temail.setCellValueFactory(new PropertyValueFactory<Person,String>("email"));
//		tnom.setCellFactory(TextFieldTableCell);
	}
    public void supp() {
    	Person selected=table.getSelectionModel().getSelectedItem();
    	table.getItems().remove(selected);
    }
    public void importbtn(ActionEvent event)
    {
    	for(Person p:data.getImportList())
    	{
    		table.getItems().add(p);
    	}
    }
    public void quitter()
    {
    	Platform.exit();
    }
    public void export(ActionEvent event) {
    	data.setExportList(table.getItems());
    }
}
