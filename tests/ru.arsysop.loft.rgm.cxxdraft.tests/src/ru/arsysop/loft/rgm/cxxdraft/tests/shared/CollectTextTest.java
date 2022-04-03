package ru.arsysop.loft.rgm.cxxdraft.tests.shared;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import org.dom4j.Document;
import org.dom4j.io.DOMReader;
import org.junit.Test;
import org.w3c.tidy.Tidy;

import ru.arsysop.loft.rgm.internal.cxxdraft.paragraph.CollectText;

public final class CollectTextTest {

	@Test
	public void structure() {
		assertEquals("outer content just content inner content", //$NON-NLS-1$
				new CollectText().apply(document().getRootElement()));
	}

	private Document document() {
		String raw = "<html>" //$NON-NLS-1$
				+ "<body>" //$NON-NLS-1$
				+ "<div>outer content<i>just content<a>inner content</a></i></div>" //$NON-NLS-1$
				+ "</body>" //$NON-NLS-1$
				+ "</html>"; //$NON-NLS-1$
		ByteArrayInputStream is = new ByteArrayInputStream(raw.getBytes(StandardCharsets.UTF_8));
		return new DOMReader().read(new Tidy().parseDOM(is, null /* no output */));
	}

}
