package ru.arsysop.loft.rgm.seal.protection;

import org.eclipse.passage.lic.api.requirements.Feature;
import org.eclipse.passage.lic.base.requirements.BaseFeature;

public final class RgmFeatures {

	public Feature library() {
		return new BaseFeature(//
				"ru.arsysop.loft.rgm.library", //$NON-NLS-1$
				"0.1.0", //$NON-NLS-1$
				"Requirements Gathering and Markup", //$NON-NLS-1$
				"ArSysOp"//$NON-NLS-1$
		);
	}

	public static final class Spec {

		public Feature load() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.spec.load", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Spec Load", //$NON-NLS-1$
					"ArSysOp"//$NON-NLS-1$
			);
		}

		public Feature editor() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.spec.editor", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Spec Editor", //$NON-NLS-1$
					"ArSysOp"//$NON-NLS-1$
			);
		}

		public Feature browser() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.spec.browser", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Spec Browser", //$NON-NLS-1$
					"ArSysOp"//$NON-NLS-1$
			);
		}
	}

	public static final class Synopsis {

		public Feature load() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.synopsis.load", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Synopsis Load", //$NON-NLS-1$
					"ArSysOp"//$NON-NLS-1$
			);
		}

		public Feature editor() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.synopsis.editor", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Synopsis Editor", //$NON-NLS-1$
					"ArSysOp"//$NON-NLS-1$
			);
		}
	}

	public static final class Markup {

		public Feature load() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.markup.load", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Markup Load", //$NON-NLS-1$
					"ArSysOp"//$NON-NLS-1$
			);
		}

		public Feature editor() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.markup.editor", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM Markup Editor", //$NON-NLS-1$
					"ArSysOp"//$NON-NLS-1$
			);
		}
	}

	public static final class CxxDraft {

		public Feature importCxx14() {
			return new BaseFeature(//
					"ru.arsysop.loft.rgm.cxxdraft.importcxx14", //$NON-NLS-1$
					"0.1.0", //$NON-NLS-1$
					"RGM C++14 Draft Import", //$NON-NLS-1$
					"ArSysOp"//$NON-NLS-1$
			);
		}
	}
}
