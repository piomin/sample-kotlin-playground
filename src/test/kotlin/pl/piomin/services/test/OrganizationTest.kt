package pl.piomin.services.test

import org.junit.Assert
import org.junit.Test
import pl.piomin.services.test.model.Organization
import pl.piomin.services.test.model.Person

class OrganizationTest {

    private fun Organization.addPerson(person: Person) {
        persons.add(person)
    }

    @Test
    fun testExtension() {
        val organization = Organization()
        organization.addPerson(person = Person("John", "Smith", 1))
        Assert.assertTrue(organization.persons.size == 1)
        println("Organization ${organization.name} with ${organization.persons.size} persons")
    }

}