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

public final class ContainerIntegrityTest extends CxxIntegrityTest {
            
    @Test
    public void directContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("containers")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }

 
    @Test
    public void containerRequirementsContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("container.requirements")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void associativeReqmtsContents() {
        assertEquals(1, sections().stream() //
                .filter(section -> section.getId().equals("associative.reqmts")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void unordReqContents() {
        assertEquals(1, sections().stream() //
                .filter(section -> section.getId().equals("unord.req")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void sequencesContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("sequences")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void arrayContents() {
        assertEquals(9, sections().stream() //
                .filter(section -> section.getId().equals("array")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
          
    @Test
    public void dequeContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("deque")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void forwardlistContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("forwardlist")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
        
    @Test
    public void listContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("list")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
       
    @Test
    public void vectorContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("vector")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
        
    @Test
    public void associativeContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("associative")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void mapContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("map")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void multimapContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("multimap")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void setContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("set")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void multisetContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("multiset")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void unordContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("unord")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void unordMapContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("unord.map")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void unordMultimapContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("unord.multimap")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void unordSetContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("unord.set")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void unordMultisetContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("unord.multiset")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void containerAdaptorsContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("container.adaptors")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void queueContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("queue")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void priorityQueueContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("priority.queue")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void stackContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("stack")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
}
