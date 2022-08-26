package controller;

import javax.swing.DefaultListModel;

import model.Group;
import model.database.DatabaseProvider;
import view.GroupView;
import view.Home;
import view.RegisterGroup;

public class GroupController {
	private final GroupView view;
	private Group groupEscolhido;

	public GroupController(GroupView view) {
		super();
		this.view = view;
	}

	public void sendAction(Object botaoSelecionado) {
		if (botaoSelecionado == view.getButtonFinalizar()) {
			new Home();
		} else if (botaoSelecionado == view.getButtonSelecionar()) {
			String nomeEscolhido = view.getFieldGroups().getSelectedValue();

			if (nomeEscolhido != null) {
				groupEscolhido = resgatarGroupEscolhido(nomeEscolhido);
				// new RegisterGroup();
				// MainFrameControl.mostrarCadastraPapel();
			}
		} else {
			new RegisterGroup();
		}
	}

	public Group getGroupEscolhido() {
		return groupEscolhido;
	}

	public Group resgatarGroupEscolhido(String nome) {
		for (Group groupAtual : DatabaseProvider.getGroups()) {
			if (nome.equals(groupAtual.getNameGroup())) {
				return groupAtual;
			}
		}
		return null;
	}

	public DefaultListModel<String> atualizarModeloLista() {
		DefaultListModel<String> nomes = new DefaultListModel<>();

		for (Group groupAtual : DatabaseProvider.getGroups()) {
			nomes.addElement(groupAtual.getNameGroup());
		}

		return nomes;
	}
}
