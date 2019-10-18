import groovy.transform.Canonical

//The @Canonical meta-annotation combines the @EqualsAndHashCode, @ToString and @TupleConstructor annotations.
@Canonical class CanonicalUser {
     String first, last
     int age
     Date since
     Collection favItems = ['Food']
     def object 
 }