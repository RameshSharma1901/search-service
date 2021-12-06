package eu.pjmoore.searchservice.api;

import eu.pjmoore.searchservice.model.SearchRequest;
import eu.pjmoore.searchservice.model.SearchResult;
import eu.pjmoore.searchservice.service.SearchService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SearchControllerTest {

    @InjectMocks
    SearchController searchController;

    @Mock
    SearchService searchService;


    @Test
    void searchRequest() {
        SearchRequest searchRequest = new SearchRequest("World News");
        when(searchService.search(searchRequest)).thenReturn(anyList());

        ResponseEntity<List<SearchResult>> responseEntity = searchController.search(searchRequest);

        verify(searchService).search(searchRequest);
        assertEquals(200, responseEntity.getStatusCodeValue());
    }

}