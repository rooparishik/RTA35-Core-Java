package com.roopa.learning.core.oops.assosciations;

// Aggregation Weak Assosciation Example

import java.util.List;

class  CreditCard{

}
class VisaCard extends CreditCard{

}
class MasterCard extends CreditCard{

}
class DiscoverVisaCard extends CreditCard{

}

public class AggregationWeakAssociationExample {

    private List<CreditCard> creditCardList;
}

/* In this type of Association there is no  strong dependency between
two Classes. One Class can  exist without any dependency on other class.
Here they have Weak relationship between them, this type of Association is usually
referred as Aggregation Association.
 */