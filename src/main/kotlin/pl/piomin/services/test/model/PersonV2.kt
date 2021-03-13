package pl.piomin.services.test.model

data class PersonV2(val id: Int?) {
    lateinit var firstName: String
    lateinit var lastName: String
    var age: Int = 0
}