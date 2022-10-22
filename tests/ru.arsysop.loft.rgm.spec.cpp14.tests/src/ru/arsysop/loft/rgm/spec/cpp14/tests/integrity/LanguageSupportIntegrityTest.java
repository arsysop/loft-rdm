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

public final class LanguageSupportIntegrityTest extends CxxIntegrityTest {
            
    @Test
    public void directContents() {
        assertEquals(10, sections().stream() //
                .filter(section -> section.getId().equals("language.support")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }

  
    @Test
    public void supportLimitsContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("support.limits")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void limitsContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("limits")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
         
    @Test
    public void cstdintContents() {
        assertEquals(1, sections().stream() //
                .filter(section -> section.getId().equals("cstdint")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void supportDynamicContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("support.dynamic")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void newDeleteContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("new.delete")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void allocErrorsContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("alloc.errors")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void supportRttiContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("support.rtti")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void supportExceptionContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("support.exception")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void exceptionTerminateContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("exception.terminate")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
        
    @Test
    public void supportInitlistContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("support.initlist")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
}
