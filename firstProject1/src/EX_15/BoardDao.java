//list<Board> get BoardList 라는 메소드가 있다.
package EX_15;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		list.add(new Board("자바 공부하실분", "재밌는 자바 같이모여서 공부해요"));
		return list;

	}
}
