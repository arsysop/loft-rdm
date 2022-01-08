package ru.arsysop.loft.rgm.edit;

import java.util.Optional;
import java.util.function.Function;

import org.eclipse.emf.edit.provider.StyledString;

import ru.arsysop.loft.rgm.model.api.StyledNode;

public final class NodeStyle implements Function<StyledNode, StyledString> {

	@Override
	public StyledString apply(StyledNode node) {
		switch (node.getType()) {
		case "a": //$NON-NLS-1$
			return reference(node.getText());
		case "span": //$NON-NLS-1$
			return code(node.getText());
		default:
			return raw(Optional.ofNullable(node.getText()).orElse("")); //$NON-NLS-1$
		}
	}

	private StyledString code(String text) {
		return new StyledString(text, StyledString.Style.QUALIFIER_STYLER);
	}

	private StyledString reference(String text) {
		return new StyledString(text, StyledString.Style.COUNTER_STYLER);
	}

	private StyledString raw(String text) {
		return new StyledString(text);
	}


}
