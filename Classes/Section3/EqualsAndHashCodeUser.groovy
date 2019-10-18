import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(includeFields=true)
class EqualsAndHashCodeUser {
     String name
     boolean active
     List likes
     private int age = 37
}