package controller;

import model.Transportation;
import model.database.DatabaseProvider;
import view.EditGroup;
import view.Home;
import view.ShowTransportation;

public class TransportationController {

	private final ShowTransportation view;

	public TransportationController(ShowTransportation view) {
		super();
		this.view = view;
	}

	public void sendAction(Object source) {
		if (source == view.getButtonConfirm()) {
			registerNewTransport();
			System.out.println(DatabaseProvider.getTransports());
			new Home();
		} else if (source == view.getButtonCancel()) {
			new EditGroup();
		}
	}

	private void registerNewTransport() {
		String transportMode = view.getTextFieldTransportation().getText();
		Double cost = Double.parseDouble(view.getTextFieldCost().getText());

		Transportation transport = new Transportation(transportMode, cost);

		DatabaseProvider.getTransports().add(transport);
	}

}
