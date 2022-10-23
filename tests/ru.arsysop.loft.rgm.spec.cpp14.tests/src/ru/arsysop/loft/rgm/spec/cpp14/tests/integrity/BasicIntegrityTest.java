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

public final class BasicIntegrityTest extends CxxIntegrityTest {
            
    @Test
    public void directContents() {
        assertEquals(11, sections().stream() //
                .filter(section -> section.getId().equals("basic")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }

  
    @Test
    public void basicScopeContents() {
        assertEquals(10, sections().stream() //
                .filter(section -> section.getId().equals("basic.scope")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
           
    @Test
    public void basicLookupContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("basic.lookup")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void basicLookupQualContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("basic.lookup.qual")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
       
    @Test
    public void basicStartContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("basic.start")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void basicStcContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("basic.stc")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void basicStcDynamicContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("basic.stc.dynamic")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void basicTypesContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("basic.types")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
}
