/*******************************************************************************
 * Copyright (c) ArSysOp 2018-2022
 * 
 * RGM Sources are publicly available only for 
 * informational, review, analysis and consulting purposes.
 * 
 * Definitions, terms and conditions for using RGM Sources are stated by ArSysOp Source License version 1.0.
 * See http://arsysop.ru/licenses/rgm/ArSysOpSourceLicense-1.0.txt
 * 
 * RGM Sources are provided on "as is" basis. 
 * ArSysOp is not responsible for any damages, losses, legal prosecution 
 * or other consequences of any sort that using RGM Sources can cause to you 
 * (as an individual or Legal Entity), even if aware of such consequences.
 * 
*******************************************************************************/
package ru.arsysop.loft.rgm.spec.model.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import ru.arsysop.loft.rgm.spec.model.api.ContentResolution;

public final class SimpleContentResolution<C> implements ContentResolution<C> {

	private final Map<String, C> registered;
	private final Map<String, List<Consumer<C>>> requested;

	public SimpleContentResolution() {
		this.registered = new HashMap<>();
		this.requested = new HashMap<>();
	}

	@Override
	public Optional<C> find(String id) {
		return Optional.ofNullable(registered.get(id));
	}

	@Override
	public void register(String id, C entry) {
		registered.put(id, entry);
		List<Consumer<C>> list = requested.computeIfAbsent(id, k -> new ArrayList<>());
		list.forEach(c -> c.accept(entry));
		list.clear();
	}

	@Override
	public void request(String id, Consumer<C> consumer) {
		Optional<C> existing = Optional.ofNullable(registered.get(id));
		if (existing.isPresent()) {
			consumer.accept(existing.get());
		} else {
			requested.computeIfAbsent(id, k -> new ArrayList<>()).add(consumer);
		}
	}

}
