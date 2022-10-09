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
package ru.arsysop.loft.rgm.base.emf.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.ResourceSet;

public final class RecordingCommand extends AbstractCommand {

	private final Runnable runnable;
	private final Collection<Object> notifiers = new ArrayList<>();
	private final ChangeRecorder recorder;

	private ChangeDescription undo;
	private ChangeDescription redo;

	public RecordingCommand(String label, ResourceSet resourceSet, Runnable runnable) {
		this(label, null, Collections.singleton(resourceSet), runnable);
	}

	public RecordingCommand(String label, String description, Collection<?> rootObjects, Runnable runnable) {
		super(label, description);
		this.runnable = runnable;
		this.recorder = new ChangeRecorder();
		this.notifiers.addAll(rootObjects);
	}

	@Override
	public void execute() {
		try {
			recorder.beginRecording(notifiers);
			runnable.run();
		} finally {
			undo = recorder.endRecording();
		}
	}

	@Override
	protected boolean prepare() {
		return true;
	}

	private ChangeDescription applyChanges(ChangeDescription incoming) {
		final ChangeDescription outgoing;
		try {
			recorder.beginRecording(notifiers);
			incoming.apply();
		} finally {
			outgoing = recorder.endRecording();
		}
		return outgoing;
	}

	@Override
	public boolean canUndo() {
		return undo != null;
	}

	@Override
	public void undo() {
		redo = applyChanges(undo);
		undo = null;
	}

	@Override
	public void redo() {
		undo = applyChanges(redo);
		redo = null;
	}

	@Override
	public void dispose() {
		notifiers.clear();
		undo = null;
		redo = null;
	}
}