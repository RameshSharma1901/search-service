package eu.pjmoore.searchservice.model;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;


class SearchRequestTest {

    @Test
    void equalsContract() {
        EqualsVerifier.forClass(SearchRequest.class).verify();
    }

}