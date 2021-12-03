package eu.pjmoore.searchservice.model;

import java.util.List;
import java.util.Objects;

public class SearchResult {

    private final String title;
    private final String description;
    private final List<String> tags;
    private final int weight;

    public SearchResult(String title, String description, List<String> tags, int weight) {
        this.title = title;
        this.description = description;
        this.tags = tags;
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchResult that = (SearchResult) o;
        return weight == that.weight && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, tags, weight);
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", weight=" + weight +
                '}';
    }
}
