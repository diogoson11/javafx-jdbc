package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable {
	 @FXML
	private TableView<Department> tableViewDepartment;
	@FXML
	private Button btn = new Button();
	
	
	@FXML
	private TableColumn<Department, Integer> tableColumnId;
	
	
	@FXML
	private TableColumn<Department, String> tableColumnName;
	
	@FXML
	
	public void onBtnNewAction() {
		System.out.println("CLICKED!");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		initializeNodes();
		
	}

	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("Name"));
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
		
	}
	
}