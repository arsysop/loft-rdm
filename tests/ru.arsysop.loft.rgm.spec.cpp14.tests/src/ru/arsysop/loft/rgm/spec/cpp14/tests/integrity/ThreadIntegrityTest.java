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

public final class ThreadIntegrityTest extends CxxIntegrityTest {
            
    @Test
    public void directContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("thread")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }

 
    @Test
    public void threadReqContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("thread.req")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void threadReqLockableContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("thread.req.lockable")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void threadThreadsContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("thread.threads")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void threadThreadClassContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("thread.thread.class")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
         
    @Test
    public void threadMutexContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("thread.mutex")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void threadMutexRequirementsContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("thread.mutex.requirements")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void threadMutexRequirementsMutexContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("thread.mutex.requirements.mutex")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void threadTimedmutexRequirementsContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("thread.timedmutex.requirements")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void threadSharedtimedmutexRequirementsContents() {
        assertEquals(1, sections().stream() //
                .filter(section -> section.getId().equals("thread.sharedtimedmutex.requirements")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void threadLockContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("thread.lock")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void threadLockUniqueContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("thread.lock.unique")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void threadLockSharedContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("thread.lock.shared")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void threadOnceContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("thread.once")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void threadConditionContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("thread.condition")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void futuresContents() {
        assertEquals(9, sections().stream() //
                .filter(section -> section.getId().equals("futures")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
         
    @Test
    public void futuresTaskContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("futures.task")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
}
