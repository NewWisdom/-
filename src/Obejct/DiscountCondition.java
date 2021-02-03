/**
 * 할인 조건
 */

package Obejct;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
