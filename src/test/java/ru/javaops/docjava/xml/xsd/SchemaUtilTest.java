package ru.javaops.docjava.xml.xsd;

import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SchemaUtilTest {

    private static final File xmlSchema = new File("in/userWithMeals.xsd");

    @Test
    void validateOk() throws IOException, SAXException {
        SchemaUtil.validate(new File("in/usersWithMeals.xml"), xmlSchema);
    }

    @Test
    void testValidateNOK() {
        assertThrows(SAXException.class,
                () -> SchemaUtil.validate(new File("in/badXmlFile.xml"), xmlSchema), "Except bad format exception");
    }
}