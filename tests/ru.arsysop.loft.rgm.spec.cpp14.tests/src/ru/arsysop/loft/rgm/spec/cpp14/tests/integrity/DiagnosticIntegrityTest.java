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

public final class DiagnosticIntegrityTest extends CxxIntegrityTest {
            
    @Test
    public void directContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("diagnostics")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }

 
    @Test
    public void stdExceptionsContents() {
        assertEquals(9, sections().stream() //
                .filter(section -> section.getId().equals("std.exceptions")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
            
    @Test
    public void syserrContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("syserr")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void syserrErrcatContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("syserr.errcat")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void syserrErrcodeContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("syserr.errcode")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void syserrErrconditionContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("syserr.errcondition")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
        
    @Test
    public void syserrSyserrContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("syserr.syserr")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
}
