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

public final class IteratorIntegrityTest extends CxxIntegrityTest {
            
    @Test
    public void directContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("iterators")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }

 
    @Test
    public void iteratorRequirementsContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("iterator.requirements")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
         
    @Test
    public void iteratorPrimitivesContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("iterator.primitives")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void predefIteratorsContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("predef.iterators")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void reverseIteratorsContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("reverse.iterators")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void reverseIterOpsContents() {
        assertEquals(21, sections().stream() //
                .filter(section -> section.getId().equals("reverse.iter.ops")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
                      
    @Test
    public void insertIteratorsContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("insert.iterators")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void backInsertIterOpsContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("back.insert.iter.ops")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
       
    @Test
    public void frontInsertIterOpsContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("front.insert.iter.ops")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
       
    @Test
    public void insertIterOpsContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("insert.iter.ops")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void moveIteratorsContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("move.iterators")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void moveIterOpsContents() {
        assertEquals(14, sections().stream() //
                .filter(section -> section.getId().equals("move.iter.ops")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
               
    @Test
    public void streamIteratorsContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("stream.iterators")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void istreamIteratorContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("istream.iterator")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void ostreamIteratorContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("ostream.iterator")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void istreambufIteratorContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("istreambuf.iterator")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
        
    @Test
    public void ostreambufIteratorContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("ostreambuf.iterator")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
}
