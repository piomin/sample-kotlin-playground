package pl.piomin.services.test

import org.junit.Assert
import org.junit.Test
import pl.piomin.services.test.model.Person

class ScopeFunctionsTest {

    @Test fun testApplyFunction() {
        val p: Person = Person("John", "Smith", 1)
                .apply {
                    age = 20
                    localization = "London"
                }
        Assert.assertEquals(20, p.age)
        Assert.assertEquals("London", p.localization)
    }

    @Test fun testLetFunction() {
        val p: Person = Person("John", "Smith", 1)
                .let {
                    it.age = 20
                    it.localization = "London"
                    it
                }
        Assert.assertEquals(20, p.age)
        Assert.assertEquals("London", p.localization)
    }

    @Test fun testRunFunction() {
        val p: Person = Person("John", "Smith", 1)
                .run {
                    age = 20
                    localization = "London"
                    this
                }
        Assert.assertEquals(20, p.age)
        Assert.assertEquals("London", p.localization)
    }

    @Test fun testAlsoFunction() {
        val p: Person = Person("John", "Smith", 1)
                .apply {
                    age = 20
                    localization = "London"
                }
                .also {
                    Assert.assertEquals(20, it.age)
                    Assert.assertEquals("London", it.localization)
                }
    }

    @Test fun testTakeIfFunction() {
        var p: Person? = Person("John", "Smith", 1).takeIf { it.id > 1 }
        Assert.assertNull(p)
        p = Person("John", "Smith", 1).takeIf { it.id == 1 }
        Assert.assertNotNull(p)
    }

}