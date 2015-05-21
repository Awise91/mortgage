package Calculator;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
	
	@FXML
	private Label incomeLabel;
	
	@FXML
	private Label debtLabel;
	
	@FXML
	private Label interestLabel;
	
	@FXML
	private Label termLabel;
	
	@FXML
	private Label downPayLabel;
	
	@FXML
	private Label housePayLabel;
	
	@FXML
	private Label housePayObLabel;
	
	@FXML
	private Label maxPayLabel;
	
	@FXML
	private Label mortAllowLabel;
	
	@FXML
	private Label housePayCalc;
	
	@FXML
	private void handlePay() {
		housePayCalc.textProperty().set(String.valueOf(Calculate.getIncome()*0.18));
	}
	
	@FXML
	private Label housePayObCalc;
	
	@FXML
	private void handlePayOb() {
		housePayObCalc.textProperty().set(String.valueOf(Calculate.getIncome()*0.36));
	}
	
	@FXML
	private Label maxPayCalc;
	
	public void handleMaxPay() {
		maxPayCalc.textProperty().set(String.valueOf(Calculate.maxPayment()));
	}
	
	@FXML
	private Label mortAllowCalc;
	
	@FXML
	public void handleMortCalc() {
		mortAllowCalc.textProperty().set(String.valueOf(Calculate.mortgage()));
	}
		
	@FXML
	private TextField incomeField;
	
	public void handleInputIncome() {
		incomeField.setText(incomeField.getText());
		Calculate.setIncome(Double.parseDouble(incomeField.getText()));
	}
	
	@FXML
	private TextField debtField;
	
	public void handleDebt() {
		Calculate.setDebt(Double.parseDouble(debtField.getText()));
	}
	
	@FXML
	private TextField interestField;
	
	public void handleInterest() {
		Calculate.setInterest(Double.parseDouble(interestField.getText())*0.01);
	}
		
	@FXML
	private ChoiceBox<String> termField = new ChoiceBox<String>((FXCollections.observableArrayList("10 years", "15 years", "30 yeaers")));
	
	@FXML
	public void handleTermField() {

		termField.getItems().clear();
		termField.getItems().addAll("10 years", "15 years", "30 years");
		if (termField.getSelectionModel().getSelectedItem() == "10 years") {
			Calculate.setTerm(10);
		}
		else if (termField.getSelectionModel().getSelectedItem() == "15 years") {
			Calculate.setTerm(15);
		}
		else if (termField.getSelectionModel().getSelectedItem() == "30 years") {
			Calculate.setTerm(30);
		}
	}

	@FXML
	private TextField downPayField;
	
	public void downPay() {
		Calculate.setDown(Double.parseDouble(downPayField.getText()));
	}
	
	@FXML
	private Button button;
	
	@FXML
	public void onClick() {
		mortAllowCalc.textProperty().set(String.valueOf(Calculate.mortgage()));
		housePayCalc.textProperty().set(String.valueOf(Calculate.getIncome()*0.18));
		housePayObCalc.textProperty().set(String.valueOf(Calculate.getIncome()*0.36));
		maxPayCalc.textProperty().set(String.valueOf(Calculate.maxPayment()));
	}
	
	public CalculatorController() {
	}
	
}

