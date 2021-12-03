package eu.pjmoore.searchservice.api;

import eu.pjmoore.searchservice.service.SearchService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SearchControllerTest {

    @InjectMocks
    SearchController searchController;

    @Mock
    SearchService searchService;


}