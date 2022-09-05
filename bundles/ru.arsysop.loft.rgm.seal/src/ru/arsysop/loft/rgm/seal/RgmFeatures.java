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
package ru.arsysop.loft.rgm.seal;

import org.eclipse.passage.lic.api.requirements.Feature;
import org.eclipse.passage.lic.base.requirements.BaseFeature;

public final class RgmFeatures {

	public String namespace() {
		return "ru.arsysop.loft.rgm."; //$NON-NLS-1$
	}

	public Feature library() {
		return new BaseFeature(//
				"ru.arsysop.loft.rgm.library0", //$NON-NLS-1$
				"0.1.0", //$NON-NLS-1$
				"Requirements Gathering and Markup",
				"ArSysOp"
		);
	}

	public static final class Spec {

		public Feature load() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.spec.load0", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Spec Load",
					"ArSysOp"
			);
		}

		public Feature editor() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.spec.editor0", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Spec Editor",
					"ArSysOp"
			);
		}

		public Feature browser() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.spec.browser0", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Spec Browser",
					"ArSysOp"
			);
		}
	}

	public static final class Synopsis {

		public Feature load() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.synopsis.load0", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Synopsis Load",
					"ArSysOp"
			);
		}

		public Feature editor() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.synopsis.editor0", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Synopsis Editor",
					"ArSysOp"//
			);
		}
	}

	public static final class Markup {

		public Feature load() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.markup.load0", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Markup Load",
					"ArSysOp"
			);
		}

		public Feature editor() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.markup.editor0", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Markup Editor", 
					"ArSysOp"
			);
		}
	}

	public static final class CxxDraft {

		public Feature importCxx14() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.cxxdraft.importcxx140", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM C++14 Draft Import",
					"ArSysOp"
			);
		}
	}
}
