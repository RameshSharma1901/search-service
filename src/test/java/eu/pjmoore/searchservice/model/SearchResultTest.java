package eu.pjmoore.searchservice.model;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

class SearchResultTest {

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(SearchResult.class).verify();
    }

}