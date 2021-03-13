package pl.piomin.services.test

import org.junit.Test
import pl.piomin.services.test.model.Person
import pl.piomin.services.test.model.PersonV2
import kotlin.test.assertEquals

class DataClassTest {

    @Test
    fun `Test with null id`() {
        val p1 = Person("John", "Smith", null)
        val p2 = Person("John", "Smith", null)
        assertEquals(p1, p2)
    }

    @Test
    fun `Test with null id and different field`() {
        val p1 = Person(firstName = "John", lastName = "Smith", id = null)
        p1.age = 33
        val p2 = Person(firstName = "John", lastName = "Smith", id = null)
        p2.age = 22
        assertEquals(p1, p2)
    }

    @Test
    fun `Two different objects in Set`() {
        val p1 = PersonV2(id = null)
        p1.firstName = "John"
        p1.lastName = "Smith"
        p1.age = 22
        val p2 = PersonV2(id = null)
        p2.firstName = "Paul"
        p2.lastName = "Walker"
        p2.age = 44
        val s = setOf(p1, p2)
        assertEquals(1, s.size)
    }
}