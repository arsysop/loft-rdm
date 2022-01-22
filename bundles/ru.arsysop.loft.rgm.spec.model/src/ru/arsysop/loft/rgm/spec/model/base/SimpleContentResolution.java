/*******************************************************************************
 * Copyright (c) 2021 ArSysOp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     (ArSysOp) - initial API and implementation
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
