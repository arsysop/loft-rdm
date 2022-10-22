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

public final class UtilityIntegrityTest extends CxxIntegrityTest {
            
    @Test
    public void directContents() {
        assertEquals(14, sections().stream() //
                .filter(section -> section.getId().equals("utilities")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }

 
    @Test
    public void utilityContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("utility")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void pairsContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("pairs")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void tupleContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("tuple")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void tupleTupleContents() {
        assertEquals(9, sections().stream() //
                .filter(section -> section.getId().equals("tuple.tuple")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
          
    @Test
    public void intseqContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("intseq")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void templateBitsetContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("template.bitset")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void memoryContents() {
        assertEquals(13, sections().stream() //
                .filter(section -> section.getId().equals("memory")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void pointerTraitsContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("pointer.traits")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void allocatorUsesContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("allocator.uses")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void allocatorTraitsContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("allocator.traits")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void defaultAllocatorContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("default.allocator")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void specializedAlgorithmsContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("specialized.algorithms")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void smartptrContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("smartptr")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void uniquePtrContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("unique.ptr")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void uniquePtrDltrContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("unique.ptr.dltr")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void uniquePtrSingleContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("unique.ptr.single")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void uniquePtrRuntimeContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("unique.ptr.runtime")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void utilSmartptrContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("util.smartptr")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void utilSmartptrSharedContents() {
        assertEquals(11, sections().stream() //
                .filter(section -> section.getId().equals("util.smartptr.shared")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
            
    @Test
    public void utilSmartptrWeakContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("util.smartptr.weak")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
           
    @Test
    public void functionObjectsContents() {
        assertEquals(12, sections().stream() //
                .filter(section -> section.getId().equals("function.objects")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void refwrapContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("refwrap")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
           
    @Test
    public void funcBindContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("func.bind")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void funcWrapContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("func.wrap")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void funcWrapBadcallContents() {
        assertEquals(1, sections().stream() //
                .filter(section -> section.getId().equals("func.wrap.badcall")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void funcWrapFuncContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("func.wrap.func")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
         
    @Test
    public void metaContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("meta")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void metaUnaryContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("meta.unary")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void metaTransContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("meta.trans")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
       
    @Test
    public void ratioContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("ratio")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
       
    @Test
    public void timeContents() {
        assertEquals(8, sections().stream() //
                .filter(section -> section.getId().equals("time")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void timeTraitsContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("time.traits")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void timeDurationContents() {
        assertEquals(8, sections().stream() //
                .filter(section -> section.getId().equals("time.duration")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
         
    @Test
    public void timePointContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("time.point")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
        
    @Test
    public void timeClockContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("time.clock")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void allocatorAdaptorContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("allocator.adaptor")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void typeIndexContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("type.index")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
}
