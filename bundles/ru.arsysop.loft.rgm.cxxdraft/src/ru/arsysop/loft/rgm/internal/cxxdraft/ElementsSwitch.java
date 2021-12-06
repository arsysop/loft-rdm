package ru.arsysop.loft.rgm.internal.cxxdraft;

import org.eclipse.emf.ecore.EObject;

import ru.arsysop.loft.rgm.model.api.Document;
import ru.arsysop.loft.rgm.model.api.Toc;
import ru.arsysop.loft.rgm.model.util.RgmSwitch;

public final class ElementsSwitch extends RgmSwitch<BaseElements<? extends EObject>> {

	@Override
	public BaseElements<? extends EObject> caseToc(Toc object) {
		return new TocElements(object);
	}

	@Override
	public BaseElements<? extends EObject> caseDocument(Document object) {
		return new TocElements(object.getToc());
	}

}
