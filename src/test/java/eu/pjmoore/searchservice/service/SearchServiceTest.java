package eu.pjmoore.searchservice.service;

import eu.pjmoore.searchservice.model.SearchRequest;
import eu.pjmoore.searchservice.model.SearchResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchServiceTest {

    private SearchService searchService;

    @BeforeEach
    public void setUp() {
        searchService = new SearchService();
    }

    @Test
    void shouldFakeSearch() {
        SearchRequest searchRequest = new SearchRequest("World News");
        List<SearchResult> searchResponse = searchService.search(searchRequest);
        assertEquals(5, searchResponse.size());
    }

}