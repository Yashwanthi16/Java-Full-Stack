package LambdaExpression;
import java.util.function.IntPredicate;

public class Application4 {
		public static void main(String[] args) {			
			//IntPredicate lessThan18 = new IntPredicate(){
				//@Override
				//public boolean test(int value) {
				//	if(value < 18) {
				//		return true;
				//	}else {
				//		return false;
				//	}
				//}
			//}
			//System.out.println(lessThan18.and(MoreThan10).test(45));

			//lamdba exp technique of doing the above operation
			//here value = i and condition is the "if condition" which is written as i<18

			IntPredicate lessThan18 = i->i<18;
			IntPredicate MoreThan10 = i->i>10;
			
			System.out.println(lessThan18.and(MoreThan10).test(45));

		}
}
