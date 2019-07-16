class BookList {
private Book[] list; // ゲームソフトを格納する配列
private int numberOfStock; // 現在の在庫数
public BookList(int number) { // コンストラクタ
list = new Book[number]; // 配列の大きさを確定
numberOfStock = 0;
}
public void add(Book book) {
list[numberOfStock] = book; // 格納
numberOfStock += 1; // 在庫数を1 つ増加
}
public Book getbook(int number) { // 指定番号のゲームソフト取出し
return list[number];
}
public int getNumberOfStock() { // 現在の在庫数を取得
return numberOfStock;
}
}