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

public final class NumericIntegrityTest extends CxxIntegrityTest {
            
    @Test
    public void directContents() {
        assertEquals(8, sections().stream() //
                .filter(section -> section.getId().equals("numerics")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }

  
    @Test
    public void cfenvContents() {
        assertEquals(1, sections().stream() //
                .filter(section -> section.getId().equals("cfenv")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void complexNumbersContents() {
        assertEquals(11, sections().stream() //
                .filter(section -> section.getId().equals("complex.numbers")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
            
    @Test
    public void randContents() {
        assertEquals(8, sections().stream() //
                .filter(section -> section.getId().equals("rand")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void randReqContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("rand.req")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
        
    @Test
    public void randEngContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("rand.eng")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void randAdaptContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("rand.adapt")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
       
    @Test
    public void randUtilContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("rand.util")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void randDistContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("rand.dist")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void randDistUniContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("rand.dist.uni")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void randDistBernContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("rand.dist.bern")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void randDistPoisContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("rand.dist.pois")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void randDistNormContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("rand.dist.norm")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
       
    @Test
    public void randDistSampContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("rand.dist.samp")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void numarrayContents() {
        assertEquals(10, sections().stream() //
                .filter(section -> section.getId().equals("numarray")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void templateValarrayContents() {
        assertEquals(8, sections().stream() //
                .filter(section -> section.getId().equals("template.valarray")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
         
    @Test
    public void valarrayNonmembersContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("valarray.nonmembers")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void classSliceContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("class.slice")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void templateSliceArrayContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("template.slice.array")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void classGsliceContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("class.gslice")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void templateGsliceArrayContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("template.gslice.array")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void templateMaskArrayContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("template.mask.array")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void templateIndirectArrayContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("template.indirect.array")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void numericOpsContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("numeric.ops")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
       
}
