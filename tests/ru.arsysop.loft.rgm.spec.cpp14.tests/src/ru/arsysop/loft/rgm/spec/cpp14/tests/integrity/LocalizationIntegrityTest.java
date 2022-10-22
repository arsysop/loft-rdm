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

public final class LocalizationIntegrityTest extends CxxIntegrityTest {
            
    @Test
    public void directContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("localization")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }

  
    @Test
    public void localesContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("locales")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void localeContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("locale")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void localeTypesContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("locale.types")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
         
    @Test
    public void localeConvenienceContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.convenience")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void conversionsContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("conversions")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void localeCategoriesContents() {
        assertEquals(8, sections().stream() //
                .filter(section -> section.getId().equals("locale.categories")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void categoryCtypeContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("category.ctype")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void localeCtypeContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.ctype")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void facetCtypeSpecialContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("facet.ctype.special")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void localeCodecvtContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.codecvt")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void categoryNumericContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("category.numeric")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void localeNumGetContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.num.get")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void localeNmPutContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.nm.put")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void facetNumpunctContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("facet.numpunct")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void localeNumpunctContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.numpunct")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void categoryCollateContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("category.collate")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void localeCollateContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.collate")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void categoryTimeContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("category.time")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void localeTimeGetContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.time.get")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void localeTimePutContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.time.put")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void categoryMonetaryContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("category.monetary")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void localeMoneyGetContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.money.get")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void localeMoneyPutContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.money.put")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void localeMoneypunctContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.moneypunct")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void categoryMessagesContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("category.messages")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void localeMessagesContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("locale.messages")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
}
