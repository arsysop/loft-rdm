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
package ru.arsysop.loft.rgm.spec.cpp14.tests.integrity;
    
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import ru.arsysop.loft.rgm.spec.model.api.Section;

public final class ReIntegrityTest extends CxxIntegrityTest {
            
    @Test
    public void directContents() {
        assertEquals(13, sections().stream() //
                .filter(section -> section.getId().equals("re")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }

 
    @Test
    public void reDefContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("re.def")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
          
    @Test
    public void reConstContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("re.const")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void reRegexContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("re.regex")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
       
    @Test
    public void reRegexNonmembContents() {
        assertEquals(1, sections().stream() //
                .filter(section -> section.getId().equals("re.regex.nonmemb")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void reSubmatchContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("re.submatch")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void reResultsContents() {
        assertEquals(8, sections().stream() //
                .filter(section -> section.getId().equals("re.results")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
         
    @Test
    public void reAlgContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("re.alg")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void reIterContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("re.iter")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void reRegiterContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("re.regiter")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void reTokiterContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("re.tokiter")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
}
