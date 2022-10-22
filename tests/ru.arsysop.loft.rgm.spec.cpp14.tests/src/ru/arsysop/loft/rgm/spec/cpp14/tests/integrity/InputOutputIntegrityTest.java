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

public final class InputOutputIntegrityTest extends CxxIntegrityTest {
            
    @Test
    public void directContents() {
        assertEquals(9, sections().stream() //
                .filter(section -> section.getId().equals("input.output")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }

 
    @Test
    public void iostreamsRequirementsContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("iostreams.requirements")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void iostreamObjectsContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("iostream.objects")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void iostreamsBaseContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("iostreams.base")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void iosBaseContents() {
        assertEquals(7, sections().stream() //
                .filter(section -> section.getId().equals("ios.base")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void iosTypesContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("ios.types")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
             
    @Test
    public void fposContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("fpos")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void iosContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("ios")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void stdIosManipContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("std.ios.manip")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void streamBuffersContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("stream.buffers")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
   
    @Test
    public void streambufContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("streambuf")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void streambufMembersContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("streambuf.members")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void streambufProtectedContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("streambuf.protected")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void streambufVirtualsContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("streambuf.virtuals")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void iostreamFormatContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("iostream.format")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void inputStreamsContents() {
        assertEquals(6, sections().stream() //
                .filter(section -> section.getId().equals("input.streams")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void istreamContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("istream")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void istreamFormattedContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("istream.formatted")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void iostreamclassContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("iostreamclass")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void outputStreamsContents() {
        assertEquals(9, sections().stream() //
                .filter(section -> section.getId().equals("output.streams")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
      
    @Test
    public void ostreamFormattedContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("ostream.formatted")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
           
    @Test
    public void stringStreamsContents() {
        assertEquals(5, sections().stream() //
                .filter(section -> section.getId().equals("string.streams")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
  
    @Test
    public void stringbufContents() {
        assertEquals(4, sections().stream() //
                .filter(section -> section.getId().equals("stringbuf")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
     
    @Test
    public void istringstreamContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("istringstream")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void ostringstreamContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("ostringstream")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void stringstreamContents() {
        assertEquals(3, sections().stream() //
                .filter(section -> section.getId().equals("stringstream")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
    
    @Test
    public void fileStreamsContents() {
        assertEquals(2, sections().stream() //
                .filter(section -> section.getId().equals("file.streams")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
 
    @Test
    public void fstreamsContents() {
        assertEquals(17, sections().stream() //
                .filter(section -> section.getId().equals("fstreams")) //$NON-NLS-1$
                .flatMap(section -> section.getContents().stream()) //
                .filter(Section.class::isInstance) //
                .count());
    }
                  
}
