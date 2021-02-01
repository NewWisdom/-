/**
 * 할인 정책이 없음
 */

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening){
        return Money.ZERO;
    }
}
