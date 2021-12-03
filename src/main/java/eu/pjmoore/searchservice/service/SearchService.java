package eu.pjmoore.searchservice.service;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import eu.pjmoore.searchservice.model.SearchRequest;
import eu.pjmoore.searchservice.model.SearchResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class SearchService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchService.class);
    private static final int MIN = 1;
    private static final int MAX = 100;
    private final Lorem lorem = LoremIpsum.getInstance();

    public List<SearchResult> search(SearchRequest request) {

        return Arrays.asList(
                new SearchResult(lorem.getTitle(2, 6), lorem.getWords(3, 20), Arrays.asList(getRandomTag(), getRandomTag()), getRandomWeighting()),
                new SearchResult(lorem.getTitle(2, 6), lorem.getWords(3, 20), Arrays.asList(getRandomTag(), getRandomTag()), getRandomWeighting()),
                new SearchResult(lorem.getTitle(2, 6), lorem.getWords(3, 20), Arrays.asList(getRandomTag(), getRandomTag()), getRandomWeighting()),
                new SearchResult(lorem.getTitle(2, 6), lorem.getWords(3, 20), Arrays.asList(getRandomTag(), getRandomTag()), getRandomWeighting()),
                new SearchResult(lorem.getTitle(2, 6), lorem.getWords(3, 20), Arrays.asList(getRandomTag(), getRandomTag()), getRandomWeighting())
        );
    }

    private int getRandomWeighting() {
        return ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
    }

    private String getRandomTag() {
        return lorem.getWords(1);
    }
}
