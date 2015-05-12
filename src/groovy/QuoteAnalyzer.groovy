/**
 * Created by henrique on 05/05/2015.
 */
package qotd

class QuoteAnalyzer {
    private final List<Quote> quotes

    QuoteAnalyzer(List<Quote> quotes) {
        this.quotes = new ArrayList(quotes)
    }

    int getQuoteCount() {
        return this.quotes.size()
    }
}
