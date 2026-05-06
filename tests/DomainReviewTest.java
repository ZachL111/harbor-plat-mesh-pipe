package io.portfolio;

public final class DomainReviewTest {
    public static void main(String[] args) {
        var item = new DomainReview.Item(48, 52, 19, 49);
        if (DomainReview.score(item) != 140) throw new AssertionError("domain score mismatch");
        if (!DomainReview.lane(item).equals("ship")) throw new AssertionError("domain lane mismatch");
    }
}
