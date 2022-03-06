package ru.arsysop.loft.rgm.seal.protection;

public final class RgmFeatures {

	public String library() {
		return "ru.arsysop.loft.rgm.library";
	}

	public static final class Spec {

		public String load() {
			return "ru.arsysop.loft.rgm.spec.load";
		}

		public String editor() {
			return "ru.arsysop.loft.rgm.spec.editor";
		}

		public String browser() {
			return "ru.arsysop.loft.rgm.spec.browser";
		}
	}

	public static final class Synopsis {

		public String load() {
			return "ru.arsysop.loft.rgm.synopsis.load";
		}

		public String editor() {
			return "ru.arsysop.loft.rgm.synopsis.editor";
		}
	}

	public static final class Markup {

		public String load() {
			return "ru.arsysop.loft.rgm.markup.load";
		}

		public String editor() {
			return "ru.arsysop.loft.rgm.markup.editor";
		}
	}

	public static final class CxxDraft {

		public String importCxx14() {
			return "ru.arsysop.loft.rgm.cxxdraft.importcxx14";
		}
	}
}
