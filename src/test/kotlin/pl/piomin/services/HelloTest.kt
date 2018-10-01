package pl.piomin.services

import org.junit.Assert
import org.junit.Test
import pl.piomin.services.model.Person
import kotlin.test.assertEquals

class HelloTest {

    @Test
    fun `Test person equality`() {
        val person = Person("John", "Smith", 1)
        println("$person")
        Assert.assertEquals(1, person.id)
        val person2 = Person("John", "Smith", 1)
        Assert.assertEquals(person, person2)
    }

    @Test
    fun `Test destructurization feature`() {
        val person = Person("John", "Smith", 1)
        val (firstName, lastName) = person
        Assert.assertEquals("John", firstName)
        Assert.assertEquals("Smith", lastName)
    }

}
