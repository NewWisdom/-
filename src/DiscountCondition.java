/**
 * 할인 조건
 */

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}