public class IteratorSample1 {
public static void main(String[] args) {
BookListAggregate gameListAggregate = new BookListAggregate();
Iterator iterator = gameListAggregate.createIterator();
gameListAggregate.add(new Book("みんなでゴルフ", 3700));
gameListAggregate.add(new Book("ファイナルファンタジア", 7300));
gameListAggregate.add(new Book("ロケットモンスター", 5400));
gameListAggregate.add(new Book("サイコロの達人", 5200));
iterator.first(); // まず探す場所を先頭位置にしてもらう
while ( ! iterator.isDone() ) { // まだある？ まだあるよ！
Book book = (Book)iterator.getItem(); // はいどうぞ (と受取る)
System.out.println(book.getName());
iterator.next(); // 次を頂戴
}
}
}