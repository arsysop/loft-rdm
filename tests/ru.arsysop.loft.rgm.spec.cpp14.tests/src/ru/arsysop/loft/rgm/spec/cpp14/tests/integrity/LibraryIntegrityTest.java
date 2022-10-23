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

public final class LibraryIntegrityTest extends CxxIntegrityTest {
            
    @Test
    public void directContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("library")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }

  
    @Test
    public void definitionsContents() {
        assertEquals(27, sections().stream() //
                .filter(section -> section.getId().equals("definitions")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
                             
    @Test
    public void descriptionContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("description")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void structureContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("structure")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void conventionsContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("conventions")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void typeDescriptionsContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("type.descriptions")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void characterSeqContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("character.seq")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void requirementsContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("requirements")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void organizationContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("organization")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void usingContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("using")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void utilityRequirementsContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("utility.requirements")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void constraintsContents() {
        assertEquals(11, sections().stream() //
                .filter(section -> section.getId().equals("constraints")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void namespaceConstraintsContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("namespace.constraints")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void reservedNamesContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("reserved.names")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
              
    @Test
    public void conformingContents() {
        assertEquals(15, sections().stream() //
                .filter(section -> section.getId().equals("conforming")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
               
}
