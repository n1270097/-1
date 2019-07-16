public class IteratorSampleX0 {
public static void main(String[] args) {
// ゲームへの参照を格納する配列
Book[] books = new Book[20];
// いくつ格納しているかを表す変数
int num = 0;
// ゲームを配列に格納
books[num] = new Book("スーパーピグマリオ", 5400);
num += 1;
books[num] = new Book("アインクラフト", 3300);
num += 1;
books[num] = new Book("星のギャッツビー", 5400);
num += 1;
// 先頭から順にゲームの名称を表示
for (int i = 0; i < num; i++) {
System.out.println(books[i].getName());
}
}
}