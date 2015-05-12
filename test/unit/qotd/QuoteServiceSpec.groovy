package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(QuoteService)
class QuoteServiceSpec extends Specification {

    void "static quote service always returns quiche quote" (){
        when:
            Quote staticQuote = service.getStaticQuote()
        then:
            staticQuote.author == "Anonymous"
            staticQuote.content == "Real Programmers don't eat Quiche"
    }


}
