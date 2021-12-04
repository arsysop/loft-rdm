package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.ArrayList;
import java.util.List;

import ru.arsysop.loft.rgm.cxxdraft.Draft;
import ru.arsysop.loft.rgm.cxxdraft.Index;

public final class DefaultDraft implements Draft {
	
	private final List<Index> indexes;

	public DefaultDraft() {
		this.indexes = new ArrayList<>();
	}

	@Override
	public List<Index> getIndexes() {
		return new ArrayList<Index>(indexes);
	}

}
