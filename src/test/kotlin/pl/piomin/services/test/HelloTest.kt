package pl.piomin.services.test

import org.junit.Assert
import org.junit.Test
import pl.piomin.services.test.model.Person
import java.util.HashSet

class HelloTest {

    @Test fun `Test person equality excluding "age" property`() {
        val person = Person("John", "Smith", 1)
        person.age = 35
        val person2 = Person("John", "Smith", 1)
        person2.age = 45
        Assert.assertEquals(person, person2)
    }

    @Test fun `Test person componentN method for properties`() {
        val person = Person("John", "Smith", 1)
        Assert.assertEquals("John", person.component1())
        Assert.assertEquals("Smith", person.component2())
        Assert.assertEquals(1, person.component3())
    }

    @Test fun `Test adding and getting person from a Set`() {
        val s = HashSet<Person>()
        val person = Person("John", "Smith", 1)
        var added = s.add(person)
        Assert.assertTrue(added)
        added = s.add(person)
        Assert.assertFalse(added)
    }

//    @Test
//    fun `Test destructurization feature`() {
//        val person = Person("John", "Smith", 1)
//        val (firstName, lastName) = person
//        Assert.assertEquals("John", firstName)
//        Assert.assertEquals("Smith", lastName)
//    }

}
