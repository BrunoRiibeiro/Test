package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Accommodation;
import model.Group;
import model.Restaurant;
import model.Transportation;
import model.database.DatabaseProvider;
import view.Home;
import view.ShowInformationGroup;

/**
 * Classe auxiliar que cont�m a l�gica por tr�s da classe RelatorioFilmes.
 * 
 * @author Eduardo Rodrigues
 * 
 * @see RelatorioFilmes
 * @see RelatorioFilmesHelper
 */
public class ShowInformationGroupController {

	private ShowInformationGroup view;

	/**
	 * Inicializa view e helper.
	 * 
	 * @param view A tela
	 */
	public ShowInformationGroupController(ShowInformationGroup view) {
		this.view = view;
	}

	/**
	 * Executa uma a��o de acordo com o bot�o selecionado na view
	 * 
	 * Casos: Caso bot�o cancelar: limpe as entradas e volte ao menu. Caso bot�o
	 * ComboBox Estudio: mostre o relat�rio com esse estudio.
	 * 
	 * @param botaoFonte Um botao da tela
	 */
	public void sendAction(Object source) {
		if (source == view.getButtonBack()) {
			new Home();
		} else {
			if (view.getFieldGroup().getSelectedItem() != null) {
				view.getFieldReport().setText(generateReport());
			}
		}
	}

	/**
	 * Metodo chama o helper para criar a array de estudios e retorna um
	 * DefaultComboBoxModel com essa array.
	 * 
	 * @return DefaultComboBoxModel o model cadastrado para um comboBox
	 */

	public DefaultComboBoxModel<Object> updateModel() {
		return new DefaultComboBoxModel<>(createArrayUser());
	}

	public Object[] createArrayUser() {
		List<String> model = new ArrayList<>();

		for (Group group : DatabaseProvider.getGroups()) {
			model.add(group.getNameGroup());
		}

		return model.toArray();
	}

	public String generateReport() {
		boolean flag0 = false;
		boolean flag1 = false;
		boolean flag2 = false;
		StringBuilder model = new StringBuilder();

		model.append("Grupo:\n");

		for (Group currentGroup : DatabaseProvider.getGroups()) {
			if (currentGroup.getNameGroup().equals(view.getFieldGroup().getSelectedItem())) {

				model.append("    - ");
				model.append("Nome do grupo: " + currentGroup.getNameGroup());
				model.append("\n");

				model.append("    - ");
				model.append("Criador: " + currentGroup.getCreator().getName());
				model.append("\n");

				model.append("    - ");
				model.append("Motivação: " + currentGroup.getMotivation());
				model.append("\n");

				model.append("    - ");
				model.append("Data de planejamento: " + currentGroup.getExpectedDate());
				model.append("\n");

				model.append("    - ");
				model.append("Números de membros: " + currentGroup.getNumberOfMembers());
				model.append("\n");

				model.append("    - ");
				model.append("Preço Total: " + currentGroup.getTotalPrice());
				model.append("\n");

				model.append("    - ");
				model.append("Preço por Membro: " + currentGroup.getTotalPrice() / currentGroup.getNumberOfMembers());
				model.append("\n");

				model.append("    ____________________________________________________ \n");

				for (Transportation currentTransportation : currentGroup.getTRANSPORTATION()) {
					flag0 = true;

					model.append("    -> ");
					model.append("Transporte: " + currentTransportation.getTransportMode());
					model.append("\n");

					model.append("    - ");
					model.append("Custo do transporte: " + currentTransportation.getTransportCost());
					model.append("\n");
				}
				if (!flag0) {
					model.append("    - Não há transportes cadastrados nesse grupo \n");
				}

				model.append("    ____________________________________________________ \n");

				for (Restaurant currentRestaurant : currentGroup.getRESTAURANT()) {
					flag1 = true;

					model.append("    -> ");
					model.append("Nome do restaurante: " + currentRestaurant.getName());
					model.append("\n");

					model.append("    - ");
					model.append("Estrelas do restaurante: " + currentRestaurant.getStars());
					model.append("\n");

					model.append("    - ");
					model.append("Prato pedido: " + currentRestaurant.getMeal());
					model.append("\n");

					model.append("    - ");
					model.append("Custo do prato: " + currentRestaurant.getMealPrice());
					model.append("\n");
				}
				if (!flag1) {
					model.append("    - Não há restaurantes cadastrados nesse grupo \n");
				}

				model.append("    ____________________________________________________ \n");

				for (Accommodation currentAccommodation : currentGroup.getACCOMMODATION()) {
					flag2 = true;

					model.append("    -> ");
					model.append("Lugar de acomodação: " + currentAccommodation.getAccommodation());
					model.append("\n");

					model.append("    - ");
					model.append("Custo da acomodação: " + currentAccommodation.getAccommodationCost());
					model.append("\n");
				}

				if (!flag2) {
					model.append("    - Não há acomodações cadastrados nesse grupo \n");
				}
			}
		}

		return model.toString();
	}
}