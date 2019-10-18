import groovy.transform.Sortable
import groovy.transform.ToString

//A class annotation used to make a class Comparable by (potentially) multiple Comparators
@Sortable
@ToString
class SortablePerson {
     String first
     String last
     Integer born
}